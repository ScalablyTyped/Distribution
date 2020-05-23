package typings.sharepoint.SPClientTemplates

import typings.sharepoint.SPClientForms.ClientValidation.ValidatorSet
import typings.sharepoint.anon.AllowScriptableWebParts
import typings.sharepoint.anon.BaseType
import typings.sharepoint.anon.ExternalListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientFormContext extends js.Object {
  var controlMode: Double
  var fieldName: String
  var fieldSchema: FieldSchemaInForm
  var fieldValue: js.Any
  var itemAttributes: ExternalListItem
  var listAttributes: BaseType
  var webAttributes: AllowScriptableWebParts
  def registerClientValidator(fieldname: String, validator: ValidatorSet): Unit
  def registerFocusCallback(fieldname: String, callback: js.Function0[Unit]): Unit
  def registerGetValueCallback(fieldname: String, callback: js.Function0[_]): Unit
  def registerHasValueChangedCallback(fieldname: String, callback: js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]): Unit
  def registerInitCallback(fieldname: String, callback: js.Function0[Unit]): Unit
  def registerValidationErrorCallback(fieldname: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit
  def updateControlValue(fieldname: String, value: js.Any): Unit
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
}

