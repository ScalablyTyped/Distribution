package typings.semanticDashUiDashReact.distCommonjsModulesStickyStickyMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictStickyProps extends js.Object {
  /** A Sticky can be active. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Offset in pixels from the bottom of the screen when fixing element to viewport. */
  var bottomOffset: js.UndefOr[Double] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Context which sticky element should stick to. */
  var context: js.UndefOr[js.Object | Ref[HTMLElement]] = js.undefined
  /** Offset in pixels from the top of the screen when fixing element to viewport. */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * Callback when element is bound to bottom of parent container.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onBottom: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps, Unit]
  ] = js.undefined
  /**
    * Callback when element is fixed to page.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onStick: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps, Unit]
  ] = js.undefined
  /**
    * Callback when element is bound to top of parent container.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onTop: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps, Unit]
  ] = js.undefined
  /**
    * Callback when element is unfixed from page.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onUnstick: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps, Unit]
  ] = js.undefined
  /** Whether element should be "pushed" by the viewport, attaching to the bottom of the screen when scrolling up. */
  var pushing: js.UndefOr[Boolean] = js.undefined
  /** Context which sticky should attach onscroll events. */
  var scrollContext: js.UndefOr[js.Object | Ref[HTMLElement]] = js.undefined
  /** Custom style for sticky element. */
  var styleElement: js.UndefOr[js.Object] = js.undefined
}

object StrictStickyProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    bottomOffset: Int | Double = null,
    children: ReactNode = null,
    className: String = null,
    context: js.Object | Ref[HTMLElement] = null,
    offset: Int | Double = null,
    onBottom: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps) => Unit = null,
    onStick: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps) => Unit = null,
    onTop: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps) => Unit = null,
    onUnstick: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps) => Unit = null,
    pushing: js.UndefOr[Boolean] = js.undefined,
    scrollContext: js.Object | Ref[HTMLElement] = null,
    styleElement: js.Object = null
  ): StrictStickyProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onBottom != null) __obj.updateDynamic("onBottom")(js.Any.fromFunction2(onBottom))
    if (onStick != null) __obj.updateDynamic("onStick")(js.Any.fromFunction2(onStick))
    if (onTop != null) __obj.updateDynamic("onTop")(js.Any.fromFunction2(onTop))
    if (onUnstick != null) __obj.updateDynamic("onUnstick")(js.Any.fromFunction2(onUnstick))
    if (!js.isUndefined(pushing)) __obj.updateDynamic("pushing")(pushing.asInstanceOf[js.Any])
    if (scrollContext != null) __obj.updateDynamic("scrollContext")(scrollContext.asInstanceOf[js.Any])
    if (styleElement != null) __obj.updateDynamic("styleElement")(styleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictStickyProps]
  }
}

