package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, 'message'> */
trait PickImplmessage extends StObject {
  
  def message(message: String, `type`: String): String
  @JSName("message")
  var message_Original: js.Function2[/* message */ String, /* type */ String, String]
}
object PickImplmessage {
  
  inline def apply(message: (/* message */ String, /* type */ String) => String): PickImplmessage = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction2(message))
    __obj.asInstanceOf[PickImplmessage]
  }
  
  extension [Self <: PickImplmessage](x: Self) {
    
    inline def setMessage(value: (/* message */ String, /* type */ String) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
  }
}
