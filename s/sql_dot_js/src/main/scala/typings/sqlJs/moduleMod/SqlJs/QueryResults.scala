package typings.sqlJs.moduleMod.SqlJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResults extends js.Object {
  var columns: js.Array[String]
  var values: js.Array[js.Array[ValueType]]
}

object QueryResults {
  @scala.inline
  def apply(columns: js.Array[String], values: js.Array[js.Array[ValueType]]): QueryResults = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResults]
  }
}

