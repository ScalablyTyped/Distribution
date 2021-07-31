package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputKeyPressEventData extends StObject {
  
  var key: String
}
object TextInputKeyPressEventData {
  
  @scala.inline
  def apply(key: String): TextInputKeyPressEventData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputKeyPressEventData]
  }
  
  @scala.inline
  implicit class TextInputKeyPressEventDataMutableBuilder[Self <: TextInputKeyPressEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
