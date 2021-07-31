package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object automationConfigMod {
  
  type ConfigMap = StringDictionary[ConfigValue]
  
  trait ConfigValue extends StObject {
    
    var secret: js.UndefOr[Boolean] = js.undefined
    
    var value: String
  }
  object ConfigValue {
    
    @scala.inline
    def apply(value: String): ConfigValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigValue]
    }
    
    @scala.inline
    implicit class ConfigValueMutableBuilder[Self <: ConfigValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecret(value: Boolean): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
