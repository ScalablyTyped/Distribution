package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityConfigurationEncryptionConfigurationCloudwatchEncryption extends StObject {
  
  /**
    * Encryption mode to use for CloudWatch data. Valid values: `DISABLED`, `SSE-KMS`. Default value: `DISABLED`.
    */
  var cloudwatchEncryptionMode: js.UndefOr[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[String] = js.native
}
object SecurityConfigurationEncryptionConfigurationCloudwatchEncryption {
  
  @scala.inline
  def apply(): SecurityConfigurationEncryptionConfigurationCloudwatchEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationCloudwatchEncryption]
  }
  
  @scala.inline
  implicit class SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionMutableBuilder[Self <: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudwatchEncryptionMode(value: String): Self = StObject.set(x, "cloudwatchEncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchEncryptionModeUndefined: Self = StObject.set(x, "cloudwatchEncryptionMode", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
  }
}
