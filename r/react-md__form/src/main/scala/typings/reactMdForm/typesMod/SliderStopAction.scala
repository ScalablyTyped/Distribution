package typings.reactMdForm.typesMod

import typings.reactMdForm.reactMdFormStrings.stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderStopAction
  extends StObject
     with SliderAction {
  
  var `type`: stop
}
object SliderStopAction {
  
  @scala.inline
  def apply(): SliderStopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stop")
    __obj.asInstanceOf[SliderStopAction]
  }
  
  @scala.inline
  implicit class SliderStopActionMutableBuilder[Self <: SliderStopAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: stop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
