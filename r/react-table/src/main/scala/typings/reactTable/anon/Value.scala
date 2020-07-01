package typings.reactTable.anon

import typings.reactTable.mod.FilterValue
import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value[D /* <: js.Object */] extends js.Object {
  var id: IdType[D]
  var value: FilterValue
}

object Value {
  @scala.inline
  def apply[/* <: js.Object */ D](id: IdType[D], value: FilterValue): Value[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[D]]
  }
}

