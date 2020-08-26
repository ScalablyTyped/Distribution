package typings.rbx.fieldLabelMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.normal
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLabelVariablesDefaults extends js.Object {
  var sizes: small | normal | medium | large = js.native
}

object FieldLabelVariablesDefaults {
  @scala.inline
  def apply(sizes: small | normal | medium | large): FieldLabelVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLabelVariablesDefaults]
  }
  @scala.inline
  implicit class FieldLabelVariablesDefaultsOps[Self <: FieldLabelVariablesDefaults] (val x: Self) extends AnyVal {
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
    def setSizes(value: small | normal | medium | large): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
  
}

