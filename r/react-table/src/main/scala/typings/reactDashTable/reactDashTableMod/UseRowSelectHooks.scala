package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseRowSelectHooks[D /* <: js.Object */] extends js.Object {
  var getToggleAllRowsSelectedProps: js.Array[js.Function1[/* instance */ TableInstance[D], js.Object]]
  var getToggleRowSelectedProps: js.Array[js.Function2[/* row */ Row[D], /* instance */ TableInstance[D], js.Object]]
}

object UseRowSelectHooks {
  @scala.inline
  def apply[D /* <: js.Object */](
    getToggleAllRowsSelectedProps: js.Array[js.Function1[/* instance */ TableInstance[D], js.Object]],
    getToggleRowSelectedProps: js.Array[js.Function2[/* row */ Row[D], /* instance */ TableInstance[D], js.Object]]
  ): UseRowSelectHooks[D] = {
    val __obj = js.Dynamic.literal(getToggleAllRowsSelectedProps = getToggleAllRowsSelectedProps.asInstanceOf[js.Any], getToggleRowSelectedProps = getToggleRowSelectedProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseRowSelectHooks[D]]
  }
}

