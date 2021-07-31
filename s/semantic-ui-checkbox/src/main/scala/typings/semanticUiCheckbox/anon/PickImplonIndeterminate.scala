package typings.semanticUiCheckbox.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'onIndeterminate'> */
trait PickImplonIndeterminate extends StObject {
  
  def onIndeterminate(): Unit
  @JSName("onIndeterminate")
  var onIndeterminate_Original: js.ThisFunction0[/* this */ HTMLInputElement, Unit]
}
object PickImplonIndeterminate {
  
  @scala.inline
  def apply(onIndeterminate: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): PickImplonIndeterminate = {
    val __obj = js.Dynamic.literal(onIndeterminate = onIndeterminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonIndeterminate]
  }
  
  @scala.inline
  implicit class PickImplonIndeterminateMutableBuilder[Self <: PickImplonIndeterminate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnIndeterminate(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = StObject.set(x, "onIndeterminate", value.asInstanceOf[js.Any])
  }
}
