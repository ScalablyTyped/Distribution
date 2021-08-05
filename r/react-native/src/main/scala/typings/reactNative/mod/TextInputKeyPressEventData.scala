package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputKeyPressEventData extends StObject {
  
  var key: String
}
object TextInputKeyPressEventData {
  
  inline def apply(key: String): TextInputKeyPressEventData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputKeyPressEventData]
  }
  
  extension [Self <: TextInputKeyPressEventData](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
