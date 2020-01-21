package typings.reactabularTable

import typings.reactabularTable.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnColumnIndex extends js.Object {
  var column: Column
  var columnIndex: Double
  var property: String
  var rowData: js.Any
  var rowIndex: Double
}

object AnonColumnColumnIndex {
  @scala.inline
  def apply(column: Column, columnIndex: Double, property: String, rowData: js.Any, rowIndex: Double): AnonColumnColumnIndex = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnColumnIndex]
  }
}

