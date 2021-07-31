package typings.semanticUiCheckbox.anon

import typings.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'beforeDeterminate'> */
trait PickImplbeforeDeterminate extends StObject {
  
  def beforeDeterminate(): Unit | `false`
  @JSName("beforeDeterminate")
  var beforeDeterminate_Original: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
}
object PickImplbeforeDeterminate {
  
  @scala.inline
  def apply(beforeDeterminate: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): PickImplbeforeDeterminate = {
    val __obj = js.Dynamic.literal(beforeDeterminate = beforeDeterminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbeforeDeterminate]
  }
  
  @scala.inline
  implicit class PickImplbeforeDeterminateMutableBuilder[Self <: PickImplbeforeDeterminate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeDeterminate(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): Self = StObject.set(x, "beforeDeterminate", value.asInstanceOf[js.Any])
  }
}
