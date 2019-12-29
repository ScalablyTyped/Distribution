package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.HeaderGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column[D /* <: js.Object */] extends js.Object {
  var column: HeaderGroup[D]
}

object Anon_Column {
  @scala.inline
  def apply[D /* <: js.Object */](column: HeaderGroup[D]): Anon_Column[D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Column[D]]
  }
}

