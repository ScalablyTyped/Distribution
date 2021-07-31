package typings.semanticUiApi.anon

import typings.jquery.JQuery.jqXHR
import typings.semanticUiApi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onError'> */
trait PickImplonError extends StObject {
  
  def onError(errorMessage: String, element: JQuery, xhr: jqXHR[js.Any]): Unit
  @JSName("onError")
  var onError_Original: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[js.Any], Unit]
}
object PickImplonError {
  
  @scala.inline
  def apply(onError: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[js.Any]) => Unit): PickImplonError = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction3(onError))
    __obj.asInstanceOf[PickImplonError]
  }
  
  @scala.inline
  implicit class PickImplonErrorMutableBuilder[Self <: PickImplonError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnError(value: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[js.Any]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
  }
}
