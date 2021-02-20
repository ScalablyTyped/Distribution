package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityConfigurationEncryptionConfiguration extends StObject {
  
  var cloudwatchEncryption: Input[SecurityConfigurationEncryptionConfigurationCloudwatchEncryption] = js.native
  
  var jobBookmarksEncryption: Input[SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption] = js.native
  
  /**
    * A `s3Encryption ` block as described below, which contains encryption configuration for S3 data.
    */
  var s3Encryption: Input[SecurityConfigurationEncryptionConfigurationS3Encryption] = js.native
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
  
  @scala.inline
  implicit class SecurityConfigurationEncryptionConfigurationMutableBuilder[Self <: SecurityConfigurationEncryptionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudwatchEncryption(value: Input[SecurityConfigurationEncryptionConfigurationCloudwatchEncryption]): Self = StObject.set(x, "cloudwatchEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobBookmarksEncryption(value: Input[SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption]): Self = StObject.set(x, "jobBookmarksEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Encryption(value: Input[SecurityConfigurationEncryptionConfigurationS3Encryption]): Self = StObject.set(x, "s3Encryption", value.asInstanceOf[js.Any])
  }
}
