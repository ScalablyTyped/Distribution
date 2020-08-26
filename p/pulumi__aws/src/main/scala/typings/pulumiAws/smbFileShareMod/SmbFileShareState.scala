package typings.pulumiAws.smbFileShareMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmbFileShareState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the SMB File Share.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The authentication method that users use to access the file share. Defaults to `ActiveDirectory`. Valid values: `ActiveDirectory`, `GuestAccess`.
    */
  val authentication: js.UndefOr[Input[String]] = js.native
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
    */
  val defaultStorageClass: js.UndefOr[Input[String]] = js.native
  /**
    * ID of the SMB File Share.
    */
  val fileshareId: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the file gateway.
    */
  val gatewayArn: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
    */
  val guessMimeTypeEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A list of users in the Active Directory that are not allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
    */
  val invalidUserLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
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
  val locationArn: js.UndefOr[Input[String]] = js.native
  /**
    * Access Control List permission for S3 bucket objects. Defaults to `private`.
    */
  val objectAcl: js.UndefOr[Input[String]] = js.native
  /**
    * File share path used by the NFS client to identify the mount point.
    */
  val path: js.UndefOr[Input[String]] = js.native
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
  val roleArn: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A list of users in the Active Directory that are allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
    */
  val validUserLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object SmbFileShareState {
  @scala.inline
  def apply(): SmbFileShareState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmbFileShareState]
  }
  @scala.inline
  implicit class SmbFileShareStateOps[Self <: SmbFileShareState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAuthentication(value: Input[String]): Self = this.set("authentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthentication: Self = this.set("authentication", js.undefined)
    @scala.inline
    def setDefaultStorageClass(value: Input[String]): Self = this.set("defaultStorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultStorageClass: Self = this.set("defaultStorageClass", js.undefined)
    @scala.inline
    def setFileshareId(value: Input[String]): Self = this.set("fileshareId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileshareId: Self = this.set("fileshareId", js.undefined)
    @scala.inline
    def setGatewayArn(value: Input[String]): Self = this.set("gatewayArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayArn: Self = this.set("gatewayArn", js.undefined)
    @scala.inline
    def setGuessMimeTypeEnabled(value: Input[Boolean]): Self = this.set("guessMimeTypeEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuessMimeTypeEnabled: Self = this.set("guessMimeTypeEnabled", js.undefined)
    @scala.inline
    def setInvalidUserListsVarargs(value: Input[String]*): Self = this.set("invalidUserLists", js.Array(value :_*))
    @scala.inline
    def setInvalidUserLists(value: Input[js.Array[Input[String]]]): Self = this.set("invalidUserLists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidUserLists: Self = this.set("invalidUserLists", js.undefined)
    @scala.inline
    def setKmsEncrypted(value: Input[Boolean]): Self = this.set("kmsEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsEncrypted: Self = this.set("kmsEncrypted", js.undefined)
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    @scala.inline
    def setLocationArn(value: Input[String]): Self = this.set("locationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationArn: Self = this.set("locationArn", js.undefined)
    @scala.inline
    def setObjectAcl(value: Input[String]): Self = this.set("objectAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectAcl: Self = this.set("objectAcl", js.undefined)
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRequesterPays(value: Input[Boolean]): Self = this.set("requesterPays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterPays: Self = this.set("requesterPays", js.undefined)
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setValidUserListsVarargs(value: Input[String]*): Self = this.set("validUserLists", js.Array(value :_*))
    @scala.inline
    def setValidUserLists(value: Input[js.Array[Input[String]]]): Self = this.set("validUserLists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidUserLists: Self = this.set("validUserLists", js.undefined)
  }
  
}

