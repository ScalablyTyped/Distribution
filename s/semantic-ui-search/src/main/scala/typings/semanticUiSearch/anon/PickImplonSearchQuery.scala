package typings.semanticUiSearch.anon

import typings.semanticUiSearch.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'onSearchQuery'> */
trait PickImplonSearchQuery extends StObject {
  
  def onSearchQuery(query: String): Unit
  @JSName("onSearchQuery")
  var onSearchQuery_Original: js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]
}
object PickImplonSearchQuery {
  
  inline def apply(onSearchQuery: js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]): PickImplonSearchQuery = {
    val __obj = js.Dynamic.literal(onSearchQuery = onSearchQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonSearchQuery]
  }
  
  extension [Self <: PickImplonSearchQuery](x: Self) {
    
    inline def setOnSearchQuery(value: js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]): Self = StObject.set(x, "onSearchQuery", value.asInstanceOf[js.Any])
  }
}
