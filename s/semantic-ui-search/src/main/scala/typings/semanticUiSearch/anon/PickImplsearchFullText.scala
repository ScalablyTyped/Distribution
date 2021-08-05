package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'searchFullText'> */
trait PickImplsearchFullText extends StObject {
  
  var searchFullText: Boolean
}
object PickImplsearchFullText {
  
  inline def apply(searchFullText: Boolean): PickImplsearchFullText = {
    val __obj = js.Dynamic.literal(searchFullText = searchFullText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchFullText]
  }
  
  extension [Self <: PickImplsearchFullText](x: Self) {
    
    inline def setSearchFullText(value: Boolean): Self = StObject.set(x, "searchFullText", value.asInstanceOf[js.Any])
  }
}
