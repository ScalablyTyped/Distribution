package typings.semanticUiCheckbox.anon

import typings.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'beforeIndeterminate'> */
trait PickImplbeforeIndetermina extends StObject {
  
  def beforeIndeterminate(): Unit | `false`
  @JSName("beforeIndeterminate")
  var beforeIndeterminate_Original: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
}
object PickImplbeforeIndetermina {
  
  @scala.inline
  def apply(beforeIndeterminate: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): PickImplbeforeIndetermina = {
    val __obj = js.Dynamic.literal(beforeIndeterminate = beforeIndeterminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbeforeIndetermina]
  }
  
  @scala.inline
  implicit class PickImplbeforeIndeterminaMutableBuilder[Self <: PickImplbeforeIndetermina] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeIndeterminate(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): Self = StObject.set(x, "beforeIndeterminate", value.asInstanceOf[js.Any])
  }
}
