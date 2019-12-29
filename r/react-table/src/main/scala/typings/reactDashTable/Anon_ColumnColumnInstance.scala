package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.ColumnInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnColumnInstance[D /* <: js.Object */] extends js.Object {
  var column: ColumnInstance[D]
}

object Anon_ColumnColumnInstance {
  @scala.inline
  def apply[D /* <: js.Object */](column: ColumnInstance[D]): Anon_ColumnColumnInstance[D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnColumnInstance[D]]
  }
}

