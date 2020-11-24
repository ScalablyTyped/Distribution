package typings.rcFieldForm.formMod

import typings.rcFieldForm.interfaceMod.FieldData
import typings.rcFieldForm.interfaceMod.FormInstance
import typings.rcFieldForm.interfaceMod.Store
import typings.rcFieldForm.interfaceMod.ValidateErrorEntity
import typings.rcFieldForm.interfaceMod.ValidateMessages
import typings.rcFieldForm.rcFieldFormBooleans.`false`
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormProps[Values] extends BaseFormProps {
  
  @JSName("children")
  var children_FormProps: js.UndefOr[RenderProps | ReactNode] = js.native
  
  var component: js.UndefOr[`false` | String | FC[_] | (ComponentClass[_, ComponentState])] = js.native
  
  var fields: js.UndefOr[js.Array[FieldData]] = js.native
  
  var form: js.UndefOr[FormInstance[Values]] = js.native
  
  var initialValues: js.UndefOr[Store] = js.native
  
  var onFieldsChange: js.UndefOr[
    js.Function2[/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData], Unit]
  ] = js.native
  
  var onFinish: js.UndefOr[js.Function1[/* values */ Values, Unit]] = js.native
  
  var onFinishFailed: js.UndefOr[js.Function1[/* errorInfo */ ValidateErrorEntity[Values], Unit]] = js.native
  
  var onValuesChange: js.UndefOr[js.Function2[/* changedValues */ js.Any, /* values */ Values, Unit]] = js.native
  
  var preserve: js.UndefOr[Boolean] = js.native
  
  var validateMessages: js.UndefOr[ValidateMessages] = js.native
  
  var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.native
}
object FormProps {
  
  @scala.inline
  def apply[Values](): FormProps[Values] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProps[Values]]
  }
  
  @scala.inline
  implicit class FormPropsOps[Self <: FormProps[_], Values] (val x: Self with FormProps[Values]) extends AnyVal {
    
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
    def setChildrenFunction2(value: (/* values */ Store, /* form */ FormInstance[js.Any]) => Element | ReactNode): Self = this.set("children", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChildren(value: RenderProps | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setComponent(value: `false` | String | FC[_] | (ComponentClass[_, ComponentState])): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: FieldData*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[FieldData]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setForm(value: FormInstance[Values]): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setInitialValues(value: Store): Self = this.set("initialValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValues: Self = this.set("initialValues", js.undefined)
    
    @scala.inline
    def setOnFieldsChange(value: (/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData]) => Unit): Self = this.set("onFieldsChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFieldsChange: Self = this.set("onFieldsChange", js.undefined)
    
    @scala.inline
    def setOnFinish(value: /* values */ Values => Unit): Self = this.set("onFinish", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFinish: Self = this.set("onFinish", js.undefined)
    
    @scala.inline
    def setOnFinishFailed(value: /* errorInfo */ ValidateErrorEntity[Values] => Unit): Self = this.set("onFinishFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFinishFailed: Self = this.set("onFinishFailed", js.undefined)
    
    @scala.inline
    def setOnValuesChange(value: (/* changedValues */ js.Any, /* values */ Values) => Unit): Self = this.set("onValuesChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnValuesChange: Self = this.set("onValuesChange", js.undefined)
    
    @scala.inline
    def setPreserve(value: Boolean): Self = this.set("preserve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserve: Self = this.set("preserve", js.undefined)
    
    @scala.inline
    def setValidateMessages(value: ValidateMessages): Self = this.set("validateMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateMessages: Self = this.set("validateMessages", js.undefined)
    
    @scala.inline
    def setValidateTriggerVarargs(value: String*): Self = this.set("validateTrigger", js.Array(value :_*))
    
    @scala.inline
    def setValidateTrigger(value: String | js.Array[String] | `false`): Self = this.set("validateTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateTrigger: Self = this.set("validateTrigger", js.undefined)
  }
}
