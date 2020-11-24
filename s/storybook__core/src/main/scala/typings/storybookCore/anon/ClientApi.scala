package typings.storybookCore.anon

import typings.storybookClientApi.mod.ConfigApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientApi extends js.Object {
  
  var clientApi: typings.storybookClientApi.mod.ClientApi = js.native
  
  var configApi: ConfigApi = js.native
  
  var storyStore: typings.storybookClientApi.mod.StoryStore = js.native
}
object ClientApi {
  
  @scala.inline
  def apply(
    clientApi: typings.storybookClientApi.mod.ClientApi,
    configApi: ConfigApi,
    storyStore: typings.storybookClientApi.mod.StoryStore
  ): ClientApi = {
    val __obj = js.Dynamic.literal(clientApi = clientApi.asInstanceOf[js.Any], configApi = configApi.asInstanceOf[js.Any], storyStore = storyStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientApi]
  }
  
  @scala.inline
  implicit class ClientApiOps[Self <: ClientApi] (val x: Self) extends AnyVal {
    
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
    def setClientApi(value: typings.storybookClientApi.mod.ClientApi): Self = this.set("clientApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigApi(value: ConfigApi): Self = this.set("configApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryStore(value: typings.storybookClientApi.mod.StoryStore): Self = this.set("storyStore", value.asInstanceOf[js.Any])
  }
}
