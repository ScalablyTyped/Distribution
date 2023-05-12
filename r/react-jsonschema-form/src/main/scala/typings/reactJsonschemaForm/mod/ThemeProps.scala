package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-jsonschema-form.react-jsonschema-form.FormProps<T>, 'schema'> */
trait ThemeProps[T] extends StObject {
  
  var ArrayFieldTemplate: js.UndefOr[FunctionComponent[ArrayFieldTemplateProps[Any]]] = js.undefined
  
  var ErrorList: js.UndefOr[FunctionComponent[ErrorListProps]] = js.undefined
  
  var FieldTemplate: js.UndefOr[FunctionComponent[FieldTemplateProps]] = js.undefined
  
  var ObjectFieldTemplate: js.UndefOr[FunctionComponent[ObjectFieldTemplateProps[Any]]] = js.undefined
  
  var acceptcharset: js.UndefOr[String] = js.undefined
  
  var action: js.UndefOr[String] = js.undefined
  
  var additionalMetaSchemas: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var autoComplete: js.UndefOr[String] = js.undefined
  
  var autocomplete: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var customFormats: js.UndefOr[
    StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
  ] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var enctype: js.UndefOr[String] = js.undefined
  
  var fields: js.UndefOr[StringDictionary[Field]] = js.undefined
  
  var formContext: js.UndefOr[Any] = js.undefined
  
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
  
  var onChange: js.UndefOr[js.Function2[/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema], Any]] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var onFocus: js.UndefOr[
    js.Function2[/* id */ String, /* value */ Boolean | Double | String | Null, Unit]
  ] = js.undefined
  
  var onSubmit: js.UndefOr[js.Function1[/* e */ ISubmitEvent[T], Any]] = js.undefined
  
  var safeRenderCompletion: js.UndefOr[Boolean] = js.undefined
  
  var showErrorList: js.UndefOr[Boolean] = js.undefined
  
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178, starting with typings.reactJsonschemaForm.reactJsonschemaFormStrings.a, typings.reactJsonschemaForm.reactJsonschemaFormStrings.abbr, typings.reactJsonschemaForm.reactJsonschemaFormStrings.address */ Any
  ] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]] = js.undefined
  
  var uiSchema: js.UndefOr[UiSchema] = js.undefined
  
  var validate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]] = js.undefined
  
  var widgets: js.UndefOr[StringDictionary[Widget]] = js.undefined
}
object ThemeProps {
  
  inline def apply[T](): ThemeProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeProps[?], T] (val x: Self & ThemeProps[T]) extends AnyVal {
    
    inline def setAcceptcharset(value: String): Self = StObject.set(x, "acceptcharset", value.asInstanceOf[js.Any])
    
    inline def setAcceptcharsetUndefined: Self = StObject.set(x, "acceptcharset", js.undefined)
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAdditionalMetaSchemas(value: js.Array[js.Object]): Self = StObject.set(x, "additionalMetaSchemas", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMetaSchemasUndefined: Self = StObject.set(x, "additionalMetaSchemas", js.undefined)
    
    inline def setAdditionalMetaSchemasVarargs(value: js.Object*): Self = StObject.set(x, "additionalMetaSchemas", js.Array(value*))
    
    inline def setArrayFieldTemplate(value: FunctionComponent[ArrayFieldTemplateProps[Any]]): Self = StObject.set(x, "ArrayFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setArrayFieldTemplateUndefined: Self = StObject.set(x, "ArrayFieldTemplate", js.undefined)
    
    inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCustomFormats(value: StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]): Self = StObject.set(x, "customFormats", value.asInstanceOf[js.Any])
    
    inline def setCustomFormatsUndefined: Self = StObject.set(x, "customFormats", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnctype(value: String): Self = StObject.set(x, "enctype", value.asInstanceOf[js.Any])
    
    inline def setEnctypeUndefined: Self = StObject.set(x, "enctype", js.undefined)
    
    inline def setErrorList(value: FunctionComponent[ErrorListProps]): Self = StObject.set(x, "ErrorList", value.asInstanceOf[js.Any])
    
    inline def setErrorListUndefined: Self = StObject.set(x, "ErrorList", js.undefined)
    
    inline def setFieldTemplate(value: FunctionComponent[FieldTemplateProps]): Self = StObject.set(x, "FieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldTemplateUndefined: Self = StObject.set(x, "FieldTemplate", js.undefined)
    
    inline def setFields(value: StringDictionary[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFormContext(value: Any): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
    
    inline def setFormContextUndefined: Self = StObject.set(x, "formContext", js.undefined)
    
    inline def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
    
    inline def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLiveOmit(value: Boolean): Self = StObject.set(x, "liveOmit", value.asInstanceOf[js.Any])
    
    inline def setLiveOmitUndefined: Self = StObject.set(x, "liveOmit", js.undefined)
    
    inline def setLiveValidate(value: Boolean): Self = StObject.set(x, "liveValidate", value.asInstanceOf[js.Any])
    
    inline def setLiveValidateUndefined: Self = StObject.set(x, "liveValidate", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoHtml5Validate(value: Boolean): Self = StObject.set(x, "noHtml5Validate", value.asInstanceOf[js.Any])
    
    inline def setNoHtml5ValidateUndefined: Self = StObject.set(x, "noHtml5Validate", js.undefined)
    
    inline def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
    
    inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
    
    inline def setObjectFieldTemplate(value: FunctionComponent[ObjectFieldTemplateProps[Any]]): Self = StObject.set(x, "ObjectFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setObjectFieldTemplateUndefined: Self = StObject.set(x, "ObjectFieldTemplate", js.undefined)
    
    inline def setOmitExtraData(value: Boolean): Self = StObject.set(x, "omitExtraData", value.asInstanceOf[js.Any])
    
    inline def setOmitExtraDataUndefined: Self = StObject.set(x, "omitExtraData", js.undefined)
    
    inline def setOnBlur(value: (/* id */ String, /* value */ Boolean | Double | String | Null) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: (/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema]) => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnError(value: /* e */ Any => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(value: (/* id */ String, /* value */ Boolean | Double | String | Null) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnSubmit(value: /* e */ ISubmitEvent[T] => Any): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setSafeRenderCompletion(value: Boolean): Self = StObject.set(x, "safeRenderCompletion", value.asInstanceOf[js.Any])
    
    inline def setSafeRenderCompletionUndefined: Self = StObject.set(x, "safeRenderCompletion", js.undefined)
    
    inline def setShowErrorList(value: Boolean): Self = StObject.set(x, "showErrorList", value.asInstanceOf[js.Any])
    
    inline def setShowErrorListUndefined: Self = StObject.set(x, "showErrorList", js.undefined)
    
    inline def setTagName(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178, starting with typings.reactJsonschemaForm.reactJsonschemaFormStrings.a, typings.reactJsonschemaForm.reactJsonschemaFormStrings.abbr, typings.reactJsonschemaForm.reactJsonschemaFormStrings.address */ Any
    ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTransformErrors(value: /* errors */ js.Array[AjvError] => js.Array[AjvError]): Self = StObject.set(x, "transformErrors", js.Any.fromFunction1(value))
    
    inline def setTransformErrorsUndefined: Self = StObject.set(x, "transformErrors", js.undefined)
    
    inline def setUiSchema(value: UiSchema): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
    
    inline def setValidate(value: (/* formData */ T, /* errors */ FormValidation) => FormValidation): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setWidgets(value: StringDictionary[Widget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
  }
}
