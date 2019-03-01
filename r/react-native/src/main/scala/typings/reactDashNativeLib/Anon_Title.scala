package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Title
  extends reactDashNativeLib.reactDashNativeMod.ShareContent {
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object Anon_Title {
  @scala.inline
  def apply(url: java.lang.String, title: java.lang.String = null): Anon_Title = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Title]
  }
}

