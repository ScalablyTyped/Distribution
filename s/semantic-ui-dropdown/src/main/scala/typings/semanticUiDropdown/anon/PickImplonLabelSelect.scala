package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'onLabelSelect'> */
trait PickImplonLabelSelect extends StObject {
  
  def onLabelSelect($selectedLabels: JQuery): Unit
  @JSName("onLabelSelect")
  var onLabelSelect_Original: js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]
}
object PickImplonLabelSelect {
  
  @scala.inline
  def apply(onLabelSelect: js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]): PickImplonLabelSelect = {
    val __obj = js.Dynamic.literal(onLabelSelect = onLabelSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonLabelSelect]
  }
  
  @scala.inline
  implicit class PickImplonLabelSelectMutableBuilder[Self <: PickImplonLabelSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnLabelSelect(value: js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]): Self = StObject.set(x, "onLabelSelect", value.asInstanceOf[js.Any])
  }
}
