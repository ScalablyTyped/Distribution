package typings.reactTable

import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[D /* <: js.Object */] extends js.Object {
  var accessor: IdType[D]
}

object Anon0 {
  @scala.inline
  def apply[D /* <: js.Object */](accessor: IdType[D]): Anon0[D] = {
    val __obj = js.Dynamic.literal(accessor = accessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0[D]]
  }
}

