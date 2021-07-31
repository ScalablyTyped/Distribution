package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, 'category'> */
trait PickImplcategoryCategory extends StObject {
  
  var category: String
}
object PickImplcategoryCategory {
  
  @scala.inline
  def apply(category: String): PickImplcategoryCategory = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcategoryCategory]
  }
  
  @scala.inline
  implicit class PickImplcategoryCategoryMutableBuilder[Self <: PickImplcategoryCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
  }
}
