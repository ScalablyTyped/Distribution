package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-table.react-table.RowInfo<D> ]:? react-table.react-table.RowInfo<D>[P]} */ trait RowRenderProps[D] extends js.Object {
  /** Whenever the current row is expanded */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /** The current cell value */
  var value: js.UndefOr[D] = js.undefined
}

object RowRenderProps {
  @scala.inline
  def apply[D](isExpanded: js.UndefOr[scala.Boolean] = js.undefined, value: D = null): RowRenderProps[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowRenderProps[D]]
  }
}

