package typings.reactRouterNavigationCore.mod

import typings.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route[T] extends js.Object {
  var key: String = js.native
  var `match`: js.UndefOr[typings.reactRouter.mod.`match`[T]] = js.native
  var routeName: String = js.native
}

object Route {
  @scala.inline
  def apply[T](key: String, routeName: String): Route[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route[T]]
  }
  @scala.inline
  implicit class RouteOps[Self <: Route[_], T] (val x: Self with Route[T]) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteName(value: String): Self = this.set("routeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(value: `match`[T]): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
  }
  
}

