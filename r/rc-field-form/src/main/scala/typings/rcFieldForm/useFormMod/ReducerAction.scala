package typings.rcFieldForm.useFormMod

import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.rcFieldForm.interfaceMod.StoreValue
import typings.rcFieldForm.rcFieldFormStrings.updateValue
import typings.rcFieldForm.rcFieldFormStrings.validateField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcFieldForm.useFormMod.UpdateAction
  - typings.rcFieldForm.useFormMod.ValidateAction
*/
trait ReducerAction extends js.Object

object ReducerAction {
  @scala.inline
  def UpdateAction(namePath: InternalNamePath, `type`: updateValue, value: StoreValue): ReducerAction = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReducerAction]
  }
  @scala.inline
  def ValidateAction(namePath: InternalNamePath, triggerName: String, `type`: validateField): ReducerAction = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReducerAction]
  }
}

