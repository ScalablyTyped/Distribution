package typings.atPulumiAws.typesInputMod.glueNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityConfigurationEncryptionConfiguration extends js.Object {
  var cloudwatchEncryption: Input[SecurityConfigurationEncryptionConfigurationCloudwatchEncryption]
  var jobBookmarksEncryption: Input[SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption]
  /**
    * A `s3Encryption ` block as described below, which contains encryption configuration for S3 data.
    */
  var s3Encryption: Input[SecurityConfigurationEncryptionConfigurationS3Encryption]
}

object SecurityConfigurationEncryptionConfiguration {
  @scala.inline
  def apply(
    cloudwatchEncryption: Input[SecurityConfigurationEncryptionConfigurationCloudwatchEncryption],
    jobBookmarksEncryption: Input[SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption],
    s3Encryption: Input[SecurityConfigurationEncryptionConfigurationS3Encryption]
  ): SecurityConfigurationEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(cloudwatchEncryption = cloudwatchEncryption.asInstanceOf[js.Any], jobBookmarksEncryption = jobBookmarksEncryption.asInstanceOf[js.Any], s3Encryption = s3Encryption.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfiguration]
  }
}

