package typings.reactNative.anon

import typings.reactNative.mod.ShareContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends ShareContent {
  var message: String
  var title: js.UndefOr[String] = js.undefined
}

object Message {
  @scala.inline
  def apply(message: String, title: String = null): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

