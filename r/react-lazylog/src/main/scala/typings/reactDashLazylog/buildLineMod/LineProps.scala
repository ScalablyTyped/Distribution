package typings.reactDashLazylog.buildLineMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.reactDashLazylog.Anon_Text
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProps extends js.Object {
  var data: js.Array[Anon_Text]
  var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var number: Double
  var onLineNumberClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  /**
    * This is never called
    * https://github.com/mozilla-frontend-infra/react-lazylog/issues/18
    */
  var onRowClick: js.UndefOr[js.Function0[_]] = js.undefined
  var rowHeight: Double
  var selectable: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LineProps {
  @scala.inline
  def apply(
    data: js.Array[Anon_Text],
    number: Double,
    rowHeight: Double,
    formatPart: /* text */ String => ReactNode = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    onLineNumberClick: MouseEventHandler[HTMLAnchorElement] = null,
    onRowClick: () => _ = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): LineProps = {
    val __obj = js.Dynamic.literal(data = data, number = number, rowHeight = rowHeight)
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1(formatPart))
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (onLineNumberClick != null) __obj.updateDynamic("onLineNumberClick")(onLineNumberClick)
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction0(onRowClick))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LineProps]
  }
}

