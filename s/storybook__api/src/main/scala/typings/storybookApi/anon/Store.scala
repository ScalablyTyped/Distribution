package typings.storybookApi.anon

import typings.storybookApi.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  var provider: typings.storybookApi.initProviderApiMod.Provider
  var store: default
}

object Store {
  @scala.inline
  def apply(provider: typings.storybookApi.initProviderApiMod.Provider, store: default): Store = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
}

