package typings.semanticUiApi.anon

import typings.jquery.JQuery.jqXHR
import typings.semanticUiApi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onSuccess'> */
trait PickImplonSuccess extends StObject {
  
  def onSuccess(response: js.Any, element: JQuery, xhr: jqXHR[js.Any]): Unit
  @JSName("onSuccess")
  var onSuccess_Original: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[js.Any], Unit]
}
object PickImplonSuccess {
  
  @scala.inline
  def apply(onSuccess: (/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[js.Any]) => Unit): PickImplonSuccess = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction3(onSuccess))
    __obj.asInstanceOf[PickImplonSuccess]
  }
  
  @scala.inline
  implicit class PickImplonSuccessMutableBuilder[Self <: PickImplonSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnSuccess(value: (/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[js.Any]) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
  }
}
