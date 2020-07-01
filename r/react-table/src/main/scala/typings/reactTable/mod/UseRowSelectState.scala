package typings.reactTable.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseRowSelectState[D /* <: js.Object */] extends js.Object {
  var selectedRowIds: Record[IdType[D], Boolean]
}

object UseRowSelectState {
  @scala.inline
  def apply[/* <: js.Object */ D](selectedRowIds: Record[IdType[D], Boolean]): UseRowSelectState[D] = {
    val __obj = js.Dynamic.literal(selectedRowIds = selectedRowIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowSelectState[D]]
  }
}

