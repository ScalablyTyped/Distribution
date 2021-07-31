package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfigurationEncryptionConfigurationS3Encryption extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Encryption mode to use for S3 data. Valid values: `DISABLED`, `SSE-KMS`, `SSE-S3`. Default value: `DISABLED`.
    */
  var s3EncryptionMode: js.UndefOr[Input[String]] = js.undefined
}
object SecurityConfigurationEncryptionConfigurationS3Encryption {
  
  @scala.inline
  def apply(): SecurityConfigurationEncryptionConfigurationS3Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationS3Encryption]
  }
  
  @scala.inline
  implicit class SecurityConfigurationEncryptionConfigurationS3EncryptionMutableBuilder[Self <: SecurityConfigurationEncryptionConfigurationS3Encryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    @scala.inline
    def setS3EncryptionMode(value: Input[String]): Self = StObject.set(x, "s3EncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3EncryptionModeUndefined: Self = StObject.set(x, "s3EncryptionMode", js.undefined)
  }
}
