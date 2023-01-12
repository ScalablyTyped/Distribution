package typings.psi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigSettings extends StObject {
  
  var emulatedFormFactor: String
  
  var locale: String
  
  var onlyCategories: js.Object
}
object ConfigSettings {
  
  inline def apply(emulatedFormFactor: String, locale: String, onlyCategories: js.Object): ConfigSettings = {
    val __obj = js.Dynamic.literal(emulatedFormFactor = emulatedFormFactor.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onlyCategories = onlyCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigSettings] (val x: Self) extends AnyVal {
    
    inline def setEmulatedFormFactor(value: String): Self = StObject.set(x, "emulatedFormFactor", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setOnlyCategories(value: js.Object): Self = StObject.set(x, "onlyCategories", value.asInstanceOf[js.Any])
  }
}
