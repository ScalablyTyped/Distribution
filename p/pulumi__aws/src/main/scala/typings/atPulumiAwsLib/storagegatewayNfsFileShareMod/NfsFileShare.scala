package typings
package atPulumiAwsLib.storagegatewayNfsFileShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/storagegateway/nfsFileShare", "NfsFileShare")
@js.native
class NfsFileShare protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a NfsFileShare resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: NfsFileShareArgs) = this()
  def this(name: java.lang.String, args: NfsFileShareArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the NFS File Share.
    */
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `["0.0.0.0/0"]` to not limit access. Minimum 1 item. Maximum 100 items.
    */
  val clientLists: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
    */
  val defaultStorageClass: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * ID of the NFS File Share.
    */
  val fileshareId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Amazon Resource Name (ARN) of the file gateway.
    */
  val gatewayArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
    */
  val guessMimeTypeEnabled: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
    */
  val kmsEncrypted: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is true.
    */
  val kmsKeyArn: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ARN of the backed storage used for storing file data.
    */
  val locationArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Nested argument with file share default values. More information below.
    */
  val nfsFileShareDefaults: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_GroupIdDirectoryMode]] = js.native
  /**
    * Access Control List permission for S3 bucket objects. Defaults to `private`.
    */
  val objectAcl: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
    */
  val readOnly: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
    */
  val requesterPays: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
    */
  val roleArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
    */
  val squash: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
}

@JSImport("@pulumi/aws/storagegateway/nfsFileShare", "NfsFileShare")
@js.native
object NfsFileShare extends js.Object {
  /**
    * Get an existing NfsFileShare resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShare = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShareState
  ): atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShare = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShareState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShare = js.native
}

