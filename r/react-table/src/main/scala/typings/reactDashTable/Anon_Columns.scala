package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns[D /* <: js.Object */] extends js.Object {
  var columns: js.Array[Column[D]]
  var data: js.Array[D]
}

object Anon_Columns {
  @scala.inline
  def apply[D /* <: js.Object */](columns: js.Array[Column[D]], data: js.Array[D]): Anon_Columns[D] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Columns[D]]
  }
}

