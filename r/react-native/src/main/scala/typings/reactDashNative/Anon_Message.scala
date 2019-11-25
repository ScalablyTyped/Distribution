package typings.reactDashNative

import typings.reactDashNative.reactDashNativeMod.ShareContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends ShareContent {
  var message: String
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Message {
  @scala.inline
  def apply(message: String, title: String = null): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Message]
  }
}

