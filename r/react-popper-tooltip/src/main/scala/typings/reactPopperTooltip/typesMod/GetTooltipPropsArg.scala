package typings.reactPopperTooltip.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTooltipPropsArg
  extends /* key */ StringDictionary[js.Any] {
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event_], Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event_], Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GetTooltipPropsArg {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    onMouseEnter: /* event */ SyntheticEvent[Element, Event_] => Unit = null,
    onMouseLeave: /* event */ SyntheticEvent[Element, Event_] => Unit = null,
    style: CSSProperties = null
  ): GetTooltipPropsArg = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTooltipPropsArg]
  }
}

