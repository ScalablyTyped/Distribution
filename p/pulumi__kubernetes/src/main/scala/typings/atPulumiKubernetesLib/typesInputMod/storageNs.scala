package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "storage")
@js.native
object storageNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * StorageClass describes the parameters for a class of storage for which PersistentVolumes can
      * be dynamically provisioned.
      *
      * StorageClasses are non-namespaced; the name of the storage class according to etcd is in
      * ObjectMeta.Name.
      */
    trait StorageClass extends js.Object {
      /**
        * AllowVolumeExpansion shows whether the storage class allow volume expand
        */
      var allowVolumeExpansion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
      /**
        * Restrict the node topologies where volumes can be dynamically provisioned. Each volume
        * plugin defines its own supported topology specifications. An empty TopologySelectorTerm
        * list means there is no topology restriction. This field is only honored by servers that
        * enable the VolumeScheduling feature.
        */
      var allowedTopologies: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[
              js.Array[
                atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.TopologySelectorTerm]
              ]
            ]
          ] = js.undefined
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClass]
          ] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Dynamically provisioned PersistentVolumes of this storage class are created with these
        * mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one
        * is invalid.
        */
      var mountOptions: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
          ] = js.undefined
      /**
        * Parameters holds the parameters for the provisioner that should create volumes of this
        * storage class.
        */
      var parameters: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[
              org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
        * Provisioner indicates the type of the provisioner.
        */
      var provisioner: atPulumiPulumiLib.outputMod.Input[java.lang.String]
      /**
        * Dynamically provisioned PersistentVolumes of this storage class are created with this
        * reclaimPolicy. Defaults to Delete.
        */
      var reclaimPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
        * When unset, VolumeBindingImmediate is used. This field is only honored by servers that
        * enable the VolumeScheduling feature.
        */
      var volumeBindingMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * StorageClassList is a collection of storage classes.
      */
    trait StorageClassList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`]
          ] = js.undefined
      /**
        * Items is the list of StorageClasses
        */
      var items: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[StorageClass]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClassList]
          ] = js.undefined
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * VolumeAttachment captures the intent to attach or detach the specified volume to/from the
      * specified node.
      *
      * VolumeAttachment objects are non-namespaced.
      */
    trait VolumeAttachment extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachment]
          ] = js.undefined
      /**
        * Standard object metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes
        * system.
        */
      var spec: atPulumiPulumiLib.outputMod.Input[VolumeAttachmentSpec]
      /**
        * Status of the VolumeAttachment request. Populated by the entity completing the attach or
        * detach operation, i.e. the external-attacher.
        */
      var status: js.UndefOr[atPulumiPulumiLib.outputMod.Input[VolumeAttachmentStatus]] = js.undefined
    }
    
    /**
      * VolumeAttachmentList is a collection of VolumeAttachment objects.
      */
    trait VolumeAttachmentList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`]
          ] = js.undefined
      /**
        * Items is the list of VolumeAttachments
        */
      var items: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[VolumeAttachment]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachmentList]
          ] = js.undefined
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * VolumeAttachmentSource represents a volume that should be attached. Right now only
      * PersistenVolumes can be attached via external attacher, in future we may allow also inline
      * volumes in pods. Exactly one member can be set.
      */
    trait VolumeAttachmentSource extends js.Object {
      /**
        * Name of the persistent volume to attach.
        */
      var persistentVolumeName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
      */
    trait VolumeAttachmentSpec extends js.Object {
      /**
        * Attacher indicates the name of the volume driver that MUST handle this request. This is the
        * name returned by GetPluginName().
        */
      var attacher: atPulumiPulumiLib.outputMod.Input[java.lang.String]
      /**
        * The node that the volume should be attached to.
        */
      var nodeName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
      /**
        * Source represents the volume that should be attached.
        */
      var source: atPulumiPulumiLib.outputMod.Input[VolumeAttachmentSource]
    }
    
    /**
      * VolumeAttachmentStatus is the status of a VolumeAttachment request.
      */
    trait VolumeAttachmentStatus extends js.Object {
      /**
        * The last error encountered during attach operation, if any. This field must only be set by
        * the entity completing the attach operation, i.e. the external-attacher.
        */
      var attachError: js.UndefOr[atPulumiPulumiLib.outputMod.Input[VolumeError]] = js.undefined
      /**
        * Indicates the volume is successfully attached. This field must only be set by the entity
        * completing the attach operation, i.e. the external-attacher.
        */
      var attached: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
      /**
        * Upon successful attach, this field is populated with any information returned by the attach
        * operation that must be passed into subsequent WaitForAttach or Mount calls. This field must
        * only be set by the entity completing the attach operation, i.e. the external-attacher.
        */
      var attachmentMetadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[
              org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
        * The last error encountered during detach operation, if any. This field must only be set by
        * the entity completing the detach operation, i.e. the external-attacher.
        */
      var detachError: js.UndefOr[atPulumiPulumiLib.outputMod.Input[VolumeError]] = js.undefined
    }
    
    /**
      * VolumeError captures an error encountered during a volume operation.
      */
    trait VolumeError extends js.Object {
      /**
        * String detailing the error encountered during Attach or Detach operation. This string may
        * be logged, so it should not contain sensitive information.
        */
      var message: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * Time the error was encountered.
        */
      var time: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
    }
    
    def isStorageClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1.StorageClass */ scala.Boolean = js.native
    def isStorageClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1.StorageClassList */ scala.Boolean = js.native
    def isVolumeAttachment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1.VolumeAttachment */ scala.Boolean = js.native
    def isVolumeAttachmentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1.VolumeAttachmentList */ scala.Boolean = js.native
  }
  
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
      * VolumeAttachment captures the intent to attach or detach the specified volume to/from the
      * specified node.
      *
      * VolumeAttachment objects are non-namespaced.
      */
    trait VolumeAttachment extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachment]
          ] = js.undefined
      /**
        * Standard object metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes
        * system.
        */
      var spec: atPulumiPulumiLib.outputMod.Input[VolumeAttachmentSpec]
      /**
        * Status of the VolumeAttachment request. Populated by the entity completing the attach or
        * detach operation, i.e. the external-attacher.
        */
      var status: js.UndefOr[atPulumiPulumiLib.outputMod.Input[VolumeAttachmentStatus]] = js.undefined
    }
    
    /**
      * VolumeAttachmentList is a collection of VolumeAttachment objects.
      */
    trait VolumeAttachmentList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1`]
          ] = js.undefined
      /**
        * Items is the list of VolumeAttachments
        */
      var items: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[VolumeAttachment]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachmentList]
          ] = js.undefined
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * VolumeAttachmentSource represents a volume that should be attached. Right now only
      * PersistenVolumes can be attached via external attacher, in future we may allow also inline
      * volumes in pods. Exactly one member can be set.
      */
    trait VolumeAttachmentSource extends js.Object {
      /**
        * Name of the persistent volume to attach.
        */
      var persistentVolumeName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
      */
    trait VolumeAttachmentSpec extends js.Object {
      /**
        * Attacher indicates the name of the volume driver that MUST handle this request. This is the
        * name returned by GetPluginName().
        */
      var attacher: atPulumiPulumiLib.outputMod.Input[java.lang.String]
      /**
        * The node that the volume should be attached to.
        */
      var nodeName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
      /**
        * Source represents the volume that should be attached.
        */
      var source: atPulumiPulumiLib.outputMod.Input[VolumeAttachmentSource]
    }
    
    /**
      * VolumeAttachmentStatus is the status of a VolumeAttachment request.
      */
    trait VolumeAttachmentStatus extends js.Object {
      /**
        * The last error encountered during attach operation, if any. This field must only be set by
        * the entity completing the attach operation, i.e. the external-attacher.
        */
      var attachError: js.UndefOr[atPulumiPulumiLib.outputMod.Input[VolumeError]] = js.undefined
      /**
        * Indicates the volume is successfully attached. This field must only be set by the entity
        * completing the attach operation, i.e. the external-attacher.
        */
      var attached: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
      /**
        * Upon successful attach, this field is populated with any information returned by the attach
        * operation that must be passed into subsequent WaitForAttach or Mount calls. This field must
        * only be set by the entity completing the attach operation, i.e. the external-attacher.
        */
      var attachmentMetadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[
              org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
        * The last error encountered during detach operation, if any. This field must only be set by
        * the entity completing the detach operation, i.e. the external-attacher.
        */
      var detachError: js.UndefOr[atPulumiPulumiLib.outputMod.Input[VolumeError]] = js.undefined
    }
    
    /**
      * VolumeError captures an error encountered during a volume operation.
      */
    trait VolumeError extends js.Object {
      /**
        * String detailing the error encountered during Attach or Detach operation. This string maybe
        * logged, so it should not contain sensitive information.
        */
      var message: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * Time the error was encountered.
        */
      var time: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
    }
    
    def isVolumeAttachment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1alpha1.VolumeAttachment */ scala.Boolean = js.native
    def isVolumeAttachmentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1alpha1.VolumeAttachmentList */ scala.Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * CSIDriver captures information about a Container Storage Interface (CSI) volume driver
      * deployed on the cluster. CSI drivers do not need to create the CSIDriver object directly.
      * Instead they may use the cluster-driver-registrar sidecar container. When deployed with a CSI
      * driver it automatically creates a CSIDriver object representing the driver. Kubernetes attach
      * detach controller uses this object to determine whether attach is required. Kubelet uses this
      * object to determine whether pod information needs to be passed on mount. CSIDriver objects
      * are non-namespaced.
      */
    trait CSIDriver extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSIDriver]
          ] = js.undefined
      /**
        * Standard object metadata. metadata.Name indicates the name of the CSI driver that this
        * object refers to; it MUST be the same name returned by the CSI GetPluginName() call for
        * that driver. The driver name must be 63 characters or less, beginning and ending with an
        * alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between.
        * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Specification of the CSI Driver.
        */
      var spec: atPulumiPulumiLib.outputMod.Input[CSIDriverSpec]
    }
    
    /**
      * CSIDriverList is a collection of CSIDriver objects.
      */
    trait CSIDriverList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`]
          ] = js.undefined
      /**
        * items is the list of CSIDriver
        */
      var items: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[CSIDriver]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSIDriverList]
          ] = js.undefined
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * CSIDriverSpec is the specification of a CSIDriver.
      */
    trait CSIDriverSpec extends js.Object {
      /**
        * attachRequired indicates this CSI volume driver requires an attach operation (because it
        * implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach
        * controller should call the attach volume interface which checks the volumeattachment status
        * and waits until the volume is attached before proceeding to mounting. The CSI
        * external-attacher coordinates with CSI volume driver and updates the volumeattachment
        * status when the attach operation is complete. If the CSIDriverRegistry feature gate is
        * enabled and the value is specified to false, the attach operation will be skipped.
        * Otherwise the attach operation will be called.
        */
      var attachRequired: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
      /**
        * If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod
        * information (like podName, podUID, etc.) during mount operations. If set to false, pod
        * information will not be passed on mount. Default is false. The CSI driver specifies
        * podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as
        * VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for
        * parsing and validating the information passed in as VolumeContext. The following
        * VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the
        * prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name
        * "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid":
        * string(pod.UID)
        */
      var podInfoOnMount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
      * CSINode holds information about all CSI drivers installed on a node. CSI drivers do not need
      * to create the CSINode object directly. As long as they use the node-driver-registrar sidecar
      * container, the kubelet will automatically populate the CSINode object for the CSI driver as
      * part of kubelet plugin registration. CSINode has the same name as a node. If the object is
      * missing, it means either there are no CSI Drivers available on the node, or the Kubelet
      * version is low enough that it doesn't create this object. CSINode has an OwnerReference that
      * points to the corresponding node object.
      */
    trait CSINode extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSINode]
          ] = js.undefined
      /**
        * metadata.name must be the Kubernetes node name.
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * spec is the specification of CSINode
        */
      var spec: atPulumiPulumiLib.outputMod.Input[CSINodeSpec]
    }
    
    /**
      * CSINodeDriver holds information about the specification of one CSI driver installed on a node
      */
    trait CSINodeDriver extends js.Object {
      /**
        * This is the name of the CSI driver that this object refers to. This MUST be the same name
        * returned by the CSI GetPluginName() call for that driver.
        */
      var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
      /**
        * nodeID of the node from the driver point of view. This field enables Kubernetes to
        * communicate with storage systems that do not share the same nomenclature for nodes. For
        * example, Kubernetes may refer to a given node as "node1", but the storage system may refer
        * to the same node as "nodeA". When Kubernetes issues a command to the storage system to
        * attach a volume to a specific node, it can use this field to refer to the node name using
        * the ID that the storage system will understand, e.g. "nodeA" instead of "node1". This field
        * is required.
        */
      var nodeID: atPulumiPulumiLib.outputMod.Input[java.lang.String]
      /**
        * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a
        * cluster, it provides a set of topology keys that it understands (e.g. "company.com/zone",
        * "company.com/region"). When a driver is initialized on a node, it provides the same
        * topology keys along with values. Kubelet will expose these topology keys as labels on its
        * own node object. When Kubernetes does topology aware provisioning, it can use this list to
        * determine which labels it should retrieve from the node object and pass back to the driver.
        * It is possible for different nodes to use different topology keys. This can be empty if
        * driver does not support topology.
        */
      var topologyKeys: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
          ] = js.undefined
    }
    
    /**
      * CSINodeList is a collection of CSINode objects.
      */
    trait CSINodeList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`]
          ] = js.undefined
      /**
        * items is the list of CSINode
        */
      var items: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[CSINode]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSINodeList]
          ] = js.undefined
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
      */
    trait CSINodeSpec extends js.Object {
      /**
        * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in
        * the list are uninstalled, this can become empty.
        */
      var drivers: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[CSINodeDriver]]]
    }
    
    /**
      * StorageClass describes the parameters for a class of storage for which PersistentVolumes can
      * be dynamically provisioned.
      *
      * StorageClasses are non-namespaced; the name of the storage class according to etcd is in
      * ObjectMeta.Name.
      */
    trait StorageClass extends js.Object {
      /**
        * AllowVolumeExpansion shows whether the storage class allow volume expand
        */
      var allowVolumeExpansion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
      /**
        * Restrict the node topologies where volumes can be dynamically provisioned. Each volume
        * plugin defines its own supported topology specifications. An empty TopologySelectorTerm
        * list means there is no topology restriction. This field is only honored by servers that
        * enable the VolumeScheduling feature.
        */
      var allowedTopologies: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[
              js.Array[
                atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.TopologySelectorTerm]
              ]
            ]
          ] = js.undefined
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClass]
          ] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Dynamically provisioned PersistentVolumes of this storage class are created with these
        * mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one
        * is invalid.
        */
      var mountOptions: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
          ] = js.undefined
      /**
        * Parameters holds the parameters for the provisioner that should create volumes of this
        * storage class.
        */
      var parameters: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[
              org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
        * Provisioner indicates the type of the provisioner.
        */
      var provisioner: atPulumiPulumiLib.outputMod.Input[java.lang.String]
      /**
        * Dynamically provisioned PersistentVolumes of this storage class are created with this
        * reclaimPolicy. Defaults to Delete.
        */
      var reclaimPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
        * When unset, VolumeBindingImmediate is used. This field is only honored by servers that
        * enable the VolumeScheduling feature.
        */
      var volumeBindingMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * StorageClassList is a collection of storage classes.
      */
    trait StorageClassList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`]
          ] = js.undefined
      /**
        * Items is the list of StorageClasses
        */
      var items: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[StorageClass]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClassList]
          ] = js.undefined
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * VolumeAttachment captures the intent to attach or detach the specified volume to/from the
      * specified node.
      *
      * VolumeAttachment objects are non-namespaced.
      */
    trait VolumeAttachment extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachment]
          ] = js.undefined
      /**
        * Standard object metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes
        * system.
        */
      var spec: atPulumiPulumiLib.outputMod.Input[VolumeAttachmentSpec]
      /**
        * Status of the VolumeAttachment request. Populated by the entity completing the attach or
        * detach operation, i.e. the external-attacher.
        */
      var status: js.UndefOr[atPulumiPulumiLib.outputMod.Input[VolumeAttachmentStatus]] = js.undefined
    }
    
    /**
      * VolumeAttachmentList is a collection of VolumeAttachment objects.
      */
    trait VolumeAttachmentList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`]
          ] = js.undefined
      /**
        * Items is the list of VolumeAttachments
        */
      var items: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[VolumeAttachment]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.VolumeAttachmentList]
          ] = js.undefined
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * VolumeAttachmentSource represents a volume that should be attached. Right now only
      * PersistenVolumes can be attached via external attacher, in future we may allow also inline
      * volumes in pods. Exactly one member can be set.
      */
    trait VolumeAttachmentSource extends js.Object {
      /**
        * Name of the persistent volume to attach.
        */
      var persistentVolumeName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
      */
    trait VolumeAttachmentSpec extends js.Object {
      /**
        * Attacher indicates the name of the volume driver that MUST handle this request. This is the
        * name returned by GetPluginName().
        */
      var attacher: atPulumiPulumiLib.outputMod.Input[java.lang.String]
      /**
        * The node that the volume should be attached to.
        */
      var nodeName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
      /**
        * Source represents the volume that should be attached.
        */
      var source: atPulumiPulumiLib.outputMod.Input[VolumeAttachmentSource]
    }
    
    /**
      * VolumeAttachmentStatus is the status of a VolumeAttachment request.
      */
    trait VolumeAttachmentStatus extends js.Object {
      /**
        * The last error encountered during attach operation, if any. This field must only be set by
        * the entity completing the attach operation, i.e. the external-attacher.
        */
      var attachError: js.UndefOr[atPulumiPulumiLib.outputMod.Input[VolumeError]] = js.undefined
      /**
        * Indicates the volume is successfully attached. This field must only be set by the entity
        * completing the attach operation, i.e. the external-attacher.
        */
      var attached: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
      /**
        * Upon successful attach, this field is populated with any information returned by the attach
        * operation that must be passed into subsequent WaitForAttach or Mount calls. This field must
        * only be set by the entity completing the attach operation, i.e. the external-attacher.
        */
      var attachmentMetadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[
              org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
        * The last error encountered during detach operation, if any. This field must only be set by
        * the entity completing the detach operation, i.e. the external-attacher.
        */
      var detachError: js.UndefOr[atPulumiPulumiLib.outputMod.Input[VolumeError]] = js.undefined
    }
    
    /**
      * VolumeError captures an error encountered during a volume operation.
      */
    trait VolumeError extends js.Object {
      /**
        * String detailing the error encountered during Attach or Detach operation. This string may
        * be logged, so it should not contain sensitive information.
        */
      var message: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * Time the error was encountered.
        */
      var time: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
    }
    
    def isCSIDriver(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.CSIDriver */ scala.Boolean = js.native
    def isCSIDriverList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.CSIDriverList */ scala.Boolean = js.native
    def isCSINode(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.CSINode */ scala.Boolean = js.native
    def isCSINodeList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.CSINodeList */ scala.Boolean = js.native
    def isStorageClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.StorageClass */ scala.Boolean = js.native
    def isStorageClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.StorageClassList */ scala.Boolean = js.native
    def isVolumeAttachment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.VolumeAttachment */ scala.Boolean = js.native
    def isVolumeAttachmentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.VolumeAttachmentList */ scala.Boolean = js.native
  }
  
}

