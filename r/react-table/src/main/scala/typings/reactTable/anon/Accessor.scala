package typings.reactTable.anon

import typings.reactTable.mod.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accessor[D /* <: js.Object */] extends js.Object {
  var accessor: js.UndefOr[typings.reactTable.mod.Accessor[D]] = js.undefined
}

object Accessor {
  @scala.inline
  def apply[/* <: js.Object */ D](accessor: (D, /* index */ Double, /* sub */ Data[D]) => CellValue[js.Any] = null): Accessor[D] = {
    val __obj = js.Dynamic.literal()
    if (accessor != null) __obj.updateDynamic("accessor")(js.Any.fromFunction3(accessor))
    __obj.asInstanceOf[Accessor[D]]
  }
}

