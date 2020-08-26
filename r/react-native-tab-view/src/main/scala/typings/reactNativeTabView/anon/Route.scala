package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route[T /* <: typings.reactNativeTabView.typesMod.Route */] extends js.Object {
  var route: T = js.native
}

object Route {
  @scala.inline
  def apply[/* <: typings.reactNativeTabView.typesMod.Route */ T](route: T): Route[T] = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route[T]]
  }
  @scala.inline
  implicit class RouteOps[Self <: Route[_], /* <: typings.reactNativeTabView.typesMod.Route */ T] (val x: Self with Route[T]) extends AnyVal {
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
    def setRoute(value: T): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

