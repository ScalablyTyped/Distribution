package typings.router5.routerMod

import typings.router5.baseMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeState extends js.Object {
  var previousRoute: State = js.native
  var route: State = js.native
}

object SubscribeState {
  @scala.inline
  def apply(previousRoute: State, route: State): SubscribeState = {
    val __obj = js.Dynamic.literal(previousRoute = previousRoute.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeState]
  }
  @scala.inline
  implicit class SubscribeStateOps[Self <: SubscribeState] (val x: Self) extends AnyVal {
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
    def setPreviousRoute(value: State): Self = this.set("previousRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: State): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

