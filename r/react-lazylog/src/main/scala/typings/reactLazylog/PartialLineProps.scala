package typings.reactLazylog

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-lazylog.react-lazylog/build/Line.LineProps> */
trait PartialLineProps extends js.Object {
  var data: js.UndefOr[js.Array[AnonText]] = js.undefined
  var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var onLineNumberClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onRowClick: js.UndefOr[js.Function0[_]] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialLineProps {
  @scala.inline
  def apply(
    data: js.Array[AnonText] = null,
    formatPart: /* text */ String => ReactNode = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    number: Int | Double = null,
    onLineNumberClick: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    onRowClick: () => _ = null,
    rowHeight: Int | Double = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): PartialLineProps = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1(formatPart))
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (onLineNumberClick != null) __obj.updateDynamic("onLineNumberClick")(js.Any.fromFunction1(onLineNumberClick))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction0(onRowClick))
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLineProps]
  }
}

