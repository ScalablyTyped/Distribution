package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'statusMessage'> */
@js.native
trait PickImplstatusMessage extends StObject {
  
  var statusMessage: String = js.native
}
object PickImplstatusMessage {
  
  @scala.inline
  def apply(statusMessage: String): PickImplstatusMessage = {
    val __obj = js.Dynamic.literal(statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstatusMessage]
  }
  
  @scala.inline
  implicit class PickImplstatusMessageMutableBuilder[Self <: PickImplstatusMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
