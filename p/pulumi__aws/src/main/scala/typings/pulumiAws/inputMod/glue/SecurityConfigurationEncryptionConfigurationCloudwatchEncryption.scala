package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfigurationEncryptionConfigurationCloudwatchEncryption extends StObject {
  
  /**
    * Encryption mode to use for CloudWatch data. Valid values: `DISABLED`, `SSE-KMS`. Default value: `DISABLED`.
    */
  var cloudwatchEncryptionMode: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
}
object SecurityConfigurationEncryptionConfigurationCloudwatchEncryption {
  
  inline def apply(): SecurityConfigurationEncryptionConfigurationCloudwatchEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationCloudwatchEncryption]
  }
  
  extension [Self <: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption](x: Self) {
    
    inline def setCloudwatchEncryptionMode(value: Input[String]): Self = StObject.set(x, "cloudwatchEncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchEncryptionModeUndefined: Self = StObject.set(x, "cloudwatchEncryptionMode", js.undefined)
    
    inline def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
  }
}
