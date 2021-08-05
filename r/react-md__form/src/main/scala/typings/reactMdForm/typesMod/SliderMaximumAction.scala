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
  
  inline def apply(max: Double): SliderMaximumAction = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("maximum")
    __obj.asInstanceOf[SliderMaximumAction]
  }
  
  extension [Self <: SliderMaximumAction](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setType(value: maximum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
