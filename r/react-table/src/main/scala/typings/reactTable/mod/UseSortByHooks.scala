package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSortByHooks[D /* <: js.Object */] extends js.Object {
  var getSortByToggleProps: js.Array[js.Function2[/* column */ Column[D], /* instance */ TableInstance[D], js.Object]]
}

object UseSortByHooks {
  @scala.inline
  def apply[D /* <: js.Object */](
    getSortByToggleProps: js.Array[js.Function2[/* column */ Column[D], /* instance */ TableInstance[D], js.Object]]
  ): UseSortByHooks[D] = {
    val __obj = js.Dynamic.literal(getSortByToggleProps = getSortByToggleProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseSortByHooks[D]]
  }
}

