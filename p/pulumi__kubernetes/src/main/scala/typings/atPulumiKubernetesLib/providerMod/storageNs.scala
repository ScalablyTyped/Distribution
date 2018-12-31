package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "storage")
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
    @js.native
    class StorageClass protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a storage.v1.StorageClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.StorageClass) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.StorageClass, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * AllowVolumeExpansion shows whether the storage class allow volume expand
        */
      val allowVolumeExpansion: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
      /**
        * Restrict the node topologies where volumes can be dynamically provisioned. Each volume
        * plugin defines its own supported topology specifications. An empty TopologySelectorTerm
        * list means there is no topology restriction. This field is only honored by servers that
        * enable the VolumeScheduling feature.
        */
      val allowedTopologies: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.TopologySelectorTerm]] = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Dynamically provisioned PersistentVolumes of this storage class are created with these
        * mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one
        * is invalid.
        */
      val mountOptions: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
      /**
        * Parameters holds the parameters for the provisioner that should create volumes of this
        * storage class.
        */
      val parameters: atPulumiPulumiLib.pulumiMod.Output[
            org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
          ] = js.native
      /**
        * Provisioner indicates the type of the provisioner.
        */
      val provisioner: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Dynamically provisioned PersistentVolumes of this storage class are created with this
        * reclaimPolicy. Defaults to Delete.
        */
      val reclaimPolicy: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
        * When unset, VolumeBindingImmediate is used. This field is only honored by servers that
        * enable the VolumeScheduling feature.
        */
      val volumeBindingMode: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.StorageClass = js.native
    }
    
    /**
      * StorageClassList is a collection of storage classes.
      */
    @js.native
    class StorageClassList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a storage.v1.StorageClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.StorageClassList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.StorageClassList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Items is the list of StorageClasses
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.StorageClass]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.StorageClassList = js.native
    }
    
    /**
      * VolumeAttachment captures the intent to attach or detach the specified volume to/from the
      * specified node.
      *
      * VolumeAttachment objects are non-namespaced.
      */
    @js.native
    class VolumeAttachment protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a storage.v1.VolumeAttachment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.VolumeAttachment) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.VolumeAttachment, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes
        * system.
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachmentSpec] = js.native
      /**
        * Status of the VolumeAttachment request. Populated by the entity completing the attach or
        * detach operation, i.e. the external-attacher.
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachmentStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.VolumeAttachment = js.native
    }
    
    /**
      * VolumeAttachmentList is a collection of VolumeAttachment objects.
      */
    @js.native
    class VolumeAttachmentList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a storage.v1.VolumeAttachmentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.VolumeAttachmentList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.VolumeAttachmentList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Items is the list of VolumeAttachments
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachment]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.VolumeAttachmentList = js.native
    }
    
    /**
      * StorageClass describes the parameters for a class of storage for which PersistentVolumes can
      * be dynamically provisioned.
      *
      * StorageClasses are non-namespaced; the name of the storage class according to etcd is in
      * ObjectMeta.Name.
      */
    @js.native
    object StorageClass extends js.Object {
      /**
        * Get the state of an existing `StorageClass` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.storageNs.v1Ns.StorageClass = js.native
    }
    
    /**
      * StorageClassList is a collection of storage classes.
      */
    @js.native
    object StorageClassList extends js.Object {
      /**
        * Get the state of an existing `StorageClassList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.storageNs.v1Ns.StorageClassList = js.native
    }
    
    /**
      * VolumeAttachment captures the intent to attach or detach the specified volume to/from the
      * specified node.
      *
      * VolumeAttachment objects are non-namespaced.
      */
    @js.native
    object VolumeAttachment extends js.Object {
      /**
        * Get the state of an existing `VolumeAttachment` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.storageNs.v1Ns.VolumeAttachment = js.native
    }
    
    /**
      * VolumeAttachmentList is a collection of VolumeAttachment objects.
      */
    @js.native
    object VolumeAttachmentList extends js.Object {
      /**
        * Get the state of an existing `VolumeAttachmentList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.storageNs.v1Ns.VolumeAttachmentList = js.native
    }
    
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
    @js.native
    class VolumeAttachment protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a storage.v1alpha1.VolumeAttachment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1alpha1Ns.VolumeAttachment) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1alpha1Ns.VolumeAttachment, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes
        * system.
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachmentSpec] = js.native
      /**
        * Status of the VolumeAttachment request. Populated by the entity completing the attach or
        * detach operation, i.e. the external-attacher.
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachmentStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.storageNs.v1alpha1Ns.VolumeAttachment = js.native
    }
    
    /**
      * VolumeAttachmentList is a collection of VolumeAttachment objects.
      */
    @js.native
    class VolumeAttachmentList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a storage.v1alpha1.VolumeAttachmentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1alpha1Ns.VolumeAttachmentList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1alpha1Ns.VolumeAttachmentList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Items is the list of VolumeAttachments
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachment]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.storageNs.v1alpha1Ns.VolumeAttachmentList = js.native
    }
    
    /**
      * VolumeAttachment captures the intent to attach or detach the specified volume to/from the
      * specified node.
      *
      * VolumeAttachment objects are non-namespaced.
      */
    @js.native
    object VolumeAttachment extends js.Object {
      /**
        * Get the state of an existing `VolumeAttachment` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.storageNs.v1alpha1Ns.VolumeAttachment = js.native
    }
    
    /**
      * VolumeAttachmentList is a collection of VolumeAttachment objects.
      */
    @js.native
    object VolumeAttachmentList extends js.Object {
      /**
        * Get the state of an existing `VolumeAttachmentList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.storageNs.v1alpha1Ns.VolumeAttachmentList = js.native
    }
    
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
    @js.native
    class StorageClass protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a storage.v1beta1.StorageClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.StorageClass) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.StorageClass, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * AllowVolumeExpansion shows whether the storage class allow volume expand
        */
      val allowVolumeExpansion: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
      /**
        * Restrict the node topologies where volumes can be dynamically provisioned. Each volume
        * plugin defines its own supported topology specifications. An empty TopologySelectorTerm
        * list means there is no topology restriction. This field is only honored by servers that
        * enable the VolumeScheduling feature.
        */
      val allowedTopologies: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.TopologySelectorTerm]] = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Dynamically provisioned PersistentVolumes of this storage class are created with these
        * mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one
        * is invalid.
        */
      val mountOptions: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
      /**
        * Parameters holds the parameters for the provisioner that should create volumes of this
        * storage class.
        */
      val parameters: atPulumiPulumiLib.pulumiMod.Output[
            org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
          ] = js.native
      /**
        * Provisioner indicates the type of the provisioner.
        */
      val provisioner: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Dynamically provisioned PersistentVolumes of this storage class are created with this
        * reclaimPolicy. Defaults to Delete.
        */
      val reclaimPolicy: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
        * When unset, VolumeBindingImmediate is used. This field is only honored by servers that
        * enable the VolumeScheduling feature.
        */
      val volumeBindingMode: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.StorageClass = js.native
    }
    
    /**
      * StorageClassList is a collection of storage classes.
      */
    @js.native
    class StorageClassList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a storage.v1beta1.StorageClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.StorageClassList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.StorageClassList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Items is the list of StorageClasses
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.StorageClass]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.StorageClassList = js.native
    }
    
    /**
      * VolumeAttachment captures the intent to attach or detach the specified volume to/from the
      * specified node.
      *
      * VolumeAttachment objects are non-namespaced.
      */
    @js.native
    class VolumeAttachment protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a storage.v1beta1.VolumeAttachment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.VolumeAttachment) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.VolumeAttachment, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes
        * system.
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachmentSpec] = js.native
      /**
        * Status of the VolumeAttachment request. Populated by the entity completing the attach or
        * detach operation, i.e. the external-attacher.
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachmentStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.VolumeAttachment = js.native
    }
    
    /**
      * VolumeAttachmentList is a collection of VolumeAttachment objects.
      */
    @js.native
    class VolumeAttachmentList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a storage.v1beta1.VolumeAttachmentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.VolumeAttachmentList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.VolumeAttachmentList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Items is the list of VolumeAttachments
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachment]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.VolumeAttachmentList = js.native
    }
    
    /**
      * StorageClass describes the parameters for a class of storage for which PersistentVolumes can
      * be dynamically provisioned.
      *
      * StorageClasses are non-namespaced; the name of the storage class according to etcd is in
      * ObjectMeta.Name.
      */
    @js.native
    object StorageClass extends js.Object {
      /**
        * Get the state of an existing `StorageClass` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.StorageClass = js.native
    }
    
    /**
      * StorageClassList is a collection of storage classes.
      */
    @js.native
    object StorageClassList extends js.Object {
      /**
        * Get the state of an existing `StorageClassList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.StorageClassList = js.native
    }
    
    /**
      * VolumeAttachment captures the intent to attach or detach the specified volume to/from the
      * specified node.
      *
      * VolumeAttachment objects are non-namespaced.
      */
    @js.native
    object VolumeAttachment extends js.Object {
      /**
        * Get the state of an existing `VolumeAttachment` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.VolumeAttachment = js.native
    }
    
    /**
      * VolumeAttachmentList is a collection of VolumeAttachment objects.
      */
    @js.native
    object VolumeAttachmentList extends js.Object {
      /**
        * Get the state of an existing `VolumeAttachmentList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.VolumeAttachmentList = js.native
    }
    
  }
  
}

