package typings.reactDashSelect.srcComponentsMenuMod

import typings.reactDashSelect.reactDashSelectStrings.bottom
import typings.reactDashSelect.reactDashSelectStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuState extends js.Object {
  var maxHeight: Double
  var placement: bottom | top | Null
}

object MenuState {
  @scala.inline
  def apply(maxHeight: Double, placement: bottom | top = null): MenuState = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuState]
  }
}

