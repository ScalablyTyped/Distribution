package typings.reactNativeVideo

import typings.reactNativeVideo.reactNativeVideoStrings.disabled
import typings.reactNativeVideo.reactNativeVideoStrings.index
import typings.reactNativeVideo.reactNativeVideoStrings.language
import typings.reactNativeVideo.reactNativeVideoStrings.system
import typings.reactNativeVideo.reactNativeVideoStrings.title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: system | disabled | title | language | index
  var value: js.UndefOr[String | Double] = js.undefined
}

object AnonType {
  @scala.inline
  def apply(`type`: system | disabled | title | language | index, value: String | Double = null): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

