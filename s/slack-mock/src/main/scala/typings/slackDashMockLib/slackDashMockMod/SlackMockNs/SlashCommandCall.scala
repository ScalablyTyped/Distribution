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

