package typings.psi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigSettings extends StObject {
  
  var emulatedFormFactor: String = js.native
  
  var locale: String = js.native
  
  var onlyCategories: js.Object = js.native
}
object ConfigSettings {
  
  @scala.inline
  def apply(emulatedFormFactor: String, locale: String, onlyCategories: js.Object): ConfigSettings = {
    val __obj = js.Dynamic.literal(emulatedFormFactor = emulatedFormFactor.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onlyCategories = onlyCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigSettings]
  }
  
  @scala.inline
  implicit class ConfigSettingsMutableBuilder[Self <: ConfigSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmulatedFormFactor(value: String): Self = StObject.set(x, "emulatedFormFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyCategories(value: js.Object): Self = StObject.set(x, "onlyCategories", value.asInstanceOf[js.Any])
  }
}
