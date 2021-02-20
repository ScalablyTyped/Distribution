package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'categories'> */
@js.native
trait PickImplcategories extends StObject {
  
  var categories: String = js.native
}
object PickImplcategories {
  
  @scala.inline
  def apply(categories: String): PickImplcategories = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcategories]
  }
  
  @scala.inline
  implicit class PickImplcategoriesMutableBuilder[Self <: PickImplcategories] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: String): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
  }
}
