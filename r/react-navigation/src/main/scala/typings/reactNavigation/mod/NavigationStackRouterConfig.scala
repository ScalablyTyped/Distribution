package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationStackRouterConfig extends js.Object {
  var initialRouteKey: js.UndefOr[String] = js.native
  var initialRouteName: js.UndefOr[String] = js.native
  var initialRouteParams: js.UndefOr[NavigationParams] = js.native
  var paths: js.UndefOr[NavigationPathsConfig] = js.native
}

object NavigationStackRouterConfig {
  @scala.inline
  def apply(): NavigationStackRouterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationStackRouterConfig]
  }
  @scala.inline
  implicit class NavigationStackRouterConfigOps[Self <: NavigationStackRouterConfig] (val x: Self) extends AnyVal {
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
    def setInitialRouteKey(value: String): Self = this.set("initialRouteKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialRouteKey: Self = this.set("initialRouteKey", js.undefined)
    @scala.inline
    def setInitialRouteName(value: String): Self = this.set("initialRouteName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialRouteName: Self = this.set("initialRouteName", js.undefined)
    @scala.inline
    def setInitialRouteParams(value: NavigationParams): Self = this.set("initialRouteParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialRouteParams: Self = this.set("initialRouteParams", js.undefined)
    @scala.inline
    def setPaths(value: NavigationPathsConfig): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
  }
  
}

