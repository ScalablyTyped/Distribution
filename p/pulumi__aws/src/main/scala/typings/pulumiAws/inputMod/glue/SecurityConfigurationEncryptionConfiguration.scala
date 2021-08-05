package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfigurationEncryptionConfiguration extends StObject {
  
  var cloudwatchEncryption: Input[SecurityConfigurationEncryptionConfigurationCloudwatchEncryption]
  
  var jobBookmarksEncryption: Input[SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption]
  
  /**
    * A `s3Encryption ` block as described below, which contains encryption configuration for S3 data.
    */
  var s3Encryption: Input[SecurityConfigurationEncryptionConfigurationS3Encryption]
}
object SecurityConfigurationEncryptionConfiguration {
  
  inline def apply(
    cloudwatchEncryption: Input[SecurityConfigurationEncryptionConfigurationCloudwatchEncryption],
    jobBookmarksEncryption: Input[SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption],
    s3Encryption: Input[SecurityConfigurationEncryptionConfigurationS3Encryption]
  ): SecurityConfigurationEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(cloudwatchEncryption = cloudwatchEncryption.asInstanceOf[js.Any], jobBookmarksEncryption = jobBookmarksEncryption.asInstanceOf[js.Any], s3Encryption = s3Encryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfiguration]
  }
  
  extension [Self <: SecurityConfigurationEncryptionConfiguration](x: Self) {
    
    inline def setCloudwatchEncryption(value: Input[SecurityConfigurationEncryptionConfigurationCloudwatchEncryption]): Self = StObject.set(x, "cloudwatchEncryption", value.asInstanceOf[js.Any])
    
    inline def setJobBookmarksEncryption(value: Input[SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption]): Self = StObject.set(x, "jobBookmarksEncryption", value.asInstanceOf[js.Any])
    
    inline def setS3Encryption(value: Input[SecurityConfigurationEncryptionConfigurationS3Encryption]): Self = StObject.set(x, "s3Encryption", value.asInstanceOf[js.Any])
  }
}
