package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoronoiProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
   // default: ''
  var extent: js.Array[js.Array[Double]]
  var nodes: js.Array[VoronoiPoint]
  var onBlur: js.UndefOr[RVMouseEventHandler] = js.undefined
  var onClick: js.UndefOr[RVMouseEventHandler] = js.undefined
  var onHover: js.UndefOr[RVMouseEventHandler] = js.undefined
  var onMouseDown: js.UndefOr[RVMouseEventHandler] = js.undefined
  var onMouseUp: js.UndefOr[RVMouseEventHandler] = js.undefined
  var x: js.UndefOr[js.Function1[/* d */ js.Any, Double]] = js.undefined
  var y: js.UndefOr[js.Function1[/* d */ js.Any, Double]] = js.undefined
}

object VoronoiProps {
  @scala.inline
  def apply(
    extent: js.Array[js.Array[Double]],
    nodes: js.Array[VoronoiPoint],
    className: String = null,
    onBlur: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onHover: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseDown: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    x: /* d */ js.Any => Double = null,
    y: /* d */ js.Any => Double = null
  ): VoronoiProps = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (x != null) __obj.updateDynamic("x")(js.Any.fromFunction1(x))
    if (y != null) __obj.updateDynamic("y")(js.Any.fromFunction1(y))
    __obj.asInstanceOf[VoronoiProps]
  }
}

