package typings
package reactDashSelectLib.srcComponentsMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuState extends js.Object {
  var maxHeight: scala.Double
  var placement: reactDashSelectLib.reactDashSelectLibStrings.bottom | reactDashSelectLib.reactDashSelectLibStrings.top | scala.Null
}

object MenuState {
  @scala.inline
  def apply(
    maxHeight: scala.Double,
    placement: reactDashSelectLib.reactDashSelectLibStrings.bottom | reactDashSelectLib.reactDashSelectLibStrings.top = null
  ): MenuState = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuState]
  }
}

