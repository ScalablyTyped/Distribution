package typings.reactMdForm.typesMod

import typings.reactMdForm.reactMdFormStrings.setValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderSetValueAction extends SliderAction {
  
  var `type`: setValue = js.native
  
  var value: Double = js.native
}
object SliderSetValueAction {
  
  @scala.inline
  def apply(`type`: setValue, value: Double): SliderSetValueAction = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderSetValueAction]
  }
  
  @scala.inline
  implicit class SliderSetValueActionMutableBuilder[Self <: SliderSetValueAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: setValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
