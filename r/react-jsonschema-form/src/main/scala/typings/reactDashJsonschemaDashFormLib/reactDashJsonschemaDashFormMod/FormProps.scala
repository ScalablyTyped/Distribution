package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps[T] extends js.Object {
  var ArrayFieldTemplate: js.UndefOr[reactLib.reactMod.ReactNs.StatelessComponent[ArrayFieldTemplateProps]] = js.undefined
  var ErrorList: js.UndefOr[reactLib.reactMod.ReactNs.StatelessComponent[ErrorListProps]] = js.undefined
  var FieldTemplate: js.UndefOr[reactLib.reactMod.ReactNs.StatelessComponent[FieldTemplateProps]] = js.undefined
  var ObjectFieldTemplate: js.UndefOr[reactLib.reactMod.ReactNs.StatelessComponent[ObjectFieldTemplateProps]] = js.undefined
  var acceptcharset: js.UndefOr[java.lang.String] = js.undefined
  var action: js.UndefOr[java.lang.String] = js.undefined
  var autocomplete: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var enctype: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Field]] = js.undefined
  var formContext: js.UndefOr[js.Any] = js.undefined
  var formData: js.UndefOr[T] = js.undefined
  // HTML Attributes
  var id: js.UndefOr[java.lang.String] = js.undefined
  var idPrefix: js.UndefOr[java.lang.String] = js.undefined
  var liveValidate: js.UndefOr[scala.Boolean] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var noHtml5Validate: js.UndefOr[scala.Boolean] = js.undefined
  var noValidate: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ IChangeEvent[T], _]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* e */ ISubmitEvent[T], _]] = js.undefined
  var safeRenderCompletion: js.UndefOr[scala.Boolean] = js.undefined
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6
  var showErrorList: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]] = js.undefined
  var uiSchema: js.UndefOr[UiSchema] = js.undefined
  var validate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]] = js.undefined
  var widgets: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Widget]] = js.undefined
}

