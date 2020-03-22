package typings.reactNavigationStack.cardStackMod

import typings.reactNavigationStack.vendorTypesMod.Layout
import typings.reactNavigationStack.vendorTypesMod.Route
import typings.reactNavigationStack.vendorTypesMod.Scene
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var descriptors: StackDescriptorMap
  var gestures: GestureValues
  var headerHeights: Record[String, Double]
  var layout: Layout
  var routes: js.Array[Route[String]]
  var scenes: js.Array[Scene[Route[String]]]
}

object State {
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    gestures: GestureValues,
    headerHeights: Record[String, Double],
    layout: Layout,
    routes: js.Array[Route[String]],
    scenes: js.Array[Scene[Route[String]]]
  ): State = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], gestures = gestures.asInstanceOf[js.Any], headerHeights = headerHeights.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

