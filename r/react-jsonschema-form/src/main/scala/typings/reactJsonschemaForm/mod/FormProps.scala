package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormProps[T] extends StObject {
  
  var ArrayFieldTemplate: js.UndefOr[FunctionComponent[ArrayFieldTemplateProps[Any]]] = js.undefined
  
  /** A React component used to customize how form errors are displayed */
  var ErrorList: js.UndefOr[FunctionComponent[ErrorListProps]] = js.undefined
  
  var FieldTemplate: js.UndefOr[FunctionComponent[FieldTemplateProps]] = js.undefined
  
  var ObjectFieldTemplate: js.UndefOr[FunctionComponent[ObjectFieldTemplateProps[Any]]] = js.undefined
  
  /** The value that will be passed to `accept-charset` HTML attribute of form  */
  var acceptcharset: js.UndefOr[String] = js.undefined
  
  /** The value that will be passed to `action` HTML attribute of form  */
  var action: js.UndefOr[String] = js.undefined
  
  /** Allows you to validate formdata against another JSON Schema meta schema */
  var additionalMetaSchemas: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  /** The value that will be passed to `autocomplete ` HTML attribute of form */
  var autoComplete: js.UndefOr[String] = js.undefined
  
  /** @deprecated Same functionality as autoComplete */
  var autocomplete: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /** The value that will be passed to `class` HTML attribute of form  */
  var className: js.UndefOr[String] = js.undefined
  
  /** Allows you to define custom formats for validation */
  var customFormats: js.UndefOr[
    StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
  ] = js.undefined
  
  /** If true, disabled prop is passed down to each field on the form */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** The value that will be passed to `enctype` HTML attribute of form  */
  var enctype: js.UndefOr[String] = js.undefined
  
  /** Dictionary of registered fields */
  var fields: js.UndefOr[StringDictionary[Field]] = js.undefined
  
  /** Data that is passed down to all fields and widgets. Used for implementing context aware fields and widgets */
  var formContext: js.UndefOr[Any] = js.undefined
  
  /** Data to pass into form mathcing the schema */
  var formData: js.UndefOr[T] = js.undefined
  
  // HTML Attributes
  /** The value that will be passed to `id` HTML attribute of form  */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Used to change prefix of ids to avoid collision with existing ids in DOM
    * @default 'root'
    */
  var idPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * If `omitExtraData` and `liveOmit` are both set to true, then extra form data values that are not in any form field will be removed whenever `onChange` is called.
    * @default false
    */
  var liveOmit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, will perform validation as data is changed rather than just on submit
    * @default false
    */
  var liveValidate: js.UndefOr[Boolean] = js.undefined
  
  /** The value that will be passed to `method` HTML attribute of form  */
  var method: js.UndefOr[String] = js.undefined
  
  /** The value that will be passed to `name` HTML attribute of form  */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, turns off HTML5 validation
    * @default false
    */
  var noHtml5Validate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, turns off all validation
    * @default false
    */
  var noValidate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, extra form data values not in form field will be removed when `onSubmit` is called
    * @default false
    */
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
  
  /** Form schema */
  var schema: JSONSchema6
  
  /** When true, a list of errors will show. When false, only inline input validation errors will show */
  var showErrorList: js.UndefOr[Boolean] = js.undefined
  
  /** Used to change the default `form` tag into a different HTML tag */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178, starting with typings.reactJsonschemaForm.reactJsonschemaFormStrings.a, typings.reactJsonschemaForm.reactJsonschemaFormStrings.abbr, typings.reactJsonschemaForm.reactJsonschemaFormStrings.address */ Any
  ] = js.undefined
  
  /** The value that will be passed to `target` HTML attribute of form  */
  var target: js.UndefOr[String] = js.undefined
  
  /** Function that modifies default errors from JSCON Schema Validation */
  var transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]] = js.undefined
  
  /** Form uiSchema */
  var uiSchema: js.UndefOr[UiSchema] = js.undefined
  
  /** Function that specifices custom validation rules for the form */
  var validate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]] = js.undefined
  
  /** Directory of registered widgets */
  var widgets: js.UndefOr[StringDictionary[Widget]] = js.undefined
}
object FormProps {
  
  inline def apply[T](schema: JSONSchema6): FormProps[T] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormProps[?], T] (val x: Self & FormProps[T]) extends AnyVal {
    
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
    
    inline def setSchema(value: JSONSchema6): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
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
