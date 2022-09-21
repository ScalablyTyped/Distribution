package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MKRadioButtonGroup extends StObject {
  
  var buttons: js.Array[Any]
}
object MKRadioButtonGroup {
  
  inline def apply(buttons: js.Array[Any]): MKRadioButtonGroup = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[MKRadioButtonGroup]
  }
  
  extension [Self <: MKRadioButtonGroup](x: Self) {
    
    inline def setButtons(value: js.Array[Any]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: Any*): Self = StObject.set(x, "buttons", js.Array(value*))
  }
}
