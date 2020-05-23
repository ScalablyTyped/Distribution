package typings.rcTable.footerCellMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryCellProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var index: Double
  var rowSpan: js.UndefOr[Double] = js.undefined
}

object SummaryCellProps {
  @scala.inline
  def apply(
    index: Double,
    children: ReactNode = null,
    className: String = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    rowSpan: js.UndefOr[Double] = js.undefined
  ): SummaryCellProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryCellProps]
  }
}

