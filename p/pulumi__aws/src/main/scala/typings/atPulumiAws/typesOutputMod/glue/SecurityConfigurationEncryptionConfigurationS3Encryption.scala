package typings.atPulumiAws.typesOutputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityConfigurationEncryptionConfigurationS3Encryption extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[String] = js.undefined
  /**
    * Encryption mode to use for S3 data. Valid values: `DISABLED`, `SSE-KMS`, `SSE-S3`. Default value: `DISABLED`.
    */
  var s3EncryptionMode: js.UndefOr[String] = js.undefined
}

object SecurityConfigurationEncryptionConfigurationS3Encryption {
  @scala.inline
  def apply(kmsKeyArn: String = null, s3EncryptionMode: String = null): SecurityConfigurationEncryptionConfigurationS3Encryption = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    if (s3EncryptionMode != null) __obj.updateDynamic("s3EncryptionMode")(s3EncryptionMode)
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationS3Encryption]
  }
}

