package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, 'escape'> */
trait PickImplescape extends StObject {
  
  def escape(string: String): String
  @JSName("escape")
  var escape_Original: js.Function1[/* string */ String, String]
}
object PickImplescape {
  
  inline def apply(escape: /* string */ String => String): PickImplescape = {
    val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape))
    __obj.asInstanceOf[PickImplescape]
  }
  
  extension [Self <: PickImplescape](x: Self) {
    
    inline def setEscape(value: /* string */ String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
  }
}
