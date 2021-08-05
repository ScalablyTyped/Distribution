package typings.semanticUiApi.anon

import typings.jquery.JQuery.jqXHR
import typings.semanticUiApi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onAbort'> */
trait PickImplonAbort extends StObject {
  
  def onAbort(errorMessage: String, element: JQuery, xhr: jqXHR[js.Any]): Unit
  @JSName("onAbort")
  var onAbort_Original: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[js.Any], Unit]
}
object PickImplonAbort {
  
  inline def apply(onAbort: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[js.Any]) => Unit): PickImplonAbort = {
    val __obj = js.Dynamic.literal(onAbort = js.Any.fromFunction3(onAbort))
    __obj.asInstanceOf[PickImplonAbort]
  }
  
  extension [Self <: PickImplonAbort](x: Self) {
    
    inline def setOnAbort(value: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[js.Any]) => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction3(value))
  }
}
