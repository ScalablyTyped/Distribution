package typings.semanticUiCheckbox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'performance'> */
trait PickImplperformance extends StObject {
  
  var performance: Boolean
}
object PickImplperformance {
  
  inline def apply(performance: Boolean): PickImplperformance = {
    val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplperformance]
  }
  
  extension [Self <: PickImplperformance](x: Self) {
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
  }
}
