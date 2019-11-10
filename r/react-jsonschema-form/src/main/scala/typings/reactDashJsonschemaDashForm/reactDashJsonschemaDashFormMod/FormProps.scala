package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps[T] extends js.Object {
  var ArrayFieldTemplate: js.UndefOr[StatelessComponent[ArrayFieldTemplateProps[_]]] = js.undefined
  var ErrorList: js.UndefOr[StatelessComponent[ErrorListProps]] = js.undefined
  var FieldTemplate: js.UndefOr[StatelessComponent[FieldTemplateProps]] = js.undefined
  var ObjectFieldTemplate: js.UndefOr[StatelessComponent[ObjectFieldTemplateProps[_]]] = js.undefined
  var acceptcharset: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[String] = js.undefined
  var autocomplete: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var enctype: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[StringDictionary[Field]] = js.undefined
  var formContext: js.UndefOr[js.Any] = js.undefined
  var formData: js.UndefOr[T] = js.undefined
  // HTML Attributes
  var id: js.UndefOr[String] = js.undefined
  var idPrefix: js.UndefOr[String] = js.undefined
  var liveValidate: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noHtml5Validate: js.UndefOr[Boolean] = js.undefined
  var noValidate: js.UndefOr[Boolean] = js.undefined
  var onBlur: js.UndefOr[
    js.Function2[/* id */ String, /* value */ Boolean | Double | String | Null, Unit]
  ] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema], _]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* e */ ISubmitEvent[T], _]] = js.undefined
  var safeRenderCompletion: js.UndefOr[Boolean] = js.undefined
  var schema: JSONSchema6
  var showErrorList: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]] = js.undefined
  var uiSchema: js.UndefOr[UiSchema] = js.undefined
  var validate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]] = js.undefined
  var widgets: js.UndefOr[StringDictionary[Widget]] = js.undefined
}

object FormProps {
  @scala.inline
  def apply[T](
    schema: JSONSchema6,
    ArrayFieldTemplate: StatelessComponent[ArrayFieldTemplateProps[_]] = null,
    ErrorList: StatelessComponent[ErrorListProps] = null,
    FieldTemplate: StatelessComponent[FieldTemplateProps] = null,
    ObjectFieldTemplate: StatelessComponent[ObjectFieldTemplateProps[_]] = null,
    acceptcharset: String = null,
    action: String = null,
    autocomplete: String = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enctype: String = null,
    fields: StringDictionary[Field] = null,
    formContext: js.Any = null,
    formData: T = null,
    id: String = null,
    idPrefix: String = null,
    liveValidate: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    name: String = null,
    noHtml5Validate: js.UndefOr[Boolean] = js.undefined,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    onBlur: (/* id */ String, /* value */ Boolean | Double | String | Null) => Unit = null,
    onChange: (/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema]) => _ = null,
    onError: /* e */ js.Any => _ = null,
    onSubmit: /* e */ ISubmitEvent[T] => _ = null,
    safeRenderCompletion: js.UndefOr[Boolean] = js.undefined,
    showErrorList: js.UndefOr[Boolean] = js.undefined,
    target: String = null,
    transformErrors: /* errors */ js.Array[AjvError] => js.Array[AjvError] = null,
    uiSchema: UiSchema = null,
    validate: (/* formData */ T, /* errors */ FormValidation) => FormValidation = null,
    widgets: StringDictionary[Widget] = null
  ): FormProps[T] = {
    val __obj = js.Dynamic.literal(schema = schema)
    if (ArrayFieldTemplate != null) __obj.updateDynamic("ArrayFieldTemplate")(ArrayFieldTemplate)
    if (ErrorList != null) __obj.updateDynamic("ErrorList")(ErrorList)
    if (FieldTemplate != null) __obj.updateDynamic("FieldTemplate")(FieldTemplate)
    if (ObjectFieldTemplate != null) __obj.updateDynamic("ObjectFieldTemplate")(ObjectFieldTemplate)
    if (acceptcharset != null) __obj.updateDynamic("acceptcharset")(acceptcharset)
    if (action != null) __obj.updateDynamic("action")(action)
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (enctype != null) __obj.updateDynamic("enctype")(enctype)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (formContext != null) __obj.updateDynamic("formContext")(formContext)
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix)
    if (!js.isUndefined(liveValidate)) __obj.updateDynamic("liveValidate")(liveValidate)
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(noHtml5Validate)) __obj.updateDynamic("noHtml5Validate")(noHtml5Validate)
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (!js.isUndefined(safeRenderCompletion)) __obj.updateDynamic("safeRenderCompletion")(safeRenderCompletion)
    if (!js.isUndefined(showErrorList)) __obj.updateDynamic("showErrorList")(showErrorList)
    if (target != null) __obj.updateDynamic("target")(target)
    if (transformErrors != null) __obj.updateDynamic("transformErrors")(js.Any.fromFunction1(transformErrors))
    if (uiSchema != null) __obj.updateDynamic("uiSchema")(uiSchema)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (widgets != null) __obj.updateDynamic("widgets")(widgets)
    __obj.asInstanceOf[FormProps[T]]
  }
}

