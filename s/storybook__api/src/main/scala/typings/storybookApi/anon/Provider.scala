package typings.storybookApi.anon

import typings.storybookApi.mod.API
import typings.storybookApi.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  var api: API
  var provider: typings.storybookApi.initProviderApiMod.Provider
  var store: default
}

object Provider {
  @scala.inline
  def apply(api: API, provider: typings.storybookApi.initProviderApiMod.Provider, store: default): Provider = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
}

