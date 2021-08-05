package typings.semanticUiCheckbox.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'onEnabled'> */
trait PickImplonEnabled extends StObject {
  
  def onEnabled(): Unit
  @JSName("onEnabled")
  var onEnabled_Original: js.ThisFunction0[/* this */ HTMLInputElement, Unit]
}
object PickImplonEnabled {
  
  inline def apply(onEnabled: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): PickImplonEnabled = {
    val __obj = js.Dynamic.literal(onEnabled = onEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonEnabled]
  }
  
  extension [Self <: PickImplonEnabled](x: Self) {
    
    inline def setOnEnabled(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = StObject.set(x, "onEnabled", value.asInstanceOf[js.Any])
  }
}
