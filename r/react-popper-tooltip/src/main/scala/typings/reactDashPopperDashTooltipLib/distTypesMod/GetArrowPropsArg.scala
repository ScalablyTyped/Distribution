package typings
package reactDashPopperDashTooltipLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetArrowPropsArg
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object GetArrowPropsArg {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): GetArrowPropsArg = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GetArrowPropsArg]
  }
}

