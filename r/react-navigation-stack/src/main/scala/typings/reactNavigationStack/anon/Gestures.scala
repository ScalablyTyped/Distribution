package typings.reactNavigationStack.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.cardStackMod.GestureValues
import typings.reactNavigationStack.vendorTypesMod.Scene
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gestures extends js.Object {
  var descriptors: StackDescriptorMap
  var gestures: GestureValues
  var headerHeights: Record[String, Double]
  var routes: js.Array[NavigationRoute[NavigationParams]]
  var scenes: js.Array[Scene[NavigationRoute[NavigationParams]]]
}

object Gestures {
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    gestures: GestureValues,
    headerHeights: Record[String, Double],
    routes: js.Array[NavigationRoute[NavigationParams]],
    scenes: js.Array[Scene[NavigationRoute[NavigationParams]]]
  ): Gestures = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], gestures = gestures.asInstanceOf[js.Any], headerHeights = headerHeights.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gestures]
  }
}

