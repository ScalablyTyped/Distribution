package typings.slackMock.mod

import typings.nock.mod.ReplyHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebCall[T] extends js.Object {
  var headers: WebHttpHeaders = js.native
  var params: T = js.native
  var url: WebUrl = js.native
}

object WebCall {
  @scala.inline
  def apply[T](headers: WebHttpHeaders, params: T, url: WebUrl): WebCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebCall[T]]
  }
  @scala.inline
  implicit class WebCallOps[Self <: WebCall[_], T] (val x: Self with WebCall[T]) extends AnyVal {
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
    def setHeadersVarargs(value: ReplyHeaderValue*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: WebHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: WebUrl): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

