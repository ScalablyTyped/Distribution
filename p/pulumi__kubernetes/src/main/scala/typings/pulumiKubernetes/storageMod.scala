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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageMod {
  
  object v1 {
    
    @JSImport("@pulumi/kubernetes/storage", "v1.CSIDriver")
    @js.native
    class CSIDriver protected ()
      extends typings.pulumiKubernetes.storageV1Mod.CSIDriver {
      /**
        * Create a CSIDriver resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CSIDriverArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: CSIDriverArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object CSIDriver {
      
      /**
        * Get an existing CSIDriver resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.CSIDriver.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CsidriverMod.CSIDriver = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1.CSIDriver.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CsidriverMod.CSIDriver = js.native
      
      /**
        * Returns true if the given object is an instance of CSIDriver.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.CSIDriver.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csidriver.CSIDriver */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1.CSIDriverList")
    @js.native
    class CSIDriverList protected ()
      extends typings.pulumiKubernetes.storageV1Mod.CSIDriverList {
      /**
        * Create a CSIDriverList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CSIDriverListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: CSIDriverListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object CSIDriverList {
      
      /**
        * Get an existing CSIDriverList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.CSIDriverList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CsidriverListMod.CSIDriverList = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1.CSIDriverList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CsidriverListMod.CSIDriverList = js.native
      
      /**
        * Returns true if the given object is an instance of CSIDriverList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.CSIDriverList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csidriverList.CSIDriverList */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1.CSINode")
    @js.native
    class CSINode protected ()
      extends typings.pulumiKubernetes.storageV1Mod.CSINode {
      /**
        * Create a CSINode resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CSINodeArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: CSINodeArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object CSINode {
      
      /**
        * Get an existing CSINode resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.CSINode.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CsinodeMod.CSINode = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1.CSINode.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CsinodeMod.CSINode = js.native
      
      /**
        * Returns true if the given object is an instance of CSINode.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.CSINode.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csinode.CSINode */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1.CSINodeList")
    @js.native
    class CSINodeList protected ()
      extends typings.pulumiKubernetes.storageV1Mod.CSINodeList {
      /**
        * Create a CSINodeList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CSINodeListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: CSINodeListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object CSINodeList {
      
      /**
        * Get an existing CSINodeList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.CSINodeList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CsinodeListMod.CSINodeList = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1.CSINodeList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CsinodeListMod.CSINodeList = js.native
      
      /**
        * Returns true if the given object is an instance of CSINodeList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.CSINodeList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/csinodeList.CSINodeList */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1.StorageClass")
    @js.native
    class StorageClass protected ()
      extends typings.pulumiKubernetes.storageV1Mod.StorageClass {
      /**
        * Create a StorageClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: StorageClassArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: StorageClassArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object StorageClass {
      
      /**
        * Get an existing StorageClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.StorageClass.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1StorageClassMod.StorageClass = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1.StorageClass.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1StorageClassMod.StorageClass = js.native
      
      /**
        * Returns true if the given object is an instance of StorageClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.StorageClass.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/storageClass.StorageClass */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1.StorageClassList")
    @js.native
    class StorageClassList protected ()
      extends typings.pulumiKubernetes.storageV1Mod.StorageClassList {
      /**
        * Create a StorageClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: StorageClassListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: StorageClassListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object StorageClassList {
      
      /**
        * Get an existing StorageClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.StorageClassList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1StorageClassListMod.StorageClassList = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1.StorageClassList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1StorageClassListMod.StorageClassList = js.native
      
      /**
        * Returns true if the given object is an instance of StorageClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.StorageClassList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/storageClassList.StorageClassList */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1.VolumeAttachment")
    @js.native
    class VolumeAttachment protected ()
      extends typings.pulumiKubernetes.storageV1Mod.VolumeAttachment {
      /**
        * Create a VolumeAttachment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: VolumeAttachmentArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: VolumeAttachmentArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object VolumeAttachment {
      
      /**
        * Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.VolumeAttachment.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1VolumeAttachmentMod.VolumeAttachment = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1.VolumeAttachment.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1VolumeAttachmentMod.VolumeAttachment = js.native
      
      /**
        * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.VolumeAttachment.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/volumeAttachment.VolumeAttachment */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1.VolumeAttachmentList")
    @js.native
    class VolumeAttachmentList protected ()
      extends typings.pulumiKubernetes.storageV1Mod.VolumeAttachmentList {
      /**
        * Create a VolumeAttachmentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: VolumeAttachmentListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: VolumeAttachmentListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object VolumeAttachmentList {
      
      /**
        * Get an existing VolumeAttachmentList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.VolumeAttachmentList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1VolumeAttachmentListMod.VolumeAttachmentList = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1.VolumeAttachmentList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1VolumeAttachmentListMod.VolumeAttachmentList = js.native
      
      /**
        * Returns true if the given object is an instance of VolumeAttachmentList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1.VolumeAttachmentList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1/volumeAttachmentList.VolumeAttachmentList */ Boolean = js.native
    }
  }
  
  object v1alpha1 {
    
    @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachment")
    @js.native
    class VolumeAttachment protected ()
      extends typings.pulumiKubernetes.storageV1alpha1Mod.VolumeAttachment {
      /**
        * Create a VolumeAttachment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.volumeAttachmentMod.VolumeAttachmentArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.volumeAttachmentMod.VolumeAttachmentArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object VolumeAttachment {
      
      /**
        * Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachment.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.volumeAttachmentMod.VolumeAttachment = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachment.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.volumeAttachmentMod.VolumeAttachment = js.native
      
      /**
        * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachment.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachment.VolumeAttachment */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachmentList")
    @js.native
    class VolumeAttachmentList protected ()
      extends typings.pulumiKubernetes.storageV1alpha1Mod.VolumeAttachmentList {
      /**
        * Create a VolumeAttachmentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.volumeAttachmentListMod.VolumeAttachmentListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.volumeAttachmentListMod.VolumeAttachmentListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object VolumeAttachmentList {
      
      /**
        * Get an existing VolumeAttachmentList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachmentList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.volumeAttachmentListMod.VolumeAttachmentList = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachmentList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.volumeAttachmentListMod.VolumeAttachmentList = js.native
      
      /**
        * Returns true if the given object is an instance of VolumeAttachmentList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachmentList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachmentList.VolumeAttachmentList */ Boolean = js.native
    }
  }
  
  object v1beta1 {
    
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriver")
    @js.native
    class CSIDriver protected ()
      extends typings.pulumiKubernetes.storageV1beta1Mod.CSIDriver {
      /**
        * Create a CSIDriver resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.csidriverMod.CSIDriverArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.csidriverMod.CSIDriverArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object CSIDriver {
      
      /**
        * Get an existing CSIDriver resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriver.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.csidriverMod.CSIDriver = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriver.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.csidriverMod.CSIDriver = js.native
      
      /**
        * Returns true if the given object is an instance of CSIDriver.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriver.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csidriver.CSIDriver */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriverList")
    @js.native
    class CSIDriverList protected ()
      extends typings.pulumiKubernetes.storageV1beta1Mod.CSIDriverList {
      /**
        * Create a CSIDriverList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.csidriverListMod.CSIDriverListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.csidriverListMod.CSIDriverListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object CSIDriverList {
      
      /**
        * Get an existing CSIDriverList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriverList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.csidriverListMod.CSIDriverList = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriverList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.csidriverListMod.CSIDriverList = js.native
      
      /**
        * Returns true if the given object is an instance of CSIDriverList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriverList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csidriverList.CSIDriverList */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINode")
    @js.native
    class CSINode protected ()
      extends typings.pulumiKubernetes.storageV1beta1Mod.CSINode {
      /**
        * Create a CSINode resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated storage/v1beta1/CSINode is deprecated by storage.k8s.io/v1/CSINode. */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.csinodeMod.CSINodeArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: typings.pulumiKubernetes.csinodeMod.CSINodeArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object CSINode {
      
      /**
        * Get an existing CSINode resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINode.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.csinodeMod.CSINode = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINode.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.csinodeMod.CSINode = js.native
      
      /**
        * Returns true if the given object is an instance of CSINode.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINode.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csinode.CSINode */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINodeList")
    @js.native
    class CSINodeList protected ()
      extends typings.pulumiKubernetes.storageV1beta1Mod.CSINodeList {
      /**
        * Create a CSINodeList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.csinodeListMod.CSINodeListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.csinodeListMod.CSINodeListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object CSINodeList {
      
      /**
        * Get an existing CSINodeList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINodeList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.csinodeListMod.CSINodeList = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINodeList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.csinodeListMod.CSINodeList = js.native
      
      /**
        * Returns true if the given object is an instance of CSINodeList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINodeList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csinodeList.CSINodeList */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClass")
    @js.native
    class StorageClass protected ()
      extends typings.pulumiKubernetes.storageV1beta1Mod.StorageClass {
      /**
        * Create a StorageClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.storageClassMod.StorageClassArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.storageClassMod.StorageClassArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object StorageClass {
      
      /**
        * Get an existing StorageClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClass.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.storageClassMod.StorageClass = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClass.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.storageClassMod.StorageClass = js.native
      
      /**
        * Returns true if the given object is an instance of StorageClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClass.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClass.StorageClass */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClassList")
    @js.native
    class StorageClassList protected ()
      extends typings.pulumiKubernetes.storageV1beta1Mod.StorageClassList {
      /**
        * Create a StorageClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.storageClassListMod.StorageClassListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.storageClassListMod.StorageClassListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object StorageClassList {
      
      /**
        * Get an existing StorageClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClassList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.storageClassListMod.StorageClassList = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClassList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.storageClassListMod.StorageClassList = js.native
      
      /**
        * Returns true if the given object is an instance of StorageClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClassList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClassList.StorageClassList */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachment")
    @js.native
    class VolumeAttachment protected ()
      extends typings.pulumiKubernetes.storageV1beta1Mod.VolumeAttachment {
      /**
        * Create a VolumeAttachment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.v1beta1VolumeAttachmentMod.VolumeAttachmentArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.v1beta1VolumeAttachmentMod.VolumeAttachmentArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object VolumeAttachment {
      
      /**
        * Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachment.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1VolumeAttachmentMod.VolumeAttachment = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachment.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1VolumeAttachmentMod.VolumeAttachment = js.native
      
      /**
        * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachment.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/volumeAttachment.VolumeAttachment */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachmentList")
    @js.native
    class VolumeAttachmentList protected ()
      extends typings.pulumiKubernetes.storageV1beta1Mod.VolumeAttachmentList {
      /**
        * Create a VolumeAttachmentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.v1beta1VolumeAttachmentListMod.VolumeAttachmentListArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.v1beta1VolumeAttachmentListMod.VolumeAttachmentListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object VolumeAttachmentList {
      
      /**
        * Get an existing VolumeAttachmentList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachmentList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1VolumeAttachmentListMod.VolumeAttachmentList = js.native
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachmentList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1VolumeAttachmentListMod.VolumeAttachmentList = js.native
      
      /**
        * Returns true if the given object is an instance of VolumeAttachmentList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachmentList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/volumeAttachmentList.VolumeAttachmentList */ Boolean = js.native
    }
  }
}
