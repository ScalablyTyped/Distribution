package typings
package reactDashScrollbarLib.reactDashScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollAreaProps
  extends reactLib.reactMod.ReactNs.Props[ScrollArea] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  var contentStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var contentWindow: js.UndefOr[js.Any] = js.undefined
  var focusableTabIndex: js.UndefOr[scala.Double] = js.undefined
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  var horizontalContainerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var horizontalScrollbarStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var minScrollSize: js.UndefOr[scala.Double] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* value */ reactDashScrollbarLib.Anon_ContainerHeight, scala.Unit]] = js.undefined
  var ownerDocument: js.UndefOr[js.Any] = js.undefined
  var smoothScrolling: js.UndefOr[scala.Boolean] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var stopScrollPropagation: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var swapWheelAxes: js.UndefOr[scala.Boolean] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
  var verticalContainerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var verticalScrollbarStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object ScrollAreaProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    contentClassName: java.lang.String = null,
    contentStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    contentWindow: js.Any = null,
    focusableTabIndex: scala.Int | scala.Double = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    horizontalContainerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    horizontalScrollbarStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    minScrollSize: scala.Int | scala.Double = null,
    onScroll: /* value */ reactDashScrollbarLib.Anon_ContainerHeight => scala.Unit = null,
    ownerDocument: js.Any = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[ScrollArea] = null,
    smoothScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    speed: scala.Int | scala.Double = null,
    stopScrollPropagation: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    swapWheelAxes: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined,
    verticalContainerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    verticalScrollbarStyle: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ScrollAreaProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (contentWindow != null) __obj.updateDynamic("contentWindow")(contentWindow)
    if (focusableTabIndex != null) __obj.updateDynamic("focusableTabIndex")(focusableTabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (horizontalContainerStyle != null) __obj.updateDynamic("horizontalContainerStyle")(horizontalContainerStyle)
    if (horizontalScrollbarStyle != null) __obj.updateDynamic("horizontalScrollbarStyle")(horizontalScrollbarStyle)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (minScrollSize != null) __obj.updateDynamic("minScrollSize")(minScrollSize.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (ownerDocument != null) __obj.updateDynamic("ownerDocument")(ownerDocument)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothScrolling)) __obj.updateDynamic("smoothScrolling")(smoothScrolling)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(stopScrollPropagation)) __obj.updateDynamic("stopScrollPropagation")(stopScrollPropagation)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(swapWheelAxes)) __obj.updateDynamic("swapWheelAxes")(swapWheelAxes)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (verticalContainerStyle != null) __obj.updateDynamic("verticalContainerStyle")(verticalContainerStyle)
    if (verticalScrollbarStyle != null) __obj.updateDynamic("verticalScrollbarStyle")(verticalScrollbarStyle)
    __obj.asInstanceOf[ScrollAreaProps]
  }
}

