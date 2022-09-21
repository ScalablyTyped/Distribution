package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.TemplatesSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, 'message'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl>> */
trait PickImplmessagePartialPic
  extends StObject
     with Param {
  
  var category: js.UndefOr[js.Function1[/* response */ Any, String]] = js.undefined
  
  var escape: js.UndefOr[js.Function1[/* string */ String, String]] = js.undefined
  
  def message(message: String, `type`: String): String
  @JSName("message")
  var message_Original: (js.Function2[/* message */ String, /* type */ String, String]) & (js.UndefOr[js.Function2[/* message */ String, /* type */ String, String]])
  
  var standard: js.UndefOr[js.Function1[/* response */ Any, String]] = js.undefined
}
object PickImplmessagePartialPic {
  
  inline def apply(
    message: (js.Function2[/* message */ String, /* type */ String, String]) & (js.UndefOr[js.Function2[/* message */ String, /* type */ String, String]])
  ): PickImplmessagePartialPic = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmessagePartialPic]
  }
  
  extension [Self <: PickImplmessagePartialPic](x: Self) {
    
    inline def setCategory(value: /* response */ Any => String): Self = StObject.set(x, "category", js.Any.fromFunction1(value))
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setEscape(value: /* string */ String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setMessage(
      value: (js.Function2[/* message */ String, /* type */ String, String]) & (js.UndefOr[js.Function2[/* message */ String, /* type */ String, String]])
    ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: /* response */ Any => String): Self = StObject.set(x, "standard", js.Any.fromFunction1(value))
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
