package typings.raygun.typesMod

import typings.node.httpMod.IncomingMessage
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendOptions extends js.Object {
  var batch: Boolean = js.native
  var callback: Callback[IncomingMessage] = js.native
  var http: HTTPOptions = js.native
  var message: String = js.native
}

object SendOptions {
  @scala.inline
  def apply(batch: Boolean, callback: Callback[IncomingMessage], http: HTTPOptions, message: String): SendOptions = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
  @scala.inline
  implicit class SendOptionsOps[Self <: SendOptions] (val x: Self) extends AnyVal {
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
    def setBatch(value: Boolean): Self = this.set("batch", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackFunction2(value: (/* e */ Error | Null, /* t */ IncomingMessage | Null) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def setCallbackFunction1(value: /* t */ IncomingMessage | Null => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def setCallback(value: Callback[IncomingMessage]): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttp(value: HTTPOptions): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

