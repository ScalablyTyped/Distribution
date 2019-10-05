package typings.atPulumiAws

import typings.atPulumiAws.fsxLustreFileSystemMod.LustreFileSystemArgs
import typings.atPulumiAws.fsxLustreFileSystemMod.LustreFileSystemState
import typings.atPulumiAws.fsxWindowsFileSystemMod.WindowsFileSystemArgs
import typings.atPulumiAws.fsxWindowsFileSystemMod.WindowsFileSystemState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/fsx", JSImport.Namespace)
@js.native
object fsxMod extends js.Object {
  @js.native
  class LustreFileSystem protected ()
    extends typings.atPulumiAws.fsxLustreFileSystemMod.LustreFileSystem {
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
  
  @js.native
  class WindowsFileSystem protected ()
    extends typings.atPulumiAws.fsxWindowsFileSystemMod.WindowsFileSystem {
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
  @js.native
  object LustreFileSystem extends js.Object {
    /**
      * Get an existing LustreFileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.fsxLustreFileSystemMod.LustreFileSystem = js.native
    def get(name: String, id: Input[ID], state: LustreFileSystemState): typings.atPulumiAws.fsxLustreFileSystemMod.LustreFileSystem = js.native
    def get(name: String, id: Input[ID], state: LustreFileSystemState, opts: CustomResourceOptions): typings.atPulumiAws.fsxLustreFileSystemMod.LustreFileSystem = js.native
    /**
      * Returns true if the given object is an instance of LustreFileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fsx/lustreFileSystem.LustreFileSystem */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object WindowsFileSystem extends js.Object {
    /**
      * Get an existing WindowsFileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.fsxWindowsFileSystemMod.WindowsFileSystem = js.native
    def get(name: String, id: Input[ID], state: WindowsFileSystemState): typings.atPulumiAws.fsxWindowsFileSystemMod.WindowsFileSystem = js.native
    def get(name: String, id: Input[ID], state: WindowsFileSystemState, opts: CustomResourceOptions): typings.atPulumiAws.fsxWindowsFileSystemMod.WindowsFileSystem = js.native
    /**
      * Returns true if the given object is an instance of WindowsFileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fsx/windowsFileSystem.WindowsFileSystem */ Boolean = js.native
  }
  
}

