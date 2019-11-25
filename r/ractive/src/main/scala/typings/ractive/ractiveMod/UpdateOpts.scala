package typings.ractive.ractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOpts extends js.Object {
  /** Whether or not to force Ractive to consider a value to be changed. */
  var force: js.UndefOr[Boolean] = js.undefined
}

object UpdateOpts {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined): UpdateOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOpts]
  }
}

