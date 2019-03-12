package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlashCommands[T] extends js.Object {
  var calls: js.Array[SlashCommandCall[T]]
  def addResponse(opts: SlashCommandOptions[T]): scala.Unit
  def reset(): scala.Unit
  def send(targetUrl: SlashCommandUrl, body: T): js.Promise[scala.Unit]
}

object SlashCommands {
  @scala.inline
  def apply[T](
    addResponse: SlashCommandOptions[T] => scala.Unit,
    calls: js.Array[SlashCommandCall[T]],
    reset: () => scala.Unit,
    send: (SlashCommandUrl, T) => js.Promise[scala.Unit]
  ): SlashCommands[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls, reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
  
    __obj.asInstanceOf[SlashCommands[T]]
  }
}

