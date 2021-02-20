package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'categoryResults'> */
@js.native
trait PickImplcategoryResults extends StObject {
  
  var categoryResults: String = js.native
}
object PickImplcategoryResults {
  
  @scala.inline
  def apply(categoryResults: String): PickImplcategoryResults = {
    val __obj = js.Dynamic.literal(categoryResults = categoryResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcategoryResults]
  }
  
  @scala.inline
  implicit class PickImplcategoryResultsMutableBuilder[Self <: PickImplcategoryResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryResults(value: String): Self = StObject.set(x, "categoryResults", value.asInstanceOf[js.Any])
  }
}
