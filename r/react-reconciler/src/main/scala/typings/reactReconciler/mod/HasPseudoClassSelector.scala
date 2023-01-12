package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasPseudoClassSelector
  extends StObject
     with Selector {
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double
  
  var value: js.Array[Selector]
}
object HasPseudoClassSelector {
  
  inline def apply(DollarDollartypeof: js.Symbol | Double, value: js.Array[Selector]): HasPseudoClassSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasPseudoClassSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasPseudoClassSelector] (val x: Self) extends AnyVal {
    
    inline def setDollarDollartypeof(value: js.Symbol | Double): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Selector]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Selector*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
