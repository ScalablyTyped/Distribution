package typings.reactElemental.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipState extends StObject {
  
  val displayTooltip: Any
}
object TooltipState {
  
  inline def apply(displayTooltip: Any): TooltipState = {
    val __obj = js.Dynamic.literal(displayTooltip = displayTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipState]
  }
  
  extension [Self <: TooltipState](x: Self) {
    
    inline def setDisplayTooltip(value: Any): Self = StObject.set(x, "displayTooltip", value.asInstanceOf[js.Any])
  }
}
