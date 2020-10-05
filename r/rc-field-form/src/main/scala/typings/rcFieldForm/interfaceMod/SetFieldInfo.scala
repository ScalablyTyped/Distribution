package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.setField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetFieldInfo extends NotifyInfo {
  var data: FieldData = js.native
  var `type`: setField = js.native
}

object SetFieldInfo {
  @scala.inline
  def apply(data: FieldData, `type`: setField): SetFieldInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFieldInfo]
  }
  @scala.inline
  implicit class SetFieldInfoOps[Self <: SetFieldInfo] (val x: Self) extends AnyVal {
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
    def setData(value: FieldData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: setField): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

