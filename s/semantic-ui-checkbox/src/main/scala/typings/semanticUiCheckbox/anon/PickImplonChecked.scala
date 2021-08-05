package typings.semanticUiCheckbox.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'onChecked'> */
trait PickImplonChecked extends StObject {
  
  def onChecked(): Unit
  @JSName("onChecked")
  var onChecked_Original: js.ThisFunction0[/* this */ HTMLInputElement, Unit]
}
object PickImplonChecked {
  
  inline def apply(onChecked: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): PickImplonChecked = {
    val __obj = js.Dynamic.literal(onChecked = onChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonChecked]
  }
  
  extension [Self <: PickImplonChecked](x: Self) {
    
    inline def setOnChecked(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = StObject.set(x, "onChecked", value.asInstanceOf[js.Any])
  }
}
