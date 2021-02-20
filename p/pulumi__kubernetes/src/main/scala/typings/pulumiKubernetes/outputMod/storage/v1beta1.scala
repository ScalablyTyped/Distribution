package typings.pulumiKubernetes.outputMod.storage

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.outputMod.core.v1.PersistentVolumeSpec
import typings.pulumiKubernetes.outputMod.core.v1.TopologySelectorTerm
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1 {
  
  /**
    * CSIDriver captures information about a Container Storage Interface (CSI) volume driver deployed on the cluster. CSI drivers do not need to create the CSIDriver object directly. Instead they may use the cluster-driver-registrar sidecar container. When deployed with a CSI driver it automatically creates a CSIDriver object representing the driver. Kubernetes attach detach controller uses this object to determine whether attach is required. Kubelet uses this object to determine whether pod information needs to be passed on mount. CSIDriver objects are non-namespaced.
    */
  @js.native
  trait CSIDriver extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: storageDotk8sDotioSlashv1beta1 = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CSIDriver = js.native
    
    /**
      * Standard object metadata. metadata.Name indicates the name of the CSI driver that this object refers to; it MUST be the same name returned by the CSI GetPluginName() call for that driver. The driver name must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMeta = js.native
    
    /**
      * Specification of the CSI Driver.
      */
    var spec: CSIDriverSpec = js.native
  }
  object CSIDriver {
    
    @scala.inline
    def apply(
      apiVersion: storageDotk8sDotioSlashv1beta1,
      kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CSIDriver,
      metadata: ObjectMeta,
      spec: CSIDriverSpec
    ): CSIDriver = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSIDriver]
    }
    
    @scala.inline
    implicit class CSIDriverMutableBuilder[Self <: CSIDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: storageDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.CSIDriver): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpec(value: CSIDriverSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * CSIDriverSpec is the specification of a CSIDriver.
    */
  @js.native
  trait CSIDriverSpec extends StObject {
    
    /**
      * attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
      */
    var attachRequired: Boolean = js.native
    
    /**
      * Defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details. This field is alpha-level, and is only honored by servers that enable the CSIVolumeFSGroupPolicy feature gate.
      */
    var fsGroupPolicy: String = js.native
    
    /**
      * If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID) "csi.storage.k8s.io/ephemeral": "true" iff the volume is an ephemeral inline volume
      *                                 defined by a CSIVolumeSource, otherwise "false"
      *
      * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
      */
    var podInfoOnMount: Boolean = js.native
    
    /**
      * If set to true, storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information.
      *
      * The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
      *
      * Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
      *
      * This is an alpha field and only available when the CSIStorageCapacity feature is enabled. The default is false.
      */
    var storageCapacity: Boolean = js.native
    
    /**
      * VolumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is "Persistent", which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is "Ephemeral". In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
      */
    var volumeLifecycleModes: js.Array[String] = js.native
  }
  object CSIDriverSpec {
    
    @scala.inline
    def apply(
      attachRequired: Boolean,
      fsGroupPolicy: String,
      podInfoOnMount: Boolean,
      storageCapacity: Boolean,
      volumeLifecycleModes: js.Array[String]
    ): CSIDriverSpec = {
      val __obj = js.Dynamic.literal(attachRequired = attachRequired.asInstanceOf[js.Any], fsGroupPolicy = fsGroupPolicy.asInstanceOf[js.Any], podInfoOnMount = podInfoOnMount.asInstanceOf[js.Any], storageCapacity = storageCapacity.asInstanceOf[js.Any], volumeLifecycleModes = volumeLifecycleModes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSIDriverSpec]
    }
    
    @scala.inline
    implicit class CSIDriverSpecMutableBuilder[Self <: CSIDriverSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachRequired(value: Boolean): Self = StObject.set(x, "attachRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsGroupPolicy(value: String): Self = StObject.set(x, "fsGroupPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPodInfoOnMount(value: Boolean): Self = StObject.set(x, "podInfoOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageCapacity(value: Boolean): Self = StObject.set(x, "storageCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeLifecycleModes(value: js.Array[String]): Self = StObject.set(x, "volumeLifecycleModes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeLifecycleModesVarargs(value: String*): Self = StObject.set(x, "volumeLifecycleModes", js.Array(value :_*))
    }
  }
  
  /**
    * CSINode holds information about all CSI drivers installed on a node. CSI drivers do not need to create the CSINode object directly. As long as they use the node-driver-registrar sidecar container, the kubelet will automatically populate the CSINode object for the CSI driver as part of kubelet plugin registration. CSINode has the same name as a node. If the object is missing, it means either there are no CSI Drivers available on the node, or the Kubelet version is low enough that it doesn't create this object. CSINode has an OwnerReference that points to the corresponding node object.
    */
  @js.native
  trait CSINode extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: storageDotk8sDotioSlashv1beta1 = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CSINode = js.native
    
    /**
      * metadata.name must be the Kubernetes node name.
      */
    var metadata: ObjectMeta = js.native
    
    /**
      * spec is the specification of CSINode
      */
    var spec: CSINodeSpec = js.native
  }
  object CSINode {
    
    @scala.inline
    def apply(
      apiVersion: storageDotk8sDotioSlashv1beta1,
      kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CSINode,
      metadata: ObjectMeta,
      spec: CSINodeSpec
    ): CSINode = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSINode]
    }
    
    @scala.inline
    implicit class CSINodeMutableBuilder[Self <: CSINode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: storageDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.CSINode): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpec(value: CSINodeSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * CSINodeDriver holds information about the specification of one CSI driver installed on a node
    */
  @js.native
  trait CSINodeDriver extends StObject {
    
    /**
      * allocatable represents the volume resources of a node that are available for scheduling.
      */
    var allocatable: VolumeNodeResources = js.native
    
    /**
      * This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.
      */
    var name: String = js.native
    
    /**
      * nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as "node1", but the storage system may refer to the same node as "nodeA". When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. "nodeA" instead of "node1". This field is required.
      */
    var nodeID: String = js.native
    
    /**
      * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. "company.com/zone", "company.com/region"). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
      */
    var topologyKeys: js.Array[String] = js.native
  }
  object CSINodeDriver {
    
    @scala.inline
    def apply(allocatable: VolumeNodeResources, name: String, nodeID: String, topologyKeys: js.Array[String]): CSINodeDriver = {
      val __obj = js.Dynamic.literal(allocatable = allocatable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeID = nodeID.asInstanceOf[js.Any], topologyKeys = topologyKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSINodeDriver]
    }
    
    @scala.inline
    implicit class CSINodeDriverMutableBuilder[Self <: CSINodeDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocatable(value: VolumeNodeResources): Self = StObject.set(x, "allocatable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeID(value: String): Self = StObject.set(x, "nodeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopologyKeys(value: js.Array[String]): Self = StObject.set(x, "topologyKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopologyKeysVarargs(value: String*): Self = StObject.set(x, "topologyKeys", js.Array(value :_*))
    }
  }
  
  /**
    * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
    */
  @js.native
  trait CSINodeSpec extends StObject {
    
    /**
      * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
      */
    var drivers: js.Array[CSINodeDriver] = js.native
  }
  object CSINodeSpec {
    
    @scala.inline
    def apply(drivers: js.Array[CSINodeDriver]): CSINodeSpec = {
      val __obj = js.Dynamic.literal(drivers = drivers.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSINodeSpec]
    }
    
    @scala.inline
    implicit class CSINodeSpecMutableBuilder[Self <: CSINodeSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrivers(value: js.Array[CSINodeDriver]): Self = StObject.set(x, "drivers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriversVarargs(value: CSINodeDriver*): Self = StObject.set(x, "drivers", js.Array(value :_*))
    }
  }
  
  /**
    * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
    *
    * StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
    */
  @js.native
  trait StorageClass extends StObject {
    
    /**
      * AllowVolumeExpansion shows whether the storage class allow volume expand
      */
    var allowVolumeExpansion: Boolean = js.native
    
    /**
      * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
      */
    var allowedTopologies: js.Array[TopologySelectorTerm] = js.native
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: storageDotk8sDotioSlashv1beta1 = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass = js.native
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMeta = js.native
    
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
      */
    var mountOptions: js.Array[String] = js.native
    
    /**
      * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
      */
    var parameters: StringDictionary[String] = js.native
    
    /**
      * Provisioner indicates the type of the provisioner.
      */
    var provisioner: String = js.native
    
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
      */
    var reclaimPolicy: String = js.native
    
    /**
      * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
      */
    var volumeBindingMode: String = js.native
  }
  object StorageClass {
    
    @scala.inline
    def apply(
      allowVolumeExpansion: Boolean,
      allowedTopologies: js.Array[TopologySelectorTerm],
      apiVersion: storageDotk8sDotioSlashv1beta1,
      kind: typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass,
      metadata: ObjectMeta,
      mountOptions: js.Array[String],
      parameters: StringDictionary[String],
      provisioner: String,
      reclaimPolicy: String,
      volumeBindingMode: String
    ): StorageClass = {
      val __obj = js.Dynamic.literal(allowVolumeExpansion = allowVolumeExpansion.asInstanceOf[js.Any], allowedTopologies = allowedTopologies.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mountOptions = mountOptions.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], provisioner = provisioner.asInstanceOf[js.Any], reclaimPolicy = reclaimPolicy.asInstanceOf[js.Any], volumeBindingMode = volumeBindingMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageClass]
    }
    
    @scala.inline
    implicit class StorageClassMutableBuilder[Self <: StorageClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowVolumeExpansion(value: Boolean): Self = StObject.set(x, "allowVolumeExpansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedTopologies(value: js.Array[TopologySelectorTerm]): Self = StObject.set(x, "allowedTopologies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedTopologiesVarargs(value: TopologySelectorTerm*): Self = StObject.set(x, "allowedTopologies", js.Array(value :_*))
      
      @scala.inline
      def setApiVersion(value: storageDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.StorageClass): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountOptions(value: js.Array[String]): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountOptionsVarargs(value: String*): Self = StObject.set(x, "mountOptions", js.Array(value :_*))
      
      @scala.inline
      def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisioner(value: String): Self = StObject.set(x, "provisioner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReclaimPolicy(value: String): Self = StObject.set(x, "reclaimPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeBindingMode(value: String): Self = StObject.set(x, "volumeBindingMode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
    *
    * VolumeAttachment objects are non-namespaced.
    */
  @js.native
  trait VolumeAttachment extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: storageDotk8sDotioSlashv1beta1 = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment = js.native
    
    /**
      * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMeta = js.native
    
    /**
      * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
      */
    var spec: VolumeAttachmentSpec = js.native
    
    /**
      * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
      */
    var status: VolumeAttachmentStatus = js.native
  }
  object VolumeAttachment {
    
    @scala.inline
    def apply(
      apiVersion: storageDotk8sDotioSlashv1beta1,
      kind: typings.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment,
      metadata: ObjectMeta,
      spec: VolumeAttachmentSpec,
      status: VolumeAttachmentStatus
    ): VolumeAttachment = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachment]
    }
    
    @scala.inline
    implicit class VolumeAttachmentMutableBuilder[Self <: VolumeAttachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: storageDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpec(value: VolumeAttachmentSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: VolumeAttachmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
    */
  @js.native
  trait VolumeAttachmentSource extends StObject {
    
    /**
      * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
      */
    var inlineVolumeSpec: PersistentVolumeSpec = js.native
    
    /**
      * Name of the persistent volume to attach.
      */
    var persistentVolumeName: String = js.native
  }
  object VolumeAttachmentSource {
    
    @scala.inline
    def apply(inlineVolumeSpec: PersistentVolumeSpec, persistentVolumeName: String): VolumeAttachmentSource = {
      val __obj = js.Dynamic.literal(inlineVolumeSpec = inlineVolumeSpec.asInstanceOf[js.Any], persistentVolumeName = persistentVolumeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachmentSource]
    }
    
    @scala.inline
    implicit class VolumeAttachmentSourceMutableBuilder[Self <: VolumeAttachmentSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInlineVolumeSpec(value: PersistentVolumeSpec): Self = StObject.set(x, "inlineVolumeSpec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentVolumeName(value: String): Self = StObject.set(x, "persistentVolumeName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
    */
  @js.native
  trait VolumeAttachmentSpec extends StObject {
    
    /**
      * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
      */
    var attacher: String = js.native
    
    /**
      * The node that the volume should be attached to.
      */
    var nodeName: String = js.native
    
    /**
      * Source represents the volume that should be attached.
      */
    var source: VolumeAttachmentSource = js.native
  }
  object VolumeAttachmentSpec {
    
    @scala.inline
    def apply(attacher: String, nodeName: String, source: VolumeAttachmentSource): VolumeAttachmentSpec = {
      val __obj = js.Dynamic.literal(attacher = attacher.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachmentSpec]
    }
    
    @scala.inline
    implicit class VolumeAttachmentSpecMutableBuilder[Self <: VolumeAttachmentSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttacher(value: String): Self = StObject.set(x, "attacher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: VolumeAttachmentSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * VolumeAttachmentStatus is the status of a VolumeAttachment request.
    */
  @js.native
  trait VolumeAttachmentStatus extends StObject {
    
    /**
      * The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
      */
    var attachError: VolumeError = js.native
    
    /**
      * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
      */
    var attached: Boolean = js.native
    
    /**
      * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
      */
    var attachmentMetadata: StringDictionary[String] = js.native
    
    /**
      * The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
      */
    var detachError: VolumeError = js.native
  }
  object VolumeAttachmentStatus {
    
    @scala.inline
    def apply(
      attachError: VolumeError,
      attached: Boolean,
      attachmentMetadata: StringDictionary[String],
      detachError: VolumeError
    ): VolumeAttachmentStatus = {
      val __obj = js.Dynamic.literal(attachError = attachError.asInstanceOf[js.Any], attached = attached.asInstanceOf[js.Any], attachmentMetadata = attachmentMetadata.asInstanceOf[js.Any], detachError = detachError.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachmentStatus]
    }
    
    @scala.inline
    implicit class VolumeAttachmentStatusMutableBuilder[Self <: VolumeAttachmentStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachError(value: VolumeError): Self = StObject.set(x, "attachError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttached(value: Boolean): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentMetadata(value: StringDictionary[String]): Self = StObject.set(x, "attachmentMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachError(value: VolumeError): Self = StObject.set(x, "detachError", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * VolumeError captures an error encountered during a volume operation.
    */
  @js.native
  trait VolumeError extends StObject {
    
    /**
      * String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
      */
    var message: String = js.native
    
    /**
      * Time the error was encountered.
      */
    var time: String = js.native
  }
  object VolumeError {
    
    @scala.inline
    def apply(message: String, time: String): VolumeError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeError]
    }
    
    @scala.inline
    implicit class VolumeErrorMutableBuilder[Self <: VolumeError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * VolumeNodeResources is a set of resource limits for scheduling of volumes.
    */
  @js.native
  trait VolumeNodeResources extends StObject {
    
    /**
      * Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is nil, then the supported number of volumes on this node is unbounded.
      */
    var count: Double = js.native
  }
  object VolumeNodeResources {
    
    @scala.inline
    def apply(count: Double): VolumeNodeResources = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeNodeResources]
    }
    
    @scala.inline
    implicit class VolumeNodeResourcesMutableBuilder[Self <: VolumeNodeResources] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
}
