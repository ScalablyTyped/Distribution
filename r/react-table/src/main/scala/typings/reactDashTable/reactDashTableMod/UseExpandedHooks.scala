package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseExpandedHooks[D /* <: js.Object */] extends js.Object {
  var getExpandedToggleProps: js.Array[js.Function2[/* row */ Row[D], /* instance */ TableInstance[D], js.Object]]
}

object UseExpandedHooks {
  @scala.inline
  def apply[D /* <: js.Object */](
    getExpandedToggleProps: js.Array[js.Function2[/* row */ Row[D], /* instance */ TableInstance[D], js.Object]]
  ): UseExpandedHooks[D] = {
    val __obj = js.Dynamic.literal(getExpandedToggleProps = getExpandedToggleProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseExpandedHooks[D]]
  }
}

