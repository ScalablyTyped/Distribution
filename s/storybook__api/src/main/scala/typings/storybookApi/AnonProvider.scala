package typings.storybookApi

import typings.storybookApi.initProviderApiMod.Provider
import typings.storybookApi.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProvider extends js.Object {
  var provider: Provider
  var store: default
}

object AnonProvider {
  @scala.inline
  def apply(provider: Provider, store: default): AnonProvider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProvider]
  }
}

