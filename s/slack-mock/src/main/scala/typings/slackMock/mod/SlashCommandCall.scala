package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlashCommandCall[T] extends js.Object {
  var headers: SlashCommandHttpHeaders = js.native
  var params: T = js.native
  var statusCode: Double = js.native
  var `type`: SlashCommandCallType = js.native
  var url: SlashCommandUrl = js.native
}

object SlashCommandCall {
  @scala.inline
  def apply[T](
    headers: SlashCommandHttpHeaders,
    params: T,
    statusCode: Double,
    `type`: SlashCommandCallType,
    url: SlashCommandUrl
  ): SlashCommandCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlashCommandCall[T]]
  }
  @scala.inline
  implicit class SlashCommandCallOps[Self <: SlashCommandCall[_], T] (val x: Self with SlashCommandCall[T]) extends AnyVal {
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
    def setHeaders(value: SlashCommandHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: SlashCommandCallType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: SlashCommandUrl): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

