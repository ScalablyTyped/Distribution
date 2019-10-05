package typings.atPulumiAws.typesOutputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityConfigurationEncryptionConfigurationCloudwatchEncryption extends js.Object {
  /**
    * Encryption mode to use for CloudWatch data. Valid values: `DISABLED`, `SSE-KMS`. Default value: `DISABLED`.
    */
  var cloudwatchEncryptionMode: js.UndefOr[String] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[String] = js.undefined
}

object SecurityConfigurationEncryptionConfigurationCloudwatchEncryption {
  @scala.inline
  def apply(cloudwatchEncryptionMode: String = null, kmsKeyArn: String = null): SecurityConfigurationEncryptionConfigurationCloudwatchEncryption = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchEncryptionMode != null) __obj.updateDynamic("cloudwatchEncryptionMode")(cloudwatchEncryptionMode)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationCloudwatchEncryption]
  }
}

