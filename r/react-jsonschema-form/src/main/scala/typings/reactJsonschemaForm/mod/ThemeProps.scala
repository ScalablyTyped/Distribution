package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.StatelessComponent
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-jsonschema-form.react-jsonschema-form.FormProps<T>, 'schema'> */
trait ThemeProps[T] extends StObject {
  
  var ArrayFieldTemplate: js.UndefOr[StatelessComponent[ArrayFieldTemplateProps[js.Any]]] = js.undefined
  
  var ErrorList: js.UndefOr[StatelessComponent[ErrorListProps]] = js.undefined
  
  var FieldTemplate: js.UndefOr[StatelessComponent[FieldTemplateProps]] = js.undefined
  
  var ObjectFieldTemplate: js.UndefOr[StatelessComponent[ObjectFieldTemplateProps[js.Any]]] = js.undefined
  
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
  
  var onChange: js.UndefOr[js.Function2[/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema], js.Any]] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var onFocus: js.UndefOr[
    js.Function2[/* id */ String, /* value */ Boolean | Double | String | Null, Unit]
  ] = js.undefined
  
  var onSubmit: js.UndefOr[js.Function1[/* e */ ISubmitEvent[T], js.Any]] = js.undefined
  
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
  def apply[T](): ThemeProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeProps[T]]
  }
  
  @scala.inline
  implicit class ThemePropsMutableBuilder[Self <: ThemeProps[?], T] (val x: Self & ThemeProps[T]) extends AnyVal {
    
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
    def setArrayFieldTemplate(value: StatelessComponent[ArrayFieldTemplateProps[js.Any]]): Self = StObject.set(x, "ArrayFieldTemplate", value.asInstanceOf[js.Any])
    
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
    def setObjectFieldTemplate(value: StatelessComponent[ObjectFieldTemplateProps[js.Any]]): Self = StObject.set(x, "ObjectFieldTemplate", value.asInstanceOf[js.Any])
    
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
    def setOnChange(value: (/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema]) => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnError(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: (/* id */ String, /* value */ Boolean | Double | String | Null) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: /* e */ ISubmitEvent[T] => js.Any): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    @scala.inline
    def setSafeRenderCompletion(value: Boolean): Self = StObject.set(x, "safeRenderCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeRenderCompletionUndefined: Self = StObject.set(x, "safeRenderCompletion", js.undefined)
    
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
