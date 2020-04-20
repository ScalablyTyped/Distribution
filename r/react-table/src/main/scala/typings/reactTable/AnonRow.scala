package typings.reactTable

import typings.reactTable.mod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRow[D /* <: js.Object */] extends js.Object {
  var row: Row[D]
}

object AnonRow {
  @scala.inline
  def apply[D /* <: js.Object */](row: Row[D]): AnonRow[D] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRow[D]]
  }
}

