package typings.reactNavigationDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialRouteName extends js.Object {
  var initialRouteName: js.UndefOr[String] = js.native
  var resetOnBlur: js.UndefOr[Boolean] = js.native
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.native
}

object InitialRouteName {
  @scala.inline
  def apply(): InitialRouteName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialRouteName]
  }
  @scala.inline
  implicit class InitialRouteNameOps[Self <: InitialRouteName] (val x: Self) extends AnyVal {
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
    def setInitialRouteName(value: String): Self = this.set("initialRouteName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialRouteName: Self = this.set("initialRouteName", js.undefined)
    @scala.inline
    def setResetOnBlur(value: Boolean): Self = this.set("resetOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetOnBlur: Self = this.set("resetOnBlur", js.undefined)
    @scala.inline
    def setUnmountInactiveRoutes(value: Boolean): Self = this.set("unmountInactiveRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmountInactiveRoutes: Self = this.set("unmountInactiveRoutes", js.undefined)
  }
  
}

