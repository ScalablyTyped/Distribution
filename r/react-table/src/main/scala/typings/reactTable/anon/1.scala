package typings.reactTable.anon

import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1`[D /* <: js.Object */] extends js.Object {
  var accessor: js.UndefOr[typings.reactTable.mod.Accessor[D] | IdType[D]] = js.undefined
}

object `1` {
  @scala.inline
  def apply[/* <: js.Object */ D](accessor: typings.reactTable.mod.Accessor[D] | IdType[D] = null): `1`[D] = {
    val __obj = js.Dynamic.literal()
    if (accessor != null) __obj.updateDynamic("accessor")(accessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[D]]
  }
}

