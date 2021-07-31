package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.JQuery
import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'onShow'> */
trait PickImplonShow extends StObject {
  
  def onShow(): `false` | Unit
  @JSName("onShow")
  var onShow_Original: js.ThisFunction0[/* this */ JQuery, `false` | Unit]
}
object PickImplonShow {
  
  @scala.inline
  def apply(onShow: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): PickImplonShow = {
    val __obj = js.Dynamic.literal(onShow = onShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonShow]
  }
  
  @scala.inline
  implicit class PickImplonShowMutableBuilder[Self <: PickImplonShow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnShow(value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
  }
}
