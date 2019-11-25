package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationOptions extends js.Object {
  var persistQuery: js.UndefOr[Boolean] = js.undefined
  var updateRoutes: js.UndefOr[Boolean] = js.undefined
}

object LocationOptions {
  @scala.inline
  def apply(persistQuery: js.UndefOr[Boolean] = js.undefined, updateRoutes: js.UndefOr[Boolean] = js.undefined): LocationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(persistQuery)) __obj.updateDynamic("persistQuery")(persistQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(updateRoutes)) __obj.updateDynamic("updateRoutes")(updateRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationOptions]
  }
}

