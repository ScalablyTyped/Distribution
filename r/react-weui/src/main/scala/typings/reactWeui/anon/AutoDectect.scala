package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoDectect extends StObject {
  
  var autoDectect: Boolean
  
  var buttons: js.Array[Any]
  
  var show: Boolean
  
  var title: String
  
  var `type`: String
}
object AutoDectect {
  
  inline def apply(autoDectect: Boolean, buttons: js.Array[Any], show: Boolean, title: String, `type`: String): AutoDectect = {
    val __obj = js.Dynamic.literal(autoDectect = autoDectect.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDectect]
  }
  
  extension [Self <: AutoDectect](x: Self) {
    
    inline def setAutoDectect(value: Boolean): Self = StObject.set(x, "autoDectect", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: js.Array[Any]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: Any*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
