package typings.reactDashNative

import typings.reactDashNative.reactDashNativeMod.ShareContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Title extends ShareContent {
  var title: js.UndefOr[String] = js.undefined
  var url: String
}

object Anon_Title {
  @scala.inline
  def apply(url: String, title: String = null): Anon_Title = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Title]
  }
}

