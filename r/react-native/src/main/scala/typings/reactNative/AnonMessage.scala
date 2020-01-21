package typings.reactNative

import typings.reactNative.mod.ShareContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends ShareContent {
  var message: String
  var title: js.UndefOr[String] = js.undefined
}

object AnonMessage {
  @scala.inline
  def apply(message: String, title: String = null): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage]
  }
}

