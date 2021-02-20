package typings.pulumiAws

import typings.pulumiAws.lustreFileSystemMod.LustreFileSystemArgs
import typings.pulumiAws.lustreFileSystemMod.LustreFileSystemState
import typings.pulumiAws.windowsFileSystemMod.WindowsFileSystemArgs
import typings.pulumiAws.windowsFileSystemMod.WindowsFileSystemState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsxMod {
  
  @JSImport("@pulumi/aws/fsx", "LustreFileSystem")
  @js.native
  class LustreFileSystem protected ()
    extends typings.pulumiAws.lustreFileSystemMod.LustreFileSystem {
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
    
    /**
      * Get an existing LustreFileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/fsx", "LustreFileSystem.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.lustreFileSystemMod.LustreFileSystem = js.native
    @JSImport("@pulumi/aws/fsx", "LustreFileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.lustreFileSystemMod.LustreFileSystem = js.native
    @JSImport("@pulumi/aws/fsx", "LustreFileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: LustreFileSystemState): typings.pulumiAws.lustreFileSystemMod.LustreFileSystem = js.native
    @JSImport("@pulumi/aws/fsx", "LustreFileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: LustreFileSystemState, opts: CustomResourceOptions): typings.pulumiAws.lustreFileSystemMod.LustreFileSystem = js.native
    
    /**
      * Returns true if the given object is an instance of LustreFileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/fsx", "LustreFileSystem.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fsx/lustreFileSystem.LustreFileSystem */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/fsx", "WindowsFileSystem")
  @js.native
  class WindowsFileSystem protected ()
    extends typings.pulumiAws.windowsFileSystemMod.WindowsFileSystem {
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
    
    /**
      * Get an existing WindowsFileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/fsx", "WindowsFileSystem.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.windowsFileSystemMod.WindowsFileSystem = js.native
    @JSImport("@pulumi/aws/fsx", "WindowsFileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.windowsFileSystemMod.WindowsFileSystem = js.native
    @JSImport("@pulumi/aws/fsx", "WindowsFileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: WindowsFileSystemState): typings.pulumiAws.windowsFileSystemMod.WindowsFileSystem = js.native
    @JSImport("@pulumi/aws/fsx", "WindowsFileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: WindowsFileSystemState, opts: CustomResourceOptions): typings.pulumiAws.windowsFileSystemMod.WindowsFileSystem = js.native
    
    /**
      * Returns true if the given object is an instance of WindowsFileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/fsx", "WindowsFileSystem.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fsx/windowsFileSystem.WindowsFileSystem */ Boolean = js.native
  }
}
