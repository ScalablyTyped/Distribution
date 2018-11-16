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
      var allowVolumeExpansion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Dynamically provisioned PersistentVolumes of this storage class are created with these
                   * mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one
                   * is invalid.
                   */
      var mountOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Parameters holds the parameters for the provisioner that should create volumes of this
                   * storage class.
                   */
      var parameters: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
                   * Provisioner indicates the type of the provisioner.
                   */
      var provisioner: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Dynamically provisioned PersistentVolumes of this storage class are created with this
                   * reclaimPolicy. Defaults to Delete.
                   */
      var reclaimPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
                   * When unset, VolumeBindingImmediate is used. This field is alpha-level and is only honored
                   * by servers that enable the VolumeScheduling feature.
                   */
      var volumeBindingMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
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
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is the list of StorageClasses
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[StorageClass]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    def isStorageClass(o: js.Any): /* is StorageClass */scala.Boolean = js.native
    def isStorageClassList(o: js.Any): /* is StorageClassList */scala.Boolean = js.native
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
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes
                   * system.
                   */
      var spec: atPulumiPulumiLib.resourceMod.Input[VolumeAttachmentSpec]
      /**
                   * Status of the VolumeAttachment request. Populated by the entity completing the attach or
                   * detach operation, i.e. the external-attacher.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[VolumeAttachmentStatus]] = js.undefined
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
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is the list of VolumeAttachments
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[VolumeAttachment]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
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
      var persistentVolumeName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
             */
    
    trait VolumeAttachmentSpec extends js.Object {
      /**
                   * Attacher indicates the name of the volume driver that MUST handle this request. This is the
                   * name returned by GetPluginName().
                   */
      var attacher: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * The node that the volume should be attached to.
                   */
      var nodeName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Source represents the volume that should be attached.
                   */
      var source: atPulumiPulumiLib.resourceMod.Input[VolumeAttachmentSource]
    }
    
    /**
             * VolumeAttachmentStatus is the status of a VolumeAttachment request.
             */
    
    trait VolumeAttachmentStatus extends js.Object {
      /**
                   * The last error encountered during attach operation, if any. This field must only be set by
                   * the entity completing the attach operation, i.e. the external-attacher.
                   */
      var attachError: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[VolumeError]] = js.undefined
      /**
                   * Indicates the volume is successfully attached. This field must only be set by the entity
                   * completing the attach operation, i.e. the external-attacher.
                   */
      var attached: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
      /**
                   * Upon successful attach, this field is populated with any information returned by the attach
                   * operation that must be passed into subsequent WaitForAttach or Mount calls. This field must
                   * only be set by the entity completing the attach operation, i.e. the external-attacher.
                   */
      var attachmentMetadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
                   * The last error encountered during detach operation, if any. This field must only be set by
                   * the entity completing the detach operation, i.e. the external-attacher.
                   */
      var detachError: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[VolumeError]] = js.undefined
    }
    
    /**
             * VolumeError captures an error encountered during a volume operation.
             */
    
    trait VolumeError extends js.Object {
      /**
                   * String detailing the error encountered during Attach or Detach operation. This string maybe
                   * logged, so it should not contain sensitive information.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Time the error was encountered.
                   */
      var time: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isVolumeAttachment(o: js.Any): /* is VolumeAttachment */scala.Boolean = js.native
    def isVolumeAttachmentList(o: js.Any): /* is VolumeAttachmentList */scala.Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
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
      var allowVolumeExpansion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Dynamically provisioned PersistentVolumes of this storage class are created with these
                   * mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one
                   * is invalid.
                   */
      var mountOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Parameters holds the parameters for the provisioner that should create volumes of this
                   * storage class.
                   */
      var parameters: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
                   * Provisioner indicates the type of the provisioner.
                   */
      var provisioner: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Dynamically provisioned PersistentVolumes of this storage class are created with this
                   * reclaimPolicy. Defaults to Delete.
                   */
      var reclaimPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
                   * When unset, VolumeBindingImmediate is used. This field is alpha-level and is only honored
                   * by servers that enable the VolumeScheduling feature.
                   */
      var volumeBindingMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
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
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is the list of StorageClasses
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[StorageClass]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    def isStorageClass(o: js.Any): /* is StorageClass */scala.Boolean = js.native
    def isStorageClassList(o: js.Any): /* is StorageClassList */scala.Boolean = js.native
  }
  
}

