package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings.Param
import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl, 'variation'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl>> */
trait PickImplvariationPartialP
  extends StObject
     with Param {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
  
  var variation: (`false` | String) & (js.UndefOr[`false` | String])
}
object PickImplvariationPartialP {
  
  inline def apply(variation: (`false` | String) & (js.UndefOr[`false` | String])): PickImplvariationPartialP = {
    val __obj = js.Dynamic.literal(variation = variation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvariationPartialP]
  }
  
  extension [Self <: PickImplvariationPartialP](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setVariation(value: (`false` | String) & (js.UndefOr[`false` | String])): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
  }
}
