package typings.reactDashNativeDashVideo

import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.auto
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.disabled
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.index
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.resolution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var `type`: auto | disabled | resolution | index
  var value: js.UndefOr[String | Double] = js.undefined
}

object Anon_Auto {
  @scala.inline
  def apply(`type`: auto | disabled | resolution | index, value: String | Double = null): Anon_Auto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auto]
  }
}

