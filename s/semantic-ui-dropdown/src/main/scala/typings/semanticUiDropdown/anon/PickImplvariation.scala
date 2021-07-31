package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl, 'variation'> */
trait PickImplvariation extends StObject {
  
  var variation: `false` | String
}
object PickImplvariation {
  
  @scala.inline
  def apply(variation: `false` | String): PickImplvariation = {
    val __obj = js.Dynamic.literal(variation = variation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvariation]
  }
  
  @scala.inline
  implicit class PickImplvariationMutableBuilder[Self <: PickImplvariation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariation(value: `false` | String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
  }
}
