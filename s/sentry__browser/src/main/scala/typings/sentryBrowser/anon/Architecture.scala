package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Architecture extends StObject {
  
  var architecture: String
  
  var is_emulator: Boolean
  
  var locale: String
  
  var manufacturer: String
  
  var model: String
}
object Architecture {
  
  inline def apply(architecture: String, is_emulator: Boolean, locale: String, manufacturer: String, model: String): Architecture = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], is_emulator = is_emulator.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Architecture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Architecture] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setIs_emulator(value: Boolean): Self = StObject.set(x, "is_emulator", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
