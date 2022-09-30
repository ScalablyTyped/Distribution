package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSelector
  extends StObject
     with Selector {
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double
  
  var value: String
}
object TextSelector {
  
  inline def apply(DollarDollartypeof: js.Symbol | Double, value: String): TextSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSelector]
  }
  
  extension [Self <: TextSelector](x: Self) {
    
    inline def setDollarDollartypeof(value: js.Symbol | Double): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
