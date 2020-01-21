package typings.reactTable

import typings.reactTable.mod.ColumnInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnColumnInstance[D /* <: js.Object */] extends js.Object {
  var column: ColumnInstance[D]
}

object AnonColumnColumnInstance {
  @scala.inline
  def apply[D /* <: js.Object */](column: ColumnInstance[D]): AnonColumnColumnInstance[D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnColumnInstance[D]]
  }
}

