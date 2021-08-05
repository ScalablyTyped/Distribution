package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'searchFields'> */
trait PickImplsearchFields extends StObject {
  
  var searchFields: js.Array[String]
}
object PickImplsearchFields {
  
  inline def apply(searchFields: js.Array[String]): PickImplsearchFields = {
    val __obj = js.Dynamic.literal(searchFields = searchFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchFields]
  }
  
  extension [Self <: PickImplsearchFields](x: Self) {
    
    inline def setSearchFields(value: js.Array[String]): Self = StObject.set(x, "searchFields", value.asInstanceOf[js.Any])
    
    inline def setSearchFieldsVarargs(value: String*): Self = StObject.set(x, "searchFields", js.Array(value :_*))
  }
}
