package typings.semanticUiCheckbox.anon

import typings.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'beforeChecked'> */
trait PickImplbeforeChecked extends StObject {
  
  def beforeChecked(): Unit | `false`
  @JSName("beforeChecked")
  var beforeChecked_Original: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
}
object PickImplbeforeChecked {
  
  inline def apply(beforeChecked: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): PickImplbeforeChecked = {
    val __obj = js.Dynamic.literal(beforeChecked = beforeChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbeforeChecked]
  }
  
  extension [Self <: PickImplbeforeChecked](x: Self) {
    
    inline def setBeforeChecked(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): Self = StObject.set(x, "beforeChecked", value.asInstanceOf[js.Any])
  }
}
