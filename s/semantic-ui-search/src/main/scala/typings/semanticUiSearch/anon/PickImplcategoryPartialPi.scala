package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.TemplatesSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, 'category'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl>> */
trait PickImplcategoryPartialPi
  extends StObject
     with Param {
  
  def category(response: Any): String
  @JSName("category")
  var category_Original: (js.Function1[/* response */ Any, String]) & (js.UndefOr[js.Function1[/* response */ Any, String]])
  
  var escape: js.UndefOr[js.Function1[/* string */ String, String]] = js.undefined
  
  var message: js.UndefOr[js.Function2[/* message */ String, /* type */ String, String]] = js.undefined
  
  var standard: js.UndefOr[js.Function1[/* response */ Any, String]] = js.undefined
}
object PickImplcategoryPartialPi {
  
  inline def apply(
    category: (js.Function1[/* response */ Any, String]) & (js.UndefOr[js.Function1[/* response */ Any, String]])
  ): PickImplcategoryPartialPi = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcategoryPartialPi]
  }
  
  extension [Self <: PickImplcategoryPartialPi](x: Self) {
    
    inline def setCategory(
      value: (js.Function1[/* response */ Any, String]) & (js.UndefOr[js.Function1[/* response */ Any, String]])
    ): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setEscape(value: /* string */ String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setMessage(value: (/* message */ String, /* type */ String) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStandard(value: /* response */ Any => String): Self = StObject.set(x, "standard", js.Any.fromFunction1(value))
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
