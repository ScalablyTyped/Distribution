package typings.semanticUiCheckbox.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'onEnable'> */
trait PickImplonEnable extends StObject {
  
  def onEnable(): Unit
  @JSName("onEnable")
  var onEnable_Original: js.ThisFunction0[/* this */ HTMLInputElement, Unit]
}
object PickImplonEnable {
  
  @scala.inline
  def apply(onEnable: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): PickImplonEnable = {
    val __obj = js.Dynamic.literal(onEnable = onEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonEnable]
  }
  
  @scala.inline
  implicit class PickImplonEnableMutableBuilder[Self <: PickImplonEnable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnEnable(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = StObject.set(x, "onEnable", value.asInstanceOf[js.Any])
  }
}
