package typings.reachRouter.mod

import typings.history.mod.LocationState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterProps extends js.Object {
  var basepath: js.UndefOr[String] = js.native
  var component: js.UndefOr[ComponentType[js.Object] | String] = js.native
  var location: js.UndefOr[WindowLocation[LocationState]] = js.native
  var primary: js.UndefOr[Boolean] = js.native
}

object RouterProps {
  @scala.inline
  def apply(): RouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterProps]
  }
  @scala.inline
  implicit class RouterPropsOps[Self <: RouterProps] (val x: Self) extends AnyVal {
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
    def setBasepath(value: String): Self = this.set("basepath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasepath: Self = this.set("basepath", js.undefined)
    @scala.inline
    def setComponent(value: ComponentType[js.Object] | String): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
  }
  
}

