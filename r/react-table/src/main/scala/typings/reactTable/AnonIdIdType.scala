package typings.reactTable

import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdIdType[D /* <: js.Object */] extends js.Object {
  var id: IdType[D]
}

object AnonIdIdType {
  @scala.inline
  def apply[D /* <: js.Object */](id: IdType[D]): AnonIdIdType[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdIdType[D]]
  }
}

