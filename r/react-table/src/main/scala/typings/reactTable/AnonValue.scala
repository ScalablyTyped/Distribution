package typings.reactTable

import typings.reactTable.mod.FilterValue
import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue[D /* <: js.Object */] extends js.Object {
  var id: IdType[D]
  var value: FilterValue
}

object AnonValue {
  @scala.inline
  def apply[D /* <: js.Object */](id: IdType[D], value: FilterValue): AnonValue[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue[D]]
  }
}

