package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfigurationEncryptionConfigurationS3Encryption extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[String] = js.undefined
  
  /**
    * Encryption mode to use for S3 data. Valid values: `DISABLED`, `SSE-KMS`, `SSE-S3`. Default value: `DISABLED`.
    */
  var s3EncryptionMode: js.UndefOr[String] = js.undefined
}
object SecurityConfigurationEncryptionConfigurationS3Encryption {
  
  inline def apply(): SecurityConfigurationEncryptionConfigurationS3Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationS3Encryption]
  }
  
  extension [Self <: SecurityConfigurationEncryptionConfigurationS3Encryption](x: Self) {
    
    inline def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setS3EncryptionMode(value: String): Self = StObject.set(x, "s3EncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setS3EncryptionModeUndefined: Self = StObject.set(x, "s3EncryptionMode", js.undefined)
  }
}
