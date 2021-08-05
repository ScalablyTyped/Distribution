package typings.semanticUiSearch.anon

import typings.semanticUiSearch.JQuery
import typings.semanticUiSearch.semanticUiSearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'onSelect'> */
trait PickImplonSelect extends StObject {
  
  def onSelect(result: js.Any, response: js.Any): `false` | Unit
  @JSName("onSelect")
  var onSelect_Original: js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
}
object PickImplonSelect {
  
  inline def apply(
    onSelect: js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
  ): PickImplonSelect = {
    val __obj = js.Dynamic.literal(onSelect = onSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonSelect]
  }
  
  extension [Self <: PickImplonSelect](x: Self) {
    
    inline def setOnSelect(
      value: js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
    ): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
  }
}
