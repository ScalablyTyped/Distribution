package typings.reactMdForm.typesMod

import typings.reactMdForm.reactMdFormStrings.setValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderSetValueAction
  extends StObject
     with SliderAction {
  
  var `type`: setValue
  
  var value: Double
}
object SliderSetValueAction {
  
  inline def apply(value: Double): SliderSetValueAction = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setValue")
    __obj.asInstanceOf[SliderSetValueAction]
  }
  
  extension [Self <: SliderSetValueAction](x: Self) {
    
    inline def setType(value: setValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
