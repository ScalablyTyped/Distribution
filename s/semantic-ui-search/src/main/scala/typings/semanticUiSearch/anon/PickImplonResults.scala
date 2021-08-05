package typings.semanticUiSearch.anon

import typings.semanticUiSearch.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'onResults'> */
trait PickImplonResults extends StObject {
  
  def onResults(response: js.Any): Unit
  @JSName("onResults")
  var onResults_Original: js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]
}
object PickImplonResults {
  
  inline def apply(onResults: js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]): PickImplonResults = {
    val __obj = js.Dynamic.literal(onResults = onResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonResults]
  }
  
  extension [Self <: PickImplonResults](x: Self) {
    
    inline def setOnResults(value: js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]): Self = StObject.set(x, "onResults", value.asInstanceOf[js.Any])
  }
}
