package typings.reactabularTable

import typings.reactabularTable.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnIndex extends js.Object {
  var column: Column
  var columnIndex: Double
  var property: String
  var rowData: js.Any
  var rowIndex: Double
}

object AnonColumnIndex {
  @scala.inline
  def apply(column: Column, columnIndex: Double, property: String, rowData: js.Any, rowIndex: Double): AnonColumnIndex = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnIndex]
  }
}

