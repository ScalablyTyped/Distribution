package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl>> */
trait PartialPickImplkeyofImplDuration extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
  
  var variation: js.UndefOr[`false` | String] = js.undefined
}
object PartialPickImplkeyofImplDuration {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplDuration]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplDurationMutableBuilder[Self <: PartialPickImplkeyofImplDuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setVariation(value: `false` | String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
  }
}
