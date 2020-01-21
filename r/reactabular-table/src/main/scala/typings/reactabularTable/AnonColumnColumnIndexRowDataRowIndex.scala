package typings.reactabularTable

import typings.reactabularTable.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnColumnIndexRowDataRowIndex extends js.Object {
  var column: Column
  var columnIndex: Double
  var rowData: js.Any
  var rowIndex: Double
}

object AnonColumnColumnIndexRowDataRowIndex {
  @scala.inline
  def apply(column: Column, columnIndex: Double, rowData: js.Any, rowIndex: Double): AnonColumnColumnIndexRowDataRowIndex = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnColumnIndexRowDataRowIndex]
  }
}

