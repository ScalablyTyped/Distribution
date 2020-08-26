package typings.ravenJs.anon

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  request :std.XMLHttpRequest | undefined} */
@js.native
trait ErrorrequestXMLHttpReques extends js.Object {
  var message: String = js.native
  var name: String = js.native
  var request: js.UndefOr[XMLHttpRequest] = js.native
  var stack: js.UndefOr[String] = js.native
}

object ErrorrequestXMLHttpReques {
  @scala.inline
  def apply(message: String, name: String): ErrorrequestXMLHttpReques = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorrequestXMLHttpReques]
  }
  @scala.inline
  implicit class ErrorrequestXMLHttpRequesOps[Self <: ErrorrequestXMLHttpReques] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: XMLHttpRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

