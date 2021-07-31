package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownStrings.auto
import typings.semanticUiDropdown.semanticUiDropdownStrings.downward
import typings.semanticUiDropdown.semanticUiDropdownStrings.upward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'direction'> */
trait PickImpldirection extends StObject {
  
  var direction: auto | upward | downward
}
object PickImpldirection {
  
  @scala.inline
  def apply(direction: auto | upward | downward): PickImpldirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldirection]
  }
  
  @scala.inline
  implicit class PickImpldirectionMutableBuilder[Self <: PickImpldirection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: auto | upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
