package typings.reactNavigationStack

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClosingRouteKeys extends js.Object {
  var closingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined
  var descriptors: StackDescriptorMap
  var openingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined
  var previousDescriptors: StackDescriptorMap
  var previousRoutes: js.Array[NavigationRoute[NavigationParams]]
  var replacingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined
  var routes: js.Array[NavigationRoute[NavigationParams]]
}

object AnonClosingRouteKeys {
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    previousDescriptors: StackDescriptorMap,
    previousRoutes: js.Array[NavigationRoute[NavigationParams]],
    routes: js.Array[NavigationRoute[NavigationParams]],
    closingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined,
    openingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined,
    replacingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonClosingRouteKeys = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any], previousRoutes = previousRoutes.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    if (!js.isUndefined(closingRouteKeys)) __obj.updateDynamic("closingRouteKeys")(closingRouteKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(openingRouteKeys)) __obj.updateDynamic("openingRouteKeys")(openingRouteKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(replacingRouteKeys)) __obj.updateDynamic("replacingRouteKeys")(replacingRouteKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClosingRouteKeys]
  }
}

