package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'beforeSend'> */
trait PickImplbeforeSendBeforeSend extends StObject {
  
  var beforeSend: String
}
object PickImplbeforeSendBeforeSend {
  
  inline def apply(beforeSend: String): PickImplbeforeSendBeforeSend = {
    val __obj = js.Dynamic.literal(beforeSend = beforeSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbeforeSendBeforeSend]
  }
  
  extension [Self <: PickImplbeforeSendBeforeSend](x: Self) {
    
    inline def setBeforeSend(value: String): Self = StObject.set(x, "beforeSend", value.asInstanceOf[js.Any])
  }
}
