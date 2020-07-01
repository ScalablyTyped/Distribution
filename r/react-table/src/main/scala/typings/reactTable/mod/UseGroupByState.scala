package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseGroupByState[D /* <: js.Object */] extends js.Object {
  var groupBy: js.Array[IdType[D]]
}

object UseGroupByState {
  @scala.inline
  def apply[/* <: js.Object */ D](groupBy: js.Array[IdType[D]]): UseGroupByState[D] = {
    val __obj = js.Dynamic.literal(groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByState[D]]
  }
}

