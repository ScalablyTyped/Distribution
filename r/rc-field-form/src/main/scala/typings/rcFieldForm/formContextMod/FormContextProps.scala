package typings.rcFieldForm.formContextMod

import typings.rcFieldForm.interfaceMod.FieldData
import typings.rcFieldForm.interfaceMod.FormInstance
import typings.rcFieldForm.interfaceMod.Store
import typings.rcFieldForm.interfaceMod.ValidateMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormContextProps extends FormProviderProps {
  def registerForm(name: String, form: FormInstance): Unit
  def triggerFormChange(name: String, changedFields: js.Array[FieldData]): Unit
  def triggerFormFinish(name: String, values: Store): Unit
  def unregisterForm(name: String): Unit
}

object FormContextProps {
  @scala.inline
  def apply(
    registerForm: (String, FormInstance) => Unit,
    triggerFormChange: (String, js.Array[FieldData]) => Unit,
    triggerFormFinish: (String, Store) => Unit,
    unregisterForm: String => Unit,
    onFormChange: (/* name */ String, /* info */ FormChangeInfo) => Unit = null,
    onFormFinish: (/* name */ String, /* info */ FormFinishInfo) => Unit = null,
    validateMessages: ValidateMessages = null
  ): FormContextProps = {
    val __obj = js.Dynamic.literal(registerForm = js.Any.fromFunction2(registerForm), triggerFormChange = js.Any.fromFunction2(triggerFormChange), triggerFormFinish = js.Any.fromFunction2(triggerFormFinish), unregisterForm = js.Any.fromFunction1(unregisterForm))
    if (onFormChange != null) __obj.updateDynamic("onFormChange")(js.Any.fromFunction2(onFormChange))
    if (onFormFinish != null) __obj.updateDynamic("onFormFinish")(js.Any.fromFunction2(onFormFinish))
    if (validateMessages != null) __obj.updateDynamic("validateMessages")(validateMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormContextProps]
  }
}

