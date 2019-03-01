package typings
package reactDashWindowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnIndex extends js.Object {
  var columnIndex: scala.Double
  var data: js.Any
  var rowIndex: scala.Double
}

object Anon_ColumnIndex {
  @scala.inline
  def apply(columnIndex: scala.Double, data: js.Any, rowIndex: scala.Double): Anon_ColumnIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnIndex")(columnIndex)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("rowIndex")(rowIndex)
    __obj.asInstanceOf[Anon_ColumnIndex]
  }
}

