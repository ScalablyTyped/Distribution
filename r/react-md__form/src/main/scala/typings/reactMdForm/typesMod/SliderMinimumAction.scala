package typings.reactMdForm.typesMod

import typings.reactMdForm.reactMdFormStrings.minimum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderMinimumAction
  extends StObject
     with SliderAction {
  
  var min: Double
  
  var `type`: minimum
}
object SliderMinimumAction {
  
  inline def apply(min: Double): SliderMinimumAction = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("minimum")
    __obj.asInstanceOf[SliderMinimumAction]
  }
  
  extension [Self <: SliderMinimumAction](x: Self) {
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setType(value: minimum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
