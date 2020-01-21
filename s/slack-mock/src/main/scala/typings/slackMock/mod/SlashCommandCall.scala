package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlashCommandCall[T] extends js.Object {
  var headers: SlashCommandHttpHeaders
  var params: T
  var statusCode: Double
  var `type`: SlashCommandCallType
  var url: SlashCommandUrl
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
}

