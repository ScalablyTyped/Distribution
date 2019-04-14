package typings
package reactDashPopperDashTooltipLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTriggerPropsArg
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var onClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onContextMenu: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onTouchEnd: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
}

object GetTriggerPropsArg {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onClick: /* event */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event] => scala.Unit = null,
    onContextMenu: /* event */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event] => scala.Unit = null,
    onMouseEnter: /* event */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event] => scala.Unit = null,
    onMouseLeave: /* event */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event] => scala.Unit = null,
    onMouseMove: /* event */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event] => scala.Unit = null,
    onTouchEnd: /* event */ reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event] => scala.Unit = null
  ): GetTriggerPropsArg = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    __obj.asInstanceOf[GetTriggerPropsArg]
  }
}

