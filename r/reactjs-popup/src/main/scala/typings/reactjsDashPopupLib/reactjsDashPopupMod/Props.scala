package typings
package reactjsDashPopupLib.reactjsDashPopupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var arrow: js.UndefOr[scala.Boolean] = js.undefined
  var arrowStyle: js.UndefOr[js.Object] = js.undefined
  var children: reactLib.reactMod.Global.JSXNs.Element | (js.Function2[
    /* close */ js.Function0[scala.Unit], 
    /* isOpen */ scala.Boolean, 
    reactLib.reactMod.Global.JSXNs.Element
  ])
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closeOnDocumentClick: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined
  var contentStyle: js.UndefOr[js.Object] = js.undefined
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var keepTooltipInside: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var lockScroll: js.UndefOr[scala.Boolean] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var mouseEnterDelay: js.UndefOr[scala.Double] = js.undefined
  var mouseLeaveDelay: js.UndefOr[scala.Double] = js.undefined
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  var on: js.UndefOr[EventType | js.Array[EventType]] = js.undefined
  var onClose: js.UndefOr[js.Function0[_]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[_]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var overlayStyle: js.UndefOr[js.Object] = js.undefined
  var position: js.UndefOr[Position | js.Array[Position]] = js.undefined
  var repositionOnResize: js.UndefOr[scala.Boolean] = js.undefined
  var trigger: js.UndefOr[
    reactLib.reactMod.Global.JSXNs.Element | (js.Function1[/* isOpen */ scala.Boolean, reactLib.reactMod.Global.JSXNs.Element])
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Global.JSXNs.Element | (js.Function2[
      /* close */ js.Function0[scala.Unit], 
      /* isOpen */ scala.Boolean, 
      reactLib.reactMod.Global.JSXNs.Element
    ]),
    arrow: js.UndefOr[scala.Boolean] = js.undefined,
    arrowStyle: js.Object = null,
    className: java.lang.String = null,
    closeOnDocumentClick: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined,
    contentStyle: js.Object = null,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    keepTooltipInside: scala.Boolean | java.lang.String = null,
    lockScroll: js.UndefOr[scala.Boolean] = js.undefined,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    mouseEnterDelay: scala.Int | scala.Double = null,
    mouseLeaveDelay: scala.Int | scala.Double = null,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null,
    on: EventType | js.Array[EventType] = null,
    onClose: () => _ = null,
    onOpen: () => _ = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    overlayStyle: js.Object = null,
    position: Position | js.Array[Position] = null,
    repositionOnResize: js.UndefOr[scala.Boolean] = js.undefined,
    trigger: reactLib.reactMod.Global.JSXNs.Element | (js.Function1[/* isOpen */ scala.Boolean, reactLib.reactMod.Global.JSXNs.Element]) = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(arrow)) __obj.updateDynamic("arrow")(arrow)
    if (arrowStyle != null) __obj.updateDynamic("arrowStyle")(arrowStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeOnDocumentClick)) __obj.updateDynamic("closeOnDocumentClick")(closeOnDocumentClick)
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (keepTooltipInside != null) __obj.updateDynamic("keepTooltipInside")(keepTooltipInside.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScroll)) __obj.updateDynamic("lockScroll")(lockScroll)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(repositionOnResize)) __obj.updateDynamic("repositionOnResize")(repositionOnResize)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

