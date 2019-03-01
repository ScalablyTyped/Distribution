package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationOptions extends js.Object {
  var persistQuery: js.UndefOr[scala.Boolean] = js.undefined
  var updateRoutes: js.UndefOr[scala.Boolean] = js.undefined
}

object LocationOptions {
  @scala.inline
  def apply(
    persistQuery: js.UndefOr[scala.Boolean] = js.undefined,
    updateRoutes: js.UndefOr[scala.Boolean] = js.undefined
  ): LocationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(persistQuery)) __obj.updateDynamic("persistQuery")(persistQuery)
    if (!js.isUndefined(updateRoutes)) __obj.updateDynamic("updateRoutes")(updateRoutes)
    __obj.asInstanceOf[LocationOptions]
  }
}

