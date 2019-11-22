package typings.reactabularDashTable

import typings.reactabularDashTable.reactabularDashTableMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnColumnIndex extends js.Object {
  var column: Column
  var columnIndex: Double
  var property: String
  var rowData: js.Any
  var rowIndex: Double
}

object Anon_ColumnColumnIndex {
  @scala.inline
  def apply(column: Column, columnIndex: Double, property: String, rowData: js.Any, rowIndex: Double): Anon_ColumnColumnIndex = {
    val __obj = js.Dynamic.literal(column = column, columnIndex = columnIndex, property = property, rowData = rowData, rowIndex = rowIndex)
  
    __obj.asInstanceOf[Anon_ColumnColumnIndex]
  }
}

