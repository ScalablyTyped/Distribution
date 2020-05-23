package typings.reactNavigationStack.anon

import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/views/Stack/StackView.State> */
trait ReadonlyState extends js.Object {
  val closingRouteKeys: js.Array[String]
  val descriptors: StackDescriptorMap
  val openingRouteKeys: js.Array[String]
  val previousDescriptors: StackDescriptorMap
  val previousRoutes: js.Array[typings.reactNavigationStack.vendorTypesMod.Route[String]]
  val replacingRouteKeys: js.Array[String]
  val routes: js.Array[typings.reactNavigationStack.vendorTypesMod.Route[String]]
}

object ReadonlyState {
  @scala.inline
  def apply(
    closingRouteKeys: js.Array[String],
    descriptors: StackDescriptorMap,
    openingRouteKeys: js.Array[String],
    previousDescriptors: StackDescriptorMap,
    previousRoutes: js.Array[typings.reactNavigationStack.vendorTypesMod.Route[String]],
    replacingRouteKeys: js.Array[String],
    routes: js.Array[typings.reactNavigationStack.vendorTypesMod.Route[String]]
  ): ReadonlyState = {
    val __obj = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any], previousRoutes = previousRoutes.asInstanceOf[js.Any], replacingRouteKeys = replacingRouteKeys.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyState]
  }
}

