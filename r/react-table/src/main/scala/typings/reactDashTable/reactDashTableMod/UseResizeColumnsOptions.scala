package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseResizeColumnsOptions[D /* <: js.Object */] extends js.Object {
  var disableResizing: js.UndefOr[Boolean] = js.undefined
}

object UseResizeColumnsOptions {
  @scala.inline
  def apply[D /* <: js.Object */](disableResizing: js.UndefOr[Boolean] = js.undefined): UseResizeColumnsOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableResizing)) __obj.updateDynamic("disableResizing")(disableResizing.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseResizeColumnsOptions[D]]
  }
}

