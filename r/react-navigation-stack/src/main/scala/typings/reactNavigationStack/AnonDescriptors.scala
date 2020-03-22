package typings.reactNavigationStack

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptors extends js.Object {
  var closingRouteKeys: js.Array[String]
  var descriptors: StackDescriptorMap
  var openingRouteKeys: js.Array[String]
  var previousDescriptors: StackDescriptorMap
  var previousRoutes: js.Array[NavigationRoute[NavigationParams]]
  var replacingRouteKeys: js.Array[String]
  var routes: js.Array[NavigationRoute[NavigationParams]]
}

object AnonDescriptors {
  @scala.inline
  def apply(
    closingRouteKeys: js.Array[String],
    descriptors: StackDescriptorMap,
    openingRouteKeys: js.Array[String],
    previousDescriptors: StackDescriptorMap,
    previousRoutes: js.Array[NavigationRoute[NavigationParams]],
    replacingRouteKeys: js.Array[String],
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): AnonDescriptors = {
    val __obj = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any], previousRoutes = previousRoutes.asInstanceOf[js.Any], replacingRouteKeys = replacingRouteKeys.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDescriptors]
  }
}

