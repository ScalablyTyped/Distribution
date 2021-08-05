package typings.semanticUiCheckbox.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'onDisabled'> */
trait PickImplonDisabled extends StObject {
  
  def onDisabled(): Unit
  @JSName("onDisabled")
  var onDisabled_Original: js.ThisFunction0[/* this */ HTMLInputElement, Unit]
}
object PickImplonDisabled {
  
  inline def apply(onDisabled: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): PickImplonDisabled = {
    val __obj = js.Dynamic.literal(onDisabled = onDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonDisabled]
  }
  
  extension [Self <: PickImplonDisabled](x: Self) {
    
    inline def setOnDisabled(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = StObject.set(x, "onDisabled", value.asInstanceOf[js.Any])
  }
}
