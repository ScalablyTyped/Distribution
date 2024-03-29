package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfigurationEncryptionConfiguration extends StObject {
  
  var cloudwatchEncryption: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption
  
  var jobBookmarksEncryption: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption
  
  /**
    * A `s3Encryption ` block as described below, which contains encryption configuration for S3 data.
    */
  var s3Encryption: SecurityConfigurationEncryptionConfigurationS3Encryption
}
object SecurityConfigurationEncryptionConfiguration {
  
  inline def apply(
    cloudwatchEncryption: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption,
    jobBookmarksEncryption: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption,
    s3Encryption: SecurityConfigurationEncryptionConfigurationS3Encryption
  ): SecurityConfigurationEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(cloudwatchEncryption = cloudwatchEncryption.asInstanceOf[js.Any], jobBookmarksEncryption = jobBookmarksEncryption.asInstanceOf[js.Any], s3Encryption = s3Encryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfiguration]
  }
  
  extension [Self <: SecurityConfigurationEncryptionConfiguration](x: Self) {
    
    inline def setCloudwatchEncryption(value: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption): Self = StObject.set(x, "cloudwatchEncryption", value.asInstanceOf[js.Any])
    
    inline def setJobBookmarksEncryption(value: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption): Self = StObject.set(x, "jobBookmarksEncryption", value.asInstanceOf[js.Any])
    
    inline def setS3Encryption(value: SecurityConfigurationEncryptionConfigurationS3Encryption): Self = StObject.set(x, "s3Encryption", value.asInstanceOf[js.Any])
  }
}
