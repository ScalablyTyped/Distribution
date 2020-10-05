package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePortEventMap extends js.Object {
  var message: MessageEvent = js.native
  var messageerror: MessageEvent = js.native
}

object MessagePortEventMap {
  @scala.inline
  def apply(message: MessageEvent, messageerror: MessageEvent): MessagePortEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePortEventMap]
  }
  @scala.inline
  implicit class MessagePortEventMapOps[Self <: MessagePortEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessage(value: MessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageerror(value: MessageEvent): Self = this.set("messageerror", value.asInstanceOf[js.Any])
  }
  
}

