package typings.sharepoint.SPClientTemplatesNs

import typings.sharepoint.Anon_AllowScriptableWebParts
import typings.sharepoint.Anon_BaseType
import typings.sharepoint.Anon_ExternalListItem
import typings.sharepoint.SPClientFormsNs.ClientValidationNs.ValidatorSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientTemplates.ClientFormContext")
@js.native
class ClientFormContext () extends js.Object {
  var controlMode: Double = js.native
  var fieldName: String = js.native
  var fieldSchema: FieldSchema_InForm = js.native
  var fieldValue: js.Any = js.native
  var itemAttributes: Anon_ExternalListItem = js.native
  var listAttributes: Anon_BaseType = js.native
  var webAttributes: Anon_AllowScriptableWebParts = js.native
  def registerClientValidator(fieldname: String, validator: ValidatorSet): Unit = js.native
  def registerFocusCallback(fieldname: String, callback: js.Function0[Unit]): Unit = js.native
  def registerGetValueCallback(fieldname: String, callback: js.Function0[_]): Unit = js.native
  def registerHasValueChangedCallback(fieldname: String, callback: js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def registerInitCallback(fieldname: String, callback: js.Function0[Unit]): Unit = js.native
  def registerValidationErrorCallback(fieldname: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def updateControlValue(fieldname: String, value: js.Any): Unit = js.native
}

