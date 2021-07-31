package typings.pulumiAws

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspacesMod {
  
  @JSImport("@pulumi/aws/workspaces", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/workspaces", "Directory")
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
  /* static members */
  object Directory {
    
    @JSImport("@pulumi/aws/workspaces", "Directory")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Directory resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.workspacesDirectoryMod.Directory = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workspacesDirectoryMod.Directory]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.workspacesDirectoryMod.Directory = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workspacesDirectoryMod.Directory]
    @scala.inline
    def get(name: String, id: Input[ID], state: DirectoryState): typings.pulumiAws.workspacesDirectoryMod.Directory = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workspacesDirectoryMod.Directory]
    @scala.inline
    def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): typings.pulumiAws.workspacesDirectoryMod.Directory = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workspacesDirectoryMod.Directory]
    
    /**
      * Returns true if the given object is an instance of Directory.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/directory.Directory */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/workspaces/directory.Directory */ Boolean]
  }
  
  @JSImport("@pulumi/aws/workspaces", "IpGroup")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: IpGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IpGroup {
    
    @JSImport("@pulumi/aws/workspaces", "IpGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IpGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.ipGroupMod.IpGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ipGroupMod.IpGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.ipGroupMod.IpGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ipGroupMod.IpGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: IpGroupState): typings.pulumiAws.ipGroupMod.IpGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ipGroupMod.IpGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: IpGroupState, opts: CustomResourceOptions): typings.pulumiAws.ipGroupMod.IpGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ipGroupMod.IpGroup]
    
    /**
      * Returns true if the given object is an instance of IpGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/ipGroup.IpGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/workspaces/ipGroup.IpGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws/workspaces", "Workspace")
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
  /* static members */
  object Workspace {
    
    @JSImport("@pulumi/aws/workspaces", "Workspace")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Workspace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.workspaceMod.Workspace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workspaceMod.Workspace]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.workspaceMod.Workspace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workspaceMod.Workspace]
    @scala.inline
    def get(name: String, id: Input[ID], state: WorkspaceState): typings.pulumiAws.workspaceMod.Workspace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workspaceMod.Workspace]
    @scala.inline
    def get(name: String, id: Input[ID], state: WorkspaceState, opts: CustomResourceOptions): typings.pulumiAws.workspaceMod.Workspace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workspaceMod.Workspace]
    
    /**
      * Returns true if the given object is an instance of Workspace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/workspace.Workspace */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/workspaces/workspace.Workspace */ Boolean]
  }
  
  @scala.inline
  def getBundle(): js.Promise[GetBundleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBundle")().asInstanceOf[js.Promise[GetBundleResult]]
  @scala.inline
  def getBundle(args: Unit, opts: InvokeOptions): js.Promise[GetBundleResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBundle")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBundleResult]]
  @scala.inline
  def getBundle(args: GetBundleArgs): js.Promise[GetBundleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBundle")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetBundleResult]]
  @scala.inline
  def getBundle(args: GetBundleArgs, opts: InvokeOptions): js.Promise[GetBundleResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBundle")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBundleResult]]
  
  @scala.inline
  def getDirectory(args: GetDirectoryArgs): js.Promise[GetDirectoryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectory")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDirectoryResult]]
  @scala.inline
  def getDirectory(args: GetDirectoryArgs, opts: InvokeOptions): js.Promise[GetDirectoryResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectory")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDirectoryResult]]
  
  @scala.inline
  def getImage(args: GetImageArgs): js.Promise[GetImageResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImage")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetImageResult]]
  @scala.inline
  def getImage(args: GetImageArgs, opts: InvokeOptions): js.Promise[GetImageResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImage")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetImageResult]]
  
  @scala.inline
  def getWorkspace(): js.Promise[GetWorkspaceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")().asInstanceOf[js.Promise[GetWorkspaceResult]]
  @scala.inline
  def getWorkspace(args: Unit, opts: InvokeOptions): js.Promise[GetWorkspaceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetWorkspaceResult]]
  @scala.inline
  def getWorkspace(args: GetWorkspaceArgs): js.Promise[GetWorkspaceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetWorkspaceResult]]
  @scala.inline
  def getWorkspace(args: GetWorkspaceArgs, opts: InvokeOptions): js.Promise[GetWorkspaceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetWorkspaceResult]]
}
