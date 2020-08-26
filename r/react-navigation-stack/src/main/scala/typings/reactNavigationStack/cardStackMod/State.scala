package typings.reactNavigationStack.cardStackMod

import typings.reactNavigationStack.vendorTypesMod.Layout
import typings.reactNavigationStack.vendorTypesMod.Route
import typings.reactNavigationStack.vendorTypesMod.Scene
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var descriptors: StackDescriptorMap = js.native
  var gestures: GestureValues = js.native
  var headerHeights: Record[String, Double] = js.native
  var layout: Layout = js.native
  var routes: js.Array[Route[String]] = js.native
  var scenes: js.Array[Scene[Route[String]]] = js.native
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
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescriptors(value: StackDescriptorMap): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setGestures(value: GestureValues): Self = this.set("gestures", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderHeights(value: Record[String, Double]): Self = this.set("headerHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutesVarargs(value: Route[String]*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[Route[String]]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def setScenesVarargs(value: Scene[Route[String]]*): Self = this.set("scenes", js.Array(value :_*))
    @scala.inline
    def setScenes(value: js.Array[Scene[Route[String]]]): Self = this.set("scenes", value.asInstanceOf[js.Any])
  }
  
}

