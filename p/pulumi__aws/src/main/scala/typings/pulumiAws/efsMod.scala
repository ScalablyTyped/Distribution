package typings.pulumiAws

import typings.pulumiAws.accessPointMod.AccessPointArgs
import typings.pulumiAws.accessPointMod.AccessPointState
import typings.pulumiAws.fileSystemMod.FileSystemArgs
import typings.pulumiAws.fileSystemMod.FileSystemState
import typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicyArgs
import typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicyState
import typings.pulumiAws.getAccessPointMod.GetAccessPointArgs
import typings.pulumiAws.getAccessPointMod.GetAccessPointResult
import typings.pulumiAws.getAccessPointsMod.GetAccessPointsArgs
import typings.pulumiAws.getAccessPointsMod.GetAccessPointsResult
import typings.pulumiAws.getFileSystemMod.GetFileSystemArgs
import typings.pulumiAws.getFileSystemMod.GetFileSystemResult
import typings.pulumiAws.getMountTargetMod.GetMountTargetArgs
import typings.pulumiAws.getMountTargetMod.GetMountTargetResult
import typings.pulumiAws.mountTargetMod.MountTargetArgs
import typings.pulumiAws.mountTargetMod.MountTargetState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object efsMod {
  
  @JSImport("@pulumi/aws/efs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/efs", "AccessPoint")
  @js.native
  class AccessPoint protected ()
    extends typings.pulumiAws.accessPointMod.AccessPoint {
    /**
      * Create a AccessPoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AccessPointArgs) = this()
    def this(name: String, args: AccessPointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AccessPoint {
    
    @JSImport("@pulumi/aws/efs", "AccessPoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AccessPoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.accessPointMod.AccessPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.accessPointMod.AccessPoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.accessPointMod.AccessPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.accessPointMod.AccessPoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: AccessPointState): typings.pulumiAws.accessPointMod.AccessPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.accessPointMod.AccessPoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: AccessPointState, opts: CustomResourceOptions): typings.pulumiAws.accessPointMod.AccessPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.accessPointMod.AccessPoint]
    
    /**
      * Returns true if the given object is an instance of AccessPoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/accessPoint.AccessPoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/efs/accessPoint.AccessPoint */ Boolean]
  }
  
  @JSImport("@pulumi/aws/efs", "FileSystem")
  @js.native
  class FileSystem protected ()
    extends typings.pulumiAws.fileSystemMod.FileSystem {
    /**
      * Create a FileSystem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: FileSystemArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: FileSystemArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object FileSystem {
    
    @JSImport("@pulumi/aws/efs", "FileSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing FileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.fileSystemMod.FileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.fileSystemMod.FileSystem]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.fileSystemMod.FileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.fileSystemMod.FileSystem]
    @scala.inline
    def get(name: String, id: Input[ID], state: FileSystemState): typings.pulumiAws.fileSystemMod.FileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.fileSystemMod.FileSystem]
    @scala.inline
    def get(name: String, id: Input[ID], state: FileSystemState, opts: CustomResourceOptions): typings.pulumiAws.fileSystemMod.FileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.fileSystemMod.FileSystem]
    
    /**
      * Returns true if the given object is an instance of FileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystem.FileSystem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/efs/fileSystem.FileSystem */ Boolean]
  }
  
  @JSImport("@pulumi/aws/efs", "FileSystemPolicy")
  @js.native
  class FileSystemPolicy protected ()
    extends typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicy {
    /**
      * Create a FileSystemPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FileSystemPolicyArgs) = this()
    def this(name: String, args: FileSystemPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object FileSystemPolicy {
    
    @JSImport("@pulumi/aws/efs", "FileSystemPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing FileSystemPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: FileSystemPolicyState): typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: FileSystemPolicyState, opts: CustomResourceOptions): typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicy]
    
    /**
      * Returns true if the given object is an instance of FileSystemPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystemPolicy.FileSystemPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/efs/fileSystemPolicy.FileSystemPolicy */ Boolean]
  }
  
  @JSImport("@pulumi/aws/efs", "MountTarget")
  @js.native
  class MountTarget protected ()
    extends typings.pulumiAws.mountTargetMod.MountTarget {
    /**
      * Create a MountTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MountTargetArgs) = this()
    def this(name: String, args: MountTargetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MountTarget {
    
    @JSImport("@pulumi/aws/efs", "MountTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MountTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.mountTargetMod.MountTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mountTargetMod.MountTarget]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.mountTargetMod.MountTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mountTargetMod.MountTarget]
    @scala.inline
    def get(name: String, id: Input[ID], state: MountTargetState): typings.pulumiAws.mountTargetMod.MountTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mountTargetMod.MountTarget]
    @scala.inline
    def get(name: String, id: Input[ID], state: MountTargetState, opts: CustomResourceOptions): typings.pulumiAws.mountTargetMod.MountTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mountTargetMod.MountTarget]
    
    /**
      * Returns true if the given object is an instance of MountTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/mountTarget.MountTarget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/efs/mountTarget.MountTarget */ Boolean]
  }
  
  @scala.inline
  def getAccessPoint(args: GetAccessPointArgs): js.Promise[GetAccessPointResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessPoint")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAccessPointResult]]
  @scala.inline
  def getAccessPoint(args: GetAccessPointArgs, opts: InvokeOptions): js.Promise[GetAccessPointResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAccessPoint")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAccessPointResult]]
  
  @scala.inline
  def getAccessPoints(args: GetAccessPointsArgs): js.Promise[GetAccessPointsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessPoints")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAccessPointsResult]]
  @scala.inline
  def getAccessPoints(args: GetAccessPointsArgs, opts: InvokeOptions): js.Promise[GetAccessPointsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAccessPoints")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAccessPointsResult]]
  
  @scala.inline
  def getFileSystem(): js.Promise[GetFileSystemResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")().asInstanceOf[js.Promise[GetFileSystemResult]]
  @scala.inline
  def getFileSystem(args: Unit, opts: InvokeOptions): js.Promise[GetFileSystemResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetFileSystemResult]]
  @scala.inline
  def getFileSystem(args: GetFileSystemArgs): js.Promise[GetFileSystemResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetFileSystemResult]]
  @scala.inline
  def getFileSystem(args: GetFileSystemArgs, opts: InvokeOptions): js.Promise[GetFileSystemResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetFileSystemResult]]
  
  @scala.inline
  def getMountTarget(args: GetMountTargetArgs): js.Promise[GetMountTargetResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMountTarget")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetMountTargetResult]]
  @scala.inline
  def getMountTarget(args: GetMountTargetArgs, opts: InvokeOptions): js.Promise[GetMountTargetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMountTarget")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetMountTargetResult]]
}
