package typings.semanticUiSearch.anon

import typings.semanticUiSearch.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'onResultsOpen'> */
trait PickImplonResultsOpen extends StObject {
  
  def onResultsOpen(): Unit
  @JSName("onResultsOpen")
  var onResultsOpen_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonResultsOpen {
  
  @scala.inline
  def apply(onResultsOpen: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonResultsOpen = {
    val __obj = js.Dynamic.literal(onResultsOpen = onResultsOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonResultsOpen]
  }
  
  @scala.inline
  implicit class PickImplonResultsOpenMutableBuilder[Self <: PickImplonResultsOpen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnResultsOpen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onResultsOpen", value.asInstanceOf[js.Any])
  }
}
