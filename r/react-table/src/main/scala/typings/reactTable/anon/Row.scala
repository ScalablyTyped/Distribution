package typings.reactTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Row[D /* <: js.Object */] extends js.Object {
  var row: typings.reactTable.mod.Row[D]
}

object Row {
  @scala.inline
  def apply[D](row: typings.reactTable.mod.Row[D]): Row[D] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row[D]]
  }
}

