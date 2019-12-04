package typings.semanticDashUiDashReact.distCommonjsModulesRatingRatingIconMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingIconProps
  extends StrictRatingIconProps
     with /* key */ StringDictionary[js.Any]

object RatingIconProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    className: String = null,
    index: Int | Double = null,
    onClick: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ RatingIconProps) => Unit = null,
    onKeyUp: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ RatingIconProps) => Unit = null,
    onMouseEnter: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ RatingIconProps) => Unit = null,
    selected: js.UndefOr[Boolean] = js.undefined
  ): RatingIconProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction2(onKeyUp))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingIconProps]
  }
}

