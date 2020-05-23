package typings.reactTable.anon

import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdIdType[D /* <: js.Object */] extends js.Object {
  var id: IdType[D]
}

object IdIdType {
  @scala.inline
  def apply[D](id: IdType[D]): IdIdType[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdIdType[D]]
  }
}

