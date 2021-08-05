package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl>> */
trait PartialPickImplkeyofImplCategory extends StObject {
  
  var category: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.undefined
  
  var escape: js.UndefOr[js.Function1[/* string */ String, String]] = js.undefined
  
  var message: js.UndefOr[js.Function2[/* message */ String, /* type */ String, String]] = js.undefined
  
  var standard: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.undefined
}
object PartialPickImplkeyofImplCategory {
  
  inline def apply(): PartialPickImplkeyofImplCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplCategory]
  }
  
  extension [Self <: PartialPickImplkeyofImplCategory](x: Self) {
    
    inline def setCategory(value: /* response */ js.Any => String): Self = StObject.set(x, "category", js.Any.fromFunction1(value))
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setEscape(value: /* string */ String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setMessage(value: (/* message */ String, /* type */ String) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStandard(value: /* response */ js.Any => String): Self = StObject.set(x, "standard", js.Any.fromFunction1(value))
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
