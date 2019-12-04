package typings.atStorybookApi

import typings.atStorybookApi.atStorybookApiMod.API
import typings.atStorybookApi.distInitDashProviderDashApiMod.Provider
import typings.atStorybookApi.distStoreMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiProvider extends js.Object {
  var api: API
  var provider: Provider
  var store: default
}

object Anon_ApiProvider {
  @scala.inline
  def apply(api: API, provider: Provider, store: default): Anon_ApiProvider = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ApiProvider]
  }
}

