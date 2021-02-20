package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checkbox extends StObject {
  
  var checkbox: Boolean = js.native
  
  var radio: Boolean = js.native
}
object Checkbox {
  
  @scala.inline
  def apply(checkbox: Boolean, radio: Boolean): Checkbox = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkbox]
  }
  
  @scala.inline
  implicit class CheckboxMutableBuilder[Self <: Checkbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadio(value: Boolean): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
  }
}
