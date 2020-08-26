package typings.reactRouterRedux.mod

import typings.history.mod.Location
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterState extends js.Object {
  var location: Location[LocationState] | Null = js.native
}

object RouterState {
  @scala.inline
  def apply(): RouterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterState]
  }
  @scala.inline
  implicit class RouterStateOps[Self <: RouterState] (val x: Self) extends AnyVal {
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
    def setLocation(value: Location[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
  }
  
}

