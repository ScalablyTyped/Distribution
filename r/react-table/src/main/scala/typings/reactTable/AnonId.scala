package typings.reactTable

import typings.reactTable.mod.FilterValue
import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId[D /* <: js.Object */] extends js.Object {
  var id: IdType[D]
  var value: FilterValue
}

object AnonId {
  @scala.inline
  def apply[D /* <: js.Object */](id: IdType[D], value: FilterValue): AnonId[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId[D]]
  }
}

