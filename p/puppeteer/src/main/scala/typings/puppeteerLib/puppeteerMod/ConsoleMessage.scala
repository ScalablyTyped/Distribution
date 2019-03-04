package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleMessage extends js.Object {
  /** The message arguments. */
  def args(): js.Array[JSHandle]
  /** The location the message originated from */
  def location(): ConsoleMessageLocation
  /** The message text. */
  def text(): java.lang.String
  def `type`(): ConsoleMessageType
}

object ConsoleMessage {
  @scala.inline
  def apply(
    args: js.Function0[js.Array[JSHandle]],
    location: js.Function0[ConsoleMessageLocation],
    text: js.Function0[java.lang.String],
    `type`: js.Function0[ConsoleMessageType]
  ): ConsoleMessage = {
    val __obj = js.Dynamic.literal(args = args, location = location, text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConsoleMessage]
  }
}

