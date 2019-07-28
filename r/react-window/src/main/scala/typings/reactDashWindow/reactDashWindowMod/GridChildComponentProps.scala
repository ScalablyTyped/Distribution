package typings.reactDashWindow.reactDashWindowMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridChildComponentProps extends js.Object {
  var columnIndex: Double
  var data: js.Any
  var isScrolling: js.UndefOr[Boolean] = js.undefined
  var rowIndex: Double
  var style: CSSProperties
}

object GridChildComponentProps {
  @scala.inline
  def apply(
    columnIndex: Double,
    data: js.Any,
    rowIndex: Double,
    style: CSSProperties,
    isScrolling: js.UndefOr[Boolean] = js.undefined
  ): GridChildComponentProps = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex, data = data, rowIndex = rowIndex, style = style)
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling)
    __obj.asInstanceOf[GridChildComponentProps]
  }
}

