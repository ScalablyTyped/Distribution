package typings.storybookApi.mod

import typings.history.mod.LocationState
import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import typings.storybookApi.storeMod.default
import typings.storybookApi.storybookApiStrings.development
import typings.storybookApi.storybookApiStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/api.@storybook/api.StoreData & @storybook/router.@storybook/router.RenderData & @storybook/api.@storybook/api.ProviderData & {  mode :'production' | 'development' | undefined,   state :@storybook/api.@storybook/api.State} */
@js.native
trait Module extends js.Object {
  var default: js.UndefOr[Boolean] = js.native
  var location: js.UndefOr[WindowLocation[LocationState]] = js.native
  var mode: js.UndefOr[production | development] = js.native
  var navigate: js.UndefOr[NavigateFn] = js.native
  var path: js.UndefOr[String] = js.native
  var provider: typings.storybookApi.initProviderApiMod.Provider = js.native
  var state: State = js.native
  var store: default = js.native
  var storyId: js.UndefOr[String] = js.native
  var uri: js.UndefOr[String] = js.native
  var viewMode: js.UndefOr[String] = js.native
}

object Module {
  @scala.inline
  def apply(provider: typings.storybookApi.initProviderApiMod.Provider, state: State, store: default): Module = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
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
    def setProvider(value: typings.storybookApi.initProviderApiMod.Provider): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setStore(value: default): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMode(value: production | development): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
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

