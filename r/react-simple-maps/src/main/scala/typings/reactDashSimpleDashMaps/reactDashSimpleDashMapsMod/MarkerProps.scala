package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import typings.react.reactMod.FocusEvent
import typings.reactDashSimpleDashMaps.Anon_Default
import typings.std.MouseEvent
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.SVGProps<std.SVGPathElement>, 'style'> ]: react.react.SVGProps<std.SVGPathElement>[P]} */ trait MarkerProps extends js.Object {
  var coordinates: js.UndefOr[Point] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[SVGPathElement], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[SVGPathElement], Unit]] = js.undefined
  var onMouseDown: js.UndefOr[
    js.Function1[/* event */ typings.react.reactMod.MouseEvent[SVGPathElement, MouseEvent], Unit]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function1[/* event */ typings.react.reactMod.MouseEvent[SVGPathElement, MouseEvent], Unit]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[/* event */ typings.react.reactMod.MouseEvent[SVGPathElement, MouseEvent], Unit]
  ] = js.undefined
  var onMouseUp: js.UndefOr[
    js.Function1[/* event */ typings.react.reactMod.MouseEvent[SVGPathElement, MouseEvent], Unit]
  ] = js.undefined
  var style: js.UndefOr[Anon_Default] = js.undefined
}

object MarkerProps {
  @scala.inline
  def apply(
    coordinates: Point = null,
    onBlur: /* event */ FocusEvent[SVGPathElement] => Unit = null,
    onFocus: /* event */ FocusEvent[SVGPathElement] => Unit = null,
    onMouseDown: /* event */ typings.react.reactMod.MouseEvent[SVGPathElement, MouseEvent] => Unit = null,
    onMouseEnter: /* event */ typings.react.reactMod.MouseEvent[SVGPathElement, MouseEvent] => Unit = null,
    onMouseLeave: /* event */ typings.react.reactMod.MouseEvent[SVGPathElement, MouseEvent] => Unit = null,
    onMouseUp: /* event */ typings.react.reactMod.MouseEvent[SVGPathElement, MouseEvent] => Unit = null,
    style: Anon_Default = null
  ): MarkerProps = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
}

