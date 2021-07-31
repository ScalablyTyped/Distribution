package typings.semanticUiCheckbox.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'onDisable'> */
trait PickImplonDisable extends StObject {
  
  def onDisable(): Unit
  @JSName("onDisable")
  var onDisable_Original: js.ThisFunction0[/* this */ HTMLInputElement, Unit]
}
object PickImplonDisable {
  
  @scala.inline
  def apply(onDisable: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): PickImplonDisable = {
    val __obj = js.Dynamic.literal(onDisable = onDisable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonDisable]
  }
  
  @scala.inline
  implicit class PickImplonDisableMutableBuilder[Self <: PickImplonDisable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDisable(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = StObject.set(x, "onDisable", value.asInstanceOf[js.Any])
  }
}
