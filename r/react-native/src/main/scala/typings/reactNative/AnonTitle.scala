package typings.reactNative

import typings.reactNative.mod.ShareContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitle extends ShareContent {
  var title: js.UndefOr[String] = js.undefined
  var url: String
}

object AnonTitle {
  @scala.inline
  def apply(url: String, title: String = null): AnonTitle = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitle]
  }
}

