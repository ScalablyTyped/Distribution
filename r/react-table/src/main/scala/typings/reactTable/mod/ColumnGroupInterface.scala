package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupInterface[D /* <: js.Object */] extends js.Object {
  var columns: js.Array[Column[D]]
}

object ColumnGroupInterface {
  @scala.inline
  def apply[D /* <: js.Object */](columns: js.Array[Column[D]]): ColumnGroupInterface[D] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupInterface[D]]
  }
}

