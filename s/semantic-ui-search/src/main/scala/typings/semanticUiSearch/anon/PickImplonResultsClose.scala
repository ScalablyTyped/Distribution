package typings.semanticUiSearch.anon

import typings.semanticUiSearch.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'onResultsClose'> */
trait PickImplonResultsClose extends StObject {
  
  def onResultsClose(): Unit
  @JSName("onResultsClose")
  var onResultsClose_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonResultsClose {
  
  @scala.inline
  def apply(onResultsClose: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonResultsClose = {
    val __obj = js.Dynamic.literal(onResultsClose = onResultsClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonResultsClose]
  }
  
  @scala.inline
  implicit class PickImplonResultsCloseMutableBuilder[Self <: PickImplonResultsClose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnResultsClose(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onResultsClose", value.asInstanceOf[js.Any])
  }
}
