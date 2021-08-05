package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'statusMessage'> */
trait PickImplstatusMessage extends StObject {
  
  var statusMessage: String
}
object PickImplstatusMessage {
  
  inline def apply(statusMessage: String): PickImplstatusMessage = {
    val __obj = js.Dynamic.literal(statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstatusMessage]
  }
  
  extension [Self <: PickImplstatusMessage](x: Self) {
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
