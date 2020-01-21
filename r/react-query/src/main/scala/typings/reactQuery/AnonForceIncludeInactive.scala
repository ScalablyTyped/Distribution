package typings.reactQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceIncludeInactive extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var includeInactive: Boolean
}

object AnonForceIncludeInactive {
  @scala.inline
  def apply(includeInactive: Boolean, force: js.UndefOr[Boolean] = js.undefined): AnonForceIncludeInactive = {
    val __obj = js.Dynamic.literal(includeInactive = includeInactive.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForceIncludeInactive]
  }
}

