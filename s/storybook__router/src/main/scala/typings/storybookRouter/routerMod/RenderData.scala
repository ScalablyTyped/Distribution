package typings.storybookRouter.routerMod

import typings.history.mod.LocationState
import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @reach/router.@reach/router.RouteComponentProps<{}> & @storybook/router.@storybook/router/dist/router.Other */
@js.native
trait RenderData extends js.Object {
  var default: js.UndefOr[Boolean] = js.native
  var location: js.UndefOr[WindowLocation[LocationState]] = js.native
  var navigate: js.UndefOr[NavigateFn] = js.native
  var path: js.UndefOr[String] = js.native
  var storyId: js.UndefOr[String] = js.native
  var uri: js.UndefOr[String] = js.native
  var viewMode: js.UndefOr[String] = js.native
}

object RenderData {
  @scala.inline
  def apply(): RenderData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderData]
  }
  @scala.inline
  implicit class RenderDataOps[Self <: RenderData] (val x: Self) extends AnyVal {
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
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setNavigate(value: NavigateFn): Self = this.set("navigate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigate: Self = this.set("navigate", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoryId: Self = this.set("storyId", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    @scala.inline
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
  
}

