package typings.semanticUiApi.anon

import typings.jquery.JQuery.jqXHR
import typings.semanticUiApi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onComplete'> */
trait PickImplonComplete extends StObject {
  
  def onComplete(response: js.Any, element: JQuery, xhr: jqXHR[js.Any]): Unit
  @JSName("onComplete")
  var onComplete_Original: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[js.Any], Unit]
}
object PickImplonComplete {
  
  inline def apply(onComplete: (/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[js.Any]) => Unit): PickImplonComplete = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction3(onComplete))
    __obj.asInstanceOf[PickImplonComplete]
  }
  
  extension [Self <: PickImplonComplete](x: Self) {
    
    inline def setOnComplete(value: (/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[js.Any]) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction3(value))
  }
}
