package typings.reactDashTable.reactDashTableMod

import typings.reactDashTable.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accessor[D /* <: js.Object */] extends js.Object {
  var accessor: js.UndefOr[
    IdType[D] | (js.Function3[/* originalRow */ D, /* index */ Double, /* sub */ Anon_Data[D], CellValue])
  ] = js.undefined
  var id: js.UndefOr[IdType[D]] = js.undefined
}

object Accessor {
  @scala.inline
  def apply[D /* <: js.Object */](
    accessor: IdType[D] | (js.Function3[/* originalRow */ D, /* index */ Double, /* sub */ Anon_Data[D], CellValue]) = null,
    id: IdType[D] = null
  ): Accessor[D] = {
    val __obj = js.Dynamic.literal()
    if (accessor != null) __obj.updateDynamic("accessor")(accessor.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accessor[D]]
  }
}

