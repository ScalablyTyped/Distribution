package typings.pulumiAws.nfsFileShareMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.storagegateway.NfsFileShareNfsFileShareDefaults
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/storagegateway/nfsFileShare", "NfsFileShare")
@js.native
class NfsFileShare protected () extends CustomResource {
  /**
    * Create a NfsFileShare resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NfsFileShareArgs) = this()
  def this(name: String, args: NfsFileShareArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the NFS File Share.
    */
  val arn: Output_[String] = js.native
  /**
    * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `["0.0.0.0/0"]` to not limit access. Minimum 1 item. Maximum 100 items.
    */
  val clientLists: Output_[js.Array[String]] = js.native
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
    */
  val defaultStorageClass: Output_[js.UndefOr[String]] = js.native
  /**
    * ID of the NFS File Share.
    */
  val fileshareId: Output_[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the file gateway.
    */
  val gatewayArn: Output_[String] = js.native
  /**
    * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
    */
  val guessMimeTypeEnabled: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
    */
  val kmsEncrypted: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is true.
    */
  val kmsKeyArn: Output_[js.UndefOr[String]] = js.native
  /**
    * The ARN of the backed storage used for storing file data.
    */
  val locationArn: Output_[String] = js.native
  /**
    * Nested argument with file share default values. More information below.
    */
  val nfsFileShareDefaults: Output_[js.UndefOr[NfsFileShareNfsFileShareDefaults]] = js.native
  /**
    * Access Control List permission for S3 bucket objects. Defaults to `private`.
    */
  val objectAcl: Output_[js.UndefOr[String]] = js.native
  /**
    * File share path used by the NFS client to identify the mount point.
    */
  val path: Output_[String] = js.native
  /**
    * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
    */
  val readOnly: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
    */
  val requesterPays: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
    */
  val roleArn: Output_[String] = js.native
  /**
    * Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
    */
  val squash: Output_[js.UndefOr[String]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): NfsFileShare = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NfsFileShare = js.native
  def get(name: String, id: Input[ID], state: NfsFileShareState): NfsFileShare = js.native
  def get(name: String, id: Input[ID], state: NfsFileShareState, opts: CustomResourceOptions): NfsFileShare = js.native
  /**
    * Returns true if the given object is an instance of NfsFileShare.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/nfsFileShare.NfsFileShare */ Boolean = js.native
}

