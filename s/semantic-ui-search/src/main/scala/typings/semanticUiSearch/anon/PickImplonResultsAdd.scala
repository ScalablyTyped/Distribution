package typings.semanticUiSearch.anon

import typings.semanticUiSearch.JQuery
import typings.semanticUiSearch.semanticUiSearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'onResultsAdd'> */
trait PickImplonResultsAdd extends StObject {
  
  def onResultsAdd(html: String): `false` | Unit
  @JSName("onResultsAdd")
  var onResultsAdd_Original: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]
}
object PickImplonResultsAdd {
  
  inline def apply(onResultsAdd: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]): PickImplonResultsAdd = {
    val __obj = js.Dynamic.literal(onResultsAdd = onResultsAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonResultsAdd]
  }
  
  extension [Self <: PickImplonResultsAdd](x: Self) {
    
    inline def setOnResultsAdd(value: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]): Self = StObject.set(x, "onResultsAdd", value.asInstanceOf[js.Any])
  }
}
