package typings.reactNativeVideo.anon

import typings.reactNativeVideo.reactNativeVideoStrings.auto
import typings.reactNativeVideo.reactNativeVideoStrings.disabled
import typings.reactNativeVideo.reactNativeVideoStrings.index
import typings.reactNativeVideo.reactNativeVideoStrings.resolution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var `type`: auto | disabled | resolution | index
  var value: js.UndefOr[String | Double] = js.undefined
}

object Value {
  @scala.inline
  def apply(`type`: auto | disabled | resolution | index, value: String | Double = null): Value = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

