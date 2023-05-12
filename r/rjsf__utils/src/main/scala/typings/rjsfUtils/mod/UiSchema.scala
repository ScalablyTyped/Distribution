package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.StyleHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Type describing the well-known properties of the `UiSchema` while also supporting all user defined properties,
  * starting with `ui:`.
  */
/* Inlined @rjsf/utils.@rjsf/utils.GenericObjectType & @rjsf/utils.@rjsf/utils.MakeUIType<@rjsf/utils.@rjsf/utils.UIOptionsBaseType<T, S, F>> & {  ui:globalOptions :@rjsf/utils.@rjsf/utils.GlobalUISchemaOptions | undefined,   ui:rootFieldId :string | undefined,   ui:field :@rjsf/utils.@rjsf/utils.Field<T, S, F> | string | undefined,   ui:fieldReplacesAnyOrOneOf :boolean | undefined,   ui:options :@rjsf/utils.@rjsf/utils.UIOptionsType<T, S, F> | undefined} */
trait UiSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */]
  extends StObject
     with /* name */ StringDictionary[Any] {
  
  var ArrayFieldDescriptionTemplate: js.UndefOr[ComponentType[ArrayFieldDescriptionProps[T, S, F]]] = js.undefined
  
  var ArrayFieldItemTemplate: js.UndefOr[ComponentType[ArrayFieldTemplateItemType[T, S, F]]] = js.undefined
  
  var ArrayFieldTemplate: js.UndefOr[ComponentType[ArrayFieldTemplateProps[T, S, F]]] = js.undefined
  
  var ArrayFieldTitleTemplate: js.UndefOr[ComponentType[ArrayFieldTitleProps[T, S, F]]] = js.undefined
  
  var BaseInputTemplate: js.UndefOr[ComponentType[BaseInputTemplateProps[T, S, F]]] = js.undefined
  
  var DescriptionFieldTemplate: js.UndefOr[ComponentType[DescriptionFieldProps[T, S, F]]] = js.undefined
  
  var ErrorListTemplate: js.UndefOr[ComponentType[ErrorListProps[T, S, F]]] = js.undefined
  
  var FieldErrorTemplate: js.UndefOr[ComponentType[FieldErrorProps[T, S, F]]] = js.undefined
  
  var FieldHelpTemplate: js.UndefOr[ComponentType[FieldHelpProps[T, S, F]]] = js.undefined
  
  var FieldTemplate: js.UndefOr[ComponentType[FieldTemplateProps[T, S, F]]] = js.undefined
  
  var ObjectFieldTemplate: js.UndefOr[ComponentType[ObjectFieldTemplateProps[T, S, F]]] = js.undefined
  
  var TitleFieldTemplate: js.UndefOr[ComponentType[TitleFieldProps[T, S, F]]] = js.undefined
  
  var UnsupportedFieldTemplate: js.UndefOr[ComponentType[UnsupportedFieldProps[T, S, F]]] = js.undefined
  
  var WrapIfAdditionalTemplate: js.UndefOr[ComponentType[WrapIfAdditionalTemplateProps[T, S, F]]] = js.undefined
  
  var addable: js.UndefOr[Boolean] = js.undefined
  
  var autocomplete: js.UndefOr[String] = js.undefined
  
  var autofocus: js.UndefOr[Boolean] = js.undefined
  
  var classNames: js.UndefOr[String] = js.undefined
  
  var copyable: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var duplicateKeySuffixSeparator: js.UndefOr[String] = js.undefined
  
  var emptyValue: js.UndefOr[Any] = js.undefined
  
  var enumDisabled: js.UndefOr[js.Array[String | Double | Boolean]] = js.undefined
  
  var filePreview: js.UndefOr[Boolean] = js.undefined
  
  var help: js.UndefOr[String] = js.undefined
  
  var hideError: js.UndefOr[Boolean] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var inputType: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[Boolean] = js.undefined
  
  var order: js.UndefOr[js.Array[String]] = js.undefined
  
  var orderable: js.UndefOr[Boolean] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var removable: js.UndefOr[Boolean] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleHTMLAttributes[Any]] = js.undefined
  
  var submitButtonOptions: js.UndefOr[UISchemaSubmitButtonOptions] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  /** Allows RJSF to override the default field implementation by specifying either the name of a field that is used
    * to look up an implementation from the `fields` list or an actual one-off `Field` component implementation itself
    */
  @JSName("ui:field")
  var uiColonfield: js.UndefOr[(Field[T, S, F]) | String] = js.undefined
  
  /** By default, any field that is rendered for an `anyOf`/`oneOf` schema will be wrapped inside the `AnyOfField` or
    * `OneOfField` component. This default behavior may be undesirable if your custom field already handles behavior
    * related to choosing one or more subschemas contained in the `anyOf`/`oneOf` schema.
    * By providing a `true` value for this flag in association with a custom `ui:field`, the wrapped components will be
    * omitted, so just one instance of the custom field will be rendered. If the flag is omitted or set to `false`,
    * your custom field will be wrapped by `AnyOfField`/`OneOfField`.
    */
  @JSName("ui:fieldReplacesAnyOrOneOf")
  var uiColonfieldReplacesAnyOrOneOf: js.UndefOr[Boolean] = js.undefined
  
  /** The set of Globally relevant UI Schema options that are read from the root-level UiSchema and stored in the
    * Registry for use everywhere.
    */
  @JSName("ui:globalOptions")
  var uiColonglobalOptions: js.UndefOr[GlobalUISchemaOptions] = js.undefined
  
  /** An object that contains all the potential UI options in a single object */
  @JSName("ui:options")
  var uiColonoptions: js.UndefOr[UIOptionsType[T, S, F]] = js.undefined
  
  /** Allows the form to generate a unique prefix for the `Form`'s root prefix  */
  @JSName("ui:rootFieldId")
  var uiColonrootFieldId: js.UndefOr[String] = js.undefined
  
  var widget: js.UndefOr[(Widget[T, S, F]) | String] = js.undefined
}
object UiSchema {
  
  inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](): UiSchema[T, S, F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UiSchema[T, S, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UiSchema[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (UiSchema[T, S, F])) extends AnyVal {
    
    inline def setAddable(value: Boolean): Self = StObject.set(x, "addable", value.asInstanceOf[js.Any])
    
    inline def setAddableUndefined: Self = StObject.set(x, "addable", js.undefined)
    
    inline def setArrayFieldDescriptionTemplate(value: ComponentType[ArrayFieldDescriptionProps[T, S, F]]): Self = StObject.set(x, "ArrayFieldDescriptionTemplate", value.asInstanceOf[js.Any])
    
    inline def setArrayFieldDescriptionTemplateUndefined: Self = StObject.set(x, "ArrayFieldDescriptionTemplate", js.undefined)
    
    inline def setArrayFieldItemTemplate(value: ComponentType[ArrayFieldTemplateItemType[T, S, F]]): Self = StObject.set(x, "ArrayFieldItemTemplate", value.asInstanceOf[js.Any])
    
    inline def setArrayFieldItemTemplateUndefined: Self = StObject.set(x, "ArrayFieldItemTemplate", js.undefined)
    
    inline def setArrayFieldTemplate(value: ComponentType[ArrayFieldTemplateProps[T, S, F]]): Self = StObject.set(x, "ArrayFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setArrayFieldTemplateUndefined: Self = StObject.set(x, "ArrayFieldTemplate", js.undefined)
    
    inline def setArrayFieldTitleTemplate(value: ComponentType[ArrayFieldTitleProps[T, S, F]]): Self = StObject.set(x, "ArrayFieldTitleTemplate", value.asInstanceOf[js.Any])
    
    inline def setArrayFieldTitleTemplateUndefined: Self = StObject.set(x, "ArrayFieldTitleTemplate", js.undefined)
    
    inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    inline def setBaseInputTemplate(value: ComponentType[BaseInputTemplateProps[T, S, F]]): Self = StObject.set(x, "BaseInputTemplate", value.asInstanceOf[js.Any])
    
    inline def setBaseInputTemplateUndefined: Self = StObject.set(x, "BaseInputTemplate", js.undefined)
    
    inline def setClassNames(value: String): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setCopyable(value: Boolean): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
    
    inline def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFieldTemplate(value: ComponentType[DescriptionFieldProps[T, S, F]]): Self = StObject.set(x, "DescriptionFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFieldTemplateUndefined: Self = StObject.set(x, "DescriptionFieldTemplate", js.undefined)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDuplicateKeySuffixSeparator(value: String): Self = StObject.set(x, "duplicateKeySuffixSeparator", value.asInstanceOf[js.Any])
    
    inline def setDuplicateKeySuffixSeparatorUndefined: Self = StObject.set(x, "duplicateKeySuffixSeparator", js.undefined)
    
    inline def setEmptyValue(value: Any): Self = StObject.set(x, "emptyValue", value.asInstanceOf[js.Any])
    
    inline def setEmptyValueUndefined: Self = StObject.set(x, "emptyValue", js.undefined)
    
    inline def setEnumDisabled(value: js.Array[String | Double | Boolean]): Self = StObject.set(x, "enumDisabled", value.asInstanceOf[js.Any])
    
    inline def setEnumDisabledUndefined: Self = StObject.set(x, "enumDisabled", js.undefined)
    
    inline def setEnumDisabledVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "enumDisabled", js.Array(value*))
    
    inline def setErrorListTemplate(value: ComponentType[ErrorListProps[T, S, F]]): Self = StObject.set(x, "ErrorListTemplate", value.asInstanceOf[js.Any])
    
    inline def setErrorListTemplateUndefined: Self = StObject.set(x, "ErrorListTemplate", js.undefined)
    
    inline def setFieldErrorTemplate(value: ComponentType[FieldErrorProps[T, S, F]]): Self = StObject.set(x, "FieldErrorTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldErrorTemplateUndefined: Self = StObject.set(x, "FieldErrorTemplate", js.undefined)
    
    inline def setFieldHelpTemplate(value: ComponentType[FieldHelpProps[T, S, F]]): Self = StObject.set(x, "FieldHelpTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldHelpTemplateUndefined: Self = StObject.set(x, "FieldHelpTemplate", js.undefined)
    
    inline def setFieldTemplate(value: ComponentType[FieldTemplateProps[T, S, F]]): Self = StObject.set(x, "FieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldTemplateUndefined: Self = StObject.set(x, "FieldTemplate", js.undefined)
    
    inline def setFilePreview(value: Boolean): Self = StObject.set(x, "filePreview", value.asInstanceOf[js.Any])
    
    inline def setFilePreviewUndefined: Self = StObject.set(x, "filePreview", js.undefined)
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setHideError(value: Boolean): Self = StObject.set(x, "hideError", value.asInstanceOf[js.Any])
    
    inline def setHideErrorUndefined: Self = StObject.set(x, "hideError", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setLabel(value: Boolean): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setObjectFieldTemplate(value: ComponentType[ObjectFieldTemplateProps[T, S, F]]): Self = StObject.set(x, "ObjectFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setObjectFieldTemplateUndefined: Self = StObject.set(x, "ObjectFieldTemplate", js.undefined)
    
    inline def setOrder(value: js.Array[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setOrderable(value: Boolean): Self = StObject.set(x, "orderable", value.asInstanceOf[js.Any])
    
    inline def setOrderableUndefined: Self = StObject.set(x, "orderable", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
    
    inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setStyle(value: StyleHTMLAttributes[Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubmitButtonOptions(value: UISchemaSubmitButtonOptions): Self = StObject.set(x, "submitButtonOptions", value.asInstanceOf[js.Any])
    
    inline def setSubmitButtonOptionsUndefined: Self = StObject.set(x, "submitButtonOptions", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleFieldTemplate(value: ComponentType[TitleFieldProps[T, S, F]]): Self = StObject.set(x, "TitleFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setTitleFieldTemplateUndefined: Self = StObject.set(x, "TitleFieldTemplate", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUiColonfield(value: (Field[T, S, F]) | String): Self = StObject.set(x, "ui:field", value.asInstanceOf[js.Any])
    
    inline def setUiColonfieldReplacesAnyOrOneOf(value: Boolean): Self = StObject.set(x, "ui:fieldReplacesAnyOrOneOf", value.asInstanceOf[js.Any])
    
    inline def setUiColonfieldReplacesAnyOrOneOfUndefined: Self = StObject.set(x, "ui:fieldReplacesAnyOrOneOf", js.undefined)
    
    inline def setUiColonfieldUndefined: Self = StObject.set(x, "ui:field", js.undefined)
    
    inline def setUiColonglobalOptions(value: GlobalUISchemaOptions): Self = StObject.set(x, "ui:globalOptions", value.asInstanceOf[js.Any])
    
    inline def setUiColonglobalOptionsUndefined: Self = StObject.set(x, "ui:globalOptions", js.undefined)
    
    inline def setUiColonoptions(value: UIOptionsType[T, S, F]): Self = StObject.set(x, "ui:options", value.asInstanceOf[js.Any])
    
    inline def setUiColonoptionsUndefined: Self = StObject.set(x, "ui:options", js.undefined)
    
    inline def setUiColonrootFieldId(value: String): Self = StObject.set(x, "ui:rootFieldId", value.asInstanceOf[js.Any])
    
    inline def setUiColonrootFieldIdUndefined: Self = StObject.set(x, "ui:rootFieldId", js.undefined)
    
    inline def setUnsupportedFieldTemplate(value: ComponentType[UnsupportedFieldProps[T, S, F]]): Self = StObject.set(x, "UnsupportedFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedFieldTemplateUndefined: Self = StObject.set(x, "UnsupportedFieldTemplate", js.undefined)
    
    inline def setWidget(value: (Widget[T, S, F]) | String): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
    
    inline def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
    
    inline def setWrapIfAdditionalTemplate(value: ComponentType[WrapIfAdditionalTemplateProps[T, S, F]]): Self = StObject.set(x, "WrapIfAdditionalTemplate", value.asInstanceOf[js.Any])
    
    inline def setWrapIfAdditionalTemplateUndefined: Self = StObject.set(x, "WrapIfAdditionalTemplate", js.undefined)
  }
}
