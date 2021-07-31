package typings.reactMdForm.typesMod

import typings.reactMdForm.reactMdFormStrings.maximum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderMaximumAction
  extends StObject
     with SliderAction {
  
  var max: Double
  
  var `type`: maximum
}
object SliderMaximumAction {
  
  @scala.inline
  def apply(max: Double): SliderMaximumAction = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("maximum")
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
