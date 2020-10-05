package typings.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalFieldData extends Meta {
  var value: StoreValue = js.native
}

object InternalFieldData {
  @scala.inline
  def apply(
    errors: js.Array[String],
    name: InternalNamePath,
    touched: Boolean,
    validating: Boolean,
    value: StoreValue
  ): InternalFieldData = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalFieldData]
  }
  @scala.inline
  implicit class InternalFieldDataOps[Self <: InternalFieldData] (val x: Self) extends AnyVal {
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
    def setValue(value: StoreValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

