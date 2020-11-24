package typings.pulumiAws.mod

import typings.pulumiAws.getBundleMod.GetBundleArgs
import typings.pulumiAws.getBundleMod.GetBundleResult
import typings.pulumiAws.getWorkspaceMod.GetWorkspaceArgs
import typings.pulumiAws.getWorkspaceMod.GetWorkspaceResult
import typings.pulumiAws.ipGroupMod.IpGroupArgs
import typings.pulumiAws.ipGroupMod.IpGroupState
import typings.pulumiAws.workspaceMod.WorkspaceArgs
import typings.pulumiAws.workspaceMod.WorkspaceState
import typings.pulumiAws.workspacesDirectoryMod.DirectoryArgs
import typings.pulumiAws.workspacesDirectoryMod.DirectoryState
import typings.pulumiAws.workspacesGetDirectoryMod.GetDirectoryArgs
import typings.pulumiAws.workspacesGetDirectoryMod.GetDirectoryResult
import typings.pulumiAws.workspacesGetImageMod.GetImageArgs
import typings.pulumiAws.workspacesGetImageMod.GetImageResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "workspaces")
@js.native
object workspaces extends js.Object {
  
  def getBundle(): js.Promise[GetBundleResult] = js.native
  def getBundle(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetBundleResult] = js.native
  def getBundle(args: GetBundleArgs): js.Promise[GetBundleResult] = js.native
  def getBundle(args: GetBundleArgs, opts: InvokeOptions): js.Promise[GetBundleResult] = js.native
  
  def getDirectory(args: GetDirectoryArgs): js.Promise[GetDirectoryResult] = js.native
  def getDirectory(args: GetDirectoryArgs, opts: InvokeOptions): js.Promise[GetDirectoryResult] = js.native
  
  def getImage(args: GetImageArgs): js.Promise[GetImageResult] = js.native
  def getImage(args: GetImageArgs, opts: InvokeOptions): js.Promise[GetImageResult] = js.native
  
  def getWorkspace(): js.Promise[GetWorkspaceResult] = js.native
  def getWorkspace(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetWorkspaceResult] = js.native
  def getWorkspace(args: GetWorkspaceArgs): js.Promise[GetWorkspaceResult] = js.native
  def getWorkspace(args: GetWorkspaceArgs, opts: InvokeOptions): js.Promise[GetWorkspaceResult] = js.native
  
  @js.native
  class Directory protected ()
    extends typings.pulumiAws.workspacesMod.Directory {
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
  
  @js.native
  class IpGroup protected ()
    extends typings.pulumiAws.workspacesMod.IpGroup {
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
  
  @js.native
  class Workspace protected ()
    extends typings.pulumiAws.workspacesMod.Workspace {
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
