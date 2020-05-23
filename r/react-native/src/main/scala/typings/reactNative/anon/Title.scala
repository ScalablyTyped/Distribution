package typings.reactNative.anon

import typings.reactNative.mod.ShareContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends ShareContent {
  var title: js.UndefOr[String] = js.undefined
  var url: String
}

object Title {
  @scala.inline
  def apply(url: String, title: String = null): Title = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

