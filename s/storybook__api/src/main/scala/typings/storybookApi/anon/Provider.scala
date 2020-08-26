package typings.storybookApi.anon

import typings.storybookApi.mod.API
import typings.storybookApi.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Provider extends js.Object {
  var api: API = js.native
  var provider: typings.storybookApi.initProviderApiMod.Provider = js.native
  var store: default = js.native
}

object Provider {
  @scala.inline
  def apply(api: API, provider: typings.storybookApi.initProviderApiMod.Provider, store: default): Provider = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
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
    def setApi(value: API): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: typings.storybookApi.initProviderApiMod.Provider): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setStore(value: default): Self = this.set("store", value.asInstanceOf[js.Any])
  }
  
}

