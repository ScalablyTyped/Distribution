package typings.atPulumiAws.typesOutputMod.glueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityConfigurationEncryptionConfiguration extends js.Object {
  var cloudwatchEncryption: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption
  var jobBookmarksEncryption: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption
  /**
    * A `s3Encryption ` block as described below, which contains encryption configuration for S3 data.
    */
  var s3Encryption: SecurityConfigurationEncryptionConfigurationS3Encryption
}

object SecurityConfigurationEncryptionConfiguration {
  @scala.inline
  def apply(
    cloudwatchEncryption: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption,
    jobBookmarksEncryption: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption,
    s3Encryption: SecurityConfigurationEncryptionConfigurationS3Encryption
  ): SecurityConfigurationEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(cloudwatchEncryption = cloudwatchEncryption, jobBookmarksEncryption = jobBookmarksEncryption, s3Encryption = s3Encryption)
  
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfiguration]
  }
}

