package typings.slackMock.mod

import typings.nock.mod.ReplyHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractiveButtonCall[T] extends js.Object {
  var headers: InteractiveButtonHttpHeaders = js.native
  var params: T = js.native
  var statusCode: Double = js.native
  var `type`: InteractiveButtonCallType = js.native
  var url: InteractiveButtonUrl = js.native
}

object InteractiveButtonCall {
  @scala.inline
  def apply[T](
    headers: InteractiveButtonHttpHeaders,
    params: T,
    statusCode: Double,
    `type`: InteractiveButtonCallType,
    url: InteractiveButtonUrl
  ): InteractiveButtonCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveButtonCall[T]]
  }
  @scala.inline
  implicit class InteractiveButtonCallOps[Self <: InteractiveButtonCall[_], T] (val x: Self with InteractiveButtonCall[T]) extends AnyVal {
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
    def setHeaders(value: InteractiveButtonHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: InteractiveButtonCallType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: InteractiveButtonUrl): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

