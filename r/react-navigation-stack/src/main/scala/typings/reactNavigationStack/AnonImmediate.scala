package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImmediate extends js.Object {
  var immediate: js.UndefOr[Boolean] = js.undefined
}

object AnonImmediate {
  @scala.inline
  def apply(immediate: js.UndefOr[Boolean] = js.undefined): AnonImmediate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImmediate]
  }
}

