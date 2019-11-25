package typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayUniqueOptions extends js.Object {
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
}

object ArrayUniqueOptions {
  @scala.inline
  def apply(ignoreUndefined: js.UndefOr[Boolean] = js.undefined): ArrayUniqueOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayUniqueOptions]
  }
}

