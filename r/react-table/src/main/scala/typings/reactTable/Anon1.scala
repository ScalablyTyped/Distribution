package typings.reactTable

import typings.reactTable.mod.Accessor
import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1[D /* <: js.Object */] extends js.Object {
  var accessor: js.UndefOr[Accessor[D] | IdType[D]] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply[D /* <: js.Object */](accessor: Accessor[D] | IdType[D] = null): Anon1[D] = {
    val __obj = js.Dynamic.literal()
    if (accessor != null) __obj.updateDynamic("accessor")(accessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1[D]]
  }
}

