package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "efs")
@js.native
object efsNs extends js.Object {
  @js.native
  class FileSystem protected ()
    extends atPulumiAwsLib.efsMod.FileSystem {
    /**
      * Create a FileSystem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.efsFileSystemMod.FileSystemArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.efsFileSystemMod.FileSystemArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class MountTarget protected ()
    extends atPulumiAwsLib.efsMod.MountTarget {
    /**
      * Create a MountTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.efsMountTargetMod.MountTargetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.efsMountTargetMod.MountTargetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getFileSystem(): js.Promise[atPulumiAwsLib.efsGetFileSystemMod.GetFileSystemResult] = js.native
  def getFileSystem(args: atPulumiAwsLib.efsGetFileSystemMod.GetFileSystemArgs): js.Promise[atPulumiAwsLib.efsGetFileSystemMod.GetFileSystemResult] = js.native
  def getFileSystem(
    args: atPulumiAwsLib.efsGetFileSystemMod.GetFileSystemArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.efsGetFileSystemMod.GetFileSystemResult] = js.native
  def getMountTarget(args: atPulumiAwsLib.efsGetMountTargetMod.GetMountTargetArgs): js.Promise[atPulumiAwsLib.efsGetMountTargetMod.GetMountTargetResult] = js.native
  def getMountTarget(
    args: atPulumiAwsLib.efsGetMountTargetMod.GetMountTargetArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.efsGetMountTargetMod.GetMountTargetResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.efsFileSystemMod.FileSystem = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.efsFileSystemMod.FileSystemState
    ): atPulumiAwsLib.efsFileSystemMod.FileSystem = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.efsFileSystemMod.FileSystemState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.efsFileSystemMod.FileSystem = js.native
    /**
      * Returns true if the given object is an instance of FileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystem.FileSystem */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.efsMountTargetMod.MountTarget = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.efsMountTargetMod.MountTargetState
    ): atPulumiAwsLib.efsMountTargetMod.MountTarget = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.efsMountTargetMod.MountTargetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.efsMountTargetMod.MountTarget = js.native
    /**
      * Returns true if the given object is an instance of MountTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/mountTarget.MountTarget */ scala.Boolean = js.native
  }
  
}

