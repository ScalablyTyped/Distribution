package typings.qs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedQs
  extends /* key */ StringDictionary[js.UndefOr[String | (js.Array[ParsedQs | String]) | ParsedQs]]

object ParsedQs {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[String | (js.Array[ParsedQs | String]) | ParsedQs]] = null
  ): ParsedQs = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ParsedQs]
  }
}

