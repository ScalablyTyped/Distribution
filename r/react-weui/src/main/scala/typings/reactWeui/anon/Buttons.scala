package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buttons extends StObject {
  
  var buttons: js.Array[js.Any]
  
  var `type`: String
}
object Buttons {
  
  @scala.inline
  def apply(buttons: js.Array[js.Any], `type`: String): Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
  
  @scala.inline
  implicit class ButtonsMutableBuilder[Self <: Buttons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[js.Any]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: js.Any*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
