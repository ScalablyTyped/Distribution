package typings.rcFieldForm.useFormMod

import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.rcFieldForm.interfaceMod.StoreValue
import typings.rcFieldForm.rcFieldFormStrings.updateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAction extends ReducerAction {
  var namePath: InternalNamePath = js.native
  var `type`: updateValue = js.native
  var value: StoreValue = js.native
}

object UpdateAction {
  @scala.inline
  def apply(namePath: InternalNamePath, `type`: updateValue, value: StoreValue): UpdateAction = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAction]
  }
  @scala.inline
  implicit class UpdateActionOps[Self <: UpdateAction] (val x: Self) extends AnyVal {
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
    def setNamePathVarargs(value: (String | Double)*): Self = this.set("namePath", js.Array(value :_*))
    @scala.inline
    def setNamePath(value: InternalNamePath): Self = this.set("namePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: updateValue): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: StoreValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

