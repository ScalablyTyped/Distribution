package typings.reactTable.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseExpandedState[D /* <: js.Object */] extends js.Object {
  var expanded: Record[IdType[D], Boolean]
}

object UseExpandedState {
  @scala.inline
  def apply[D /* <: js.Object */](expanded: Record[IdType[D], Boolean]): UseExpandedState[D] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseExpandedState[D]]
  }
}

