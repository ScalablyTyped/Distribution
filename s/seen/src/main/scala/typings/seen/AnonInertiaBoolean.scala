package typings.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInertiaBoolean extends js.Object {
  var inertia: js.UndefOr[Boolean] = js.undefined
}

object AnonInertiaBoolean {
  @scala.inline
  def apply(inertia: js.UndefOr[Boolean] = js.undefined): AnonInertiaBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inertia)) __obj.updateDynamic("inertia")(inertia.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInertiaBoolean]
  }
}

