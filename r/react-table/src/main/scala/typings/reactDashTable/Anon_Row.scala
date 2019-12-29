package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Row[D /* <: js.Object */] extends js.Object {
  var row: Row[D]
}

object Anon_Row {
  @scala.inline
  def apply[D /* <: js.Object */](row: Row[D]): Anon_Row[D] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Row[D]]
  }
}

