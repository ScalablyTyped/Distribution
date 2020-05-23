package typings.semanticUiReact.stickyStickyMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyProps
  extends StrictStickyProps
     with /* key */ StringDictionary[js.Any]

object StickyProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    bottomOffset: js.UndefOr[Double] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    context: js.UndefOr[Null | js.Object | Ref[HTMLElement]] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    onBottom: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps) => Unit = null,
    onStick: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps) => Unit = null,
    onTop: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps) => Unit = null,
    onUnstick: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps) => Unit = null,
    pushing: js.UndefOr[Boolean] = js.undefined,
    scrollContext: js.UndefOr[Null | js.Object | Ref[HTMLElement]] = js.undefined,
    styleElement: js.Object = null
  ): StickyProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomOffset)) __obj.updateDynamic("bottomOffset")(bottomOffset.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (onBottom != null) __obj.updateDynamic("onBottom")(js.Any.fromFunction2(onBottom))
    if (onStick != null) __obj.updateDynamic("onStick")(js.Any.fromFunction2(onStick))
    if (onTop != null) __obj.updateDynamic("onTop")(js.Any.fromFunction2(onTop))
    if (onUnstick != null) __obj.updateDynamic("onUnstick")(js.Any.fromFunction2(onUnstick))
    if (!js.isUndefined(pushing)) __obj.updateDynamic("pushing")(pushing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollContext)) __obj.updateDynamic("scrollContext")(scrollContext.asInstanceOf[js.Any])
    if (styleElement != null) __obj.updateDynamic("styleElement")(styleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyProps]
  }
}

