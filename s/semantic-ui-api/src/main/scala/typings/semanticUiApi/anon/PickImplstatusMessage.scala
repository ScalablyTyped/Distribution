package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'statusMessage'> */
@js.native
trait PickImplstatusMessage extends js.Object {
  
  var statusMessage: String = js.native
}
object PickImplstatusMessage {
  
  @scala.inline
  def apply(statusMessage: String): PickImplstatusMessage = {
    val __obj = js.Dynamic.literal(statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstatusMessage]
  }
  
  @scala.inline
  implicit class PickImplstatusMessageOps[Self <: PickImplstatusMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
  }
}
