package typings.reactDataGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowKey extends js.Object {
  var rowKey: String
  var values: js.Array[_]
}

object RowKey {
  @scala.inline
  def apply(rowKey: String, values: js.Array[_]): RowKey = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowKey]
  }
}

