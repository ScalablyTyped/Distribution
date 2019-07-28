package typings.atPulumiAws.efsMod

import typings.atPulumiAws.efsFileSystemMod.FileSystemArgs
import typings.atPulumiAws.efsFileSystemMod.FileSystemState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/efs", "FileSystem")
@js.native
class FileSystem protected ()
  extends typings.atPulumiAws.efsFileSystemMod.FileSystem {
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

/* static members */
@JSImport("@pulumi/aws/efs", "FileSystem")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.efsFileSystemMod.FileSystem = js.native
  def get(name: String, id: Input[ID], state: FileSystemState): typings.atPulumiAws.efsFileSystemMod.FileSystem = js.native
  def get(name: String, id: Input[ID], state: FileSystemState, opts: CustomResourceOptions): typings.atPulumiAws.efsFileSystemMod.FileSystem = js.native
  /**
    * Returns true if the given object is an instance of FileSystem.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystem.FileSystem */ Boolean = js.native
}

