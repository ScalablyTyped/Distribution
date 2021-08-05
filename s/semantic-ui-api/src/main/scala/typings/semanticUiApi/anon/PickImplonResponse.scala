package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onResponse'> */
trait PickImplonResponse extends StObject {
  
  def onResponse(response: js.Any): Unit
  @JSName("onResponse")
  var onResponse_Original: js.Function1[/* response */ js.Any, Unit]
}
object PickImplonResponse {
  
  inline def apply(onResponse: /* response */ js.Any => Unit): PickImplonResponse = {
    val __obj = js.Dynamic.literal(onResponse = js.Any.fromFunction1(onResponse))
    __obj.asInstanceOf[PickImplonResponse]
  }
  
  extension [Self <: PickImplonResponse](x: Self) {
    
    inline def setOnResponse(value: /* response */ js.Any => Unit): Self = StObject.set(x, "onResponse", js.Any.fromFunction1(value))
  }
}
