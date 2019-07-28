package typings.reactDashDataDashGrid.AdazzleReactDataGridNs.ReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionParams[T] extends js.Object {
  var row: T
  var rowIdx: Double
}

object SelectionParams {
  @scala.inline
  def apply[T](row: T, rowIdx: Double): SelectionParams[T] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any], rowIdx = rowIdx)
  
    __obj.asInstanceOf[SelectionParams[T]]
  }
}

