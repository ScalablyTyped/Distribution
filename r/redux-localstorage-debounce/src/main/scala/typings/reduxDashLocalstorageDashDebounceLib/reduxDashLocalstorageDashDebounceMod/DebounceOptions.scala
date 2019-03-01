package typings
package reduxDashLocalstorageDashDebounceLib.reduxDashLocalstorageDashDebounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebounceOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var maxWait: js.UndefOr[scala.Double] = js.undefined
}

object DebounceOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    maxWait: scala.Int | scala.Double = null
  ): DebounceOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (maxWait != null) __obj.updateDynamic("maxWait")(maxWait.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebounceOptions]
  }
}

