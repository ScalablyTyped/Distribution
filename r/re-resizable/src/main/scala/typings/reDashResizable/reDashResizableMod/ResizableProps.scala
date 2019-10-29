package typings.reDashResizable.reDashResizableMod

import typings.reDashResizable.Anon_Bottom
import typings.reDashResizable.Anon_BottomBottomLeft
import typings.reDashResizable.Anon_BottomBottomLeftBottomRight
import typings.reDashResizable.Anon_HeightWidth
import typings.reDashResizable.reDashResizableStrings.parent
import typings.reDashResizable.reDashResizableStrings.window
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableProps extends HTMLAttributes[HTMLDivElement] {
  var bounds: js.UndefOr[parent | window | HTMLElement] = js.undefined
  var defaultSize: js.UndefOr[Anon_HeightWidth] = js.undefined
  var enable: js.UndefOr[Anon_BottomBottomLeftBottomRight] = js.undefined
  var grid: js.UndefOr[js.Array[Double]] = js.undefined
  var handleClasses: js.UndefOr[Anon_BottomBottomLeft] = js.undefined
  var handleComponent: js.UndefOr[HandleComponent] = js.undefined
  var handleStyles: js.UndefOr[Anon_Bottom] = js.undefined
  var handleWrapperClass: js.UndefOr[String] = js.undefined
  var handleWrapperStyle: js.UndefOr[CSSProperties] = js.undefined
  var lockAspectRatio: js.UndefOr[Boolean | Double] = js.undefined
  var lockAspectRatioExtraHeight: js.UndefOr[Double] = js.undefined
  var lockAspectRatioExtraWidth: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  var minHeight: js.UndefOr[Double | String] = js.undefined
  var minWidth: js.UndefOr[Double | String] = js.undefined
  var onResize: js.UndefOr[ResizeCallback] = js.undefined
  var onResizeStart: js.UndefOr[ResizeStartCallback] = js.undefined
  var onResizeStop: js.UndefOr[ResizeCallback] = js.undefined
  var size: js.UndefOr[Anon_HeightWidth] = js.undefined
}

object ResizableProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    bounds: parent | window | HTMLElement = null,
    className: String = null,
    defaultSize: Anon_HeightWidth = null,
    enable: Anon_BottomBottomLeftBottomRight = null,
    grid: js.Array[Double] = null,
    handleClasses: Anon_BottomBottomLeft = null,
    handleComponent: HandleComponent = null,
    handleStyles: Anon_Bottom = null,
    handleWrapperClass: String = null,
    handleWrapperStyle: CSSProperties = null,
    lockAspectRatio: Boolean | Double = null,
    lockAspectRatioExtraHeight: Int | Double = null,
    lockAspectRatioExtraWidth: Int | Double = null,
    maxHeight: Double | String = null,
    maxWidth: Double | String = null,
    minHeight: Double | String = null,
    minWidth: Double | String = null,
    onResize: (/* event */ MouseEvent | TouchEvent, /* direction */ ResizableDirection, /* elementRef */ HTMLDivElement, /* delta */ NumberSize) => Unit = null,
    onResizeStart: (/* e */ (typings.react.reactMod.MouseEvent[HTMLDivElement, NativeMouseEvent]) | typings.react.reactMod.TouchEvent[HTMLDivElement], /* dir */ ResizableDirection, /* elementRef */ HTMLDivElement, /* delta */ NumberSize) => Unit = null,
    onResizeStop: (/* event */ MouseEvent | TouchEvent, /* direction */ ResizableDirection, /* elementRef */ HTMLDivElement, /* delta */ NumberSize) => Unit = null,
    size: Anon_HeightWidth = null,
    style: CSSProperties = null
  ): ResizableProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultSize != null) __obj.updateDynamic("defaultSize")(defaultSize)
    if (enable != null) __obj.updateDynamic("enable")(enable)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (handleClasses != null) __obj.updateDynamic("handleClasses")(handleClasses)
    if (handleComponent != null) __obj.updateDynamic("handleComponent")(handleComponent)
    if (handleStyles != null) __obj.updateDynamic("handleStyles")(handleStyles)
    if (handleWrapperClass != null) __obj.updateDynamic("handleWrapperClass")(handleWrapperClass)
    if (handleWrapperStyle != null) __obj.updateDynamic("handleWrapperStyle")(handleWrapperStyle)
    if (lockAspectRatio != null) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio.asInstanceOf[js.Any])
    if (lockAspectRatioExtraHeight != null) __obj.updateDynamic("lockAspectRatioExtraHeight")(lockAspectRatioExtraHeight.asInstanceOf[js.Any])
    if (lockAspectRatioExtraWidth != null) __obj.updateDynamic("lockAspectRatioExtraWidth")(lockAspectRatioExtraWidth.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction4(onResize))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction4(onResizeStart))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction4(onResizeStop))
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ResizableProps]
  }
}

