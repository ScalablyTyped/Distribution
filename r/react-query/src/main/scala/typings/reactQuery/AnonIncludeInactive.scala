package typings.reactQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeInactive extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var includeInactive: Boolean
}

object AnonIncludeInactive {
  @scala.inline
  def apply(includeInactive: Boolean, force: js.UndefOr[Boolean] = js.undefined): AnonIncludeInactive = {
    val __obj = js.Dynamic.literal(includeInactive = includeInactive.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeInactive]
  }
}

