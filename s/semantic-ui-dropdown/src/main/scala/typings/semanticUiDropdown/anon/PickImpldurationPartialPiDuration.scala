package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings.Param
import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl, 'duration'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl>> */
trait PickImpldurationPartialPiDuration
  extends StObject
     with Param {
  
  var duration: Double
  
  var transition: js.UndefOr[String] = js.undefined
  
  var variation: js.UndefOr[`false` | String] = js.undefined
}
object PickImpldurationPartialPiDuration {
  
  inline def apply(duration: Double): PickImpldurationPartialPiDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldurationPartialPiDuration]
  }
  
  extension [Self <: PickImpldurationPartialPiDuration](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setVariation(value: `false` | String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    inline def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
  }
}
