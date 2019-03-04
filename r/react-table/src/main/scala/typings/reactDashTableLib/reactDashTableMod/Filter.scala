package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var id: java.lang.String
  var pivotId: js.UndefOr[java.lang.String] = js.undefined
  var value: js.Any
}

object Filter {
  @scala.inline
  def apply(id: java.lang.String, value: js.Any, pivotId: java.lang.String = null): Filter = {
    val __obj = js.Dynamic.literal(id = id, value = value)
    if (pivotId != null) __obj.updateDynamic("pivotId")(pivotId)
    __obj.asInstanceOf[Filter]
  }
}

