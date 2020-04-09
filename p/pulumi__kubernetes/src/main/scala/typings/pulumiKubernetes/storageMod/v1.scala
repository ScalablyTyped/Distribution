package typings.pulumiKubernetes.storageMod

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/storage", "v1")
@js.native
object v1 extends js.Object {
  @js.native
  class CSIDriver protected ()
    extends typings.pulumiKubernetes.storageV1Mod.CSIDriver {
    /**
      * Create a storage.v1.CSIDriver resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.storage.v1.CSIDriver) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.storage.v1.CSIDriver,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class CSIDriverList protected ()
    extends typings.pulumiKubernetes.storageV1Mod.CSIDriverList {
    /**
      * Create a storage.v1.CSIDriverList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.storage.v1.CSIDriverList) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.storage.v1.CSIDriverList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class CSINode protected ()
    extends typings.pulumiKubernetes.storageV1Mod.CSINode {
    /**
      * Create a storage.v1.CSINode resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.storage.v1.CSINode) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.storage.v1.CSINode,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class CSINodeList protected ()
    extends typings.pulumiKubernetes.storageV1Mod.CSINodeList {
    /**
      * Create a storage.v1.CSINodeList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.storage.v1.CSINodeList) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.storage.v1.CSINodeList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class StorageClass protected ()
    extends typings.pulumiKubernetes.storageV1Mod.StorageClass {
    /**
      * Create a storage.v1.StorageClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.storage.v1.StorageClass) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.storage.v1.StorageClass,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class StorageClassList protected ()
    extends typings.pulumiKubernetes.storageV1Mod.StorageClassList {
    /**
      * Create a storage.v1.StorageClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.storage.v1.StorageClassList) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.storage.v1.StorageClassList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class VolumeAttachment protected ()
    extends typings.pulumiKubernetes.storageV1Mod.VolumeAttachment {
    /**
      * Create a storage.v1.VolumeAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.storage.v1.VolumeAttachment) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.storage.v1.VolumeAttachment,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class VolumeAttachmentList protected ()
    extends typings.pulumiKubernetes.storageV1Mod.VolumeAttachmentList {
    /**
      * Create a storage.v1.VolumeAttachmentList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.storage.v1.VolumeAttachmentList) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.storage.v1.VolumeAttachmentList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object CSIDriver extends js.Object {
    /**
      * Get the state of an existing `CSIDriver` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CsidriverMod.CSIDriver = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CsidriverMod.CSIDriver = js.native
    /**
      * Returns true if the given object is an instance of CSIDriver.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/CSIDriver.CSIDriver */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CSIDriverList extends js.Object {
    /**
      * Get the state of an existing `CSIDriverList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CsidriverlistMod.CSIDriverList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CsidriverlistMod.CSIDriverList = js.native
    /**
      * Returns true if the given object is an instance of CSIDriverList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/CSIDriverList.CSIDriverList */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CSINode extends js.Object {
    /**
      * Get the state of an existing `CSINode` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CsinodeMod.CSINode = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CsinodeMod.CSINode = js.native
    /**
      * Returns true if the given object is an instance of CSINode.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/CSINode.CSINode */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CSINodeList extends js.Object {
    /**
      * Get the state of an existing `CSINodeList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CsinodelistMod.CSINodeList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CsinodelistMod.CSINodeList = js.native
    /**
      * Returns true if the given object is an instance of CSINodeList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/CSINodeList.CSINodeList */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StorageClass extends js.Object {
    /**
      * Get the state of an existing `StorageClass` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1StorageClassMod.StorageClass = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1StorageClassMod.StorageClass = js.native
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
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1StorageClassListMod.StorageClassList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1StorageClassListMod.StorageClassList = js.native
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
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1VolumeAttachmentMod.VolumeAttachment = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1VolumeAttachmentMod.VolumeAttachment = js.native
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
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1VolumeAttachmentListMod.VolumeAttachmentList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1VolumeAttachmentListMod.VolumeAttachmentList = js.native
    /**
      * Returns true if the given object is an instance of VolumeAttachmentList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/VolumeAttachmentList.VolumeAttachmentList */ Boolean = js.native
  }
  
}

