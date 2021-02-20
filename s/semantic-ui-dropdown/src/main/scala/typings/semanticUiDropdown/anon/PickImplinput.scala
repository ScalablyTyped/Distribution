package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.SelectorSettings._Impl, 'input'> */
@js.native
trait PickImplinput extends StObject {
  
  var input: String = js.native
}
object PickImplinput {
  
  @scala.inline
  def apply(input: String): PickImplinput = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinput]
  }
  
  @scala.inline
  implicit class PickImplinputMutableBuilder[Self <: PickImplinput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
