package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.JQuery
import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'onHide'> */
trait PickImplonHide extends StObject {
  
  def onHide(): `false` | Unit
  @JSName("onHide")
  var onHide_Original: js.ThisFunction0[/* this */ JQuery, `false` | Unit]
}
object PickImplonHide {
  
  @scala.inline
  def apply(onHide: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): PickImplonHide = {
    val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonHide]
  }
  
  @scala.inline
  implicit class PickImplonHideMutableBuilder[Self <: PickImplonHide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnHide(value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
  }
}
