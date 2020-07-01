package typings.reactTable.anon

import typings.reactTable.mod.HeaderGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column[D /* <: js.Object */] extends js.Object {
  var column: HeaderGroup[D]
}

object Column {
  @scala.inline
  def apply[/* <: js.Object */ D](column: HeaderGroup[D]): Column[D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[D]]
  }
}

