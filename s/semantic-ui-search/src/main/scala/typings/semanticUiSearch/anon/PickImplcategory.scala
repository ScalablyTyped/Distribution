package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, 'category'> */
trait PickImplcategory extends StObject {
  
  def category(response: js.Any): String
  @JSName("category")
  var category_Original: js.Function1[/* response */ js.Any, String]
}
object PickImplcategory {
  
  @scala.inline
  def apply(category: /* response */ js.Any => String): PickImplcategory = {
    val __obj = js.Dynamic.literal(category = js.Any.fromFunction1(category))
    __obj.asInstanceOf[PickImplcategory]
  }
  
  @scala.inline
  implicit class PickImplcategoryMutableBuilder[Self <: PickImplcategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: /* response */ js.Any => String): Self = StObject.set(x, "category", js.Any.fromFunction1(value))
  }
}
