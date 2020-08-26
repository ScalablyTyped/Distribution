package typings.reactRouterNavigationCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationState[OwnRoute] extends js.Object {
  var index: Double = js.native
  var routes: js.Array[Route[js.Object] with OwnRoute] = js.native
}

object NavigationState {
  @scala.inline
  def apply[OwnRoute](index: Double, routes: js.Array[Route[js.Object] with OwnRoute]): NavigationState[OwnRoute] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationState[OwnRoute]]
  }
  @scala.inline
  implicit class NavigationStateOps[Self <: NavigationState[_], OwnRoute] (val x: Self with NavigationState[OwnRoute]) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutesVarargs(value: (Route[js.Object] with OwnRoute)*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[Route[js.Object] with OwnRoute]): Self = this.set("routes", value.asInstanceOf[js.Any])
  }
  
}

