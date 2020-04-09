package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.StatelessComponent
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<react-jsonschema-form.react-jsonschema-form.FormProps<T>, 'schema'> */
trait ThemeProps[T] extends js.Object {
  var ArrayFieldTemplate: js.UndefOr[StatelessComponent[ArrayFieldTemplateProps[_]]] = js.undefined
  var ErrorList: js.UndefOr[StatelessComponent[ErrorListProps]] = js.undefined
  var FieldTemplate: js.UndefOr[StatelessComponent[FieldTemplateProps]] = js.undefined
  var ObjectFieldTemplate: js.UndefOr[StatelessComponent[ObjectFieldTemplateProps[_]]] = js.undefined
  var acceptcharset: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[String] = js.undefined
  var additionalMetaSchemas: js.UndefOr[js.Array[js.Object]] = js.undefined
  var autocomplete: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var customFormats: js.UndefOr[StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var enctype: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[StringDictionary[Field]] = js.undefined
  var formContext: js.UndefOr[js.Any] = js.undefined
  var formData: js.UndefOr[T] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var idPrefix: js.UndefOr[String] = js.undefined
  var liveOmit: js.UndefOr[Boolean] = js.undefined
  var liveValidate: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noHtml5Validate: js.UndefOr[Boolean] = js.undefined
  var noValidate: js.UndefOr[Boolean] = js.undefined
  var omitExtraData: js.UndefOr[Boolean] = js.undefined
  var onBlur: js.UndefOr[
    js.Function2[/* id */ String, /* value */ Boolean | Double | String | Null, Unit]
  ] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema], _]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* e */ ISubmitEvent[T], _]] = js.undefined
  var safeRenderCompletion: js.UndefOr[Boolean] = js.undefined
  var showErrorList: js.UndefOr[Boolean] = js.undefined
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any
  ] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]] = js.undefined
  var uiSchema: js.UndefOr[UiSchema] = js.undefined
  var validate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]] = js.undefined
  var widgets: js.UndefOr[StringDictionary[Widget]] = js.undefined
}

object ThemeProps {
  @scala.inline
  def apply[T](
    ArrayFieldTemplate: StatelessComponent[ArrayFieldTemplateProps[_]] = null,
    ErrorList: StatelessComponent[ErrorListProps] = null,
    FieldTemplate: StatelessComponent[FieldTemplateProps] = null,
    ObjectFieldTemplate: StatelessComponent[ObjectFieldTemplateProps[_]] = null,
    acceptcharset: String = null,
    action: String = null,
    additionalMetaSchemas: js.Array[js.Object] = null,
    autocomplete: String = null,
    className: String = null,
    customFormats: StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enctype: String = null,
    fields: StringDictionary[Field] = null,
    formContext: js.Any = null,
    formData: T = null,
    id: String = null,
    idPrefix: String = null,
    liveOmit: js.UndefOr[Boolean] = js.undefined,
    liveValidate: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    name: String = null,
    noHtml5Validate: js.UndefOr[Boolean] = js.undefined,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    omitExtraData: js.UndefOr[Boolean] = js.undefined,
    onBlur: (/* id */ String, /* value */ Boolean | Double | String | Null) => Unit = null,
    onChange: (/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema]) => _ = null,
    onError: /* e */ js.Any => _ = null,
    onSubmit: /* e */ ISubmitEvent[T] => _ = null,
    safeRenderCompletion: js.UndefOr[Boolean] = js.undefined,
    showErrorList: js.UndefOr[Boolean] = js.undefined,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any = null,
    target: String = null,
    transformErrors: /* errors */ js.Array[AjvError] => js.Array[AjvError] = null,
    uiSchema: UiSchema = null,
    validate: (/* formData */ T, /* errors */ FormValidation) => FormValidation = null,
    widgets: StringDictionary[Widget] = null
  ): ThemeProps[T] = {
    val __obj = js.Dynamic.literal()
    if (ArrayFieldTemplate != null) __obj.updateDynamic("ArrayFieldTemplate")(ArrayFieldTemplate.asInstanceOf[js.Any])
    if (ErrorList != null) __obj.updateDynamic("ErrorList")(ErrorList.asInstanceOf[js.Any])
    if (FieldTemplate != null) __obj.updateDynamic("FieldTemplate")(FieldTemplate.asInstanceOf[js.Any])
    if (ObjectFieldTemplate != null) __obj.updateDynamic("ObjectFieldTemplate")(ObjectFieldTemplate.asInstanceOf[js.Any])
    if (acceptcharset != null) __obj.updateDynamic("acceptcharset")(acceptcharset.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (additionalMetaSchemas != null) __obj.updateDynamic("additionalMetaSchemas")(additionalMetaSchemas.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customFormats != null) __obj.updateDynamic("customFormats")(customFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (enctype != null) __obj.updateDynamic("enctype")(enctype.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (formContext != null) __obj.updateDynamic("formContext")(formContext.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(liveOmit)) __obj.updateDynamic("liveOmit")(liveOmit.asInstanceOf[js.Any])
    if (!js.isUndefined(liveValidate)) __obj.updateDynamic("liveValidate")(liveValidate.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noHtml5Validate)) __obj.updateDynamic("noHtml5Validate")(noHtml5Validate.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (!js.isUndefined(omitExtraData)) __obj.updateDynamic("omitExtraData")(omitExtraData.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (!js.isUndefined(safeRenderCompletion)) __obj.updateDynamic("safeRenderCompletion")(safeRenderCompletion.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrorList)) __obj.updateDynamic("showErrorList")(showErrorList.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (transformErrors != null) __obj.updateDynamic("transformErrors")(js.Any.fromFunction1(transformErrors))
    if (uiSchema != null) __obj.updateDynamic("uiSchema")(uiSchema.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (widgets != null) __obj.updateDynamic("widgets")(widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProps[T]]
  }
}

