package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseResizeColumnsColumnOptions[D /* <: js.Object */] extends js.Object {
  var disableResizing: js.UndefOr[Boolean] = js.undefined
}

object UseResizeColumnsColumnOptions {
  @scala.inline
  def apply[D](disableResizing: js.UndefOr[Boolean] = js.undefined): UseResizeColumnsColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableResizing)) __obj.updateDynamic("disableResizing")(disableResizing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseResizeColumnsColumnOptions[D]]
  }
}

