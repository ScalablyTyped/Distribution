package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault extends js.Object {
  /**
    * The AWS KMS master key ID used for the SSE-KMS encryption. This can only be used when you set the value of `sseAlgorithm` as `aws:kms`. The default `aws/s3` AWS KMS master key is used if this element is absent while the `sseAlgorithm` is `aws:kms`.
    */
  var kmsMasterKeyId: js.UndefOr[String] = js.undefined
  /**
    * The server-side encryption algorithm to use. Valid values are `AES256` and `aws:kms`
    */
  var sseAlgorithm: String
}

object BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault {
  @scala.inline
  def apply(sseAlgorithm: String, kmsMasterKeyId: String = null): BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal(sseAlgorithm = sseAlgorithm)
    if (kmsMasterKeyId != null) __obj.updateDynamic("kmsMasterKeyId")(kmsMasterKeyId)
    __obj.asInstanceOf[BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault]
  }
}

