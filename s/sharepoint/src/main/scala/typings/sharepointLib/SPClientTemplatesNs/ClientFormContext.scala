package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientTemplates.ClientFormContext")
@js.native
class ClientFormContext () extends js.Object {
  var controlMode: scala.Double = js.native
  var fieldName: java.lang.String = js.native
  var fieldSchema: FieldSchema_InForm = js.native
  var fieldValue: js.Any = js.native
  var itemAttributes: sharepointLib.Anon_ExternalListItem = js.native
  var listAttributes: sharepointLib.Anon_BaseType = js.native
  var webAttributes: sharepointLib.Anon_AllowScriptableWebParts = js.native
  def registerClientValidator(
    fieldname: java.lang.String,
    validator: sharepointLib.SPClientFormsNs.ClientValidationNs.ValidatorSet
  ): scala.Unit = js.native
  def registerFocusCallback(fieldname: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def registerGetValueCallback(fieldname: java.lang.String, callback: js.Function0[_]): scala.Unit = js.native
  def registerHasValueChangedCallback(fieldname: java.lang.String, callback: js.Function1[/* eventArg */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def registerInitCallback(fieldname: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def registerValidationErrorCallback(fieldname: java.lang.String, callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  def updateControlValue(fieldname: java.lang.String, value: js.Any): scala.Unit = js.native
}

