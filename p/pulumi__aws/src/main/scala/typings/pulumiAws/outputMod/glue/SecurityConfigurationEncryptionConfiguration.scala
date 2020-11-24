package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class SecurityConfigurationEncryptionConfigurationOps[Self <: SecurityConfigurationEncryptionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCloudwatchEncryption(value: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption): Self = this.set("cloudwatchEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobBookmarksEncryption(value: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption): Self = this.set("jobBookmarksEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Encryption(value: SecurityConfigurationEncryptionConfigurationS3Encryption): Self = this.set("s3Encryption", value.asInstanceOf[js.Any])
  }
}
