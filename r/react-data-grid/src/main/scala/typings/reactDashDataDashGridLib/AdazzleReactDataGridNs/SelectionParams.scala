package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs

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
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any], rowIdx = rowIdx)
  
    __obj.asInstanceOf[SelectionParams[T]]
  }
}

