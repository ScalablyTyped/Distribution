package typings.reactMdForm.typesMod

import typings.reactMdForm.reactMdFormStrings.maximum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderMaximumAction extends SliderAction {
  
  var max: Double = js.native
  
  var `type`: maximum = js.native
}
object SliderMaximumAction {
  
  @scala.inline
  def apply(max: Double, `type`: maximum): SliderMaximumAction = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderMaximumAction]
  }
  
  @scala.inline
  implicit class SliderMaximumActionMutableBuilder[Self <: SliderMaximumAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: maximum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
