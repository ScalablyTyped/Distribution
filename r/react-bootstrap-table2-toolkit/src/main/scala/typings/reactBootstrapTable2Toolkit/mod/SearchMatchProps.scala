package typings.reactBootstrapTable2Toolkit.mod

import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchMatchProps[T /* <: js.Object */] extends js.Object {
  var column: ColumnDescription[T, _]
  var row: T
  var searchText: String
  var value: String
}

object SearchMatchProps {
  @scala.inline
  def apply[/* <: js.Object */ T](column: ColumnDescription[T, _], row: T, searchText: String, value: String): SearchMatchProps[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchMatchProps[T]]
  }
}

