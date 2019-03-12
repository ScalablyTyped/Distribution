package typings
package semanticDashUiDashReactLib.distCommonjsModulesStickyStickyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyProps
  extends StrictStickyProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object StickyProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    as: js.Any = null,
    bottomOffset: scala.Int | scala.Double = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    context: js.Object = null,
    offset: scala.Int | scala.Double = null,
    onBottom: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ StickyProps) => scala.Unit = null,
    onStick: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ StickyProps) => scala.Unit = null,
    onTop: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ StickyProps) => scala.Unit = null,
    onUnstick: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ StickyProps) => scala.Unit = null,
    pushing: js.UndefOr[scala.Boolean] = js.undefined,
    scrollContext: js.Object = null,
    styleElement: js.Object = null
  ): StickyProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (context != null) __obj.updateDynamic("context")(context)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onBottom != null) __obj.updateDynamic("onBottom")(js.Any.fromFunction2(onBottom))
    if (onStick != null) __obj.updateDynamic("onStick")(js.Any.fromFunction2(onStick))
    if (onTop != null) __obj.updateDynamic("onTop")(js.Any.fromFunction2(onTop))
    if (onUnstick != null) __obj.updateDynamic("onUnstick")(js.Any.fromFunction2(onUnstick))
    if (!js.isUndefined(pushing)) __obj.updateDynamic("pushing")(pushing)
    if (scrollContext != null) __obj.updateDynamic("scrollContext")(scrollContext)
    if (styleElement != null) __obj.updateDynamic("styleElement")(styleElement)
    __obj.asInstanceOf[StickyProps]
  }
}

