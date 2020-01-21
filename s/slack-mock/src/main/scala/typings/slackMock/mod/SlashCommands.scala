package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlashCommands[T] extends js.Object {
  var calls: js.Array[SlashCommandCall[T]]
  def addResponse(opts: SlashCommandOptions[T]): Unit
  def reset(): Unit
  def send(targetUrl: SlashCommandUrl, body: T): js.Promise[Unit]
}

object SlashCommands {
  @scala.inline
  def apply[T](
    addResponse: SlashCommandOptions[T] => Unit,
    calls: js.Array[SlashCommandCall[T]],
    reset: () => Unit,
    send: (SlashCommandUrl, T) => js.Promise[Unit]
  ): SlashCommands[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
  
    __obj.asInstanceOf[SlashCommands[T]]
  }
}

