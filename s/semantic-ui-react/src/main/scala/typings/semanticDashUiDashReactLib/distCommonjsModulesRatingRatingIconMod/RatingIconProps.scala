package typings
package semanticDashUiDashReactLib.distCommonjsModulesRatingRatingIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingIconProps
  extends StrictRatingIconProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object RatingIconProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    as: js.Any = null,
    className: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    onClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ RatingIconProps, 
      scala.Unit
    ] = null,
    onKeyUp: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ RatingIconProps, 
      scala.Unit
    ] = null,
    onMouseEnter: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ RatingIconProps, 
      scala.Unit
    ] = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined
  ): RatingIconProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[RatingIconProps]
  }
}

