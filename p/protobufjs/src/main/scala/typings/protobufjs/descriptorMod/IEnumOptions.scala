package typings.protobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEnumOptions extends js.Object {
  var allowAlias: js.UndefOr[Boolean] = js.native
  var deprecated: js.UndefOr[Boolean] = js.native
}

object IEnumOptions {
  @scala.inline
  def apply(): IEnumOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnumOptions]
  }
  @scala.inline
  implicit class IEnumOptionsOps[Self <: IEnumOptions] (val x: Self) extends AnyVal {
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
    def setAllowAlias(value: Boolean): Self = this.set("allowAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAlias: Self = this.set("allowAlias", js.undefined)
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
  }
  
}

