package typings.reactDashPopperDashTooltip.distTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetArrowPropsArg
  extends /* key */ StringDictionary[js.Any] {
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GetArrowPropsArg {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, style: CSSProperties = null): GetArrowPropsArg = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GetArrowPropsArg]
  }
}

