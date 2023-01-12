package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header extends StObject {
  
  var buttons: js.Array[HeaderButton]
}
object Header {
  
  inline def apply(buttons: js.Array[HeaderButton]): Header = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: js.Array[HeaderButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: HeaderButton*): Self = StObject.set(x, "buttons", js.Array(value*))
  }
}
