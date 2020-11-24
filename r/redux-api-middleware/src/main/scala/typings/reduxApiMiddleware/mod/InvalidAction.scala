package typings.reduxApiMiddleware.mod

import typings.reduxApiMiddleware.reduxApiMiddlewareBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidAction[Payload] extends js.Object {
  
  var error: `true` = js.native
  
  var payload: Payload = js.native
  
  var `type`: String | js.Symbol = js.native
}
object InvalidAction {
  
  @scala.inline
  def apply[Payload](error: `true`, payload: Payload, `type`: String | js.Symbol): InvalidAction[Payload] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidAction[Payload]]
  }
  
  @scala.inline
  implicit class InvalidActionOps[Self <: InvalidAction[_], Payload] (val x: Self with InvalidAction[Payload]) extends AnyVal {
    
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
    def setError(value: `true`): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String | js.Symbol): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
