package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentSelector
  extends StObject
     with Selector {
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double
  
  var value: ReactAbstractComponent[scala.Nothing, Any]
}
object ComponentSelector {
  
  inline def apply(DollarDollartypeof: js.Symbol | Double, value: ReactAbstractComponent[scala.Nothing, Any]): ComponentSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentSelector]
  }
  
  extension [Self <: ComponentSelector](x: Self) {
    
    inline def setDollarDollartypeof(value: js.Symbol | Double): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ReactAbstractComponent[scala.Nothing, Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
