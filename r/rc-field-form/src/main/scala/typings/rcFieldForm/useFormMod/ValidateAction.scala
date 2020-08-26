package typings.rcFieldForm.useFormMod

import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.rcFieldForm.rcFieldFormStrings.validateField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateAction extends ReducerAction {
  var namePath: InternalNamePath = js.native
  var triggerName: String = js.native
  var `type`: validateField = js.native
}

object ValidateAction {
  @scala.inline
  def apply(namePath: InternalNamePath, triggerName: String, `type`: validateField): ValidateAction = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateAction]
  }
  @scala.inline
  implicit class ValidateActionOps[Self <: ValidateAction] (val x: Self) extends AnyVal {
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
    def setTriggerName(value: String): Self = this.set("triggerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: validateField): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

