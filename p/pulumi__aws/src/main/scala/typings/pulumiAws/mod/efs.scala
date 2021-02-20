package typings.pulumiAws.mod

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object efs {
  
  @JSImport("@pulumi/aws", "efs.AccessPoint")
  @js.native
  class AccessPoint protected ()
    extends typings.pulumiAws.efsMod.AccessPoint {
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
    
    /**
      * Get an existing AccessPoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "efs.AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.accessPointMod.AccessPoint = js.native
    @JSImport("@pulumi/aws", "efs.AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.accessPointMod.AccessPoint = js.native
    @JSImport("@pulumi/aws", "efs.AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccessPointState): typings.pulumiAws.accessPointMod.AccessPoint = js.native
    @JSImport("@pulumi/aws", "efs.AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccessPointState, opts: CustomResourceOptions): typings.pulumiAws.accessPointMod.AccessPoint = js.native
    
    /**
      * Returns true if the given object is an instance of AccessPoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "efs.AccessPoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/accessPoint.AccessPoint */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "efs.FileSystem")
  @js.native
  class FileSystem protected ()
    extends typings.pulumiAws.efsMod.FileSystem {
    /**
      * Create a FileSystem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: FileSystemArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: FileSystemArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object FileSystem {
    
    /**
      * Get an existing FileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "efs.FileSystem.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.fileSystemMod.FileSystem = js.native
    @JSImport("@pulumi/aws", "efs.FileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.fileSystemMod.FileSystem = js.native
    @JSImport("@pulumi/aws", "efs.FileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: FileSystemState): typings.pulumiAws.fileSystemMod.FileSystem = js.native
    @JSImport("@pulumi/aws", "efs.FileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: FileSystemState, opts: CustomResourceOptions): typings.pulumiAws.fileSystemMod.FileSystem = js.native
    
    /**
      * Returns true if the given object is an instance of FileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "efs.FileSystem.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystem.FileSystem */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "efs.FileSystemPolicy")
  @js.native
  class FileSystemPolicy protected ()
    extends typings.pulumiAws.efsMod.FileSystemPolicy {
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
    
    /**
      * Get an existing FileSystemPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "efs.FileSystemPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicy = js.native
    @JSImport("@pulumi/aws", "efs.FileSystemPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicy = js.native
    @JSImport("@pulumi/aws", "efs.FileSystemPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: FileSystemPolicyState): typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicy = js.native
    @JSImport("@pulumi/aws", "efs.FileSystemPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: FileSystemPolicyState, opts: CustomResourceOptions): typings.pulumiAws.fileSystemPolicyMod.FileSystemPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of FileSystemPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "efs.FileSystemPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystemPolicy.FileSystemPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "efs.MountTarget")
  @js.native
  class MountTarget protected ()
    extends typings.pulumiAws.efsMod.MountTarget {
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
    
    /**
      * Get an existing MountTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "efs.MountTarget.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.mountTargetMod.MountTarget = js.native
    @JSImport("@pulumi/aws", "efs.MountTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.mountTargetMod.MountTarget = js.native
    @JSImport("@pulumi/aws", "efs.MountTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: MountTargetState): typings.pulumiAws.mountTargetMod.MountTarget = js.native
    @JSImport("@pulumi/aws", "efs.MountTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: MountTargetState, opts: CustomResourceOptions): typings.pulumiAws.mountTargetMod.MountTarget = js.native
    
    /**
      * Returns true if the given object is an instance of MountTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "efs.MountTarget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/mountTarget.MountTarget */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "efs.getAccessPoint")
  @js.native
  def getAccessPoint(args: GetAccessPointArgs): js.Promise[GetAccessPointResult] = js.native
  @JSImport("@pulumi/aws", "efs.getAccessPoint")
  @js.native
  def getAccessPoint(args: GetAccessPointArgs, opts: InvokeOptions): js.Promise[GetAccessPointResult] = js.native
  
  @JSImport("@pulumi/aws", "efs.getAccessPoints")
  @js.native
  def getAccessPoints(args: GetAccessPointsArgs): js.Promise[GetAccessPointsResult] = js.native
  @JSImport("@pulumi/aws", "efs.getAccessPoints")
  @js.native
  def getAccessPoints(args: GetAccessPointsArgs, opts: InvokeOptions): js.Promise[GetAccessPointsResult] = js.native
  
  @JSImport("@pulumi/aws", "efs.getFileSystem")
  @js.native
  def getFileSystem(): js.Promise[GetFileSystemResult] = js.native
  @JSImport("@pulumi/aws", "efs.getFileSystem")
  @js.native
  def getFileSystem(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetFileSystemResult] = js.native
  @JSImport("@pulumi/aws", "efs.getFileSystem")
  @js.native
  def getFileSystem(args: GetFileSystemArgs): js.Promise[GetFileSystemResult] = js.native
  @JSImport("@pulumi/aws", "efs.getFileSystem")
  @js.native
  def getFileSystem(args: GetFileSystemArgs, opts: InvokeOptions): js.Promise[GetFileSystemResult] = js.native
  
  @JSImport("@pulumi/aws", "efs.getMountTarget")
  @js.native
  def getMountTarget(args: GetMountTargetArgs): js.Promise[GetMountTargetResult] = js.native
  @JSImport("@pulumi/aws", "efs.getMountTarget")
  @js.native
  def getMountTarget(args: GetMountTargetArgs, opts: InvokeOptions): js.Promise[GetMountTargetResult] = js.native
}
