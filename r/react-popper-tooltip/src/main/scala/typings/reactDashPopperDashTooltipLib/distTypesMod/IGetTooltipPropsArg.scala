package typings
package reactDashPopperDashTooltipLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetTooltipPropsArg
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var onMouseEnter: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.Element, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.Element, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object IGetTooltipPropsArg {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onMouseEnter: /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.Element, reactLib.Event] => scala.Unit = null,
    onMouseLeave: /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.Element, reactLib.Event] => scala.Unit = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): IGetTooltipPropsArg = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IGetTooltipPropsArg]
  }
}

