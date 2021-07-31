package typings.pulumiAws.mod

import typings.pulumiAws.lustreFileSystemMod.LustreFileSystemArgs
import typings.pulumiAws.lustreFileSystemMod.LustreFileSystemState
import typings.pulumiAws.windowsFileSystemMod.WindowsFileSystemArgs
import typings.pulumiAws.windowsFileSystemMod.WindowsFileSystemState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsx {
  
  @JSImport("@pulumi/aws", "fsx.LustreFileSystem")
  @js.native
  class LustreFileSystem protected ()
    extends typings.pulumiAws.fsxMod.LustreFileSystem {
    /**
      * Create a LustreFileSystem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LustreFileSystemArgs) = this()
    def this(name: String, args: LustreFileSystemArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LustreFileSystem {
    
    @JSImport("@pulumi/aws", "fsx.LustreFileSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LustreFileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.lustreFileSystemMod.LustreFileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lustreFileSystemMod.LustreFileSystem]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.lustreFileSystemMod.LustreFileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lustreFileSystemMod.LustreFileSystem]
    @scala.inline
    def get(name: String, id: Input[ID], state: LustreFileSystemState): typings.pulumiAws.lustreFileSystemMod.LustreFileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lustreFileSystemMod.LustreFileSystem]
    @scala.inline
    def get(name: String, id: Input[ID], state: LustreFileSystemState, opts: CustomResourceOptions): typings.pulumiAws.lustreFileSystemMod.LustreFileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lustreFileSystemMod.LustreFileSystem]
    
    /**
      * Returns true if the given object is an instance of LustreFileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fsx/lustreFileSystem.LustreFileSystem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/fsx/lustreFileSystem.LustreFileSystem */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "fsx.WindowsFileSystem")
  @js.native
  class WindowsFileSystem protected ()
    extends typings.pulumiAws.fsxMod.WindowsFileSystem {
    /**
      * Create a WindowsFileSystem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WindowsFileSystemArgs) = this()
    def this(name: String, args: WindowsFileSystemArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object WindowsFileSystem {
    
    @JSImport("@pulumi/aws", "fsx.WindowsFileSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing WindowsFileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.windowsFileSystemMod.WindowsFileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.windowsFileSystemMod.WindowsFileSystem]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.windowsFileSystemMod.WindowsFileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.windowsFileSystemMod.WindowsFileSystem]
    @scala.inline
    def get(name: String, id: Input[ID], state: WindowsFileSystemState): typings.pulumiAws.windowsFileSystemMod.WindowsFileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.windowsFileSystemMod.WindowsFileSystem]
    @scala.inline
    def get(name: String, id: Input[ID], state: WindowsFileSystemState, opts: CustomResourceOptions): typings.pulumiAws.windowsFileSystemMod.WindowsFileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.windowsFileSystemMod.WindowsFileSystem]
    
    /**
      * Returns true if the given object is an instance of WindowsFileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fsx/windowsFileSystem.WindowsFileSystem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/fsx/windowsFileSystem.WindowsFileSystem */ Boolean]
  }
}
