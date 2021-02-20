package typings.reactMdForm.typesMod

import typings.reactMdForm.reactMdFormStrings.minimum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderMinimumAction extends SliderAction {
  
  var min: Double = js.native
  
  var `type`: minimum = js.native
}
object SliderMinimumAction {
  
  @scala.inline
  def apply(min: Double, `type`: minimum): SliderMinimumAction = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderMinimumAction]
  }
  
  @scala.inline
  implicit class SliderMinimumActionMutableBuilder[Self <: SliderMinimumAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: minimum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
