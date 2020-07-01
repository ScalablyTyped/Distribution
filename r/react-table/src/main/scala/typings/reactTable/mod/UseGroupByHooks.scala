package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseGroupByHooks[D /* <: js.Object */] extends js.Object {
  var getGroupByToggleProps: js.Array[HeaderGroupPropGetter[D]]
}

object UseGroupByHooks {
  @scala.inline
  def apply[/* <: js.Object */ D](getGroupByToggleProps: js.Array[HeaderGroupPropGetter[D]]): UseGroupByHooks[D] = {
    val __obj = js.Dynamic.literal(getGroupByToggleProps = getGroupByToggleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByHooks[D]]
  }
}

