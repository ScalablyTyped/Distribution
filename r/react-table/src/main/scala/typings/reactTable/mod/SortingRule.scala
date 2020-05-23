package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortingRule[D] extends js.Object {
  var desc: js.UndefOr[Boolean] = js.undefined
  var id: IdType[D]
}

object SortingRule {
  @scala.inline
  def apply[D](id: IdType[D], desc: js.UndefOr[Boolean] = js.undefined): SortingRule[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortingRule[D]]
  }
}

