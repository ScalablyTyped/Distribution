package typings.semanticUiCheckbox.anon

import typings.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'beforeUnchecked'> */
trait PickImplbeforeUnchecked extends StObject {
  
  def beforeUnchecked(): Unit | `false`
  @JSName("beforeUnchecked")
  var beforeUnchecked_Original: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
}
object PickImplbeforeUnchecked {
  
  @scala.inline
  def apply(beforeUnchecked: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): PickImplbeforeUnchecked = {
    val __obj = js.Dynamic.literal(beforeUnchecked = beforeUnchecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbeforeUnchecked]
  }
  
  @scala.inline
  implicit class PickImplbeforeUncheckedMutableBuilder[Self <: PickImplbeforeUnchecked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeUnchecked(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): Self = StObject.set(x, "beforeUnchecked", value.asInstanceOf[js.Any])
  }
}
