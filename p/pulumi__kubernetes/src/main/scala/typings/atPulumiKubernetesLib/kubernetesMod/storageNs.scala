package typings
package atPulumiKubernetesLib.kubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "storage")
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
      extends atPulumiKubernetesLib.providerMod.storageNs.v1Ns.StorageClass {
      /**
                  * Create a storage.v1.StorageClass resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a storage.v1.StorageClass resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.StorageClass) = this()
      /**
                  * Create a storage.v1.StorageClass resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.StorageClass, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
             * StorageClassList is a collection of storage classes.
             */
    @js.native
    class StorageClassList protected ()
      extends atPulumiKubernetesLib.providerMod.storageNs.v1Ns.StorageClassList {
      /**
                  * Create a storage.v1.StorageClassList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a storage.v1.StorageClassList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.StorageClassList) = this()
      /**
                  * Create a storage.v1.StorageClassList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.StorageClassList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
             * VolumeAttachment captures the intent to attach or detach the specified volume to/from the
             * specified node.
             *
             * VolumeAttachment objects are non-namespaced.
             */
    @js.native
    class VolumeAttachment protected ()
      extends atPulumiKubernetesLib.providerMod.storageNs.v1Ns.VolumeAttachment {
      /**
                  * Create a storage.v1.VolumeAttachment resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a storage.v1.VolumeAttachment resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.VolumeAttachment) = this()
      /**
                  * Create a storage.v1.VolumeAttachment resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.VolumeAttachment, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
             * VolumeAttachmentList is a collection of VolumeAttachment objects.
             */
    @js.native
    class VolumeAttachmentList protected ()
      extends atPulumiKubernetesLib.providerMod.storageNs.v1Ns.VolumeAttachmentList {
      /**
                  * Create a storage.v1.VolumeAttachmentList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a storage.v1.VolumeAttachmentList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.VolumeAttachmentList) = this()
      /**
                  * Create a storage.v1.VolumeAttachmentList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1Ns.VolumeAttachmentList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
      extends atPulumiKubernetesLib.providerMod.storageNs.v1alpha1Ns.VolumeAttachment {
      /**
                  * Create a storage.v1alpha1.VolumeAttachment resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a storage.v1alpha1.VolumeAttachment resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1alpha1Ns.VolumeAttachment) = this()
      /**
                  * Create a storage.v1alpha1.VolumeAttachment resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1alpha1Ns.VolumeAttachment, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
             * VolumeAttachmentList is a collection of VolumeAttachment objects.
             */
    @js.native
    class VolumeAttachmentList protected ()
      extends atPulumiKubernetesLib.providerMod.storageNs.v1alpha1Ns.VolumeAttachmentList {
      /**
                  * Create a storage.v1alpha1.VolumeAttachmentList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a storage.v1alpha1.VolumeAttachmentList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1alpha1Ns.VolumeAttachmentList) = this()
      /**
                  * Create a storage.v1alpha1.VolumeAttachmentList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1alpha1Ns.VolumeAttachmentList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
      extends atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.StorageClass {
      /**
                  * Create a storage.v1beta1.StorageClass resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a storage.v1beta1.StorageClass resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.StorageClass) = this()
      /**
                  * Create a storage.v1beta1.StorageClass resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.StorageClass, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
             * StorageClassList is a collection of storage classes.
             */
    @js.native
    class StorageClassList protected ()
      extends atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.StorageClassList {
      /**
                  * Create a storage.v1beta1.StorageClassList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a storage.v1beta1.StorageClassList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.StorageClassList) = this()
      /**
                  * Create a storage.v1beta1.StorageClassList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.StorageClassList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
             * VolumeAttachment captures the intent to attach or detach the specified volume to/from the
             * specified node.
             *
             * VolumeAttachment objects are non-namespaced.
             */
    @js.native
    class VolumeAttachment protected ()
      extends atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.VolumeAttachment {
      /**
                  * Create a storage.v1beta1.VolumeAttachment resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a storage.v1beta1.VolumeAttachment resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.VolumeAttachment) = this()
      /**
                  * Create a storage.v1beta1.VolumeAttachment resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.VolumeAttachment, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
             * VolumeAttachmentList is a collection of VolumeAttachment objects.
             */
    @js.native
    class VolumeAttachmentList protected ()
      extends atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.VolumeAttachmentList {
      /**
                  * Create a storage.v1beta1.VolumeAttachmentList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a storage.v1beta1.VolumeAttachmentList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.VolumeAttachmentList) = this()
      /**
                  * Create a storage.v1beta1.VolumeAttachmentList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.VolumeAttachmentList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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

