package typings.storybookApi.mod

import typings.history.mod.LocationState
import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import typings.storybookApi.storeMod.default
import typings.storybookApi.storybookApiStrings.development
import typings.storybookApi.storybookApiStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/router.@storybook/router.RenderData & @storybook/api.@storybook/api.ProviderData & {  mode :'production' | 'development' | undefined,   state :@storybook/api.@storybook/api.State,   fullAPI :@storybook/api.@storybook/api.API,   store :@storybook/api.@storybook/api/dist/store.default} */
@js.native
trait ModuleArgs extends js.Object {
  
  var fullAPI: API = js.native
  
  var location: WindowLocation[LocationState] = js.native
  
  var mode: js.UndefOr[production | development] = js.native
  
  var navigate: js.UndefOr[NavigateFn] = js.native
  
  var path: String = js.native
  
  var provider: typings.storybookApi.providerMod.Provider = js.native
  
  var refId: js.UndefOr[String] = js.native
  
  var state: State = js.native
  
  var store: default = js.native
  
  var storyId: js.UndefOr[String] = js.native
  
  var viewMode: js.UndefOr[String] = js.native
}
object ModuleArgs {
  
  @scala.inline
  def apply(
    fullAPI: API,
    location: WindowLocation[LocationState],
    path: String,
    provider: typings.storybookApi.providerMod.Provider,
    state: State,
    store: default
  ): ModuleArgs = {
    val __obj = js.Dynamic.literal(fullAPI = fullAPI.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleArgs]
  }
  
  @scala.inline
  implicit class ModuleArgsOps[Self <: ModuleArgs] (val x: Self) extends AnyVal {
    
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
    def setFullAPI(value: API): Self = this.set("fullAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: typings.storybookApi.providerMod.Provider): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: default): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: production | development): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNavigate(value: NavigateFn): Self = this.set("navigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigate: Self = this.set("navigate", js.undefined)
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefId: Self = this.set("refId", js.undefined)
    
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoryId: Self = this.set("storyId", js.undefined)
    
    @scala.inline
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
}
