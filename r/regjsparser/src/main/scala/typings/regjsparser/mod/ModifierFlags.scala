package typings.regjsparser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifierFlags extends StObject {
  
  var disabling: String
  
  var enabling: String
}
object ModifierFlags {
  
  inline def apply(disabling: String, enabling: String): ModifierFlags = {
    val __obj = js.Dynamic.literal(disabling = disabling.asInstanceOf[js.Any], enabling = enabling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifierFlags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifierFlags] (val x: Self) extends AnyVal {
    
    inline def setDisabling(value: String): Self = StObject.set(x, "disabling", value.asInstanceOf[js.Any])
    
    inline def setEnabling(value: String): Self = StObject.set(x, "enabling", value.asInstanceOf[js.Any])
  }
}
