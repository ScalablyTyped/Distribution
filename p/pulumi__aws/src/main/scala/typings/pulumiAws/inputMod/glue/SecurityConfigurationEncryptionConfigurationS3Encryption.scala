package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityConfigurationEncryptionConfigurationS3Encryption extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * Encryption mode to use for S3 data. Valid values: `DISABLED`, `SSE-KMS`, `SSE-S3`. Default value: `DISABLED`.
    */
  var s3EncryptionMode: js.UndefOr[Input[String]] = js.native
}

object SecurityConfigurationEncryptionConfigurationS3Encryption {
  @scala.inline
  def apply(kmsKeyArn: Input[String] = null, s3EncryptionMode: Input[String] = null): SecurityConfigurationEncryptionConfigurationS3Encryption = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (s3EncryptionMode != null) __obj.updateDynamic("s3EncryptionMode")(s3EncryptionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationS3Encryption]
  }
}

