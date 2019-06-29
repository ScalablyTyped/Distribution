package typings
package reactDashSelectLib.srcComponentsMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuPortalState extends js.Object {
  var placement: reactDashSelectLib.reactDashSelectLibStrings.bottom | reactDashSelectLib.reactDashSelectLibStrings.top | scala.Null
}

object MenuPortalState {
  @scala.inline
  def apply(
    placement: reactDashSelectLib.reactDashSelectLibStrings.bottom | reactDashSelectLib.reactDashSelectLibStrings.top = null
  ): MenuPortalState = {
    val __obj = js.Dynamic.literal()
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPortalState]
  }
}

