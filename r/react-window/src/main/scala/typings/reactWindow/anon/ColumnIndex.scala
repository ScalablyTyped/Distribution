package typings.reactWindow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnIndex extends js.Object {
  var columnIndex: Double
  var data: js.Any
  var rowIndex: Double
}

object ColumnIndex {
  @scala.inline
  def apply(columnIndex: Double, data: js.Any, rowIndex: Double): ColumnIndex = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnIndex]
  }
}

