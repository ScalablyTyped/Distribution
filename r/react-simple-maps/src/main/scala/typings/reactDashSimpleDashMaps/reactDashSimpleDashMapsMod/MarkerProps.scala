package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.MouseEvent
import typings.reactDashSimpleDashMaps.Anon_Default
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerProps extends js.Object {
  var marker: js.UndefOr[MarkerType] = js.undefined
  var onBlur: js.UndefOr[js.Function2[/* marker */ MarkerType, /* evt */ FocusEvent[SVGGElement], Unit]] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* marker */ MarkerType, /* evt */ MouseEvent[SVGGElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onFocus: js.UndefOr[js.Function2[/* marker */ MarkerType, /* evt */ FocusEvent[SVGGElement], Unit]] = js.undefined
  var onMouseDown: js.UndefOr[
    js.Function2[/* marker */ MarkerType, /* evt */ MouseEvent[SVGGElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function2[/* marker */ MarkerType, /* evt */ MouseEvent[SVGGElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function2[/* marker */ MarkerType, /* evt */ MouseEvent[SVGGElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function2[/* marker */ MarkerType, /* evt */ MouseEvent[SVGGElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onMouseUp: js.UndefOr[
    js.Function2[/* marker */ MarkerType, /* evt */ MouseEvent[SVGGElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var preserveMarkerAspect: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[Anon_Default] = js.undefined
  var tabable: js.UndefOr[Boolean] = js.undefined
}

object MarkerProps {
  @scala.inline
  def apply(
    marker: MarkerType = null,
    onBlur: (/* marker */ MarkerType, /* evt */ FocusEvent[SVGGElement]) => Unit = null,
    onClick: (/* marker */ MarkerType, /* evt */ MouseEvent[SVGGElement, NativeMouseEvent]) => Unit = null,
    onFocus: (/* marker */ MarkerType, /* evt */ FocusEvent[SVGGElement]) => Unit = null,
    onMouseDown: (/* marker */ MarkerType, /* evt */ MouseEvent[SVGGElement, NativeMouseEvent]) => Unit = null,
    onMouseEnter: (/* marker */ MarkerType, /* evt */ MouseEvent[SVGGElement, NativeMouseEvent]) => Unit = null,
    onMouseLeave: (/* marker */ MarkerType, /* evt */ MouseEvent[SVGGElement, NativeMouseEvent]) => Unit = null,
    onMouseMove: (/* marker */ MarkerType, /* evt */ MouseEvent[SVGGElement, NativeMouseEvent]) => Unit = null,
    onMouseUp: (/* marker */ MarkerType, /* evt */ MouseEvent[SVGGElement, NativeMouseEvent]) => Unit = null,
    preserveMarkerAspect: js.UndefOr[Boolean] = js.undefined,
    style: Anon_Default = null,
    tabable: js.UndefOr[Boolean] = js.undefined
  ): MarkerProps = {
    val __obj = js.Dynamic.literal()
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction2(onMouseUp))
    if (!js.isUndefined(preserveMarkerAspect)) __obj.updateDynamic("preserveMarkerAspect")(preserveMarkerAspect)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(tabable)) __obj.updateDynamic("tabable")(tabable)
    __obj.asInstanceOf[MarkerProps]
  }
}

