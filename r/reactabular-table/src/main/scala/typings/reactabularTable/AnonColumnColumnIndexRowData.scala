package typings.reactabularTable

import typings.reactabularTable.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnColumnIndexRowData extends js.Object {
  var column: Column
  var columnIndex: Double
  var rowData: js.Any
}

object AnonColumnColumnIndexRowData {
  @scala.inline
  def apply(column: Column, columnIndex: Double, rowData: js.Any): AnonColumnColumnIndexRowData = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnColumnIndexRowData]
  }
}

