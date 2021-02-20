package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'enter'> */
@js.native
trait PickImplenter extends StObject {
  
  var enter: Double = js.native
}
object PickImplenter {
  
  @scala.inline
  def apply(enter: Double): PickImplenter = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplenter]
  }
  
  @scala.inline
  implicit class PickImplenterMutableBuilder[Self <: PickImplenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
  }
}
