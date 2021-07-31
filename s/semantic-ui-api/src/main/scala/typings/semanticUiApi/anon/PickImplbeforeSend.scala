package typings.semanticUiApi.anon

import typings.semanticUiApi.SemanticUI.ApiSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'beforeSend'> */
trait PickImplbeforeSend extends StObject {
  
  def beforeSend(settings: ApiSettings): js.Any
  @JSName("beforeSend")
  var beforeSend_Original: js.Function1[/* settings */ ApiSettings, js.Any]
}
object PickImplbeforeSend {
  
  @scala.inline
  def apply(beforeSend: /* settings */ ApiSettings => js.Any): PickImplbeforeSend = {
    val __obj = js.Dynamic.literal(beforeSend = js.Any.fromFunction1(beforeSend))
    __obj.asInstanceOf[PickImplbeforeSend]
  }
  
  @scala.inline
  implicit class PickImplbeforeSendMutableBuilder[Self <: PickImplbeforeSend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeSend(value: /* settings */ ApiSettings => js.Any): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
  }
}
