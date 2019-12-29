package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterType[D /* <: js.Object */] extends js.Object {
  var autoRemove: js.UndefOr[js.Function1[/* filterValue */ FilterValue, Boolean]] = js.native
  def apply(rows: js.Array[Row[D]], columnIds: js.Array[IdType[D]], filterValue: FilterValue): js.Array[Row[D]] = js.native
}

