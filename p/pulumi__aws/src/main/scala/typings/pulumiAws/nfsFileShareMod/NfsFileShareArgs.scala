package typings.pulumiAws.nfsFileShareMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.storagegateway.NfsFileShareNfsFileShareDefaults
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NfsFileShareArgs extends js.Object {
  /**
    * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `["0.0.0.0/0"]` to not limit access. Minimum 1 item. Maximum 100 items.
    */
  val clientLists: Input[js.Array[Input[String]]] = js.native
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
    */
  val defaultStorageClass: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the file gateway.
    */
  val gatewayArn: Input[String] = js.native
  /**
    * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
    */
  val guessMimeTypeEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
    */
  val kmsEncrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is true.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the backed storage used for storing file data.
    */
  val locationArn: Input[String] = js.native
  /**
    * Nested argument with file share default values. More information below.
    */
  val nfsFileShareDefaults: js.UndefOr[Input[NfsFileShareNfsFileShareDefaults]] = js.native
  /**
    * Access Control List permission for S3 bucket objects. Defaults to `private`.
    */
  val objectAcl: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
    */
  val readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
    */
  val requesterPays: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
    */
  val roleArn: Input[String] = js.native
  /**
    * Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
    */
  val squash: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object NfsFileShareArgs {
  @scala.inline
  def apply(
    clientLists: Input[js.Array[Input[String]]],
    gatewayArn: Input[String],
    locationArn: Input[String],
    roleArn: Input[String]
  ): NfsFileShareArgs = {
    val __obj = js.Dynamic.literal(clientLists = clientLists.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any], locationArn = locationArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NfsFileShareArgs]
  }
  @scala.inline
  implicit class NfsFileShareArgsOps[Self <: NfsFileShareArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClientListsVarargs(value: Input[String]*): Self = this.set("clientLists", js.Array(value :_*))
    @scala.inline
    def setClientLists(value: Input[js.Array[Input[String]]]): Self = this.set("clientLists", value.asInstanceOf[js.Any])
    @scala.inline
    def setGatewayArn(value: Input[String]): Self = this.set("gatewayArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationArn(value: Input[String]): Self = this.set("locationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultStorageClass(value: Input[String]): Self = this.set("defaultStorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultStorageClass: Self = this.set("defaultStorageClass", js.undefined)
    @scala.inline
    def setGuessMimeTypeEnabled(value: Input[Boolean]): Self = this.set("guessMimeTypeEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuessMimeTypeEnabled: Self = this.set("guessMimeTypeEnabled", js.undefined)
    @scala.inline
    def setKmsEncrypted(value: Input[Boolean]): Self = this.set("kmsEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsEncrypted: Self = this.set("kmsEncrypted", js.undefined)
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    @scala.inline
    def setNfsFileShareDefaults(value: Input[NfsFileShareNfsFileShareDefaults]): Self = this.set("nfsFileShareDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNfsFileShareDefaults: Self = this.set("nfsFileShareDefaults", js.undefined)
    @scala.inline
    def setObjectAcl(value: Input[String]): Self = this.set("objectAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectAcl: Self = this.set("objectAcl", js.undefined)
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRequesterPays(value: Input[Boolean]): Self = this.set("requesterPays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterPays: Self = this.set("requesterPays", js.undefined)
    @scala.inline
    def setSquash(value: Input[String]): Self = this.set("squash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquash: Self = this.set("squash", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

