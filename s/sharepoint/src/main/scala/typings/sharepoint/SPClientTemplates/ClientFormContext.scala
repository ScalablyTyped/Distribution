package typings.sharepoint.SPClientTemplates

import typings.sharepoint.SPClientForms.ClientValidation.ValidatorSet
import typings.sharepoint.anon.AllowScriptableWebParts
import typings.sharepoint.anon.BaseType
import typings.sharepoint.anon.ExternalListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientFormContext extends js.Object {
  var controlMode: Double = js.native
  var fieldName: String = js.native
  var fieldSchema: FieldSchemaInForm = js.native
  var fieldValue: js.Any = js.native
  var itemAttributes: ExternalListItem = js.native
  var listAttributes: BaseType = js.native
  var webAttributes: AllowScriptableWebParts = js.native
  def registerClientValidator(fieldname: String, validator: ValidatorSet): Unit = js.native
  def registerFocusCallback(fieldname: String, callback: js.Function0[Unit]): Unit = js.native
  def registerGetValueCallback(fieldname: String, callback: js.Function0[_]): Unit = js.native
  def registerHasValueChangedCallback(fieldname: String, callback: js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def registerInitCallback(fieldname: String, callback: js.Function0[Unit]): Unit = js.native
  def registerValidationErrorCallback(fieldname: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def updateControlValue(fieldname: String, value: js.Any): Unit = js.native
}

object ClientFormContext {
  @scala.inline
  def apply(
    controlMode: Double,
    fieldName: String,
    fieldSchema: FieldSchemaInForm,
    fieldValue: js.Any,
    itemAttributes: ExternalListItem,
    listAttributes: BaseType,
    registerClientValidator: (String, ValidatorSet) => Unit,
    registerFocusCallback: (String, js.Function0[Unit]) => Unit,
    registerGetValueCallback: (String, js.Function0[_]) => Unit,
    registerHasValueChangedCallback: (String, js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]) => Unit,
    registerInitCallback: (String, js.Function0[Unit]) => Unit,
    registerValidationErrorCallback: (String, js.Function1[/* error */ js.Any, Unit]) => Unit,
    updateControlValue: (String, js.Any) => Unit,
    webAttributes: AllowScriptableWebParts
  ): ClientFormContext = {
    val __obj = js.Dynamic.literal(controlMode = controlMode.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fieldSchema = fieldSchema.asInstanceOf[js.Any], fieldValue = fieldValue.asInstanceOf[js.Any], itemAttributes = itemAttributes.asInstanceOf[js.Any], listAttributes = listAttributes.asInstanceOf[js.Any], registerClientValidator = js.Any.fromFunction2(registerClientValidator), registerFocusCallback = js.Any.fromFunction2(registerFocusCallback), registerGetValueCallback = js.Any.fromFunction2(registerGetValueCallback), registerHasValueChangedCallback = js.Any.fromFunction2(registerHasValueChangedCallback), registerInitCallback = js.Any.fromFunction2(registerInitCallback), registerValidationErrorCallback = js.Any.fromFunction2(registerValidationErrorCallback), updateControlValue = js.Any.fromFunction2(updateControlValue), webAttributes = webAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientFormContext]
  }
  @scala.inline
  implicit class ClientFormContextOps[Self <: ClientFormContext] (val x: Self) extends AnyVal {
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
    def setControlMode(value: Double): Self = this.set("controlMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldSchema(value: FieldSchemaInForm): Self = this.set("fieldSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldValue(value: js.Any): Self = this.set("fieldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemAttributes(value: ExternalListItem): Self = this.set("itemAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setListAttributes(value: BaseType): Self = this.set("listAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegisterClientValidator(value: (String, ValidatorSet) => Unit): Self = this.set("registerClientValidator", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterFocusCallback(value: (String, js.Function0[Unit]) => Unit): Self = this.set("registerFocusCallback", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterGetValueCallback(value: (String, js.Function0[_]) => Unit): Self = this.set("registerGetValueCallback", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterHasValueChangedCallback(value: (String, js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]) => Unit): Self = this.set("registerHasValueChangedCallback", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterInitCallback(value: (String, js.Function0[Unit]) => Unit): Self = this.set("registerInitCallback", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterValidationErrorCallback(value: (String, js.Function1[/* error */ js.Any, Unit]) => Unit): Self = this.set("registerValidationErrorCallback", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdateControlValue(value: (String, js.Any) => Unit): Self = this.set("updateControlValue", js.Any.fromFunction2(value))
    @scala.inline
    def setWebAttributes(value: AllowScriptableWebParts): Self = this.set("webAttributes", value.asInstanceOf[js.Any])
  }
  
}

