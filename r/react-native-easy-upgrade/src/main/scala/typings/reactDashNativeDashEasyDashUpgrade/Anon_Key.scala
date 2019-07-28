package typings.reactDashNativeDashEasyDashUpgrade

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var trackViewUrl: String
  var version: String
}

object Anon_Key {
  @scala.inline
  def apply(trackViewUrl: String, version: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_Key = {
    val __obj = js.Dynamic.literal(trackViewUrl = trackViewUrl, version = version)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

