package typings.reactabularTable

import typings.reactabularTable.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowData extends js.Object {
  var column: Column
  var columnIndex: Double
  var rowData: js.Any
}

object AnonRowData {
  @scala.inline
  def apply(column: Column, columnIndex: Double, rowData: js.Any): AnonRowData = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRowData]
  }
}

