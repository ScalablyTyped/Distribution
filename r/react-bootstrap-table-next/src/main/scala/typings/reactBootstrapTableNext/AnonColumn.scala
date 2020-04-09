package typings.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn[T] extends js.Object {
  var column: js.Any
  var row: T
  var searchText: String
  var value: js.Any
}

object AnonColumn {
  @scala.inline
  def apply[T](column: js.Any, row: T, searchText: String, value: js.Any): AnonColumn[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumn[T]]
  }
}

