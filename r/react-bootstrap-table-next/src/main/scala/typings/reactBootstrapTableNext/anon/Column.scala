package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column[T] extends js.Object {
  var column: js.Any
  var row: T
  var searchText: String
  var value: js.Any
}

object Column {
  @scala.inline
  def apply[T](column: js.Any, row: T, searchText: String, value: js.Any): Column[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
}

