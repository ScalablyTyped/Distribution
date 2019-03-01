package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlashCommandCall[T] extends js.Object {
  var headers: SlashCommandHttpHeaders
  var params: T
  var statusCode: scala.Double
  var `type`: SlashCommandCallType
  var url: SlashCommandUrl
}

object SlashCommandCall {
  @scala.inline
  def apply[T](
    headers: SlashCommandHttpHeaders,
    params: T,
    statusCode: scala.Double,
    `type`: SlashCommandCallType,
    url: SlashCommandUrl
  ): SlashCommandCall[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlashCommandCall[T]]
  }
}

