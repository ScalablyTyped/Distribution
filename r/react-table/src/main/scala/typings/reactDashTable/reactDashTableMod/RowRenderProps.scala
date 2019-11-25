package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-table.react-table.RowInfo ]:? react-table.react-table.RowInfo[P]} */ trait RowRenderProps extends js.Object {
  /** Whenever the current row is expanded */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /** The current cell value */
  var value: js.UndefOr[js.Any] = js.undefined
}

object RowRenderProps {
  @scala.inline
  def apply(isExpanded: js.UndefOr[Boolean] = js.undefined, value: js.Any = null): RowRenderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowRenderProps]
  }
}

