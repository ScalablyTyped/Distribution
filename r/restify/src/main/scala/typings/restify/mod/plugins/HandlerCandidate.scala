package typings.restify.mod.plugins

import typings.restify.mod.Next
import typings.restify.mod.Request
import typings.restify.mod.RequestHandler
import typings.restify.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerCandidate extends js.Object {
  var contentType: js.UndefOr[String | js.Array[String]] = js.native
  var handler: RequestHandler | js.Array[RequestHandler] = js.native
  var version: js.UndefOr[String | js.Array[String]] = js.native
}

object HandlerCandidate {
  @scala.inline
  def apply(handler: RequestHandler | js.Array[RequestHandler]): HandlerCandidate = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerCandidate]
  }
  @scala.inline
  implicit class HandlerCandidateOps[Self <: HandlerCandidate] (val x: Self) extends AnyVal {
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
    def setHandlerVarargs(value: RequestHandler*): Self = this.set("handler", js.Array(value :_*))
    @scala.inline
    def setHandlerFunction3(value: (/* req */ Request, /* res */ Response, /* next */ Next) => js.Any): Self = this.set("handler", js.Any.fromFunction3(value))
    @scala.inline
    def setHandler(value: RequestHandler | js.Array[RequestHandler]): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentTypeVarargs(value: String*): Self = this.set("contentType", js.Array(value :_*))
    @scala.inline
    def setContentType(value: String | js.Array[String]): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setVersionVarargs(value: String*): Self = this.set("version", js.Array(value :_*))
    @scala.inline
    def setVersion(value: String | js.Array[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

