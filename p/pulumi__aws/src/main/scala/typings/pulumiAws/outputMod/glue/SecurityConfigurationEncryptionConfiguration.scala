package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityConfigurationEncryptionConfiguration extends js.Object {
  var cloudwatchEncryption: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption = js.native
  var jobBookmarksEncryption: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption = js.native
  /**
    * A `s3Encryption ` block as described below, which contains encryption configuration for S3 data.
    */
  var s3Encryption: SecurityConfigurationEncryptionConfigurationS3Encryption = js.native
}

object SecurityConfigurationEncryptionConfiguration {
  @scala.inline
  def apply(
    cloudwatchEncryption: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption,
    jobBookmarksEncryption: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption,
    s3Encryption: SecurityConfigurationEncryptionConfigurationS3Encryption
  ): SecurityConfigurationEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(cloudwatchEncryption = cloudwatchEncryption.asInstanceOf[js.Any], jobBookmarksEncryption = jobBookmarksEncryption.asInstanceOf[js.Any], s3Encryption = s3Encryption.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfiguration]
  }
}

