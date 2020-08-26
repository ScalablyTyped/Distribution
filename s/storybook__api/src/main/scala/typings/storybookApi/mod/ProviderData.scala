package typings.storybookApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderData extends js.Object {
  var provider: typings.storybookApi.initProviderApiMod.Provider = js.native
}

object ProviderData {
  @scala.inline
  def apply(provider: typings.storybookApi.initProviderApiMod.Provider): ProviderData = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderData]
  }
  @scala.inline
  implicit class ProviderDataOps[Self <: ProviderData] (val x: Self) extends AnyVal {
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
  }
  
}

