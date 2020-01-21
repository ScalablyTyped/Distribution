package typings.reactTable

import typings.reactTable.mod.HeaderGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn[D /* <: js.Object */] extends js.Object {
  var column: HeaderGroup[D]
}

object AnonColumn {
  @scala.inline
  def apply[D /* <: js.Object */](column: HeaderGroup[D]): AnonColumn[D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumn[D]]
  }
}

