package typings
package atPulumiAwsLib.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/efs", "FileSystem")
@js.native
class FileSystem protected ()
  extends atPulumiAwsLib.efsFileSystemMod.FileSystem {
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

