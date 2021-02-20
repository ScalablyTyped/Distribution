package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MKRadioButtonGroup extends StObject {
  
  var buttons: js.Array[_] = js.native
}
object MKRadioButtonGroup {
  
  @scala.inline
  def apply(buttons: js.Array[_]): MKRadioButtonGroup = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[MKRadioButtonGroup]
  }
  
  @scala.inline
  implicit class MKRadioButtonGroupMutableBuilder[Self <: MKRadioButtonGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[_]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: js.Any*): Self = StObject.set(x, "buttons", js.Array(value :_*))
  }
}
