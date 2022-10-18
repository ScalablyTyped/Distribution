package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type that represents the Options potentially provided by `ui:options` */
/* Inlined @rjsf/utils.@rjsf/utils.UIOptionsBaseType<T, F> & {[key: string] : boolean | number | string | object | std.Array<any> | null | undefined} */
trait UIOptionsType[T, F]
  extends StObject
     with /** Anything else will be one of these types */
/* key */ StringDictionary[js.UndefOr[Boolean | Double | String | js.Object | js.Array[Any] | Null]] {
  
  var ArrayFieldDescriptionTemplate: js.UndefOr[ComponentType[ArrayFieldDescriptionProps[T, F]]] = js.undefined
  
  var ArrayFieldItemTemplate: js.UndefOr[ComponentType[ArrayFieldTemplateItemType[T, F]]] = js.undefined
  
  var ArrayFieldTemplate: js.UndefOr[ComponentType[ArrayFieldTemplateProps[T, F]]] = js.undefined
  
  var ArrayFieldTitleTemplate: js.UndefOr[ComponentType[ArrayFieldTitleProps[T, F]]] = js.undefined
  
  var BaseInputTemplate: js.UndefOr[ComponentType[WidgetProps[T, F]]] = js.undefined
  
  var DescriptionFieldTemplate: js.UndefOr[ComponentType[DescriptionFieldProps[T, F]]] = js.undefined
  
  var ErrorListTemplate: js.UndefOr[ComponentType[ErrorListProps[T, F]]] = js.undefined
  
  var FieldErrorTemplate: js.UndefOr[ComponentType[FieldErrorProps[T, F]]] = js.undefined
  
  var FieldHelpTemplate: js.UndefOr[ComponentType[FieldHelpProps[T, F]]] = js.undefined
  
  var FieldTemplate: js.UndefOr[ComponentType[FieldTemplateProps[T, F]]] = js.undefined
  
  var ObjectFieldTemplate: js.UndefOr[ComponentType[ObjectFieldTemplateProps[T, F]]] = js.undefined
  
  var TitleFieldTemplate: js.UndefOr[ComponentType[TitleFieldProps[T, F]]] = js.undefined
  
  var UnsupportedFieldTemplate: js.UndefOr[ComponentType[UnsupportedFieldProps[T, F]]] = js.undefined
  
  var WrapIfAdditionalTemplate: js.UndefOr[ComponentType[WrapIfAdditionalTemplateProps[T, F]]] = js.undefined
  
  /** Flag, if set to `false`, will mark array fields as NOT being able to be added to (defaults to true) */
  var addable: js.UndefOr[Boolean] = js.undefined
  
  /** Use to mark the field as supporting auto complete on a text input or textarea input */
  var autocomplete: js.UndefOr[String] = js.undefined
  
  /** Flag, if set to `true`, will mark the field as automatically focused on a text input or textarea input */
  var autofocus: js.UndefOr[Boolean] = js.undefined
  
  /** Any classnames that the user wants to be applied to a field in the ui */
  var classNames: js.UndefOr[String] = js.undefined
  
  /** We know that for description, it will be a string, if it is provided */
  var description: js.UndefOr[String] = js.undefined
  
  /** Flag, if set to `true`, will mark all child widgets from a given field as disabled */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** When using `additionalProperties`, key collision is prevented by appending a unique integer to the duplicate key.
    * This option allows you to change the separator between the original key name and the integer. Default is "-"
    */
  var duplicateKeySuffixSeparator: js.UndefOr[String] = js.undefined
  
  /** The default value to use when an input for a field is empty */
  var emptyValue: js.UndefOr[Any] = js.undefined
  
  /** Will disable any of the enum options specified in the array (by value) */
  var enumDisabled: js.UndefOr[js.Array[String | Double | Boolean]] = js.undefined
  
  /** Used to add text next to a field to guide the end user in filling it in */
  var help: js.UndefOr[String] = js.undefined
  
  /** Flag, if set to `true`, will hide the default error display for the given field AND all of its child fields in the
    * hierarchy
    */
  var hideError: js.UndefOr[Boolean] = js.undefined
  
  /** Flag, if set to `true`, will mark a list of checkboxes as displayed all on one line instead of one per row */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  /** Used to change the input type (for example, `tel` or `email`) for an <input> */
  var inputType: js.UndefOr[String] = js.undefined
  
  /** Field labels are rendered by default. Labels may be omitted by setting the `label` option to `false` */
  var label: js.UndefOr[Boolean] = js.undefined
  
  /** This property allows you to reorder the properties that are shown for a particular object */
  var order: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Flag, if set to `false`, will mark array fields as NOT being able to be ordered (defaults to true) */
  var orderable: js.UndefOr[Boolean] = js.undefined
  
  /** We know that for placeholder, it will be a string, if it is provided */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /** Flag, if set to `true`, will mark all child widgets from a given field as read-only */
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  /** Flag, if set to `false`, will mark array fields as NOT being able to be removed (defaults to true) */
  var removable: js.UndefOr[Boolean] = js.undefined
  
  /** Provides a means to set the initial height of a textarea widget */
  var rows: js.UndefOr[Double] = js.undefined
  
  /** If submitButtonOptions is provided it should match the `UISchemaSubmitButtonOptions` type */
  var submitButtonOptions: js.UndefOr[UISchemaSubmitButtonOptions] = js.undefined
  
  /** We know that for title, it will be a string, if it is provided */
  var title: js.UndefOr[String] = js.undefined
  
  /** Allows RJSF to override the default widget implementation by specifying either the name of a widget that is used
    * to look up an implementation from the `widgets` list or an actual one-off widget implementation itself
    */
  var widget: js.UndefOr[(Widget[T, F]) | String] = js.undefined
}
object UIOptionsType {
  
  inline def apply[T, F](): UIOptionsType[T, F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIOptionsType[T, F]]
  }
  
  extension [Self <: UIOptionsType[?, ?], T, F](x: Self & (UIOptionsType[T, F])) {
    
    inline def setAddable(value: Boolean): Self = StObject.set(x, "addable", value.asInstanceOf[js.Any])
    
    inline def setAddableUndefined: Self = StObject.set(x, "addable", js.undefined)
    
    inline def setArrayFieldDescriptionTemplate(value: ComponentType[ArrayFieldDescriptionProps[T, F]]): Self = StObject.set(x, "ArrayFieldDescriptionTemplate", value.asInstanceOf[js.Any])
    
    inline def setArrayFieldDescriptionTemplateUndefined: Self = StObject.set(x, "ArrayFieldDescriptionTemplate", js.undefined)
    
    inline def setArrayFieldItemTemplate(value: ComponentType[ArrayFieldTemplateItemType[T, F]]): Self = StObject.set(x, "ArrayFieldItemTemplate", value.asInstanceOf[js.Any])
    
    inline def setArrayFieldItemTemplateUndefined: Self = StObject.set(x, "ArrayFieldItemTemplate", js.undefined)
    
    inline def setArrayFieldTemplate(value: ComponentType[ArrayFieldTemplateProps[T, F]]): Self = StObject.set(x, "ArrayFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setArrayFieldTemplateUndefined: Self = StObject.set(x, "ArrayFieldTemplate", js.undefined)
    
    inline def setArrayFieldTitleTemplate(value: ComponentType[ArrayFieldTitleProps[T, F]]): Self = StObject.set(x, "ArrayFieldTitleTemplate", value.asInstanceOf[js.Any])
    
    inline def setArrayFieldTitleTemplateUndefined: Self = StObject.set(x, "ArrayFieldTitleTemplate", js.undefined)
    
    inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    inline def setBaseInputTemplate(value: ComponentType[WidgetProps[T, F]]): Self = StObject.set(x, "BaseInputTemplate", value.asInstanceOf[js.Any])
    
    inline def setBaseInputTemplateUndefined: Self = StObject.set(x, "BaseInputTemplate", js.undefined)
    
    inline def setClassNames(value: String): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFieldTemplate(value: ComponentType[DescriptionFieldProps[T, F]]): Self = StObject.set(x, "DescriptionFieldTemplate", value.asInstanceOf[js.Any])
    
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
    
    inline def setErrorListTemplate(value: ComponentType[ErrorListProps[T, F]]): Self = StObject.set(x, "ErrorListTemplate", value.asInstanceOf[js.Any])
    
    inline def setErrorListTemplateUndefined: Self = StObject.set(x, "ErrorListTemplate", js.undefined)
    
    inline def setFieldErrorTemplate(value: ComponentType[FieldErrorProps[T, F]]): Self = StObject.set(x, "FieldErrorTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldErrorTemplateUndefined: Self = StObject.set(x, "FieldErrorTemplate", js.undefined)
    
    inline def setFieldHelpTemplate(value: ComponentType[FieldHelpProps[T, F]]): Self = StObject.set(x, "FieldHelpTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldHelpTemplateUndefined: Self = StObject.set(x, "FieldHelpTemplate", js.undefined)
    
    inline def setFieldTemplate(value: ComponentType[FieldTemplateProps[T, F]]): Self = StObject.set(x, "FieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldTemplateUndefined: Self = StObject.set(x, "FieldTemplate", js.undefined)
    
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
    
    inline def setObjectFieldTemplate(value: ComponentType[ObjectFieldTemplateProps[T, F]]): Self = StObject.set(x, "ObjectFieldTemplate", value.asInstanceOf[js.Any])
    
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
    
    inline def setSubmitButtonOptions(value: UISchemaSubmitButtonOptions): Self = StObject.set(x, "submitButtonOptions", value.asInstanceOf[js.Any])
    
    inline def setSubmitButtonOptionsUndefined: Self = StObject.set(x, "submitButtonOptions", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleFieldTemplate(value: ComponentType[TitleFieldProps[T, F]]): Self = StObject.set(x, "TitleFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setTitleFieldTemplateUndefined: Self = StObject.set(x, "TitleFieldTemplate", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUnsupportedFieldTemplate(value: ComponentType[UnsupportedFieldProps[T, F]]): Self = StObject.set(x, "UnsupportedFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedFieldTemplateUndefined: Self = StObject.set(x, "UnsupportedFieldTemplate", js.undefined)
    
    inline def setWidget(value: (Widget[T, F]) | String): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
    
    inline def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
    
    inline def setWrapIfAdditionalTemplate(value: ComponentType[WrapIfAdditionalTemplateProps[T, F]]): Self = StObject.set(x, "WrapIfAdditionalTemplate", value.asInstanceOf[js.Any])
    
    inline def setWrapIfAdditionalTemplateUndefined: Self = StObject.set(x, "WrapIfAdditionalTemplate", js.undefined)
  }
}
