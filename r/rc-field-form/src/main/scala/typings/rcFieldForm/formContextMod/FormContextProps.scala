package typings.rcFieldForm.formContextMod

import typings.rcFieldForm.interfaceMod.FieldData
import typings.rcFieldForm.interfaceMod.FormInstance
import typings.rcFieldForm.interfaceMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormContextProps extends FormProviderProps {
  
  def registerForm(name: String, form: FormInstance[_]): Unit = js.native
  
  def triggerFormChange(name: String, changedFields: js.Array[FieldData]): Unit = js.native
  
  def triggerFormFinish(name: String, values: Store): Unit = js.native
  
  def unregisterForm(name: String): Unit = js.native
}
object FormContextProps {
  
  @scala.inline
  def apply(
    registerForm: (String, FormInstance[_]) => Unit,
    triggerFormChange: (String, js.Array[FieldData]) => Unit,
    triggerFormFinish: (String, Store) => Unit,
    unregisterForm: String => Unit
  ): FormContextProps = {
    val __obj = js.Dynamic.literal(registerForm = js.Any.fromFunction2(registerForm), triggerFormChange = js.Any.fromFunction2(triggerFormChange), triggerFormFinish = js.Any.fromFunction2(triggerFormFinish), unregisterForm = js.Any.fromFunction1(unregisterForm))
    __obj.asInstanceOf[FormContextProps]
  }
  
  @scala.inline
  implicit class FormContextPropsOps[Self <: FormContextProps] (val x: Self) extends AnyVal {
    
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
    def setRegisterForm(value: (String, FormInstance[_]) => Unit): Self = this.set("registerForm", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTriggerFormChange(value: (String, js.Array[FieldData]) => Unit): Self = this.set("triggerFormChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTriggerFormFinish(value: (String, Store) => Unit): Self = this.set("triggerFormFinish", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnregisterForm(value: String => Unit): Self = this.set("unregisterForm", js.Any.fromFunction1(value))
  }
}
