package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SlashCommands[T] extends js.Object {
  var calls: js.Array[SlashCommandCall[T]]
  def addResponse(opts: SlashCommandOptions[T]): scala.Unit
  def reset(): scala.Unit
  def send(targetUrl: SlashCommandUrl, body: T): stdLib.Promise[scala.Unit]
}

