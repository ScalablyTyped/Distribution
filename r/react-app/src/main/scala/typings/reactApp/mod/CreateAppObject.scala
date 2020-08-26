package typings.reactApp.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppObject extends js.Object {
  var container: Element | Null = js.native
  var routes: RouteProps = js.native
}

object CreateAppObject {
  @scala.inline
  def apply(routes: RouteProps): CreateAppObject = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppObject]
  }
  @scala.inline
  implicit class CreateAppObjectOps[Self <: CreateAppObject] (val x: Self) extends AnyVal {
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
    def setRoutes(value: RouteProps): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: Element): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
  }
  
}

