package typings.reactNavigationStack

import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClosingRouteKeys extends js.Object {
  var closingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined
  var descriptors: StackDescriptorMap
  var openingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined
  var previousDescriptors: StackDescriptorMap
  var previousRoutes: js.UndefOr[scala.Nothing] = js.undefined
  var replacingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined
  var routes: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonClosingRouteKeys {
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    previousDescriptors: StackDescriptorMap,
    closingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined,
    openingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined,
    previousRoutes: js.UndefOr[scala.Nothing] = js.undefined,
    replacingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined,
    routes: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonClosingRouteKeys = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any])
    if (!js.isUndefined(closingRouteKeys)) __obj.updateDynamic("closingRouteKeys")(closingRouteKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(openingRouteKeys)) __obj.updateDynamic("openingRouteKeys")(openingRouteKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(previousRoutes)) __obj.updateDynamic("previousRoutes")(previousRoutes.asInstanceOf[js.Any])
    if (!js.isUndefined(replacingRouteKeys)) __obj.updateDynamic("replacingRouteKeys")(replacingRouteKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(routes)) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClosingRouteKeys]
  }
}

