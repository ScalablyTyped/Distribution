package typings.reactScrollbar

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
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
  var onScroll: js.UndefOr[js.Function1[/* value */ AnonContainerHeight, Unit]] = js.undefined
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
    onScroll: /* value */ AnonContainerHeight => Unit = null,
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
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contentWindow != null) __obj.updateDynamic("contentWindow")(contentWindow.asInstanceOf[js.Any])
    if (focusableTabIndex != null) __obj.updateDynamic("focusableTabIndex")(focusableTabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (horizontalContainerStyle != null) __obj.updateDynamic("horizontalContainerStyle")(horizontalContainerStyle.asInstanceOf[js.Any])
    if (horizontalScrollbarStyle != null) __obj.updateDynamic("horizontalScrollbarStyle")(horizontalScrollbarStyle.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (minScrollSize != null) __obj.updateDynamic("minScrollSize")(minScrollSize.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (ownerDocument != null) __obj.updateDynamic("ownerDocument")(ownerDocument.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothScrolling)) __obj.updateDynamic("smoothScrolling")(smoothScrolling.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(stopScrollPropagation)) __obj.updateDynamic("stopScrollPropagation")(stopScrollPropagation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swapWheelAxes)) __obj.updateDynamic("swapWheelAxes")(swapWheelAxes.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (verticalContainerStyle != null) __obj.updateDynamic("verticalContainerStyle")(verticalContainerStyle.asInstanceOf[js.Any])
    if (verticalScrollbarStyle != null) __obj.updateDynamic("verticalScrollbarStyle")(verticalScrollbarStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollAreaProps]
  }
}

