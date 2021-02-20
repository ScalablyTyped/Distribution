package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.StatelessComponent
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormProps[T] extends StObject {
  
  var ArrayFieldTemplate: js.UndefOr[StatelessComponent[ArrayFieldTemplateProps[_]]] = js.native
  
  var ErrorList: js.UndefOr[StatelessComponent[ErrorListProps]] = js.native
  
  var FieldTemplate: js.UndefOr[StatelessComponent[FieldTemplateProps]] = js.native
  
  var ObjectFieldTemplate: js.UndefOr[StatelessComponent[ObjectFieldTemplateProps[_]]] = js.native
  
  var acceptcharset: js.UndefOr[String] = js.native
  
  var action: js.UndefOr[String] = js.native
  
  var additionalMetaSchemas: js.UndefOr[js.Array[js.Object]] = js.native
  
  var autocomplete: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var customFormats: js.UndefOr[StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])]] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var enctype: js.UndefOr[String] = js.native
  
  var fields: js.UndefOr[StringDictionary[Field]] = js.native
  
  var formContext: js.UndefOr[js.Any] = js.native
  
  var formData: js.UndefOr[T] = js.native
  
  // HTML Attributes
  var id: js.UndefOr[String] = js.native
  
  var idPrefix: js.UndefOr[String] = js.native
  
  var liveOmit: js.UndefOr[Boolean] = js.native
  
  var liveValidate: js.UndefOr[Boolean] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var noHtml5Validate: js.UndefOr[Boolean] = js.native
  
  var noValidate: js.UndefOr[Boolean] = js.native
  
  var omitExtraData: js.UndefOr[Boolean] = js.native
  
  var onBlur: js.UndefOr[
    js.Function2[/* id */ String, /* value */ Boolean | Double | String | Null, Unit]
  ] = js.native
  
  var onChange: js.UndefOr[js.Function2[/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema], _]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var onFocus: js.UndefOr[
    js.Function2[/* id */ String, /* value */ Boolean | Double | String | Null, Unit]
  ] = js.native
  
  var onSubmit: js.UndefOr[js.Function1[/* e */ ISubmitEvent[T], _]] = js.native
  
  var safeRenderCompletion: js.UndefOr[Boolean] = js.native
  
  var schema: JSONSchema6 = js.native
  
  var showErrorList: js.UndefOr[Boolean] = js.native
  
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any
  ] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]] = js.native
  
  var uiSchema: js.UndefOr[UiSchema] = js.native
  
  var validate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]] = js.native
  
  var widgets: js.UndefOr[StringDictionary[Widget]] = js.native
}
object FormProps {
  
  @scala.inline
  def apply[T](schema: JSONSchema6): FormProps[T] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps[T]]
  }
  
  @scala.inline
  implicit class FormPropsMutableBuilder[Self <: FormProps[_], T] (val x: Self with FormProps[T]) extends AnyVal {
    
    @scala.inline
    def setAcceptcharset(value: String): Self = StObject.set(x, "acceptcharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptcharsetUndefined: Self = StObject.set(x, "acceptcharset", js.undefined)
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAdditionalMetaSchemas(value: js.Array[js.Object]): Self = StObject.set(x, "additionalMetaSchemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalMetaSchemasUndefined: Self = StObject.set(x, "additionalMetaSchemas", js.undefined)
    
    @scala.inline
    def setAdditionalMetaSchemasVarargs(value: js.Object*): Self = StObject.set(x, "additionalMetaSchemas", js.Array(value :_*))
    
    @scala.inline
    def setArrayFieldTemplate(value: StatelessComponent[ArrayFieldTemplateProps[_]]): Self = StObject.set(x, "ArrayFieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayFieldTemplateUndefined: Self = StObject.set(x, "ArrayFieldTemplate", js.undefined)
    
    @scala.inline
    def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCustomFormats(value: StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])]): Self = StObject.set(x, "customFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFormatsUndefined: Self = StObject.set(x, "customFormats", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEnctype(value: String): Self = StObject.set(x, "enctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnctypeUndefined: Self = StObject.set(x, "enctype", js.undefined)
    
    @scala.inline
    def setErrorList(value: StatelessComponent[ErrorListProps]): Self = StObject.set(x, "ErrorList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorListUndefined: Self = StObject.set(x, "ErrorList", js.undefined)
    
    @scala.inline
    def setFieldTemplate(value: StatelessComponent[FieldTemplateProps]): Self = StObject.set(x, "FieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTemplateUndefined: Self = StObject.set(x, "FieldTemplate", js.undefined)
    
    @scala.inline
    def setFields(value: StringDictionary[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFormContext(value: js.Any): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormContextUndefined: Self = StObject.set(x, "formContext", js.undefined)
    
    @scala.inline
    def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLiveOmit(value: Boolean): Self = StObject.set(x, "liveOmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveOmitUndefined: Self = StObject.set(x, "liveOmit", js.undefined)
    
    @scala.inline
    def setLiveValidate(value: Boolean): Self = StObject.set(x, "liveValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveValidateUndefined: Self = StObject.set(x, "liveValidate", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNoHtml5Validate(value: Boolean): Self = StObject.set(x, "noHtml5Validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoHtml5ValidateUndefined: Self = StObject.set(x, "noHtml5Validate", js.undefined)
    
    @scala.inline
    def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
    
    @scala.inline
    def setObjectFieldTemplate(value: StatelessComponent[ObjectFieldTemplateProps[_]]): Self = StObject.set(x, "ObjectFieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFieldTemplateUndefined: Self = StObject.set(x, "ObjectFieldTemplate", js.undefined)
    
    @scala.inline
    def setOmitExtraData(value: Boolean): Self = StObject.set(x, "omitExtraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmitExtraDataUndefined: Self = StObject.set(x, "omitExtraData", js.undefined)
    
    @scala.inline
    def setOnBlur(value: (/* id */ String, /* value */ Boolean | Double | String | Null) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema]) => _): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnError(value: /* e */ js.Any => _): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: (/* id */ String, /* value */ Boolean | Double | String | Null) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: /* e */ ISubmitEvent[T] => _): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    @scala.inline
    def setSafeRenderCompletion(value: Boolean): Self = StObject.set(x, "safeRenderCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeRenderCompletionUndefined: Self = StObject.set(x, "safeRenderCompletion", js.undefined)
    
    @scala.inline
    def setSchema(value: JSONSchema6): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowErrorList(value: Boolean): Self = StObject.set(x, "showErrorList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowErrorListUndefined: Self = StObject.set(x, "showErrorList", js.undefined)
    
    @scala.inline
    def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTransformErrors(value: /* errors */ js.Array[AjvError] => js.Array[AjvError]): Self = StObject.set(x, "transformErrors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformErrorsUndefined: Self = StObject.set(x, "transformErrors", js.undefined)
    
    @scala.inline
    def setUiSchema(value: UiSchema): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
    
    @scala.inline
    def setValidate(value: (/* formData */ T, /* errors */ FormValidation) => FormValidation): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    @scala.inline
    def setWidgets(value: StringDictionary[Widget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
  }
}
