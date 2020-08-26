package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault extends js.Object {
  /**
    * The AWS KMS master key ID used for the SSE-KMS encryption. This can only be used when you set the value of `sseAlgorithm` as `aws:kms`. The default `aws/s3` AWS KMS master key is used if this element is absent while the `sseAlgorithm` is `aws:kms`.
    */
  var kmsMasterKeyId: js.UndefOr[String] = js.native
  /**
    * The server-side encryption algorithm to use. Valid values are `AES256` and `aws:kms`
    */
  var sseAlgorithm: String = js.native
}

object BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault {
  @scala.inline
  def apply(sseAlgorithm: String): BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal(sseAlgorithm = sseAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault]
  }
  @scala.inline
  implicit class BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultOps[Self <: BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault] (val x: Self) extends AnyVal {
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
    def setSseAlgorithm(value: String): Self = this.set("sseAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsMasterKeyId(value: String): Self = this.set("kmsMasterKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsMasterKeyId: Self = this.set("kmsMasterKeyId", js.undefined)
  }
  
}

