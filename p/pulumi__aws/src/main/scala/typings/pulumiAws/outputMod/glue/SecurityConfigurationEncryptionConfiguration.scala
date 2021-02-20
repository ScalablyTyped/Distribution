package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityConfigurationEncryptionConfiguration extends StObject {
  
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
  implicit class SecurityConfigurationEncryptionConfigurationMutableBuilder[Self <: SecurityConfigurationEncryptionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudwatchEncryption(value: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption): Self = StObject.set(x, "cloudwatchEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobBookmarksEncryption(value: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption): Self = StObject.set(x, "jobBookmarksEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Encryption(value: SecurityConfigurationEncryptionConfigurationS3Encryption): Self = StObject.set(x, "s3Encryption", value.asInstanceOf[js.Any])
  }
}
