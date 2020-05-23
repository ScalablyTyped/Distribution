package typings.reactNavigationStack.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosingRouteKeys extends js.Object {
  var closingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined
  var descriptors: StackDescriptorMap
  var openingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined
  var previousDescriptors: StackDescriptorMap
  var previousRoutes: js.Array[NavigationRoute[NavigationParams]]
  var replacingRouteKeys: js.UndefOr[scala.Nothing] = js.undefined
  var routes: js.Array[NavigationRoute[NavigationParams]]
}

object ClosingRouteKeys {
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    previousDescriptors: StackDescriptorMap,
    previousRoutes: js.Array[NavigationRoute[NavigationParams]],
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): ClosingRouteKeys = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any], previousRoutes = previousRoutes.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosingRouteKeys]
  }
}

