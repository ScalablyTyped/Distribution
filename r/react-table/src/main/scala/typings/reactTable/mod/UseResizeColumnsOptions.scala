package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseResizeColumnsOptions[D /* <: js.Object */] extends js.Object {
  var disableResizing: js.UndefOr[Boolean] = js.undefined
}

object UseResizeColumnsOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](disableResizing: js.UndefOr[Boolean] = js.undefined): UseResizeColumnsOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableResizing)) __obj.updateDynamic("disableResizing")(disableResizing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseResizeColumnsOptions[D]]
  }
}

