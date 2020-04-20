package typings.reactTable

import typings.reactTable.mod.Accessor
import typings.reactTable.mod.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessor[D /* <: js.Object */] extends js.Object {
  var accessor: js.UndefOr[Accessor[D]] = js.undefined
}

object AnonAccessor {
  @scala.inline
  def apply[D /* <: js.Object */](accessor: (D, /* index */ Double, /* sub */ AnonData[D]) => CellValue[js.Any] = null): AnonAccessor[D] = {
    val __obj = js.Dynamic.literal()
    if (accessor != null) __obj.updateDynamic("accessor")(js.Any.fromFunction3(accessor))
    __obj.asInstanceOf[AnonAccessor[D]]
  }
}

