package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonGroupOption extends StObject {
  
  var label: String
  
  var tooltip: String
  
  var value: String
}
object ButtonGroupOption {
  
  inline def apply(label: String, tooltip: String, value: String): ButtonGroupOption = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupOption]
  }
  
  extension [Self <: ButtonGroupOption](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
