package typings.reactabularTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: typings.reactabularTable.mod.Column
  var columnIndex: Double
  var property: String
}

object Column {
  @scala.inline
  def apply(column: typings.reactabularTable.mod.Column, columnIndex: Double, property: String): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

