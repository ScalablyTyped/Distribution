package typings.sharepoint.SPClientTemplates

import typings.sharepoint.AnonAllowScriptableWebParts
import typings.sharepoint.AnonBaseType
import typings.sharepoint.AnonExternalListItem
import typings.sharepoint.SPClientForms.ClientValidation.ValidatorSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientTemplates.ClientFormContext")
@js.native
class ClientFormContext () extends js.Object {
  var controlMode: Double = js.native
  var fieldName: String = js.native
  var fieldSchema: FieldSchemaInForm = js.native
  var fieldValue: js.Any = js.native
  var itemAttributes: AnonExternalListItem = js.native
  var listAttributes: AnonBaseType = js.native
  var webAttributes: AnonAllowScriptableWebParts = js.native
  def registerClientValidator(fieldname: String, validator: ValidatorSet): Unit = js.native
  def registerFocusCallback(fieldname: String, callback: js.Function0[Unit]): Unit = js.native
  def registerGetValueCallback(fieldname: String, callback: js.Function0[_]): Unit = js.native
  def registerHasValueChangedCallback(fieldname: String, callback: js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def registerInitCallback(fieldname: String, callback: js.Function0[Unit]): Unit = js.native
  def registerValidationErrorCallback(fieldname: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def updateControlValue(fieldname: String, value: js.Any): Unit = js.native
}

