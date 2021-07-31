package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'categoryName'> */
trait PickImplcategoryName extends StObject {
  
  var categoryName: String
}
object PickImplcategoryName {
  
  @scala.inline
  def apply(categoryName: String): PickImplcategoryName = {
    val __obj = js.Dynamic.literal(categoryName = categoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcategoryName]
  }
  
  @scala.inline
  implicit class PickImplcategoryNameMutableBuilder[Self <: PickImplcategoryName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryName(value: String): Self = StObject.set(x, "categoryName", value.asInstanceOf[js.Any])
  }
}
