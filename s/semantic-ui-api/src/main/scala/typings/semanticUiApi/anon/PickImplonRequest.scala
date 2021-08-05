package typings.semanticUiApi.anon

import typings.jquery.JQuery.Deferred
import typings.jquery.JQuery.jqXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onRequest'> */
trait PickImplonRequest extends StObject {
  
  def onRequest(promise: Deferred[js.Any, js.Any, js.Any], xhr: jqXHR[js.Any]): Unit
  @JSName("onRequest")
  var onRequest_Original: js.Function2[/* promise */ Deferred[js.Any, js.Any, js.Any], /* xhr */ jqXHR[js.Any], Unit]
}
object PickImplonRequest {
  
  inline def apply(onRequest: (/* promise */ Deferred[js.Any, js.Any, js.Any], /* xhr */ jqXHR[js.Any]) => Unit): PickImplonRequest = {
    val __obj = js.Dynamic.literal(onRequest = js.Any.fromFunction2(onRequest))
    __obj.asInstanceOf[PickImplonRequest]
  }
  
  extension [Self <: PickImplonRequest](x: Self) {
    
    inline def setOnRequest(value: (/* promise */ Deferred[js.Any, js.Any, js.Any], /* xhr */ jqXHR[js.Any]) => Unit): Self = StObject.set(x, "onRequest", js.Any.fromFunction2(value))
  }
}
