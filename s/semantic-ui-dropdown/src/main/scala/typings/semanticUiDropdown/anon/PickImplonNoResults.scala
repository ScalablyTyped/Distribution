package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'onNoResults'> */
trait PickImplonNoResults extends StObject {
  
  def onNoResults(searchValue: js.Any): Unit
  @JSName("onNoResults")
  var onNoResults_Original: js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]
}
object PickImplonNoResults {
  
  @scala.inline
  def apply(onNoResults: js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]): PickImplonNoResults = {
    val __obj = js.Dynamic.literal(onNoResults = onNoResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonNoResults]
  }
  
  @scala.inline
  implicit class PickImplonNoResultsMutableBuilder[Self <: PickImplonNoResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnNoResults(value: js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]): Self = StObject.set(x, "onNoResults", value.asInstanceOf[js.Any])
  }
}
