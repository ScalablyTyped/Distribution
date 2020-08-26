package typings.pulumiAws

import typings.pulumiAws.getBundleMod.GetBundleArgs
import typings.pulumiAws.getBundleMod.GetBundleResult
import typings.pulumiAws.ipGroupMod.IpGroupArgs
import typings.pulumiAws.ipGroupMod.IpGroupState
import typings.pulumiAws.workspaceMod.WorkspaceArgs
import typings.pulumiAws.workspaceMod.WorkspaceState
import typings.pulumiAws.workspacesDirectoryMod.DirectoryArgs
import typings.pulumiAws.workspacesDirectoryMod.DirectoryState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/workspaces", JSImport.Namespace)
@js.native
object workspacesMod extends js.Object {
  @js.native
  class Directory protected ()
    extends typings.pulumiAws.workspacesDirectoryMod.Directory {
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
    extends typings.pulumiAws.ipGroupMod.IpGroup {
    /**
      * Create a IpGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IpGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IpGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Workspace protected ()
    extends typings.pulumiAws.workspaceMod.Workspace {
    /**
      * Create a Workspace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WorkspaceArgs) = this()
    def this(name: String, args: WorkspaceArgs, opts: CustomResourceOptions) = this()
  }
  
  def getBundle(): js.Promise[GetBundleResult] = js.native
  def getBundle(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetBundleResult] = js.native
  def getBundle(args: GetBundleArgs): js.Promise[GetBundleResult] = js.native
  def getBundle(args: GetBundleArgs, opts: InvokeOptions): js.Promise[GetBundleResult] = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.workspacesDirectoryMod.Directory = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.workspacesDirectoryMod.Directory = js.native
    def get(name: String, id: Input[ID], state: DirectoryState): typings.pulumiAws.workspacesDirectoryMod.Directory = js.native
    def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): typings.pulumiAws.workspacesDirectoryMod.Directory = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.ipGroupMod.IpGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.ipGroupMod.IpGroup = js.native
    def get(name: String, id: Input[ID], state: IpGroupState): typings.pulumiAws.ipGroupMod.IpGroup = js.native
    def get(name: String, id: Input[ID], state: IpGroupState, opts: CustomResourceOptions): typings.pulumiAws.ipGroupMod.IpGroup = js.native
    /**
      * Returns true if the given object is an instance of IpGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/ipGroup.IpGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Workspace extends js.Object {
    /**
      * Get an existing Workspace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.workspaceMod.Workspace = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.workspaceMod.Workspace = js.native
    def get(name: String, id: Input[ID], state: WorkspaceState): typings.pulumiAws.workspaceMod.Workspace = js.native
    def get(name: String, id: Input[ID], state: WorkspaceState, opts: CustomResourceOptions): typings.pulumiAws.workspaceMod.Workspace = js.native
    /**
      * Returns true if the given object is an instance of Workspace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/workspace.Workspace */ Boolean = js.native
  }
  
}

