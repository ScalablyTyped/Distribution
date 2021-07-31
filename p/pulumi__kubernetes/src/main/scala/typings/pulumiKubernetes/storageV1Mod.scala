package typings.pulumiKubernetes

import typings.pulumiKubernetes.v1CsidriverListMod.CSIDriverListArgs
import typings.pulumiKubernetes.v1CsidriverMod.CSIDriverArgs
import typings.pulumiKubernetes.v1CsinodeListMod.CSINodeListArgs
import typings.pulumiKubernetes.v1CsinodeMod.CSINodeArgs
import typings.pulumiKubernetes.v1StorageClassListMod.StorageClassListArgs
import typings.pulumiKubernetes.v1StorageClassMod.StorageClassArgs
import typings.pulumiKubernetes.v1VolumeAttachmentListMod.VolumeAttachmentListArgs
import typings.pulumiKubernetes.v1VolumeAttachmentMod.VolumeAttachmentArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageV1Mod {
  
  @JSImport("@pulumi/kubernetes/storage/v1", "CSIDriver")
  @js.native
  class CSIDriver protected ()
    extends typings.pulumiKubernetes.v1CsidriverMod.CSIDriver {
    /**
      * Create a CSIDriver resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CSIDriverArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: CSIDriverArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CSIDriver {
    
    @JSImport("@pulumi/kubernetes/storage/v1", "CSIDriver")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CSIDriver resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CsidriverMod.CSIDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CsidriverMod.CSIDriver]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CsidriverMod.CSIDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CsidriverMod.CSIDriver]
    
    /**
      * Returns true if the given object is an instance of CSIDriver.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csidriver.CSIDriver */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csidriver.CSIDriver */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1", "CSIDriverList")
  @js.native
  class CSIDriverList protected ()
    extends typings.pulumiKubernetes.v1CsidriverListMod.CSIDriverList {
    /**
      * Create a CSIDriverList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CSIDriverListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: CSIDriverListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CSIDriverList {
    
    @JSImport("@pulumi/kubernetes/storage/v1", "CSIDriverList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CSIDriverList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CsidriverListMod.CSIDriverList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CsidriverListMod.CSIDriverList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CsidriverListMod.CSIDriverList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CsidriverListMod.CSIDriverList]
    
    /**
      * Returns true if the given object is an instance of CSIDriverList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csidriverList.CSIDriverList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csidriverList.CSIDriverList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1", "CSINode")
  @js.native
  class CSINode protected ()
    extends typings.pulumiKubernetes.v1CsinodeMod.CSINode {
    /**
      * Create a CSINode resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CSINodeArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: CSINodeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CSINode {
    
    @JSImport("@pulumi/kubernetes/storage/v1", "CSINode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CSINode resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CsinodeMod.CSINode = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CsinodeMod.CSINode]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CsinodeMod.CSINode = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CsinodeMod.CSINode]
    
    /**
      * Returns true if the given object is an instance of CSINode.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csinode.CSINode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csinode.CSINode */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1", "CSINodeList")
  @js.native
  class CSINodeList protected ()
    extends typings.pulumiKubernetes.v1CsinodeListMod.CSINodeList {
    /**
      * Create a CSINodeList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CSINodeListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: CSINodeListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CSINodeList {
    
    @JSImport("@pulumi/kubernetes/storage/v1", "CSINodeList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CSINodeList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CsinodeListMod.CSINodeList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CsinodeListMod.CSINodeList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CsinodeListMod.CSINodeList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CsinodeListMod.CSINodeList]
    
    /**
      * Returns true if the given object is an instance of CSINodeList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csinodeList.CSINodeList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csinodeList.CSINodeList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1", "StorageClass")
  @js.native
  class StorageClass protected ()
    extends typings.pulumiKubernetes.v1StorageClassMod.StorageClass {
    /**
      * Create a StorageClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StorageClassArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StorageClassArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StorageClass {
    
    @JSImport("@pulumi/kubernetes/storage/v1", "StorageClass")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StorageClass resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1StorageClassMod.StorageClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1StorageClassMod.StorageClass]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1StorageClassMod.StorageClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1StorageClassMod.StorageClass]
    
    /**
      * Returns true if the given object is an instance of StorageClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/storageClass.StorageClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/storageClass.StorageClass */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1", "StorageClassList")
  @js.native
  class StorageClassList protected ()
    extends typings.pulumiKubernetes.v1StorageClassListMod.StorageClassList {
    /**
      * Create a StorageClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StorageClassListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StorageClassListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StorageClassList {
    
    @JSImport("@pulumi/kubernetes/storage/v1", "StorageClassList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StorageClassList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1StorageClassListMod.StorageClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1StorageClassListMod.StorageClassList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1StorageClassListMod.StorageClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1StorageClassListMod.StorageClassList]
    
    /**
      * Returns true if the given object is an instance of StorageClassList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/storageClassList.StorageClassList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/storageClassList.StorageClassList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1", "VolumeAttachment")
  @js.native
  class VolumeAttachment protected ()
    extends typings.pulumiKubernetes.v1VolumeAttachmentMod.VolumeAttachment {
    /**
      * Create a VolumeAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VolumeAttachmentArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: VolumeAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VolumeAttachment {
    
    @JSImport("@pulumi/kubernetes/storage/v1", "VolumeAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1VolumeAttachmentMod.VolumeAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1VolumeAttachmentMod.VolumeAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1VolumeAttachmentMod.VolumeAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1VolumeAttachmentMod.VolumeAttachment]
    
    /**
      * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/volumeAttachment.VolumeAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/volumeAttachment.VolumeAttachment */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/storage/v1", "VolumeAttachmentList")
  @js.native
  class VolumeAttachmentList protected ()
    extends typings.pulumiKubernetes.v1VolumeAttachmentListMod.VolumeAttachmentList {
    /**
      * Create a VolumeAttachmentList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VolumeAttachmentListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: VolumeAttachmentListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VolumeAttachmentList {
    
    @JSImport("@pulumi/kubernetes/storage/v1", "VolumeAttachmentList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VolumeAttachmentList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1VolumeAttachmentListMod.VolumeAttachmentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1VolumeAttachmentListMod.VolumeAttachmentList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1VolumeAttachmentListMod.VolumeAttachmentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1VolumeAttachmentListMod.VolumeAttachmentList]
    
    /**
      * Returns true if the given object is an instance of VolumeAttachmentList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/volumeAttachmentList.VolumeAttachmentList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/volumeAttachmentList.VolumeAttachmentList */ Boolean]
  }
}
