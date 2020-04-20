package typings.storybookApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderData extends js.Object {
  var provider: typings.storybookApi.initProviderApiMod.Provider
}

object ProviderData {
  @scala.inline
  def apply(provider: typings.storybookApi.initProviderApiMod.Provider): ProviderData = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderData]
  }
}

