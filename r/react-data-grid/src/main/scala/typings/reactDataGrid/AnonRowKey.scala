package typings.reactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowKey extends js.Object {
  var rowKey: String
  var values: js.Array[_]
}

object AnonRowKey {
  @scala.inline
  def apply(rowKey: String, values: js.Array[_]): AnonRowKey = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowKey]
  }
}

