package typings.pulumiAws.mod

import typings.pulumiAws.fileSystemMod.FileSystemArgs
import typings.pulumiAws.fileSystemMod.FileSystemState
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "efs")
@js.native
object efs extends js.Object {
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
    def this(name: String, args: FileSystemArgs, opts: CustomResourceOptions) = this()
  }
  
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
  
  def getFileSystem(): js.Promise[GetFileSystemResult] with GetFileSystemResult = js.native
  def getFileSystem(args: GetFileSystemArgs): js.Promise[GetFileSystemResult] with GetFileSystemResult = js.native
  def getFileSystem(args: GetFileSystemArgs, opts: InvokeOptions): js.Promise[GetFileSystemResult] with GetFileSystemResult = js.native
  def getMountTarget(args: GetMountTargetArgs): js.Promise[GetMountTargetResult] with GetMountTargetResult = js.native
  def getMountTarget(args: GetMountTargetArgs, opts: InvokeOptions): js.Promise[GetMountTargetResult] with GetMountTargetResult = js.native
  /* static members */
  @js.native
  object FileSystem extends js.Object {
    /**
      * Get an existing FileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.fileSystemMod.FileSystem = js.native
    def get(name: String, id: Input[ID], state: FileSystemState): typings.pulumiAws.fileSystemMod.FileSystem = js.native
    def get(name: String, id: Input[ID], state: FileSystemState, opts: CustomResourceOptions): typings.pulumiAws.fileSystemMod.FileSystem = js.native
    /**
      * Returns true if the given object is an instance of FileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystem.FileSystem */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MountTarget extends js.Object {
    /**
      * Get an existing MountTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.mountTargetMod.MountTarget = js.native
    def get(name: String, id: Input[ID], state: MountTargetState): typings.pulumiAws.mountTargetMod.MountTarget = js.native
    def get(name: String, id: Input[ID], state: MountTargetState, opts: CustomResourceOptions): typings.pulumiAws.mountTargetMod.MountTarget = js.native
    /**
      * Returns true if the given object is an instance of MountTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/mountTarget.MountTarget */ Boolean = js.native
  }
  
}

