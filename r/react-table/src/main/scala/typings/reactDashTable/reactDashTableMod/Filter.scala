package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var id: String
  var pivotId: js.UndefOr[String] = js.undefined
  var value: js.Any
}

object Filter {
  @scala.inline
  def apply(id: String, value: js.Any, pivotId: String = null): Filter = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (pivotId != null) __obj.updateDynamic("pivotId")(pivotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

