package typings.atPulumiKubernetes.storageMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/storage", "v1")
@js.native
object v1Ns extends js.Object {
  @js.native
  class StorageClass protected ()
    extends typings.atPulumiKubernetes.storageV1Mod.StorageClass {
    /**
      * Create a storage.v1.StorageClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.storageNs.v1Ns.StorageClass) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.storageNs.v1Ns.StorageClass,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class StorageClassList protected ()
    extends typings.atPulumiKubernetes.storageV1Mod.StorageClassList {
    /**
      * Create a storage.v1.StorageClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.storageNs.v1Ns.StorageClassList) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.storageNs.v1Ns.StorageClassList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class VolumeAttachment protected ()
    extends typings.atPulumiKubernetes.storageV1Mod.VolumeAttachment {
    /**
      * Create a storage.v1.VolumeAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.storageNs.v1Ns.VolumeAttachment) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.storageNs.v1Ns.VolumeAttachment,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class VolumeAttachmentList protected ()
    extends typings.atPulumiKubernetes.storageV1Mod.VolumeAttachmentList {
    /**
      * Create a storage.v1.VolumeAttachmentList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.storageNs.v1Ns.VolumeAttachmentList) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.storageNs.v1Ns.VolumeAttachmentList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
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
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form
      *  <namespace>/<name> or <name>.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.storageV1StorageClassMod.StorageClass = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.storageV1StorageClassMod.StorageClass = js.native
    /**
      * Returns true if the given object is an instance of StorageClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/StorageClass.StorageClass */ Boolean = js.native
  }
  
  /* static members */
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
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form
      *  <namespace>/<name> or <name>.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.storageV1StorageClassListMod.StorageClassList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.storageV1StorageClassListMod.StorageClassList = js.native
    /**
      * Returns true if the given object is an instance of StorageClassList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/StorageClassList.StorageClassList */ Boolean = js.native
  }
  
  /* static members */
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
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form
      *  <namespace>/<name> or <name>.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.storageV1VolumeAttachmentMod.VolumeAttachment = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.storageV1VolumeAttachmentMod.VolumeAttachment = js.native
    /**
      * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/VolumeAttachment.VolumeAttachment */ Boolean = js.native
  }
  
  /* static members */
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
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form
      *  <namespace>/<name> or <name>.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.storageV1VolumeAttachmentListMod.VolumeAttachmentList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.storageV1VolumeAttachmentListMod.VolumeAttachmentList = js.native
    /**
      * Returns true if the given object is an instance of VolumeAttachmentList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/VolumeAttachmentList.VolumeAttachmentList */ Boolean = js.native
  }
  
}

