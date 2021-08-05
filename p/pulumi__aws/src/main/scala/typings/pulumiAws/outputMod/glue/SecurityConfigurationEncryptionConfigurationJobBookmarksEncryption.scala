package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption extends StObject {
  
  /**
    * Encryption mode to use for job bookmarks data. Valid values: `CSE-KMS`, `DISABLED`. Default value: `DISABLED`.
    */
  var jobBookmarksEncryptionMode: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[String] = js.undefined
}
object SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption {
  
  inline def apply(): SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption]
  }
  
  extension [Self <: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption](x: Self) {
    
    inline def setJobBookmarksEncryptionMode(value: String): Self = StObject.set(x, "jobBookmarksEncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setJobBookmarksEncryptionModeUndefined: Self = StObject.set(x, "jobBookmarksEncryptionMode", js.undefined)
    
    inline def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
  }
}
