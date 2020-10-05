package typings.storybookApi.anon

import typings.storybookApi.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store extends js.Object {
  var provider: typings.storybookApi.initProviderApiMod.Provider = js.native
  var store: default = js.native
}

object Store {
  @scala.inline
  def apply(provider: typings.storybookApi.initProviderApiMod.Provider, store: default): Store = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
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
    def setStore(value: default): Self = this.set("store", value.asInstanceOf[js.Any])
  }
  
}

