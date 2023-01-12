package typings.rjsfCore

import typings.jsonSchema.mod.JSONSchema7
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.FormEvent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.rjsfCore.rjsfCoreStrings.ButtonTemplates
import typings.rjsfCore.rjsfCoreStrings.schemaUtils
import typings.rjsfCore.rjsfCoreStrings.submitted
import typings.rjsfUtils.mod.CustomValidator
import typings.rjsfUtils.mod.ErrorSchema
import typings.rjsfUtils.mod.ErrorTransformer
import typings.rjsfUtils.mod.FormValidation
import typings.rjsfUtils.mod.IdSchema
import typings.rjsfUtils.mod.PathSchema
import typings.rjsfUtils.mod.RJSFSchema
import typings.rjsfUtils.mod.RJSFValidationError
import typings.rjsfUtils.mod.Registry
import typings.rjsfUtils.mod.RegistryFieldsType
import typings.rjsfUtils.mod.RegistryWidgetsType
import typings.rjsfUtils.mod.SchemaUtilsType
import typings.rjsfUtils.mod.TemplatesType
import typings.rjsfUtils.mod.UiSchema
import typings.rjsfUtils.mod.ValidationData
import typings.rjsfUtils.mod.ValidatorType
import typings.std.Omit
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rjsf/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** The `Form` component renders the outer form and all the fields defined in the `schema` */
  @JSImport("@rjsf/core", JSImport.Default)
  @js.native
  open class default[T, F] protected () extends Form[T, F] {
    /** Constructs the `Form` from the `props`. Will setup the initial state from the props. It will also call the
      * `onChange` handler if the initially provided `formData` is modified to add missing default values as part of the
      * state construction.
      *
      * @param props - The initial props for the `Form`
      */
    def this(props: FormProps[T, F]) = this()
  }
  
  /** The default registry consists of all the fields, templates and widgets provided in the core implementation,
    * plus an empty `rootSchema` and `formContext. We omit schemaUtils here because it cannot be defaulted without a
    * rootSchema and validator. It will be added into the computed registry later in the Form.
    */
  inline def getDefaultRegistry[T, F](): Omit[Registry[T, F], schemaUtils] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRegistry")().asInstanceOf[Omit[Registry[T, F], schemaUtils]]
  
  /** A Higher-Order component that creates a wrapper around a `Form` with the overrides from the `WithThemeProps` */
  inline def withTheme[T, F](themeProps: ThemeProps[T, F]): ForwardRefExoticComponent[(FormProps[T, F]) & (RefAttributes[Form[T, F]])] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(themeProps.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[(FormProps[T, F]) & (RefAttributes[Form[T, F]])]]
  
  /** The `Form` component renders the outer form and all the fields defined in the `schema` */
  @js.native
  trait Form[T, F] extends Component[FormProps[T, F], FormState[T, F], Any] {
    
    /** React lifecycle method that gets called before new props are provided, updates the state based on new props. It
      * will also call the`onChange` handler if the `formData` is modified to add missing default values as part of the
      * state construction.
      *
      * @param nextProps - The new set of props about to be applied to the `Form`
      */
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MForm(nextProps: FormProps[T, F]): Unit = js.native
    
    /** The ref used to hold the `form` element, this needs to be `any` because `tagName` or `_internalFormWrapper` can
      * provide any possible type here
      */
    var formElement: RefObject[Any] = js.native
    
    /** Returns the list of field names from inspecting the `pathSchema` as well as using the `formData`
      *
      * @param pathSchema - The `PathSchema` object for the form
      * @param formData - The form data to use while checking for empty objects/arrays
      */
    def getFieldNames(pathSchema: PathSchema[T], formData: T): js.Array[String] = js.native
    
    /** Returns the registry for the form */
    def getRegistry(): Registry[T, F] = js.native
    
    /** Extracts the updated state from the given `props` and `inputFormData`. As part of this process, the
      * `inputFormData` is first processed to add any missing required defaults. After that, the data is run through the
      * validation process IF required by the `props`.
      *
      * @param props - The props passed to the `Form`
      * @param inputFormData - The new or current data for the `Form`
      * @returns - The new state for the `Form`
      */
    def getStateFromProps(props: FormProps[T, F]): FormState[T, F] = js.native
    def getStateFromProps(props: FormProps[T, F], inputFormData: T): FormState[T, F] = js.native
    
    /** Returns the `formData` with only the elements specified in the `fields` list
      *
      * @param formData - The data for the `Form`
      * @param fields - The fields to keep while filtering
      */
    def getUsedFormData(formData: T, fields: js.Array[String]): T = js.native
    
    /** Callback function to handle when a field on the form is blurred. Calls the `onBlur` callback for the `Form` if it
      * was provided.
      *
      * @param id - The unique `id` of the field that was blurred
      * @param data - The data associated with the field that was blurred
      */
    def onBlur(id: String, data: Any): Unit = js.native
    
    /** Function to handle changes made to a field in the `Form`. This handler receives an entirely new copy of the
      * `formData` along with a new `ErrorSchema`. It will first update the `formData` with any missing default fields and
      * then, if `omitExtraData` and `liveOmit` are turned on, the `formData` will be filterer to remove any extra data not
      * in a form field. Then, the resulting formData will be validated if required. The state will be updated with the new
      * updated (potentially filtered) `formData`, any errors that resulted from validation. Finally the `onChange`
      * callback will be called if specified with the updated state.
      *
      * @param formData - The new form data from a change to a field
      * @param newErrorSchema - The new `ErrorSchema` based on the field change
      * @param id - The id of the field that caused the change
      */
    def onChange(formData: T): Unit = js.native
    def onChange(formData: T, newErrorSchema: Unit, id: String): Unit = js.native
    def onChange(formData: T, newErrorSchema: ErrorSchema[T]): Unit = js.native
    def onChange(formData: T, newErrorSchema: ErrorSchema[T], id: String): Unit = js.native
    
    /** Callback function to handle when a field on the form is focused. Calls the `onFocus` callback for the `Form` if it
      * was provided.
      *
      * @param id - The unique `id` of the field that was focused
      * @param data - The data associated with the field that was focused
      */
    def onFocus(id: String, data: Any): Unit = js.native
    
    /** Callback function to handle when the form is submitted. First, it prevents the default event behavior. Nothing
      * happens if the target and currentTarget of the event are not the same. It will omit any extra data in the
      * `formData` in the state if `omitExtraData` is true. It will validate the resulting `formData`, reporting errors
      * via the `onError()` callback unless validation is disabled. Finally it will add in any `extraErrors` and then call
      * back the `onSubmit` callback if it was provided.
      *
      * @param event - The submit HTML form event
      */
    def onSubmit(event: FormEvent[Any]): Unit = js.native
    
    /** Renders any errors contained in the `state` in using the `ErrorList`, if not disabled by `showErrorList`. */
    def renderErrors(registry: Registry[T, F]): Element | Null = js.native
    
    /** React lifecycle method that is used to determine whether component should be updated.
      *
      * @param nextProps - The next version of the props
      * @param nextState - The next version of the state
      * @returns - True if the component should be updated, false otherwise
      */
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MForm(nextProps: FormProps[T, F], nextState: FormState[T, F]): Boolean = js.native
    
    /** Provides a function that can be used to programmatically submit the `Form` */
    def submit(): Unit = js.native
    
    /** Validates the `formData` against the `schema` using the `altSchemaUtils` (if provided otherwise it uses the
      * `schemaUtils` in the state), returning the results.
      *
      * @param formData - The new form data to validate
      * @param schema - The schema used to validate against
      * @param altSchemaUtils - The alternate schemaUtils to use for validation
      */
    def validate(formData: T): ValidationData[T] = js.native
    def validate(formData: T, schema: Unit, altSchemaUtils: SchemaUtilsType[T]): ValidationData[T] = js.native
    def validate(formData: T, schema: JSONSchema7): ValidationData[T] = js.native
    def validate(formData: T, schema: JSONSchema7, altSchemaUtils: SchemaUtilsType[T]): ValidationData[T] = js.native
    
    /** Programmatically validate the form. If `onError` is provided, then it will be called with the list of errors the
      * same way as would happen on form submission.
      *
      * @returns - True if the form is valid, false otherwise.
      */
    def validateForm(): Boolean = js.native
  }
  
  /** The properties that are passed to the `Form` */
  trait FormProps[T, F] extends StObject {
    
    /**
      * _internalFormWrapper is currently used by the semantic-ui theme to provide a custom wrapper around `<Form />`
      * that supports the proper rendering of those themes. To use this prop, one must pass a component that takes two
      * props: `children` and `as`. That component, at minimum, should render the `children` inside of a <form /> tag
      * unless `as` is provided, in which case, use the `as` prop in place of `<form />`.
      * i.e.:
      * ```
      * export default function InternalForm({ children, as }) {
      *   const FormTag = as || 'form';
      *   return <FormTag>{children}</FormTag>;
      * }
      * ```
      *
      * Use at your own risk as this prop is private and may change at any time without notice.
      */
    var _internalFormWrapper: js.UndefOr[ElementType[Any]] = js.undefined
    
    /** The value of this prop will be passed to the `accept-charset` HTML attribute on the form */
    var acceptcharset: js.UndefOr[String] = js.undefined
    
    /** The value of this prop will be passed to the `action` HTML attribute on the form
      *
      * NOTE: this just renders the `action` attribute in the HTML markup. There is no real network request being sent to
      * this `action` on submit. Instead, react-jsonschema-form catches the submit event with `event.preventDefault()`
      * and then calls the `onSubmit` function, where you could send a request programmatically with `fetch` or similar.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** The value of this prop will be passed to the `autocomplete` HTML attribute on the form */
    var autoComplete: js.UndefOr[String] = js.undefined
    
    /** The optional children for the form, if provided, it will replace the default `SubmitButton` */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** The value of this prop will be passed to the `class` HTML attribute on the form */
    var className: js.UndefOr[String] = js.undefined
    
    /** Formerly the `validate` prop; Takes a function that specifies custom validation rules for the form */
    var customValidate: js.UndefOr[CustomValidator[T]] = js.undefined
    
    /** It's possible to disable the whole form by setting the `disabled` prop. The `disabled` prop is then forwarded down
      * to each field of the form. If you just want to disable some fields, see the `ui:disabled` parameter in `uiSchema`
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** The value of this prop will be passed to the `enctype` HTML attribute on the form */
    var enctype: js.UndefOr[String] = js.undefined
    
    /** This prop allows passing in custom errors that are augmented with the existing JSON Schema errors on the form; it
      * can be used to implement asynchronous validation
      */
    var extraErrors: js.UndefOr[ErrorSchema[T]] = js.undefined
    
    /** The dictionary of registered fields in the form */
    var fields: js.UndefOr[RegistryFieldsType[T, F]] = js.undefined
    
    /** You can provide a `formContext` object to the form, which is passed down to all fields and widgets. Useful for
      * implementing context aware fields and widgets.
      *
      * NOTE: Setting `{readonlyAsDisabled: false}` on the formContext will make the antd theme treat readOnly fields as
      * disabled.
      */
    var formContext: js.UndefOr[F] = js.undefined
    
    /** The data for the form, used to prefill a form with existing data */
    var formData: js.UndefOr[T] = js.undefined
    
    /** The value of this prop will be passed to the `id` HTML attribute on the form */
    var id: js.UndefOr[String] = js.undefined
    
    /** To avoid collisions with existing ids in the DOM, it is possible to change the prefix used for ids;
      * Default is `root`
      */
    var idPrefix: js.UndefOr[String] = js.undefined
    
    /** To avoid using a path separator that is present in field names, it is possible to change the separator used for
      * ids (Default is `_`)
      */
    var idSeparator: js.UndefOr[String] = js.undefined
    
    /** If `omitExtraData` and `liveOmit` are both set to true, then extra form data values that are not in any form field
      * will be removed whenever `onChange` is called. Set to `false` by default
      */
    var liveOmit: js.UndefOr[Boolean] = js.undefined
    
    /** If set to true, the form will perform validation and show any validation errors whenever the form data is changed,
      * rather than just on submit
      */
    var liveValidate: js.UndefOr[Boolean] = js.undefined
    
    /** The value of this prop will be passed to the `method` HTML attribute on the form */
    var method: js.UndefOr[String] = js.undefined
    
    /** The value of this prop will be passed to the `name` HTML attribute on the form */
    var name: js.UndefOr[String] = js.undefined
    
    /** If set to true, turns off HTML5 validation on the form; Set to `false` by default */
    var noHtml5Validate: js.UndefOr[Boolean] = js.undefined
    
    /** If set to true, turns off all validation. Set to `false` by default
      *
      * @deprecated - In a future release, this switch may be replaced by making `validator` prop optional
      */
    var noValidate: js.UndefOr[Boolean] = js.undefined
    
    /** If set to true, then extra form data values that are not in any form field will be removed whenever `onSubmit` is
      * called. Set to `false` by default.
      */
    var omitExtraData: js.UndefOr[Boolean] = js.undefined
    
    /** Sometimes you may want to trigger events or modify external state when a field has been touched, so you can pass
      * an `onBlur` handler, which will receive the id of the input that was blurred and the field value
      */
    var onBlur: js.UndefOr[js.Function2[/* id */ String, /* data */ Any, Unit]] = js.undefined
    
    /** If you plan on being notified every time the form data are updated, you can pass an `onChange` handler, which will
      * receive the same args as `onSubmit` any time a value is updated in the form. Can also return the `id` of the field
      * that caused the change
      */
    var onChange: js.UndefOr[js.Function2[/* data */ IChangeEvent[T, F], /* id */ js.UndefOr[String], Unit]] = js.undefined
    
    /** To react when submitted form data are invalid, pass an `onError` handler. It will be passed the list of
      * encountered errors
      */
    var onError: js.UndefOr[js.Function1[/* errors */ js.Array[RJSFValidationError], Unit]] = js.undefined
    
    /** Sometimes you may want to trigger events or modify external state when a field has been focused, so you can pass
      * an `onFocus` handler, which will receive the id of the input that is focused and the field value
      */
    var onFocus: js.UndefOr[js.Function2[/* id */ String, /* data */ Any, Unit]] = js.undefined
    
    /** You can pass a function as the `onSubmit` prop of your `Form` component to listen to when the form is submitted
      * and its data are valid. It will be passed a result object having a `formData` attribute, which is the valid form
      * data you're usually after. The original event will also be passed as a second parameter
      */
    var onSubmit: js.UndefOr[js.Function2[/* data */ IChangeEvent[T, F], /* event */ FormEvent[Any], Unit]] = js.undefined
    
    /** It's possible to make the whole form read-only by setting the `readonly` prop. The `readonly` prop is then
      * forwarded down to each field of the form. If you just want to make some fields read-only, see the `ui:readonly`
      * parameter in `uiSchema`
      */
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    /** The JSON schema object for the form */
    var schema: RJSFSchema
    
    /** When this prop is set to true, a list of errors (or the custom error list defined in the `ErrorList`) will also
      * show. When set to false, only inline input validation errors will be shown. Set to `true` by default
      */
    var showErrorList: js.UndefOr[Boolean] = js.undefined
    
    /** It's possible to change the default `form` tag name to a different HTML tag, which can be helpful if you are
      * nesting forms. However, native browser form behaviour, such as submitting when the `Enter` key is pressed, may no
      * longer work
      */
    var tagName: js.UndefOr[ElementType[Any]] = js.undefined
    
    /** The value of this prop will be passed to the `target` HTML attribute on the form */
    var target: js.UndefOr[String] = js.undefined
    
    /** The dictionary of registered templates in the form; Partial allows a subset to be provided beyond the defaults */
    var templates: js.UndefOr[
        (Partial[Omit[TemplatesType[T, F], ButtonTemplates]]) & (typings.rjsfCore.anon.ButtonTemplates[T, F])
      ] = js.undefined
    
    /** A function can be passed to this prop in order to make modifications to the default errors resulting from JSON
      * Schema validation
      */
    var transformErrors: js.UndefOr[ErrorTransformer] = js.undefined
    
    /** The uiSchema for the form */
    var uiSchema: js.UndefOr[UiSchema[T, F]] = js.undefined
    
    /** An implementation of the `ValidatorType` interface that is needed for form validation to work */
    var validator: ValidatorType[T]
    
    /** The dictionary of registered widgets in the form */
    var widgets: js.UndefOr[RegistryWidgetsType[T, F]] = js.undefined
  }
  object FormProps {
    
    inline def apply[T, F](schema: RJSFSchema, validator: ValidatorType[T]): FormProps[T, F] = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormProps[T, F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormProps[?, ?], T, F] (val x: Self & (FormProps[T, F])) extends AnyVal {
      
      inline def setAcceptcharset(value: String): Self = StObject.set(x, "acceptcharset", value.asInstanceOf[js.Any])
      
      inline def setAcceptcharsetUndefined: Self = StObject.set(x, "acceptcharset", js.undefined)
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCustomValidate(value: (T, /* errors */ FormValidation[T]) => FormValidation[T]): Self = StObject.set(x, "customValidate", js.Any.fromFunction2(value))
      
      inline def setCustomValidateUndefined: Self = StObject.set(x, "customValidate", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEnctype(value: String): Self = StObject.set(x, "enctype", value.asInstanceOf[js.Any])
      
      inline def setEnctypeUndefined: Self = StObject.set(x, "enctype", js.undefined)
      
      inline def setExtraErrors(value: ErrorSchema[T]): Self = StObject.set(x, "extraErrors", value.asInstanceOf[js.Any])
      
      inline def setExtraErrorsUndefined: Self = StObject.set(x, "extraErrors", js.undefined)
      
      inline def setFields(value: RegistryFieldsType[T, F]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFormContext(value: F): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
      
      inline def setFormContextUndefined: Self = StObject.set(x, "formContext", js.undefined)
      
      inline def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
      
      inline def setIdSeparator(value: String): Self = StObject.set(x, "idSeparator", value.asInstanceOf[js.Any])
      
      inline def setIdSeparatorUndefined: Self = StObject.set(x, "idSeparator", js.undefined)
      
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
      
      inline def setOmitExtraData(value: Boolean): Self = StObject.set(x, "omitExtraData", value.asInstanceOf[js.Any])
      
      inline def setOmitExtraDataUndefined: Self = StObject.set(x, "omitExtraData", js.undefined)
      
      inline def setOnBlur(value: (/* id */ String, /* data */ Any) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: (/* data */ IChangeEvent[T, F], /* id */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnError(value: /* errors */ js.Array[RJSFValidationError] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: (/* id */ String, /* data */ Any) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnSubmit(value: (/* data */ IChangeEvent[T, F], /* event */ FormEvent[Any]) => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction2(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setSchema(value: RJSFSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setShowErrorList(value: Boolean): Self = StObject.set(x, "showErrorList", value.asInstanceOf[js.Any])
      
      inline def setShowErrorListUndefined: Self = StObject.set(x, "showErrorList", js.undefined)
      
      inline def setTagName(value: ElementType[Any]): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTemplates(
        value: (Partial[Omit[TemplatesType[T, F], ButtonTemplates]]) & (typings.rjsfCore.anon.ButtonTemplates[T, F])
      ): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
      
      inline def setTransformErrors(value: /* errors */ js.Array[RJSFValidationError] => js.Array[RJSFValidationError]): Self = StObject.set(x, "transformErrors", js.Any.fromFunction1(value))
      
      inline def setTransformErrorsUndefined: Self = StObject.set(x, "transformErrors", js.undefined)
      
      inline def setUiSchema(value: UiSchema[T, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
      
      inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
      
      inline def setValidator(value: ValidatorType[T]): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      inline def setWidgets(value: RegistryWidgetsType[T, F]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
      
      inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
      
      inline def set_internalFormWrapper(value: ElementType[Any]): Self = StObject.set(x, "_internalFormWrapper", value.asInstanceOf[js.Any])
      
      inline def set_internalFormWrapperUndefined: Self = StObject.set(x, "_internalFormWrapper", js.undefined)
    }
  }
  
  /** The data that is contained within the state for the `Form` */
  trait FormState[T, F] extends StObject {
    
    /** Flag indicating whether the form is in edit mode, true when `formData` is passed to the form, otherwise false */
    var edit: Boolean
    
    /** The current errors, in `ErrorSchema` format, for the form, includes `extraErrors` */
    var errorSchema: ErrorSchema[T]
    
    /** The current list of errors for the form, includes `extraErrors` */
    var errors: js.Array[RJSFValidationError]
    
    /** The current data for the form, computed from the `formData` prop and the changes made by the user */
    var formData: T
    
    /** The `IdSchema` for the form, computed from the `schema`, the `rootFieldId`, the `formData` and the `idPrefix` and
      * `idSeparator` props.
      */
    var idSchema: IdSchema[T]
    
    /** The JSON schema object for the form */
    var schema: RJSFSchema
    
    /** The schemaUtils implementation used by the `Form`, created from the `validator` and the `schema` */
    var schemaUtils: SchemaUtilsType[T]
    
    /** The current errors, in `ErrorSchema` format, for the form directly from schema validation, does NOT include
      * `extraErrors`
      */
    var schemaValidationErrorSchema: ErrorSchema[T]
    
    /** The current list of errors for the form directly from schema validation, does NOT include `extraErrors` */
    var schemaValidationErrors: js.Array[RJSFValidationError]
    
    /** The uiSchema for the form */
    var uiSchema: UiSchema[T, F]
  }
  object FormState {
    
    inline def apply[T, F](
      edit: Boolean,
      errorSchema: ErrorSchema[T],
      errors: js.Array[RJSFValidationError],
      formData: T,
      idSchema: IdSchema[T],
      schema: RJSFSchema,
      schemaUtils: SchemaUtilsType[T],
      schemaValidationErrorSchema: ErrorSchema[T],
      schemaValidationErrors: js.Array[RJSFValidationError],
      uiSchema: UiSchema[T, F]
    ): FormState[T, F] = {
      val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaUtils = schemaUtils.asInstanceOf[js.Any], schemaValidationErrorSchema = schemaValidationErrorSchema.asInstanceOf[js.Any], schemaValidationErrors = schemaValidationErrors.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormState[T, F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormState[?, ?], T, F] (val x: Self & (FormState[T, F])) extends AnyVal {
      
      inline def setEdit(value: Boolean): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      inline def setErrorSchema(value: ErrorSchema[T]): Self = StObject.set(x, "errorSchema", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[RJSFValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: RJSFValidationError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setIdSchema(value: IdSchema[T]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: RJSFSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUtils(value: SchemaUtilsType[T]): Self = StObject.set(x, "schemaUtils", value.asInstanceOf[js.Any])
      
      inline def setSchemaValidationErrorSchema(value: ErrorSchema[T]): Self = StObject.set(x, "schemaValidationErrorSchema", value.asInstanceOf[js.Any])
      
      inline def setSchemaValidationErrors(value: js.Array[RJSFValidationError]): Self = StObject.set(x, "schemaValidationErrors", value.asInstanceOf[js.Any])
      
      inline def setSchemaValidationErrorsVarargs(value: RJSFValidationError*): Self = StObject.set(x, "schemaValidationErrors", js.Array(value*))
      
      inline def setUiSchema(value: UiSchema[T, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    }
  }
  
  /** The event data passed when changes have been made to the form, includes everything from the `FormState` except
    * the schema validation errors. An additional `status` is added when returned from `onSubmit`
    */
  /* Inlined parent std.Omit<@rjsf/core.@rjsf/core.FormState<T, F>, 'schemaValidationErrors' | 'schemaValidationErrorSchema'> */
  trait IChangeEvent[T, F] extends StObject {
    
    var edit: Boolean
    
    var errorSchema: ErrorSchema[T]
    
    var errors: js.Array[RJSFValidationError]
    
    var formData: T
    
    var idSchema: IdSchema[T]
    
    var schema: RJSFSchema
    
    var schemaUtils: SchemaUtilsType[T]
    
    /** The status of the form when submitted */
    var status: js.UndefOr[submitted] = js.undefined
    
    var uiSchema: UiSchema[T, F]
  }
  object IChangeEvent {
    
    inline def apply[T, F](
      edit: Boolean,
      errorSchema: ErrorSchema[T],
      errors: js.Array[RJSFValidationError],
      formData: T,
      idSchema: IdSchema[T],
      schema: RJSFSchema,
      schemaUtils: SchemaUtilsType[T],
      uiSchema: UiSchema[T, F]
    ): IChangeEvent[T, F] = {
      val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaUtils = schemaUtils.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChangeEvent[T, F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IChangeEvent[?, ?], T, F] (val x: Self & (IChangeEvent[T, F])) extends AnyVal {
      
      inline def setEdit(value: Boolean): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      inline def setErrorSchema(value: ErrorSchema[T]): Self = StObject.set(x, "errorSchema", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[RJSFValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: RJSFValidationError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setIdSchema(value: IdSchema[T]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: RJSFSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUtils(value: SchemaUtilsType[T]): Self = StObject.set(x, "schemaUtils", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: submitted): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUiSchema(value: UiSchema[T, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    }
  }
  
  /** The properties for the `withTheme` function, essentially a subset of properties from the `FormProps` that can be
    * overridden while creating a theme
    */
  /* Inlined std.Pick<@rjsf/core.@rjsf/core.FormProps<T, F>, 'fields' | 'templates' | 'widgets' | '_internalFormWrapper'> */
  trait ThemeProps[T, F] extends StObject {
    
    var _internalFormWrapper: js.UndefOr[ElementType[Any]] = js.undefined
    
    var fields: js.UndefOr[RegistryFieldsType[T, F]] = js.undefined
    
    var templates: js.UndefOr[
        (Partial[Omit[TemplatesType[T, F], ButtonTemplates]]) & (typings.rjsfCore.anon.ButtonTemplates[T, F])
      ] = js.undefined
    
    var widgets: js.UndefOr[RegistryWidgetsType[T, F]] = js.undefined
  }
  object ThemeProps {
    
    inline def apply[T, F](): ThemeProps[T, F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeProps[T, F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeProps[?, ?], T, F] (val x: Self & (ThemeProps[T, F])) extends AnyVal {
      
      inline def setFields(value: RegistryFieldsType[T, F]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setTemplates(
        value: (Partial[Omit[TemplatesType[T, F], ButtonTemplates]]) & (typings.rjsfCore.anon.ButtonTemplates[T, F])
      ): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
      
      inline def setWidgets(value: RegistryWidgetsType[T, F]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
      
      inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
      
      inline def set_internalFormWrapper(value: ElementType[Any]): Self = StObject.set(x, "_internalFormWrapper", value.asInstanceOf[js.Any])
      
      inline def set_internalFormWrapperUndefined: Self = StObject.set(x, "_internalFormWrapper", js.undefined)
    }
  }
}
