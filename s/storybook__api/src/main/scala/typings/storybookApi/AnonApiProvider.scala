package typings.storybookApi

import typings.storybookApi.initProviderApiMod.Provider
import typings.storybookApi.mod.API
import typings.storybookApi.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiProvider extends js.Object {
  var api: API
  var provider: Provider
  var store: default
}

object AnonApiProvider {
  @scala.inline
  def apply(api: API, provider: Provider, store: default): AnonApiProvider = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApiProvider]
  }
}

