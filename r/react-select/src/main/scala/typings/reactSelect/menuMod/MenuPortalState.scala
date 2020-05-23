package typings.reactSelect.menuMod

import typings.reactSelect.reactSelectStrings.bottom
import typings.reactSelect.reactSelectStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuPortalState extends js.Object {
  var placement: bottom | top | Null
}

object MenuPortalState {
  @scala.inline
  def apply(placement: bottom | top = null): MenuPortalState = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPortalState]
  }
}

