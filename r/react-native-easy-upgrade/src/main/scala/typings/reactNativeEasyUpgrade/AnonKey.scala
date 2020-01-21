package typings.reactNativeEasyUpgrade

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey
  extends /* key */ StringDictionary[js.Any] {
  var trackViewUrl: String
  var version: String
}

object AnonKey {
  @scala.inline
  def apply(trackViewUrl: String, version: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonKey = {
    val __obj = js.Dynamic.literal(trackViewUrl = trackViewUrl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonKey]
  }
}

