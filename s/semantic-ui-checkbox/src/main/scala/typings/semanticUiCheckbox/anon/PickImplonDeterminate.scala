package typings.semanticUiCheckbox.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'onDeterminate'> */
trait PickImplonDeterminate extends StObject {
  
  def onDeterminate(): Unit
  @JSName("onDeterminate")
  var onDeterminate_Original: js.ThisFunction0[/* this */ HTMLInputElement, Unit]
}
object PickImplonDeterminate {
  
  @scala.inline
  def apply(onDeterminate: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): PickImplonDeterminate = {
    val __obj = js.Dynamic.literal(onDeterminate = onDeterminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonDeterminate]
  }
  
  @scala.inline
  implicit class PickImplonDeterminateMutableBuilder[Self <: PickImplonDeterminate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDeterminate(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = StObject.set(x, "onDeterminate", value.asInstanceOf[js.Any])
  }
}
