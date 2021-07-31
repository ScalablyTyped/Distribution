package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption extends StObject {
  
  /**
    * Encryption mode to use for job bookmarks data. Valid values: `CSE-KMS`, `DISABLED`. Default value: `DISABLED`.
    */
  var jobBookmarksEncryptionMode: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
}
object SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption {
  
  @scala.inline
  def apply(): SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption]
  }
  
  @scala.inline
  implicit class SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionMutableBuilder[Self <: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobBookmarksEncryptionMode(value: Input[String]): Self = StObject.set(x, "jobBookmarksEncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobBookmarksEncryptionModeUndefined: Self = StObject.set(x, "jobBookmarksEncryptionMode", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
  }
}
