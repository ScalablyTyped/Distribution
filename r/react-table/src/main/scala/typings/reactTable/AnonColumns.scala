package typings.reactTable

import typings.reactTable.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumns[D /* <: js.Object */] extends js.Object {
  var columns: js.Array[Column[D]]
  var data: js.Array[D]
}

object AnonColumns {
  @scala.inline
  def apply[D /* <: js.Object */](columns: js.Array[Column[D]], data: js.Array[D]): AnonColumns[D] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumns[D]]
  }
}

