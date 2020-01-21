package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleMessage extends js.Object {
  /** The message arguments. */
  def args(): js.Array[JSHandle[_]]
  /** The location the message originated from */
  def location(): ConsoleMessageLocation
  /** The message text. */
  def text(): String
  def `type`(): ConsoleMessageType
}

object ConsoleMessage {
  @scala.inline
  def apply(
    args: () => js.Array[JSHandle[_]],
    location: () => ConsoleMessageLocation,
    text: () => String,
    `type`: () => ConsoleMessageType
  ): ConsoleMessage = {
    val __obj = js.Dynamic.literal(args = js.Any.fromFunction0(args), location = js.Any.fromFunction0(location), text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[ConsoleMessage]
  }
}

