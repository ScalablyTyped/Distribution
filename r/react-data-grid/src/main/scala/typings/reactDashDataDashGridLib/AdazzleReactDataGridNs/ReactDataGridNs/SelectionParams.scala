package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs.ReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionParams[T] extends js.Object {
  var row: T
  var rowIdx: scala.Double
}

object SelectionParams {
  @scala.inline
  def apply[T](row: T, rowIdx: scala.Double): SelectionParams[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.updateDynamic("rowIdx")(rowIdx)
    __obj.asInstanceOf[SelectionParams[T]]
  }
}

