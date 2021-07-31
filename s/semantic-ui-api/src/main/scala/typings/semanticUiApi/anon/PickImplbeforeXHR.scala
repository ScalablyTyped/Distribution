package typings.semanticUiApi.anon

import typings.jquery.JQuery.jqXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'beforeXHR'> */
trait PickImplbeforeXHR extends StObject {
  
  def beforeXHR(xhrObject: jqXHR[js.Any]): js.Any
  @JSName("beforeXHR")
  var beforeXHR_Original: js.Function1[/* xhrObject */ jqXHR[js.Any], js.Any]
}
object PickImplbeforeXHR {
  
  @scala.inline
  def apply(beforeXHR: /* xhrObject */ jqXHR[js.Any] => js.Any): PickImplbeforeXHR = {
    val __obj = js.Dynamic.literal(beforeXHR = js.Any.fromFunction1(beforeXHR))
    __obj.asInstanceOf[PickImplbeforeXHR]
  }
  
  @scala.inline
  implicit class PickImplbeforeXHRMutableBuilder[Self <: PickImplbeforeXHR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeXHR(value: /* xhrObject */ jqXHR[js.Any] => js.Any): Self = StObject.set(x, "beforeXHR", js.Any.fromFunction1(value))
  }
}
