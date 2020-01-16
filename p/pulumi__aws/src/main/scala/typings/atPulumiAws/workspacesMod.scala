package typings.atPulumiAws

import typings.atPulumiAws.workspacesDirectoryMod.DirectoryArgs
import typings.atPulumiAws.workspacesDirectoryMod.DirectoryState
import typings.atPulumiAws.workspacesGetBundleMod.GetBundleArgs
import typings.atPulumiAws.workspacesGetBundleMod.GetBundleResult
import typings.atPulumiAws.workspacesIpGroupMod.IpGroupArgs
import typings.atPulumiAws.workspacesIpGroupMod.IpGroupState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/workspaces", JSImport.Namespace)
@js.native
object workspacesMod extends js.Object {
  @js.native
  class Directory protected ()
    extends typings.atPulumiAws.workspacesDirectoryMod.Directory {
    /**
      * Create a Directory resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DirectoryArgs) = this()
    def this(name: String, args: DirectoryArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class IpGroup protected ()
    extends typings.atPulumiAws.workspacesIpGroupMod.IpGroup {
    /**
      * Create a IpGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IpGroupArgs) = this()
    def this(name: String, args: IpGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  def getBundle(args: GetBundleArgs): js.Promise[GetBundleResult] with GetBundleResult = js.native
  def getBundle(args: GetBundleArgs, opts: InvokeOptions): js.Promise[GetBundleResult] with GetBundleResult = js.native
  /* static members */
  @js.native
  object Directory extends js.Object {
    /**
      * Get an existing Directory resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.workspacesDirectoryMod.Directory = js.native
    def get(name: String, id: Input[ID], state: DirectoryState): typings.atPulumiAws.workspacesDirectoryMod.Directory = js.native
    def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): typings.atPulumiAws.workspacesDirectoryMod.Directory = js.native
    /**
      * Returns true if the given object is an instance of Directory.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/directory.Directory */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IpGroup extends js.Object {
    /**
      * Get an existing IpGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.workspacesIpGroupMod.IpGroup = js.native
    def get(name: String, id: Input[ID], state: IpGroupState): typings.atPulumiAws.workspacesIpGroupMod.IpGroup = js.native
    def get(name: String, id: Input[ID], state: IpGroupState, opts: CustomResourceOptions): typings.atPulumiAws.workspacesIpGroupMod.IpGroup = js.native
    /**
      * Returns true if the given object is an instance of IpGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/ipGroup.IpGroup */ Boolean = js.native
  }
  
}

