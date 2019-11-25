package typings.reduxDashLocalstorageDashDebounce.reduxDashLocalstorageDashDebounceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebounceOptions
  extends /* key */ StringDictionary[js.Any] {
  var maxWait: js.UndefOr[Double] = js.undefined
}

object DebounceOptions {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, maxWait: Int | Double = null): DebounceOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (maxWait != null) __obj.updateDynamic("maxWait")(maxWait.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebounceOptions]
  }
}

