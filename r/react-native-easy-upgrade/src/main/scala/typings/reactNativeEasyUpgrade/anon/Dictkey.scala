package typings.reactNativeEasyUpgrade.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var trackViewUrl: String
  var version: String
}

object Dictkey {
  @scala.inline
  def apply(
    trackViewUrl: String,
    version: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal(trackViewUrl = trackViewUrl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

