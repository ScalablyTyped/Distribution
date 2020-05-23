package typings.reactTable.anon

import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[D /* <: js.Object */] extends js.Object {
  var accessor: IdType[D]
}

object `0` {
  @scala.inline
  def apply[D](accessor: IdType[D]): `0`[D] = {
    val __obj = js.Dynamic.literal(accessor = accessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[D]]
  }
}

