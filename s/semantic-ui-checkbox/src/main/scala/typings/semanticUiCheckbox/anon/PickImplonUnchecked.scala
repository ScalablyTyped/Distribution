package typings.semanticUiCheckbox.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'onUnchecked'> */
trait PickImplonUnchecked extends StObject {
  
  def onUnchecked(): Unit
  @JSName("onUnchecked")
  var onUnchecked_Original: js.ThisFunction0[/* this */ HTMLInputElement, Unit]
}
object PickImplonUnchecked {
  
  inline def apply(onUnchecked: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): PickImplonUnchecked = {
    val __obj = js.Dynamic.literal(onUnchecked = onUnchecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonUnchecked]
  }
  
  extension [Self <: PickImplonUnchecked](x: Self) {
    
    inline def setOnUnchecked(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = StObject.set(x, "onUnchecked", value.asInstanceOf[js.Any])
  }
}
