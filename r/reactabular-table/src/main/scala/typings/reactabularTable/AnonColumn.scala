package typings.reactabularTable

import typings.reactabularTable.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends js.Object {
  var column: Column
  var columnIndex: Double
  var property: String
}

object AnonColumn {
  @scala.inline
  def apply(column: Column, columnIndex: Double, property: String): AnonColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumn]
  }
}

