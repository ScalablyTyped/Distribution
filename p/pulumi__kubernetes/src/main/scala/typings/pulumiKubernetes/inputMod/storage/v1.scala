package typings.pulumiKubernetes.inputMod.storage

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.inputMod.core.v1.PersistentVolumeSpec
import typings.pulumiKubernetes.inputMod.core.v1.TopologySelectorTerm
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1 {
  
  /**
    * CSIDriver captures information about a Container Storage Interface (CSI) volume driver deployed on the cluster. Kubernetes attach detach controller uses this object to determine whether attach is required. Kubelet uses this object to determine whether pod information needs to be passed on mount. CSIDriver objects are non-namespaced.
    */
  trait CSIDriver extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CSIDriver]] = js.undefined
    
    /**
      * Standard object metadata. metadata.Name indicates the name of the CSI driver that this object refers to; it MUST be the same name returned by the CSI GetPluginName() call for that driver. The driver name must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * Specification of the CSI Driver.
      */
    var spec: Input[CSIDriverSpec]
  }
  object CSIDriver {
    
    @scala.inline
    def apply(spec: Input[CSIDriverSpec]): CSIDriver = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSIDriver]
    }
    
    @scala.inline
    implicit class CSIDriverMutableBuilder[Self <: CSIDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[storageDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CSIDriver]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[CSIDriverSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * CSIDriverSpec is the specification of a CSIDriver.
    */
  trait CSIDriverSpec extends StObject {
    
    /**
      * attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
      */
    var attachRequired: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details. This field is alpha-level, and is only honored by servers that enable the CSIVolumeFSGroupPolicy feature gate.
      */
    var fsGroupPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID) "csi.storage.k8s.io/ephemeral": "true" iff the volume is an ephemeral inline volume
      *                                 defined by a CSIVolumeSource, otherwise "false"
      *
      * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
      */
    var podInfoOnMount: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If set to true, storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information.
      *
      * The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
      *
      * Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
      *
      * This is an alpha field and only available when the CSIStorageCapacity feature is enabled. The default is false.
      */
    var storageCapacity: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is "Persistent", which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is "Ephemeral". In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future. This field is beta.
      */
    var volumeLifecycleModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object CSIDriverSpec {
    
    @scala.inline
    def apply(): CSIDriverSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSIDriverSpec]
    }
    
    @scala.inline
    implicit class CSIDriverSpecMutableBuilder[Self <: CSIDriverSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachRequired(value: Input[Boolean]): Self = StObject.set(x, "attachRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachRequiredUndefined: Self = StObject.set(x, "attachRequired", js.undefined)
      
      @scala.inline
      def setFsGroupPolicy(value: Input[String]): Self = StObject.set(x, "fsGroupPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsGroupPolicyUndefined: Self = StObject.set(x, "fsGroupPolicy", js.undefined)
      
      @scala.inline
      def setPodInfoOnMount(value: Input[Boolean]): Self = StObject.set(x, "podInfoOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPodInfoOnMountUndefined: Self = StObject.set(x, "podInfoOnMount", js.undefined)
      
      @scala.inline
      def setStorageCapacity(value: Input[Boolean]): Self = StObject.set(x, "storageCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageCapacityUndefined: Self = StObject.set(x, "storageCapacity", js.undefined)
      
      @scala.inline
      def setVolumeLifecycleModes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "volumeLifecycleModes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeLifecycleModesUndefined: Self = StObject.set(x, "volumeLifecycleModes", js.undefined)
      
      @scala.inline
      def setVolumeLifecycleModesVarargs(value: Input[String]*): Self = StObject.set(x, "volumeLifecycleModes", js.Array(value :_*))
    }
  }
  
  /**
    * CSINode holds information about all CSI drivers installed on a node. CSI drivers do not need to create the CSINode object directly. As long as they use the node-driver-registrar sidecar container, the kubelet will automatically populate the CSINode object for the CSI driver as part of kubelet plugin registration. CSINode has the same name as a node. If the object is missing, it means either there are no CSI Drivers available on the node, or the Kubelet version is low enough that it doesn't create this object. CSINode has an OwnerReference that points to the corresponding node object.
    */
  trait CSINode extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CSINode]] = js.undefined
    
    /**
      * metadata.name must be the Kubernetes node name.
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * spec is the specification of CSINode
      */
    var spec: Input[CSINodeSpec]
  }
  object CSINode {
    
    @scala.inline
    def apply(spec: Input[CSINodeSpec]): CSINode = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSINode]
    }
    
    @scala.inline
    implicit class CSINodeMutableBuilder[Self <: CSINode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[storageDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CSINode]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[CSINodeSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * CSINodeDriver holds information about the specification of one CSI driver installed on a node
    */
  trait CSINodeDriver extends StObject {
    
    /**
      * allocatable represents the volume resources of a node that are available for scheduling. This field is beta.
      */
    var allocatable: js.UndefOr[Input[VolumeNodeResources]] = js.undefined
    
    /**
      * This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.
      */
    var name: Input[String]
    
    /**
      * nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as "node1", but the storage system may refer to the same node as "nodeA". When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. "nodeA" instead of "node1". This field is required.
      */
    var nodeID: Input[String]
    
    /**
      * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. "company.com/zone", "company.com/region"). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
      */
    var topologyKeys: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object CSINodeDriver {
    
    @scala.inline
    def apply(name: Input[String], nodeID: Input[String]): CSINodeDriver = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeID = nodeID.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSINodeDriver]
    }
    
    @scala.inline
    implicit class CSINodeDriverMutableBuilder[Self <: CSINodeDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocatable(value: Input[VolumeNodeResources]): Self = StObject.set(x, "allocatable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllocatableUndefined: Self = StObject.set(x, "allocatable", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeID(value: Input[String]): Self = StObject.set(x, "nodeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopologyKeys(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "topologyKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopologyKeysUndefined: Self = StObject.set(x, "topologyKeys", js.undefined)
      
      @scala.inline
      def setTopologyKeysVarargs(value: Input[String]*): Self = StObject.set(x, "topologyKeys", js.Array(value :_*))
    }
  }
  
  /**
    * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
    */
  trait CSINodeSpec extends StObject {
    
    /**
      * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
      */
    var drivers: Input[js.Array[Input[CSINodeDriver]]]
  }
  object CSINodeSpec {
    
    @scala.inline
    def apply(drivers: Input[js.Array[Input[CSINodeDriver]]]): CSINodeSpec = {
      val __obj = js.Dynamic.literal(drivers = drivers.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSINodeSpec]
    }
    
    @scala.inline
    implicit class CSINodeSpecMutableBuilder[Self <: CSINodeSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrivers(value: Input[js.Array[Input[CSINodeDriver]]]): Self = StObject.set(x, "drivers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriversVarargs(value: Input[CSINodeDriver]*): Self = StObject.set(x, "drivers", js.Array(value :_*))
    }
  }
  
  /**
    * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
    *
    * StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
    */
  trait StorageClass extends StObject {
    
    /**
      * AllowVolumeExpansion shows whether the storage class allow volume expand
      */
    var allowVolumeExpansion: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
      */
    var allowedTopologies: js.UndefOr[Input[js.Array[Input[TopologySelectorTerm]]]] = js.undefined
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass]] = js.undefined
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
      */
    var mountOptions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
      */
    var parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Provisioner indicates the type of the provisioner.
      */
    var provisioner: Input[String]
    
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
      */
    var reclaimPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
      */
    var volumeBindingMode: js.UndefOr[Input[String]] = js.undefined
  }
  object StorageClass {
    
    @scala.inline
    def apply(provisioner: Input[String]): StorageClass = {
      val __obj = js.Dynamic.literal(provisioner = provisioner.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageClass]
    }
    
    @scala.inline
    implicit class StorageClassMutableBuilder[Self <: StorageClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowVolumeExpansion(value: Input[Boolean]): Self = StObject.set(x, "allowVolumeExpansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowVolumeExpansionUndefined: Self = StObject.set(x, "allowVolumeExpansion", js.undefined)
      
      @scala.inline
      def setAllowedTopologies(value: Input[js.Array[Input[TopologySelectorTerm]]]): Self = StObject.set(x, "allowedTopologies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedTopologiesUndefined: Self = StObject.set(x, "allowedTopologies", js.undefined)
      
      @scala.inline
      def setAllowedTopologiesVarargs(value: Input[TopologySelectorTerm]*): Self = StObject.set(x, "allowedTopologies", js.Array(value :_*))
      
      @scala.inline
      def setApiVersion(value: Input[storageDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setMountOptions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountOptionsUndefined: Self = StObject.set(x, "mountOptions", js.undefined)
      
      @scala.inline
      def setMountOptionsVarargs(value: Input[String]*): Self = StObject.set(x, "mountOptions", js.Array(value :_*))
      
      @scala.inline
      def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setProvisioner(value: Input[String]): Self = StObject.set(x, "provisioner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReclaimPolicy(value: Input[String]): Self = StObject.set(x, "reclaimPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReclaimPolicyUndefined: Self = StObject.set(x, "reclaimPolicy", js.undefined)
      
      @scala.inline
      def setVolumeBindingMode(value: Input[String]): Self = StObject.set(x, "volumeBindingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeBindingModeUndefined: Self = StObject.set(x, "volumeBindingMode", js.undefined)
    }
  }
  
  /**
    * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
    *
    * VolumeAttachment objects are non-namespaced.
    */
  trait VolumeAttachment extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment]] = js.undefined
    
    /**
      * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
      */
    var spec: Input[VolumeAttachmentSpec]
    
    /**
      * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
      */
    var status: js.UndefOr[Input[VolumeAttachmentStatus]] = js.undefined
  }
  object VolumeAttachment {
    
    @scala.inline
    def apply(spec: Input[VolumeAttachmentSpec]): VolumeAttachment = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachment]
    }
    
    @scala.inline
    implicit class VolumeAttachmentMutableBuilder[Self <: VolumeAttachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[storageDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[VolumeAttachmentSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Input[VolumeAttachmentStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
    */
  trait VolumeAttachmentSource extends StObject {
    
    /**
      * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
      */
    var inlineVolumeSpec: js.UndefOr[Input[PersistentVolumeSpec]] = js.undefined
    
    /**
      * Name of the persistent volume to attach.
      */
    var persistentVolumeName: js.UndefOr[Input[String]] = js.undefined
  }
  object VolumeAttachmentSource {
    
    @scala.inline
    def apply(): VolumeAttachmentSource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VolumeAttachmentSource]
    }
    
    @scala.inline
    implicit class VolumeAttachmentSourceMutableBuilder[Self <: VolumeAttachmentSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInlineVolumeSpec(value: Input[PersistentVolumeSpec]): Self = StObject.set(x, "inlineVolumeSpec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineVolumeSpecUndefined: Self = StObject.set(x, "inlineVolumeSpec", js.undefined)
      
      @scala.inline
      def setPersistentVolumeName(value: Input[String]): Self = StObject.set(x, "persistentVolumeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentVolumeNameUndefined: Self = StObject.set(x, "persistentVolumeName", js.undefined)
    }
  }
  
  /**
    * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
    */
  trait VolumeAttachmentSpec extends StObject {
    
    /**
      * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
      */
    var attacher: Input[String]
    
    /**
      * The node that the volume should be attached to.
      */
    var nodeName: Input[String]
    
    /**
      * Source represents the volume that should be attached.
      */
    var source: Input[VolumeAttachmentSource]
  }
  object VolumeAttachmentSpec {
    
    @scala.inline
    def apply(attacher: Input[String], nodeName: Input[String], source: Input[VolumeAttachmentSource]): VolumeAttachmentSpec = {
      val __obj = js.Dynamic.literal(attacher = attacher.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachmentSpec]
    }
    
    @scala.inline
    implicit class VolumeAttachmentSpecMutableBuilder[Self <: VolumeAttachmentSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttacher(value: Input[String]): Self = StObject.set(x, "attacher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeName(value: Input[String]): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: Input[VolumeAttachmentSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * VolumeAttachmentStatus is the status of a VolumeAttachment request.
    */
  trait VolumeAttachmentStatus extends StObject {
    
    /**
      * The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
      */
    var attachError: js.UndefOr[Input[VolumeError]] = js.undefined
    
    /**
      * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
      */
    var attached: Input[Boolean]
    
    /**
      * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
      */
    var attachmentMetadata: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
      */
    var detachError: js.UndefOr[Input[VolumeError]] = js.undefined
  }
  object VolumeAttachmentStatus {
    
    @scala.inline
    def apply(attached: Input[Boolean]): VolumeAttachmentStatus = {
      val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachmentStatus]
    }
    
    @scala.inline
    implicit class VolumeAttachmentStatusMutableBuilder[Self <: VolumeAttachmentStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachError(value: Input[VolumeError]): Self = StObject.set(x, "attachError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachErrorUndefined: Self = StObject.set(x, "attachError", js.undefined)
      
      @scala.inline
      def setAttached(value: Input[Boolean]): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentMetadata(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "attachmentMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentMetadataUndefined: Self = StObject.set(x, "attachmentMetadata", js.undefined)
      
      @scala.inline
      def setDetachError(value: Input[VolumeError]): Self = StObject.set(x, "detachError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachErrorUndefined: Self = StObject.set(x, "detachError", js.undefined)
    }
  }
  
  /**
    * VolumeError captures an error encountered during a volume operation.
    */
  trait VolumeError extends StObject {
    
    /**
      * String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
      */
    var message: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Time the error was encountered.
      */
    var time: js.UndefOr[Input[String]] = js.undefined
  }
  object VolumeError {
    
    @scala.inline
    def apply(): VolumeError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VolumeError]
    }
    
    @scala.inline
    implicit class VolumeErrorMutableBuilder[Self <: VolumeError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setTime(value: Input[String]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  /**
    * VolumeNodeResources is a set of resource limits for scheduling of volumes.
    */
  trait VolumeNodeResources extends StObject {
    
    /**
      * Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is not specified, then the supported number of volumes on this node is unbounded.
      */
    var count: js.UndefOr[Input[Double]] = js.undefined
  }
  object VolumeNodeResources {
    
    @scala.inline
    def apply(): VolumeNodeResources = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VolumeNodeResources]
    }
    
    @scala.inline
    implicit class VolumeNodeResourcesMutableBuilder[Self <: VolumeNodeResources] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    }
  }
}
