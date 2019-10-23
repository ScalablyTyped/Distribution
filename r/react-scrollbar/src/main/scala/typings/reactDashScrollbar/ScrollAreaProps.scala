package typings.reactDashScrollbar

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollAreaProps extends Props[ScrollArea] {
  var className: js.UndefOr[String] = js.undefined
  var contentClassName: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  var contentWindow: js.UndefOr[js.Any] = js.undefined
  var focusableTabIndex: js.UndefOr[Double] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var horizontalContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  var horizontalScrollbarStyle: js.UndefOr[CSSProperties] = js.undefined
  var minScrollSize: js.UndefOr[Double] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* value */ Anon_ContainerHeight, Unit]] = js.undefined
  var ownerDocument: js.UndefOr[js.Any] = js.undefined
  var smoothScrolling: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var stopScrollPropagation: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var swapWheelAxes: js.UndefOr[Boolean] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
  var verticalContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  var verticalScrollbarStyle: js.UndefOr[CSSProperties] = js.undefined
}

object ScrollAreaProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    contentClassName: String = null,
    contentStyle: CSSProperties = null,
    contentWindow: js.Any = null,
    focusableTabIndex: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    horizontalContainerStyle: CSSProperties = null,
    horizontalScrollbarStyle: CSSProperties = null,
    key: Key = null,
    minScrollSize: Int | Double = null,
    onScroll: /* value */ Anon_ContainerHeight => Unit = null,
    ownerDocument: js.Any = null,
    ref: LegacyRef[ScrollArea] = null,
    smoothScrolling: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    stopScrollPropagation: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    swapWheelAxes: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    verticalContainerStyle: CSSProperties = null,
    verticalScrollbarStyle: CSSProperties = null
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

