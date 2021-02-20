package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackSettingsMod {
  
  @js.native
  trait StackSettings extends StObject {
    
    var config: js.UndefOr[StringDictionary[StackSettingsConfigValue]] = js.native
    
    var encryptedKey: js.UndefOr[String] = js.native
    
    var encryptionSalt: js.UndefOr[String] = js.native
    
    var secretsProvider: js.UndefOr[String] = js.native
  }
  object StackSettings {
    
    @scala.inline
    def apply(): StackSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackSettings]
    }
    
    @scala.inline
    implicit class StackSettingsMutableBuilder[Self <: StackSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: StringDictionary[StackSettingsConfigValue]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setEncryptedKey(value: String): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedKeyUndefined: Self = StObject.set(x, "encryptedKey", js.undefined)
      
      @scala.inline
      def setEncryptionSalt(value: String): Self = StObject.set(x, "encryptionSalt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionSaltUndefined: Self = StObject.set(x, "encryptionSalt", js.undefined)
      
      @scala.inline
      def setSecretsProvider(value: String): Self = StObject.set(x, "secretsProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretsProviderUndefined: Self = StObject.set(x, "secretsProvider", js.undefined)
    }
  }
  
  type StackSettingsConfigValue = String | StackSettingsSecureConfigValue | js.Any
  
  @js.native
  trait StackSettingsSecureConfigValue extends StObject {
    
    var secure: String = js.native
  }
  object StackSettingsSecureConfigValue {
    
    @scala.inline
    def apply(secure: String): StackSettingsSecureConfigValue = {
      val __obj = js.Dynamic.literal(secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackSettingsSecureConfigValue]
    }
    
    @scala.inline
    implicit class StackSettingsSecureConfigValueMutableBuilder[Self <: StackSettingsSecureConfigValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecure(value: String): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
}
