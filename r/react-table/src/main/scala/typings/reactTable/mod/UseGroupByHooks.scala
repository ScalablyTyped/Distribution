package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseGroupByHooks[D /* <: js.Object */] extends js.Object {
  var getGroupByToggleProps: js.Array[
    js.Function2[/* header */ HeaderGroup[D], /* instance */ TableInstance[D], js.Object]
  ]
}

object UseGroupByHooks {
  @scala.inline
  def apply[D /* <: js.Object */](
    getGroupByToggleProps: js.Array[
      js.Function2[/* header */ HeaderGroup[D], /* instance */ TableInstance[D], js.Object]
    ]
  ): UseGroupByHooks[D] = {
    val __obj = js.Dynamic.literal(getGroupByToggleProps = getGroupByToggleProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseGroupByHooks[D]]
  }
}

