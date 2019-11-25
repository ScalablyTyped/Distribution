package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.MouseEvent
import typings.reactDashSimpleDashMaps.Anon_Default
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProps extends js.Object {
  var buildPath: js.UndefOr[js.Function3[/* start */ Point, /* end */ Point, /* line */ Line, String]] = js.undefined
  var line: js.UndefOr[Line] = js.undefined
  var onBlur: js.UndefOr[js.Function2[/* line */ Line, /* evt */ FocusEvent[SVGPathElement], Unit]] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* line */ Line, /* evt */ MouseEvent[SVGPathElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onFocus: js.UndefOr[js.Function2[/* line */ Line, /* evt */ FocusEvent[SVGPathElement], Unit]] = js.undefined
  var onMouseDown: js.UndefOr[
    js.Function2[/* line */ Line, /* evt */ MouseEvent[SVGPathElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function2[/* line */ Line, /* evt */ MouseEvent[SVGPathElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function2[/* line */ Line, /* evt */ MouseEvent[SVGPathElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function2[/* line */ Line, /* evt */ MouseEvent[SVGPathElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onMouseUp: js.UndefOr[
    js.Function2[/* line */ Line, /* evt */ MouseEvent[SVGPathElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var preserveMarkerAspect: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[Anon_Default] = js.undefined
  var tabable: js.UndefOr[Boolean] = js.undefined
}

object LineProps {
  @scala.inline
  def apply(
    buildPath: (/* start */ Point, /* end */ Point, /* line */ Line) => String = null,
    line: Line = null,
    onBlur: (/* line */ Line, /* evt */ FocusEvent[SVGPathElement]) => Unit = null,
    onClick: (/* line */ Line, /* evt */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit = null,
    onFocus: (/* line */ Line, /* evt */ FocusEvent[SVGPathElement]) => Unit = null,
    onMouseDown: (/* line */ Line, /* evt */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit = null,
    onMouseEnter: (/* line */ Line, /* evt */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit = null,
    onMouseLeave: (/* line */ Line, /* evt */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit = null,
    onMouseMove: (/* line */ Line, /* evt */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit = null,
    onMouseUp: (/* line */ Line, /* evt */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit = null,
    preserveMarkerAspect: js.UndefOr[Boolean] = js.undefined,
    style: Anon_Default = null,
    tabable: js.UndefOr[Boolean] = js.undefined
  ): LineProps = {
    val __obj = js.Dynamic.literal()
    if (buildPath != null) __obj.updateDynamic("buildPath")(js.Any.fromFunction3(buildPath))
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction2(onMouseUp))
    if (!js.isUndefined(preserveMarkerAspect)) __obj.updateDynamic("preserveMarkerAspect")(preserveMarkerAspect.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabable)) __obj.updateDynamic("tabable")(tabable.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProps]
  }
}

