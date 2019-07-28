package typings.atPulumiAws.efsFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/efs/fileSystem", "FileSystem")
@js.native
class FileSystem protected () extends CustomResource {
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
  /**
    * Amazon Resource Name of the file system.
    */
  val arn: Output[String] = js.native
  val creationToken: Output[String] = js.native
  /**
    * The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
    */
  val dnsName: Output[String] = js.native
  /**
    * If true, the disk will be encrypted.
    */
  val encrypted: Output[Boolean] = js.native
  /**
    * The ARN for the KMS encryption key. When specifying kms_key_id, encrypted needs to be set to true.
    */
  val kmsKeyId: Output[String] = js.native
  /**
    * The file system performance mode. Can be either `"generalPurpose"` or `"maxIO"` (Default: `"generalPurpose"`).
    */
  val performanceMode: Output[String] = js.native
  /**
    * The throughput, measured in MiB/s, that you want to provision for the file system. Only applicable with `throughput_mode` set to `provisioned`.
    */
  val provisionedThroughputInMibps: Output[js.UndefOr[Double]] = js.native
  /**
    * A mapping of tags to assign to the file system.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Throughput mode for the file system. Defaults to `bursting`. Valid values: `bursting`, `provisioned`. When using `provisioned`, also set `provisioned_throughput_in_mibps`.
    */
  val throughputMode: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/efs/fileSystem", "FileSystem")
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
  def get(name: String, id: Input[ID]): FileSystem = js.native
  def get(name: String, id: Input[ID], state: FileSystemState): FileSystem = js.native
  def get(name: String, id: Input[ID], state: FileSystemState, opts: CustomResourceOptions): FileSystem = js.native
  /**
    * Returns true if the given object is an instance of FileSystem.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystem.FileSystem */ Boolean = js.native
}

