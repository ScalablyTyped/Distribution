package typings
package semanticDashUiDashReactLib.distCommonjsModulesStickyStickyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictStickyProps extends js.Object {
  /** A Sticky can be active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Offset in pixels from the bottom of the screen when fixing element to viewport. */
  var bottomOffset: js.UndefOr[scala.Double] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Context which sticky element should stick to. */
  var context: js.UndefOr[js.Object | reactLib.reactMod.Ref[stdLib.HTMLElement]] = js.undefined
  /** Offset in pixels from the top of the screen when fixing element to viewport. */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback when element is bound to bottom of parent container.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onBottom: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ StickyProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback when element is fixed to page.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onStick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ StickyProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback when element is bound to top of parent container.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onTop: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ StickyProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback when element is unfixed from page.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onUnstick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ StickyProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** Whether element should be "pushed" by the viewport, attaching to the bottom of the screen when scrolling up. */
  var pushing: js.UndefOr[scala.Boolean] = js.undefined
  /** Context which sticky should attach onscroll events. */
  var scrollContext: js.UndefOr[js.Object | reactLib.reactMod.Ref[stdLib.HTMLElement]] = js.undefined
  /** Custom style for sticky element. */
  var styleElement: js.UndefOr[js.Object] = js.undefined
}

object StrictStickyProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    as: js.Any = null,
    bottomOffset: scala.Int | scala.Double = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    context: js.Object | reactLib.reactMod.Ref[stdLib.HTMLElement] = null,
    offset: scala.Int | scala.Double = null,
    onBottom: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ StickyProps) => scala.Unit = null,
    onStick: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ StickyProps) => scala.Unit = null,
    onTop: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ StickyProps) => scala.Unit = null,
    onUnstick: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ StickyProps) => scala.Unit = null,
    pushing: js.UndefOr[scala.Boolean] = js.undefined,
    scrollContext: js.Object | reactLib.reactMod.Ref[stdLib.HTMLElement] = null,
    styleElement: js.Object = null
  ): StrictStickyProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onBottom != null) __obj.updateDynamic("onBottom")(js.Any.fromFunction2(onBottom))
    if (onStick != null) __obj.updateDynamic("onStick")(js.Any.fromFunction2(onStick))
    if (onTop != null) __obj.updateDynamic("onTop")(js.Any.fromFunction2(onTop))
    if (onUnstick != null) __obj.updateDynamic("onUnstick")(js.Any.fromFunction2(onUnstick))
    if (!js.isUndefined(pushing)) __obj.updateDynamic("pushing")(pushing)
    if (scrollContext != null) __obj.updateDynamic("scrollContext")(scrollContext.asInstanceOf[js.Any])
    if (styleElement != null) __obj.updateDynamic("styleElement")(styleElement)
    __obj.asInstanceOf[StrictStickyProps]
  }
}

