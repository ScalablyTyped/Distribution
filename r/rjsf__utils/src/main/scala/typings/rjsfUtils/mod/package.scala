package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema7
import typings.jsonSchema.mod.JSONSchema7Type
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.rjsfUtils.anon.AddButton
import typings.rjsfUtils.anon.Blob
import typings.rjsfUtils.anon.Name
import typings.rjsfUtils.mod.^
import typings.rjsfUtils.rjsfUtilsBooleans.`false`
import typings.rjsfUtils.rjsfUtilsStrings.ArrayFieldDescriptionTemplate
import typings.rjsfUtils.rjsfUtilsStrings.ArrayFieldItemTemplate
import typings.rjsfUtils.rjsfUtilsStrings.ArrayFieldTemplate
import typings.rjsfUtils.rjsfUtilsStrings.ArrayFieldTitleTemplate
import typings.rjsfUtils.rjsfUtilsStrings.BaseInputTemplate
import typings.rjsfUtils.rjsfUtilsStrings.ButtonTemplates
import typings.rjsfUtils.rjsfUtilsStrings.DescriptionFieldTemplate
import typings.rjsfUtils.rjsfUtilsStrings.ErrorListTemplate
import typings.rjsfUtils.rjsfUtilsStrings.FieldErrorTemplate
import typings.rjsfUtils.rjsfUtilsStrings.FieldHelpTemplate
import typings.rjsfUtils.rjsfUtilsStrings.FieldTemplate
import typings.rjsfUtils.rjsfUtilsStrings.ObjectFieldTemplate
import typings.rjsfUtils.rjsfUtilsStrings.TitleFieldTemplate
import typings.rjsfUtils.rjsfUtilsStrings.UnsupportedFieldTemplate
import typings.rjsfUtils.rjsfUtilsStrings.WrapIfAdditionalTemplate
import typings.rjsfUtils.rjsfUtilsStrings._empty
import typings.rjsfUtils.rjsfUtilsStrings.`null`
import typings.rjsfUtils.rjsfUtilsStrings.`object`
import typings.rjsfUtils.rjsfUtilsStrings.array
import typings.rjsfUtils.rjsfUtilsStrings.boolean
import typings.rjsfUtils.rjsfUtilsStrings.excludeObjectChildren
import typings.rjsfUtils.rjsfUtilsStrings.number
import typings.rjsfUtils.rjsfUtilsStrings.preventDuplicates
import typings.rjsfUtils.rjsfUtilsStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ADDITIONAL_PROPERTIES_KEY: /* "additionalProperties" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ADDITIONAL_PROPERTIES_KEY").asInstanceOf[/* "additionalProperties" */ String]

/** Below are the list of all the keys into various elements of a RJSFSchema or UiSchema that are used by the various
  * utility functions. In addition to those keys, there are the special `ADDITIONAL_PROPERTY_FLAG` and
  * `RJSF_ADDITONAL_PROPERTIES_FLAG` flags that is added to a schema under certain conditions by the `retrieveSchema()`
  * utility.
  */
inline def ADDITIONAL_PROPERTY_FLAG: /* "__additional_property" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ADDITIONAL_PROPERTY_FLAG").asInstanceOf[/* "__additional_property" */ String]

inline def ALL_OF_KEY: /* "allOf" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ALL_OF_KEY").asInstanceOf[/* "allOf" */ String]

inline def ANY_OF_KEY: /* "anyOf" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANY_OF_KEY").asInstanceOf[/* "anyOf" */ String]

inline def CONST_KEY: /* "const" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("CONST_KEY").asInstanceOf[/* "const" */ String]

inline def DEFAULT_KEY: /* "default" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_KEY").asInstanceOf[/* "default" */ String]

inline def DEFINITIONS_KEY: /* "definitions" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFINITIONS_KEY").asInstanceOf[/* "definitions" */ String]

inline def DEPENDENCIES_KEY: /* "dependencies" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("DEPENDENCIES_KEY").asInstanceOf[/* "dependencies" */ String]

inline def ENUM_KEY: /* "enum" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ENUM_KEY").asInstanceOf[/* "enum" */ String]

inline def ERRORS_KEY: /* "__errors" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERRORS_KEY").asInstanceOf[/* "__errors" */ String]

inline def ID_KEY: /* "$id" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ID_KEY").asInstanceOf[/* "$id" */ String]

inline def ITEMS_KEY: /* "items" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ITEMS_KEY").asInstanceOf[/* "items" */ String]

inline def NAME_KEY: /* "$name" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("NAME_KEY").asInstanceOf[/* "$name" */ String]

inline def ONE_OF_KEY: /* "oneOf" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ONE_OF_KEY").asInstanceOf[/* "oneOf" */ String]

inline def PROPERTIES_KEY: /* "properties" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("PROPERTIES_KEY").asInstanceOf[/* "properties" */ String]

inline def REF_KEY: /* "$ref" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("REF_KEY").asInstanceOf[/* "$ref" */ String]

inline def REQUIRED_KEY: /* "required" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("REQUIRED_KEY").asInstanceOf[/* "required" */ String]

inline def RJSF_ADDITONAL_PROPERTIES_FLAG: /* "__rjsf_additionalProperties" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("RJSF_ADDITONAL_PROPERTIES_FLAG").asInstanceOf[/* "__rjsf_additionalProperties" */ String]

inline def ROOT_SCHEMA_PREFIX: /* "__rjsf_rootSchema" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ROOT_SCHEMA_PREFIX").asInstanceOf[/* "__rjsf_rootSchema" */ String]

inline def SUBMIT_BTN_OPTIONS_KEY: /* "submitButtonOptions" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("SUBMIT_BTN_OPTIONS_KEY").asInstanceOf[/* "submitButtonOptions" */ String]

inline def UI_FIELD_KEY: /* "ui:field" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("UI_FIELD_KEY").asInstanceOf[/* "ui:field" */ String]

inline def UI_GLOBAL_OPTIONS_KEY: /* "ui:globalOptions" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("UI_GLOBAL_OPTIONS_KEY").asInstanceOf[/* "ui:globalOptions" */ String]

inline def UI_OPTIONS_KEY: /* "ui:options" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("UI_OPTIONS_KEY").asInstanceOf[/* "ui:options" */ String]

inline def UI_WIDGET_KEY: /* "ui:widget" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("UI_WIDGET_KEY").asInstanceOf[/* "ui:widget" */ String]

/** Checks the schema to see if it is allowing additional items, by verifying that `schema.additionalItems` is an
  * object. The user is warned in the console if `schema.additionalItems` has the value `true`.
  *
  * @param schema - The schema object to check
  * @returns - True if additional items is allowed, otherwise false
  */
inline def allowAdditionalItems[S /* <: StrictRJSFSchema */](schema: S): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAdditionalItems")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def ariaDescribedByIds[T](id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ariaDescribedByIds")(id.asInstanceOf[js.Any]).asInstanceOf[String]
inline def ariaDescribedByIds[T](id: String, includeExamples: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ariaDescribedByIds")(id.asInstanceOf[js.Any], includeExamples.asInstanceOf[js.Any])).asInstanceOf[String]
/** Return a list of element ids that contain additional information about the field that can be used to as the aria
  * description of the field. This is correctly omitting `titleId` which would be "labeling" rather than "describing" the
  * element.
  *
  * @param id - Either simple string id or an IdSchema from which to extract it
  * @param [includeExamples=false] - Optional flag, if true, will add the `examplesId` into the list
  * @returns - The string containing the list of ids for use in an `aria-describedBy` attribute
  */
inline def ariaDescribedByIds[T](id: IdSchema[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ariaDescribedByIds")(id.asInstanceOf[js.Any]).asInstanceOf[String]
inline def ariaDescribedByIds[T](id: IdSchema[T], includeExamples: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ariaDescribedByIds")(id.asInstanceOf[js.Any], includeExamples.asInstanceOf[js.Any])).asInstanceOf[String]

/** Attempts to convert the string into a number. If an empty string is provided, then `undefined` is returned. If a
  * `null` is provided, it is returned. If the string ends in a `.` then the string is returned because the user may be
  * in the middle of typing a float number. If a number ends in a pattern like `.0`, `.20`, `.030`, string is returned
  * because the user may be typing number that will end in a non-zero digit. Otherwise, the string is wrapped by
  * `Number()` and if that result is not `NaN`, that number will be returned, otherwise the string `value` will be.
  *
  * @param value - The string or null value to convert to a number
  * @returns - The `value` converted to a number when appropriate, otherwise the `value`
  */
inline def asNumber(): js.UndefOr[String | Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("asNumber")().asInstanceOf[js.UndefOr[String | Double | Null]]
inline def asNumber(value: String): js.UndefOr[String | Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("asNumber")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Double | Null]]

/** Checks whether the field described by `schema`, having the `uiSchema` and `formData` supports expanding. The UI for
  * the field can expand if it has additional properties, is not forced as non-expandable by the `uiSchema` and the
  * `formData` object doesn't already have `schema.maxProperties` elements.
  *
  * @param schema - The schema for the field that is being checked
  * @param [uiSchema={}] - The uiSchema for the field
  * @param [formData] - The formData for the field
  * @returns - True if the schema element has additionalProperties, is expandable, and not at the maxProperties limit
  */
inline def canExpand[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canExpand")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def canExpand[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, uiSchema: Unit, formData: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canExpand")(schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def canExpand[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, uiSchema: UiSchema[T, S, F]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canExpand")(schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def canExpand[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, uiSchema: UiSchema[T, S, F], formData: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canExpand")(schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** Given a `formData` object, recursively creates a `FormValidation` error handling structure around it
  *
  * @param formData - The form data around which the error handler is created
  * @returns - A `FormValidation` object based on the `formData` structure
  */
inline def createErrorHandler[T](formData: T): FormValidation[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createErrorHandler")(formData.asInstanceOf[js.Any]).asInstanceOf[FormValidation[T]]

/** Creates a `SchemaUtilsType` interface that is based around the given `validator` and `rootSchema` parameters. The
  * resulting interface implementation will forward the `validator` and `rootSchema` to all the wrapped APIs.
  *
  * @param validator - an implementation of the `ValidatorType` interface that will be forwarded to all the APIs
  * @param rootSchema - The root schema that will be forwarded to all the APIs
  * @returns - An implementation of a `SchemaUtilsType` interface
  */
inline def createSchemaUtils[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], rootSchema: S): SchemaUtilsType[T, S, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSchemaUtils")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[SchemaUtilsType[T, S, F]]

/** Given the `FileReader.readAsDataURL()` based `dataURI` extracts that data into an actual Blob along with the name
  * of that Blob if provided in the URL. If no name is provided, then the name falls back to `unknown`.
  *
  * @param dataURI - The `DataUrl` potentially containing name and raw data to be converted to a Blob
  * @returns - an object containing a Blob and its name, extracted from the URI
  */
inline def dataURItoBlob(dataURI: String): Blob | Name = ^.asInstanceOf[js.Dynamic].applyDynamic("dataURItoBlob")(dataURI.asInstanceOf[js.Any]).asInstanceOf[Blob | Name]

/** Implements a deep equals using the `lodash.isEqualWith` function, that provides a customized comparator that
  * assumes all functions are equivalent.
  *
  * @param a - The first element to compare
  * @param b - The second element to compare
  * @returns - True if the `a` and `b` are deeply equal, false otherwise
  */
inline def deepEquals(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def descriptionId[T](id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("descriptionId")(id.asInstanceOf[js.Any]).asInstanceOf[String]
/** Return a consistent `id` for the field description element
  *
  * @param id - Either simple string id or an IdSchema from which to extract it
  * @returns - The consistent id for the field description element from the given `id`
  */
inline def descriptionId[T](id: IdSchema[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("descriptionId")(id.asInstanceOf[js.Any]).asInstanceOf[String]

/** Translates a `TranslatableString` value `stringToTranslate` into english. When a `params` array is provided, each
  * value in the array is used to replace any of the replaceable parameters in the `stringToTranslate` using the `%1`,
  * `%2`, etc. replacement specifiers.
  *
  * @param stringToTranslate - The `TranslatableString` value to convert to english
  * @param params - The optional list of replaceable parameter values to substitute into the english string
  * @returns - The `stringToTranslate` itself with any replaceable parameter values substituted
  */
inline def englishStringTranslator(stringToTranslate: TranslatableString): String = ^.asInstanceOf[js.Dynamic].applyDynamic("englishStringTranslator")(stringToTranslate.asInstanceOf[js.Any]).asInstanceOf[String]
inline def englishStringTranslator(stringToTranslate: TranslatableString, params: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("englishStringTranslator")(stringToTranslate.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]

/** Removes the enum option value at the `valueIndex` from the currently `selected` (list of) value(s). If `selected` is
  * a list, then that list is updated to remove the enum option value with the `valueIndex` in `allEnumOptions`. If it is
  * a single value, then if the enum option value with the `valueIndex` in `allEnumOptions` matches `selected`, undefined
  * is returned, otherwise the `selected` value is returned.
  *
  * @param valueIndex - The index of the value to be removed from the selected list or single value
  * @param selected - The current (list of) selected value(s)
  * @param [allEnumOptions=[]] - The list of all the known enumOptions
  * @returns - The updated `selected` with the enum option value at `valueIndex` in `allEnumOptions` removed from it,
  *        unless `selected` is a single value. In that case, if the `valueIndex` value matches `selected`, returns
  *        undefined, otherwise `selected`.
  */
inline def enumOptionsDeselectValue[S /* <: StrictRJSFSchema */](valueIndex: String): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsDeselectValue")(valueIndex.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsDeselectValue[S /* <: StrictRJSFSchema */](valueIndex: String, selected: Unit, allEnumOptions: js.Array[EnumOptionsType[S]]): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsDeselectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsDeselectValue[S /* <: StrictRJSFSchema */](valueIndex: Double): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsDeselectValue")(valueIndex.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsDeselectValue[S /* <: StrictRJSFSchema */](valueIndex: Double, selected: Unit, allEnumOptions: js.Array[EnumOptionsType[S]]): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsDeselectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]

inline def enumOptionsDeselectValue_value[S /* <: StrictRJSFSchema */](
  valueIndex: String,
  selected: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsDeselectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsDeselectValue_value[S /* <: StrictRJSFSchema */](
  valueIndex: String,
  selected: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any,
  allEnumOptions: js.Array[EnumOptionsType[S]]
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsDeselectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsDeselectValue_value[S /* <: StrictRJSFSchema */](
  valueIndex: String,
  selected: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
]
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsDeselectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsDeselectValue_value[S /* <: StrictRJSFSchema */](
  valueIndex: String,
  selected: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
],
  allEnumOptions: js.Array[EnumOptionsType[S]]
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsDeselectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsDeselectValue_value[S /* <: StrictRJSFSchema */](
  valueIndex: Double,
  selected: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsDeselectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsDeselectValue_value[S /* <: StrictRJSFSchema */](
  valueIndex: Double,
  selected: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any,
  allEnumOptions: js.Array[EnumOptionsType[S]]
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsDeselectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsDeselectValue_value[S /* <: StrictRJSFSchema */](
  valueIndex: Double,
  selected: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
]
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsDeselectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsDeselectValue_value[S /* <: StrictRJSFSchema */](
  valueIndex: Double,
  selected: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
],
  allEnumOptions: js.Array[EnumOptionsType[S]]
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsDeselectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]

/** Returns the index(es) of the options in `allEnumOptions` whose value(s) match the ones in `value`. All the
  * `enumOptions` are filtered based on whether they are a "selected" `value` and the index of each selected one is then
  * stored in an array. If `multiple` is true, that array is returned, otherwise the first element in the array is
  * returned.
  *
  * @param value - The single value or list of values for which indexes are desired
  * @param [allEnumOptions=[]] - The list of all the known enumOptions
  * @param [multiple=false] - Optional flag, if true will return a list of index, otherwise a single one
  * @returns - A single string index for the first `value` in `allEnumOptions`, if not `multiple`. Otherwise, the list
  *        of indexes for (each of) the value(s) in `value`.
  */
inline def enumOptionsIndexForValue_value[S /* <: StrictRJSFSchema */](
  value: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
): js.UndefOr[String | js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsIndexForValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | js.Array[String]]]
inline def enumOptionsIndexForValue_value[S /* <: StrictRJSFSchema */](
  value: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any,
  allEnumOptions: js.Array[EnumOptionsType[S]]
): js.UndefOr[String | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsIndexForValue")(value.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | js.Array[String]]]
inline def enumOptionsIndexForValue_value[S /* <: StrictRJSFSchema */](
  value: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any,
  allEnumOptions: js.Array[EnumOptionsType[S]],
  multiple: Boolean
): js.UndefOr[String | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsIndexForValue")(value.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any], multiple.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | js.Array[String]]]
inline def enumOptionsIndexForValue_value[S /* <: StrictRJSFSchema */](
  value: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any,
  allEnumOptions: Unit,
  multiple: Boolean
): js.UndefOr[String | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsIndexForValue")(value.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any], multiple.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | js.Array[String]]]
inline def enumOptionsIndexForValue_value[S /* <: StrictRJSFSchema */](
  value: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
]
): js.UndefOr[String | js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsIndexForValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | js.Array[String]]]
inline def enumOptionsIndexForValue_value[S /* <: StrictRJSFSchema */](
  value: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
],
  allEnumOptions: js.Array[EnumOptionsType[S]]
): js.UndefOr[String | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsIndexForValue")(value.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | js.Array[String]]]
inline def enumOptionsIndexForValue_value[S /* <: StrictRJSFSchema */](
  value: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
],
  allEnumOptions: js.Array[EnumOptionsType[S]],
  multiple: Boolean
): js.UndefOr[String | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsIndexForValue")(value.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any], multiple.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | js.Array[String]]]
inline def enumOptionsIndexForValue_value[S /* <: StrictRJSFSchema */](
  value: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
],
  allEnumOptions: Unit,
  multiple: Boolean
): js.UndefOr[String | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsIndexForValue")(value.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any], multiple.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | js.Array[String]]]

/** Determines whether the given `value` is (one of) the `selected` value(s).
  *
  * @param value - The value being checked to see if it is selected
  * @param selected - The current selected value or list of values
  * @returns - true if the `value` is one of the `selected` ones, false otherwise
  */
inline def enumOptionsIsSelected_value[S /* <: StrictRJSFSchema */](
  value: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any,
  selected: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsIsSelected")(value.asInstanceOf[js.Any], selected.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def enumOptionsIsSelected_value[S /* <: StrictRJSFSchema */](
  value: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any,
  selected: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsIsSelected")(value.asInstanceOf[js.Any], selected.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** Add the enum option value at the `valueIndex` to the list of `selected` values in the proper order as defined by
  * `allEnumOptions`
  *
  * @param valueIndex - The index of the value that should be selected
  * @param selected - The current list of selected values
  * @param [allEnumOptions=[]] - The list of all the known enumOptions
  * @returns - The updated list of selected enum values with enum value at the `valueIndex` added to it
  */
inline def enumOptionsSelectValue_value[S /* <: StrictRJSFSchema */](
  valueIndex: String,
  selected: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
]
): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsSelectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
inline def enumOptionsSelectValue_value[S /* <: StrictRJSFSchema */](
  valueIndex: String,
  selected: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
],
  allEnumOptions: js.Array[EnumOptionsType[S]]
): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsSelectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
inline def enumOptionsSelectValue_value[S /* <: StrictRJSFSchema */](
  valueIndex: Double,
  selected: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
]
): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsSelectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
inline def enumOptionsSelectValue_value[S /* <: StrictRJSFSchema */](
  valueIndex: Double,
  selected: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
],
  allEnumOptions: js.Array[EnumOptionsType[S]]
): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsSelectValue")(valueIndex.asInstanceOf[js.Any], selected.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

/** Returns the value(s) from `allEnumOptions` at the index(es) provided by `valueIndex`. If `valueIndex` is not an
  * array AND the index is not valid for `allEnumOptions`, `emptyValue` is returned. If `valueIndex` is an array, AND it
  * contains an invalid index, the returned array will have the resulting undefined values filtered out, leaving only
  * valid values or in the worst case, an empty array.
  *
  * @param valueIndex - The index(es) of the value(s) that should be returned
  * @param [allEnumOptions=[]] - The list of all the known enumOptions
  * @param [emptyValue] - The value to return when the non-array `valueIndex` does not refer to a real option
  * @returns - The single or list of values specified by the single or list of indexes if they are valid. Otherwise,
  *        `emptyValue` or an empty list.
  */
inline def enumOptionsValueForIndex[S /* <: StrictRJSFSchema */](valueIndex: String): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsValueForIndex")(valueIndex.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsValueForIndex[S /* <: StrictRJSFSchema */](valueIndex: String, allEnumOptions: js.Array[EnumOptionsType[S]]): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsValueForIndex")(valueIndex.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsValueForIndex[S /* <: StrictRJSFSchema */](valueIndex: js.Array[String | Double]): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsValueForIndex")(valueIndex.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsValueForIndex[S /* <: StrictRJSFSchema */](valueIndex: js.Array[String | Double], allEnumOptions: js.Array[EnumOptionsType[S]]): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsValueForIndex")(valueIndex.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsValueForIndex[S /* <: StrictRJSFSchema */](valueIndex: Double): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsValueForIndex")(valueIndex.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsValueForIndex[S /* <: StrictRJSFSchema */](valueIndex: Double, allEnumOptions: js.Array[EnumOptionsType[S]]): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsValueForIndex")(valueIndex.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]

inline def enumOptionsValueForIndex_value[S /* <: StrictRJSFSchema */](
  valueIndex: String,
  allEnumOptions: js.Array[EnumOptionsType[S]],
  emptyValue: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsValueForIndex")(valueIndex.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any], emptyValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsValueForIndex_value[S /* <: StrictRJSFSchema */](
  valueIndex: String,
  allEnumOptions: Unit,
  emptyValue: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsValueForIndex")(valueIndex.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any], emptyValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsValueForIndex_value[S /* <: StrictRJSFSchema */](
  valueIndex: js.Array[String | Double],
  allEnumOptions: js.Array[EnumOptionsType[S]],
  emptyValue: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsValueForIndex")(valueIndex.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any], emptyValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsValueForIndex_value[S /* <: StrictRJSFSchema */](
  valueIndex: js.Array[String | Double],
  allEnumOptions: Unit,
  emptyValue: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsValueForIndex")(valueIndex.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any], emptyValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsValueForIndex_value[S /* <: StrictRJSFSchema */](
  valueIndex: Double,
  allEnumOptions: js.Array[EnumOptionsType[S]],
  emptyValue: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsValueForIndex")(valueIndex.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any], emptyValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]
inline def enumOptionsValueForIndex_value[S /* <: StrictRJSFSchema */](
  valueIndex: Double,
  allEnumOptions: Unit,
  emptyValue: /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
): js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumOptionsValueForIndex")(valueIndex.asInstanceOf[js.Any], allEnumOptions.asInstanceOf[js.Any], emptyValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
(/* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any) | (js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: @rjsf/utils.@rjsf/utils.EnumOptionsType<S>['value'] */ js.Any
])]]

inline def errorId[T](id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("errorId")(id.asInstanceOf[js.Any]).asInstanceOf[String]
/** Return a consistent `id` for the field error element
  *
  * @param id - Either simple string id or an IdSchema from which to extract it
  * @returns - The consistent id for the field error element from the given `id`
  */
inline def errorId[T](id: IdSchema[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("errorId")(id.asInstanceOf[js.Any]).asInstanceOf[String]

inline def examplesId[T](id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("examplesId")(id.asInstanceOf[js.Any]).asInstanceOf[String]
/** Return a consistent `id` for the field examples element
  *
  * @param id - Either simple string id or an IdSchema from which to extract it
  * @returns - The consistent id for the field examples element from the given `id`
  */
inline def examplesId[T](id: IdSchema[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("examplesId")(id.asInstanceOf[js.Any]).asInstanceOf[String]

/** Given the name of a `$ref` from within a schema, using the `rootSchema`, look up and return the sub-schema using the
  * path provided by that reference. If `#` is not the first character of the reference, or the path does not exist in
  * the schema, then throw an Error. Otherwise return the sub-schema. Also deals with nested `$ref`s in the sub-schema.
  *
  * @param $ref - The ref string for which the schema definition is desired
  * @param [rootSchema={}] - The root schema in which to search for the definition
  * @returns - The sub-schema within the `rootSchema` which matches the `$ref` if it exists
  * @throws - Error indicating that no schema for that reference exists
  */
inline def findSchemaDefinition[S /* <: StrictRJSFSchema */](): S = ^.asInstanceOf[js.Dynamic].applyDynamic("findSchemaDefinition")().asInstanceOf[S]
inline def findSchemaDefinition[S /* <: StrictRJSFSchema */]($ref: String): S = ^.asInstanceOf[js.Dynamic].applyDynamic("findSchemaDefinition")($ref.asInstanceOf[js.Any]).asInstanceOf[S]
inline def findSchemaDefinition[S /* <: StrictRJSFSchema */]($ref: String, rootSchema: S): S = (^.asInstanceOf[js.Dynamic].applyDynamic("findSchemaDefinition")($ref.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[S]
inline def findSchemaDefinition[S /* <: StrictRJSFSchema */]($ref: Unit, rootSchema: S): S = (^.asInstanceOf[js.Dynamic].applyDynamic("findSchemaDefinition")($ref.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[S]

/** Determines which of the given `options` provided most closely matches the `formData`. Using
  * `getFirstMatchingOption()` to match two schemas that differ only by the readOnly, default or const value of a field
  * based on the `formData` and returns 0 when there is no match. Rather than passing in all the `options` at once to
  * this utility, instead an array of valid option indexes is created by iterating over the list of options, call
  * `getFirstMatchingOptions` with a list of one junk option and one good option, seeing if the good option is considered
  * matched.
  *
  * Once the list of valid indexes is created, if there is only one valid index, just return it. Otherwise, if there are
  * no valid indexes, then fill the valid indexes array with the indexes of all the options. Next, the index of the
  * option with the highest score is determined by iterating over the list of valid options, calling
  * `calculateIndexScore()` on each, comparing it against the current best score, and returning the index of the one that
  * eventually has the best score.
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param rootSchema - The root JSON schema of the entire form
  * @param formData - The form data associated with the schema
  * @param options - The list of options that can be selected from
  * @param [selectedOption=-1] - The index of the currently selected option, defaulted to -1 if not specified
  * @param [discriminatorField] - The optional name of the field within the options object whose value is used to
  *          determine which option is selected
  * @returns - The index of the option that is the closest match to the `formData` or the `selectedOption` if no match
  */
inline def getClosestMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], rootSchema: S, formData: T, options: js.Array[S]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClosestMatchingOption")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getClosestMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  rootSchema: S,
  formData: T,
  options: js.Array[S],
  selectedOption: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClosestMatchingOption")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], selectedOption.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getClosestMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  rootSchema: S,
  formData: T,
  options: js.Array[S],
  selectedOption: Double,
  discriminatorField: String
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClosestMatchingOption")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], selectedOption.asInstanceOf[js.Any], discriminatorField.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getClosestMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  rootSchema: S,
  formData: T,
  options: js.Array[S],
  selectedOption: Unit,
  discriminatorField: String
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClosestMatchingOption")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], selectedOption.asInstanceOf[js.Any], discriminatorField.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getClosestMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], rootSchema: S, formData: Unit, options: js.Array[S]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClosestMatchingOption")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getClosestMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  rootSchema: S,
  formData: Unit,
  options: js.Array[S],
  selectedOption: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClosestMatchingOption")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], selectedOption.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getClosestMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  rootSchema: S,
  formData: Unit,
  options: js.Array[S],
  selectedOption: Double,
  discriminatorField: String
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClosestMatchingOption")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], selectedOption.asInstanceOf[js.Any], discriminatorField.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getClosestMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  rootSchema: S,
  formData: Unit,
  options: js.Array[S],
  selectedOption: Unit,
  discriminatorField: String
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClosestMatchingOption")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], selectedOption.asInstanceOf[js.Any], discriminatorField.asInstanceOf[js.Any])).asInstanceOf[Double]

/** Returns the superset of `formData` that includes the given set updated to include any missing fields that have
  * computed to have defaults provided in the `schema`.
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param theSchema - The schema for which the default state is desired
  * @param [formData] - The current formData, if any, onto which to provide any missing defaults
  * @param [rootSchema] - The root schema, used to primarily to look up `$ref`s
  * @param [includeUndefinedValues=false] - Optional flag, if true, cause undefined values to be added as defaults.
  *          If "excludeObjectChildren", cause undefined values for this object and pass `includeUndefinedValues` as
  *          false when computing defaults for any nested object properties.
  * @returns - The resulting `formData` with all the defaults provided
  */
inline def getDefaultFormState[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], theSchema: S): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], theSchema: S, formData: T): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], theSchema: S, formData: T, rootSchema: S): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  theSchema: S,
  formData: T,
  rootSchema: S,
  includeUndefinedValues: Boolean
): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  theSchema: S,
  formData: T,
  rootSchema: Unit,
  includeUndefinedValues: Boolean
): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], theSchema: S, formData: Unit, rootSchema: S): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  theSchema: S,
  formData: Unit,
  rootSchema: S,
  includeUndefinedValues: Boolean
): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  theSchema: S,
  formData: Unit,
  rootSchema: Unit,
  includeUndefinedValues: Boolean
): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]

inline def getDefaultFormState_excludeObjectChildren[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  theSchema: S,
  formData: T,
  rootSchema: S,
  includeUndefinedValues: excludeObjectChildren
): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState_excludeObjectChildren[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  theSchema: S,
  formData: T,
  rootSchema: Unit,
  includeUndefinedValues: excludeObjectChildren
): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState_excludeObjectChildren[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  theSchema: S,
  formData: Unit,
  rootSchema: S,
  includeUndefinedValues: excludeObjectChildren
): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState_excludeObjectChildren[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  theSchema: S,
  formData: Unit,
  rootSchema: Unit,
  includeUndefinedValues: excludeObjectChildren
): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]

/** Determines whether the combination of `schema` and `uiSchema` properties indicates that the label for the `schema`
  * should be displayed in a UI.
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param schema - The schema for which the display label flag is desired
  * @param [uiSchema={}] - The UI schema from which to derive potentially displayable information
  * @param [rootSchema] - The root schema, used to primarily to look up `$ref`s
  * @param [globalOptions={}] - The optional Global UI Schema from which to get any fallback `xxx` options
  * @returns - True if the label should be displayed or false if it should not
  */
inline def getDisplayLabel[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLabel")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def getDisplayLabel[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, uiSchema: Unit, rootSchema: S): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLabel")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def getDisplayLabel[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  uiSchema: Unit,
  rootSchema: S,
  globalOptions: GlobalUISchemaOptions
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLabel")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], globalOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def getDisplayLabel[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  uiSchema: Unit,
  rootSchema: Unit,
  globalOptions: GlobalUISchemaOptions
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLabel")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], globalOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def getDisplayLabel[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, uiSchema: UiSchema[T, S, F]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLabel")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def getDisplayLabel[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, uiSchema: UiSchema[T, S, F], rootSchema: S): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLabel")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def getDisplayLabel[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  uiSchema: UiSchema[T, S, F],
  rootSchema: S,
  globalOptions: GlobalUISchemaOptions
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLabel")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], globalOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def getDisplayLabel[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  uiSchema: UiSchema[T, S, F],
  rootSchema: Unit,
  globalOptions: GlobalUISchemaOptions
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLabel")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], globalOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** Given the `formData` and list of `options`, attempts to find the index of the first option that matches the data.
  * Always returns the first option if there is nothing that matches.
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param formData - The current formData, if any, used to figure out a match
  * @param options - The list of options to find a matching options from
  * @param rootSchema - The root schema, used to primarily to look up `$ref`s
  * @param [discriminatorField] - The optional name of the field within the options object whose value is used to
  *          determine which option is selected
  * @returns - The index of the first matched option or 0 if none is available
  */
inline def getFirstMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], formData: T, options: js.Array[S], rootSchema: S): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstMatchingOption")(validator.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getFirstMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  formData: T,
  options: js.Array[S],
  rootSchema: S,
  discriminatorField: String
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstMatchingOption")(validator.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], discriminatorField.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getFirstMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], formData: Unit, options: js.Array[S], rootSchema: S): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstMatchingOption")(validator.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getFirstMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  formData: Unit,
  options: js.Array[S],
  rootSchema: S,
  discriminatorField: String
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstMatchingOption")(validator.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], discriminatorField.asInstanceOf[js.Any])).asInstanceOf[Double]

/** Using the `schema`, `defaultType` and `options`, extract out the props for the <input> element that make sense.
  *
  * @param schema - The schema for the field provided by the widget
  * @param [defaultType] - The default type, if any, for the field provided by the widget
  * @param [options={}] - The UI Options for the field provided by the widget
  * @param [autoDefaultStepAny=true] - Determines whether to auto-default step=any when the type is number and no step
  * @returns - The extracted `InputPropsType` object
  */
inline def getInputProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema): InputPropsType = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any]).asInstanceOf[InputPropsType]
inline def getInputProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, defaultType: String): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]
inline def getInputProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, defaultType: String, options: Unit, autoDefaultStepAny: Boolean): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoDefaultStepAny.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]
inline def getInputProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, defaultType: String, options: UIOptionsType[T, S, F]): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]
inline def getInputProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  schema: RJSFSchema,
  defaultType: String,
  options: UIOptionsType[T, S, F],
  autoDefaultStepAny: Boolean
): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoDefaultStepAny.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]
inline def getInputProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, defaultType: Unit, options: Unit, autoDefaultStepAny: Boolean): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoDefaultStepAny.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]
inline def getInputProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, defaultType: Unit, options: UIOptionsType[T, S, F]): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]
inline def getInputProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  schema: RJSFSchema,
  defaultType: Unit,
  options: UIOptionsType[T, S, F],
  autoDefaultStepAny: Boolean
): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoDefaultStepAny.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]

/** Given the `formData` and list of `options`, attempts to find the index of the option that best matches the data.
  * Deprecated, use `getFirstMatchingOption()` instead.
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param formData - The current formData, if any, used to figure out a match
  * @param options - The list of options to find a matching options from
  * @param rootSchema - The root schema, used to primarily to look up `$ref`s
  * @param [discriminatorField] - The optional name of the field within the options object whose value is used to
  *          determine which option is selected
  * @returns - The index of the matched option or 0 if none is available
  * @deprecated
  */
inline def getMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], formData: T, options: js.Array[S], rootSchema: S): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingOption")(validator.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  formData: T,
  options: js.Array[S],
  rootSchema: S,
  discriminatorField: String
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingOption")(validator.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], discriminatorField.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], formData: Unit, options: js.Array[S], rootSchema: S): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingOption")(validator.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getMatchingOption[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  formData: Unit,
  options: js.Array[S],
  rootSchema: S,
  discriminatorField: String
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingOption")(validator.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], discriminatorField.asInstanceOf[js.Any])).asInstanceOf[Double]

/** Gets the type of a given `schema`. If the type is not explicitly defined, then an attempt is made to infer it from
  * other elements of the schema as follows:
  * - schema.const: Returns the `guessType()` of that value
  * - schema.enum: Returns `string`
  * - schema.properties: Returns `object`
  * - schema.additionalProperties: Returns `object`
  * - type is an array with a length of 2 and one type is 'null': Returns the other type
  *
  * @param schema - The schema for which to get the type
  * @returns - The type of the schema
  */
inline def getSchemaType[S /* <: StrictRJSFSchema */](schema: S): js.UndefOr[String | js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemaType")(schema.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | js.Array[String]]]

/** Extracts any `ui:submitButtonOptions` from the `uiSchema` and merges them onto the `DEFAULT_OPTIONS`
  *
  * @param [uiSchema={}] - the UI Schema from which to extract submit button props
  * @returns - The merging of the `DEFAULT_OPTIONS` with any custom ones
  */
inline def getSubmitButtonOptions[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](): UISchemaSubmitButtonOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubmitButtonOptions")().asInstanceOf[UISchemaSubmitButtonOptions]
inline def getSubmitButtonOptions[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](uiSchema: UiSchema[T, S, F]): UISchemaSubmitButtonOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubmitButtonOptions")(uiSchema.asInstanceOf[js.Any]).asInstanceOf[UISchemaSubmitButtonOptions]

inline def getTemplate_ArrayFieldDescriptionTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: ArrayFieldDescriptionTemplate, registry: Registry[T, S, F]): ComponentType[ArrayFieldDescriptionProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldDescriptionProps[T, S, F]]]
inline def getTemplate_ArrayFieldDescriptionTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  name: ArrayFieldDescriptionTemplate,
  registry: Registry[T, S, F],
  uiOptions: UIOptionsType[T, S, F]
): ComponentType[ArrayFieldDescriptionProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldDescriptionProps[T, S, F]]]

inline def getTemplate_ArrayFieldItemTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: ArrayFieldItemTemplate, registry: Registry[T, S, F]): ComponentType[ArrayFieldTemplateItemType[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldTemplateItemType[T, S, F]]]
inline def getTemplate_ArrayFieldItemTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: ArrayFieldItemTemplate, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): ComponentType[ArrayFieldTemplateItemType[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldTemplateItemType[T, S, F]]]

/** Returns the template with the given `name` from either the `uiSchema` if it is defined or from the `registry`
  * otherwise. NOTE, since `ButtonTemplates` are not overridden in `uiSchema` only those in the `registry` are returned.
  *
  * @param name - The name of the template to fetch, restricted to the keys of `TemplatesType`
  * @param registry - The `Registry` from which to read the template
  * @param [uiOptions={}] - The `UIOptionsType` from which to read an alternate template
  * @returns - The template from either the `uiSchema` or `registry` for the `name`
  */
inline def getTemplate_ArrayFieldTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: ArrayFieldTemplate, registry: Registry[T, S, F]): ComponentType[ArrayFieldTemplateProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldTemplateProps[T, S, F]]]
inline def getTemplate_ArrayFieldTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: ArrayFieldTemplate, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): ComponentType[ArrayFieldTemplateProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldTemplateProps[T, S, F]]]

inline def getTemplate_ArrayFieldTitleTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: ArrayFieldTitleTemplate, registry: Registry[T, S, F]): ComponentType[ArrayFieldTitleProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldTitleProps[T, S, F]]]
inline def getTemplate_ArrayFieldTitleTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: ArrayFieldTitleTemplate, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): ComponentType[ArrayFieldTitleProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldTitleProps[T, S, F]]]

inline def getTemplate_BaseInputTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: BaseInputTemplate, registry: Registry[T, S, F]): ComponentType[BaseInputTemplateProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[BaseInputTemplateProps[T, S, F]]]
inline def getTemplate_BaseInputTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: BaseInputTemplate, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): ComponentType[BaseInputTemplateProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[BaseInputTemplateProps[T, S, F]]]

inline def getTemplate_ButtonTemplates[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: ButtonTemplates, registry: Registry[T, S, F]): AddButton[T, S, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[AddButton[T, S, F]]
inline def getTemplate_ButtonTemplates[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: ButtonTemplates, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): AddButton[T, S, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[AddButton[T, S, F]]

inline def getTemplate_DescriptionFieldTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: DescriptionFieldTemplate, registry: Registry[T, S, F]): ComponentType[DescriptionFieldProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[DescriptionFieldProps[T, S, F]]]
inline def getTemplate_DescriptionFieldTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: DescriptionFieldTemplate, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): ComponentType[DescriptionFieldProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[DescriptionFieldProps[T, S, F]]]

inline def getTemplate_ErrorListTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: ErrorListTemplate, registry: Registry[T, S, F]): ComponentType[ErrorListProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ErrorListProps[T, S, F]]]
inline def getTemplate_ErrorListTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: ErrorListTemplate, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): ComponentType[ErrorListProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ErrorListProps[T, S, F]]]

inline def getTemplate_FieldErrorTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: FieldErrorTemplate, registry: Registry[T, S, F]): ComponentType[FieldErrorProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[FieldErrorProps[T, S, F]]]
inline def getTemplate_FieldErrorTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: FieldErrorTemplate, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): ComponentType[FieldErrorProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[FieldErrorProps[T, S, F]]]

inline def getTemplate_FieldHelpTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: FieldHelpTemplate, registry: Registry[T, S, F]): ComponentType[FieldHelpProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[FieldHelpProps[T, S, F]]]
inline def getTemplate_FieldHelpTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: FieldHelpTemplate, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): ComponentType[FieldHelpProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[FieldHelpProps[T, S, F]]]

inline def getTemplate_FieldTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: FieldTemplate, registry: Registry[T, S, F]): ComponentType[FieldTemplateProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[FieldTemplateProps[T, S, F]]]
inline def getTemplate_FieldTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: FieldTemplate, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): ComponentType[FieldTemplateProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[FieldTemplateProps[T, S, F]]]

inline def getTemplate_ObjectFieldTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: ObjectFieldTemplate, registry: Registry[T, S, F]): ComponentType[ObjectFieldTemplateProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ObjectFieldTemplateProps[T, S, F]]]
inline def getTemplate_ObjectFieldTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: ObjectFieldTemplate, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): ComponentType[ObjectFieldTemplateProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ObjectFieldTemplateProps[T, S, F]]]

inline def getTemplate_TitleFieldTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: TitleFieldTemplate, registry: Registry[T, S, F]): ComponentType[TitleFieldProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[TitleFieldProps[T, S, F]]]
inline def getTemplate_TitleFieldTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: TitleFieldTemplate, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): ComponentType[TitleFieldProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[TitleFieldProps[T, S, F]]]

inline def getTemplate_UnsupportedFieldTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: UnsupportedFieldTemplate, registry: Registry[T, S, F]): ComponentType[UnsupportedFieldProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[UnsupportedFieldProps[T, S, F]]]
inline def getTemplate_UnsupportedFieldTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: UnsupportedFieldTemplate, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): ComponentType[UnsupportedFieldProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[UnsupportedFieldProps[T, S, F]]]

inline def getTemplate_WrapIfAdditionalTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: WrapIfAdditionalTemplate, registry: Registry[T, S, F]): ComponentType[WrapIfAdditionalTemplateProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[WrapIfAdditionalTemplateProps[T, S, F]]]
inline def getTemplate_WrapIfAdditionalTemplate[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](name: WrapIfAdditionalTemplate, registry: Registry[T, S, F], uiOptions: UIOptionsType[T, S, F]): ComponentType[WrapIfAdditionalTemplateProps[T, S, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[WrapIfAdditionalTemplateProps[T, S, F]]]

/** Get all passed options from ui:options, and ui:<optionName>, returning them in an object with the `ui:`
  * stripped off. Any `globalOptions` will always be returned, unless they are overridden by options in the `uiSchema`.
  *
  * @param [uiSchema={}] - The UI Schema from which to get any `ui:xxx` options
  * @param [globalOptions={}] - The optional Global UI Schema from which to get any fallback `xxx` options
  * @returns - An object containing all the `ui:xxx` options with the `ui:` stripped off along with all `globalOptions`
  */
inline def getUiOptions[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](): UIOptionsType[T, S, F] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUiOptions")().asInstanceOf[UIOptionsType[T, S, F]]
inline def getUiOptions[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](uiSchema: Unit, globalOptions: GlobalUISchemaOptions): UIOptionsType[T, S, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUiOptions")(uiSchema.asInstanceOf[js.Any], globalOptions.asInstanceOf[js.Any])).asInstanceOf[UIOptionsType[T, S, F]]
inline def getUiOptions[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](uiSchema: UiSchema[T, S, F]): UIOptionsType[T, S, F] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUiOptions")(uiSchema.asInstanceOf[js.Any]).asInstanceOf[UIOptionsType[T, S, F]]
inline def getUiOptions[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](uiSchema: UiSchema[T, S, F], globalOptions: GlobalUISchemaOptions): UIOptionsType[T, S, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUiOptions")(uiSchema.asInstanceOf[js.Any], globalOptions.asInstanceOf[js.Any])).asInstanceOf[UIOptionsType[T, S, F]]

/** Given a schema representing a field to render and either the name or actual `Widget` implementation, returns the
  * React component that is used to render the widget. If the `widget` is already a React component, then it is wrapped
  * with a `MergedWidget`. Otherwise an attempt is made to look up the widget inside of the `registeredWidgets` map based
  * on the schema type and `widget` name. If no widget component can be found an `Error` is thrown.
  *
  * @param schema - The schema for the field
  * @param [widget] - Either the name of the widget OR a `Widget` implementation to use
  * @param [registeredWidgets={}] - A registry of widget name to `Widget` implementation
  * @returns - The `Widget` component to use
  * @throws - An error if there is no `Widget` component that can be returned
  */
inline def getWidget[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema): Widget[T, S, F] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any]).asInstanceOf[Widget[T, S, F]]
inline def getWidget[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, widget: String): Widget[T, S, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any])).asInstanceOf[Widget[T, S, F]]
inline def getWidget[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, widget: String, registeredWidgets: RegistryWidgetsType[T, S, F]): Widget[T, S, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Widget[T, S, F]]
inline def getWidget[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, widget: Unit, registeredWidgets: RegistryWidgetsType[T, S, F]): Widget[T, S, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Widget[T, S, F]]
inline def getWidget[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, widget: Widget[T, S, F]): Widget[T, S, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any])).asInstanceOf[Widget[T, S, F]]
inline def getWidget[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, widget: Widget[T, S, F], registeredWidgets: RegistryWidgetsType[T, S, F]): Widget[T, S, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Widget[T, S, F]]

/** Given a specific `value` attempts to guess the type of a schema element. In the case where we have to implicitly
  *  create a schema, it is useful to know what type to use based on the data we are defining.
  *
  * @param value - The value from which to guess the type
  * @returns - The best guess for the object type
  */
inline def guessType(value: Any): array | string | `null` | boolean | number | `object` = ^.asInstanceOf[js.Dynamic].applyDynamic("guessType")(value.asInstanceOf[js.Any]).asInstanceOf[array | string | `null` | boolean | number | `object`]

inline def hasWidget[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, widget: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def hasWidget[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, widget: String, registeredWidgets: RegistryWidgetsType[T, S, F]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Boolean]
/** Detects whether the `widget` exists for the `schema` with the associated `registryWidgets` and returns true if it
  * does, or false if it doesn't.
  *
  * @param schema - The schema for the field
  * @param widget - Either the name of the widget OR a `Widget` implementation to use
  * @param [registeredWidgets={}] - A registry of widget name to `Widget` implementation
  * @returns - True if the widget exists, false otherwise
  */
inline def hasWidget[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, widget: Widget[T, S, F]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def hasWidget[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](schema: RJSFSchema, widget: Widget[T, S, F], registeredWidgets: RegistryWidgetsType[T, S, F]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def helpId[T](id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("helpId")(id.asInstanceOf[js.Any]).asInstanceOf[String]
/** Return a consistent `id` for the field help element
  *
  * @param id - Either simple string id or an IdSchema from which to extract it
  * @returns - The consistent id for the field help element from the given `id`
  */
inline def helpId[T](id: IdSchema[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("helpId")(id.asInstanceOf[js.Any]).asInstanceOf[String]

/** This function checks if the given `schema` matches a single constant value. This happens when either the schema has
  * an `enum` array with a single value or there is a `const` defined.
  *
  * @param schema - The schema for a field
  * @returns - True if the `schema` has a single constant value, false otherwise
  */
inline def isConstant[S /* <: StrictRJSFSchema */](schema: S): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstant")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** Checks to see if the `uiSchema` contains the `widget` field and that the widget is not `hidden`
  *
  * @param uiSchema - The UI Schema from which to detect if it is customized
  * @returns - True if the `uiSchema` describes a custom widget, false otherwise
  */
inline def isCustomWidget[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomWidget")().asInstanceOf[Boolean]
inline def isCustomWidget[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](uiSchema: UiSchema[T, S, F]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomWidget")(uiSchema.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** Checks to see if the `schema` and `uiSchema` combination represents an array of files
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param schema - The schema for which check for array of files flag is desired
  * @param [uiSchema={}] - The UI schema from which to check the widget
  * @param [rootSchema] - The root schema, used to primarily to look up `$ref`s
  * @returns - True if schema/uiSchema contains an array of files, otherwise false
  */
inline def isFilesArray[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFilesArray")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isFilesArray[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, uiSchema: Unit, rootSchema: S): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFilesArray")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isFilesArray[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, uiSchema: UiSchema[T, S, F]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFilesArray")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isFilesArray[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, uiSchema: UiSchema[T, S, F], rootSchema: S): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFilesArray")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** Detects whether the given `schema` contains fixed items. This is the case when `schema.items` is a non-empty array
  * that only contains objects.
  *
  * @param schema - The schema in which to check for fixed items
  * @returns - True if there are fixed items in the schema, false otherwise
  */
inline def isFixedItems[S /* <: StrictRJSFSchema */](schema: S): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixedItems")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** Checks to see if the `schema` combination represents a multi-select
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param schema - The schema for which check for a multi-select flag is desired
  * @param [rootSchema] - The root schema, used to primarily to look up `$ref`s
  * @returns - True if schema contains a multi-select, otherwise false
  */
inline def isMultiSelect[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMultiSelect")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isMultiSelect[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, rootSchema: S): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMultiSelect")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** Determines whether a `thing` is an object for the purposes of RSJF. In this case, `thing` is an object if it has
  * the type `object` but is NOT null, an array or a File.
  *
  * @param thing - The thing to check to see whether it is an object
  * @returns - True if it is a non-null, non-array, non-File object
  */
inline def isObject(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** Checks to see if the `schema` combination represents a select
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param theSchema - The schema for which check for a select flag is desired
  * @param [rootSchema] - The root schema, used to primarily to look up `$ref`s
  * @returns - True if schema contains a select, otherwise false
  */
inline def isSelect[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], theSchema: S): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSelect")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isSelect[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], theSchema: S, rootSchema: S): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSelect")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** Helper function that will return the value to use for a widget `label` based on `hideLabel`. The `fallback` is used
  * as the return value from the function when `hideLabel` is true. Due to the implementation of theme components, it
  * may be necessary to return something other than `undefined` to cause the theme component to not render a label. Some
  * themes require may `false` and others may require an empty string.
  *
  * @param [label] - The label string or component to render when not hidden
  * @param [hideLabel] - Flag, if true, will cause the label to be hidden
  * @param [fallback] - One of 3 values, `undefined` (the default), `false` or an empty string
  * @returns - `fallback` if `hideLabel` is true, otherwise `label`
  */
inline def labelValue(): js.UndefOr[String | `false` | ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")().asInstanceOf[js.UndefOr[String | `false` | ReactElement]]
inline def labelValue(label: String): js.UndefOr[String | `false` | ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | `false` | ReactElement]]
inline def labelValue(label: String, hideLabel: Boolean): js.UndefOr[String | `false` | ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | `false` | ReactElement]]
inline def labelValue(label: String, hideLabel: Boolean, fallback: _empty): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
inline def labelValue(label: String, hideLabel: Unit, fallback: _empty): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
inline def labelValue(label: Unit, hideLabel: Boolean): js.UndefOr[String | `false` | ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | `false` | ReactElement]]
inline def labelValue(label: Unit, hideLabel: Boolean, fallback: _empty): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
inline def labelValue(label: Unit, hideLabel: Unit, fallback: _empty): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
inline def labelValue(label: ReactElement): js.UndefOr[String | `false` | ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | `false` | ReactElement]]
inline def labelValue(label: ReactElement, hideLabel: Boolean): js.UndefOr[String | `false` | ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | `false` | ReactElement]]
inline def labelValue(label: ReactElement, hideLabel: Boolean, fallback: _empty): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
inline def labelValue(label: ReactElement, hideLabel: Unit, fallback: _empty): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]

inline def labelValue_false(label: String, hideLabel: Boolean, fallback: `false` | _empty): js.UndefOr[String | `false` | ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | `false` | ReactElement]]
inline def labelValue_false(label: String, hideLabel: Unit, fallback: `false` | _empty): js.UndefOr[String | `false` | ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | `false` | ReactElement]]
inline def labelValue_false(label: Unit, hideLabel: Boolean, fallback: `false` | _empty): js.UndefOr[String | `false` | ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | `false` | ReactElement]]
inline def labelValue_false(label: Unit, hideLabel: Unit, fallback: `false` | _empty): js.UndefOr[String | `false` | ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | `false` | ReactElement]]
inline def labelValue_false(label: ReactElement, hideLabel: Boolean, fallback: `false` | _empty): js.UndefOr[String | `false` | ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | `false` | ReactElement]]
inline def labelValue_false(label: ReactElement, hideLabel: Unit, fallback: `false` | _empty): js.UndefOr[String | `false` | ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("labelValue")(label.asInstanceOf[js.Any], hideLabel.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | `false` | ReactElement]]

/** Converts a local Date string into a UTC date string
  *
  * @param dateString - The string representation of a date as accepted by the `Date()` constructor
  * @returns - A UTC date string if `dateString` is truthy, otherwise undefined
  */
inline def localToUTC(dateString: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("localToUTC")(dateString.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]

/** Merges the `defaults` object of type `T` into the `formData` of type `T`
  *
  * When merging defaults and form data, we want to merge in this specific way:
  * - objects are deeply merged
  * - arrays are merged in such a way that:
  *   - when the array is set in form data, only array entries set in form data
  *     are deeply merged; additional entries from the defaults are ignored
  *   - when the array is not set in form data, the default is copied over
  * - scalars are overwritten/set by form data
  *
  * @param [defaults] - The defaults to merge
  * @param [formData] - The form data into which the defaults will be merged
  * @returns - The resulting merged form data with defaults
  */
inline def mergeDefaultsWithFormData[T](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDefaultsWithFormData")().asInstanceOf[js.UndefOr[T]]
inline def mergeDefaultsWithFormData[T](defaults: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDefaultsWithFormData")(defaults.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
inline def mergeDefaultsWithFormData[T](defaults: T, formData: T): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDefaultsWithFormData")(defaults.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def mergeDefaultsWithFormData[T](defaults: Unit, formData: T): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDefaultsWithFormData")(defaults.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

/** Recursively merge deeply nested objects.
  *
  * @param obj1 - The first object to merge
  * @param obj2 - The second object to merge
  * @param [concatArrays=false] - Optional flag that, when true, will cause arrays to be concatenated. Use
  *          "preventDuplicates" to merge arrays in a manner that prevents any duplicate entries from being merged.
  *          NOTE: Uses shallow comparison for the duplicate checking.
  * @returns - A new object that is the merge of the two given objects
  */
inline def mergeObjects(obj1: GenericObjectType, obj2: GenericObjectType): GenericObjectType = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeObjects")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[GenericObjectType]
inline def mergeObjects(obj1: GenericObjectType, obj2: GenericObjectType, concatArrays: Boolean): GenericObjectType = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeObjects")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any], concatArrays.asInstanceOf[js.Any])).asInstanceOf[GenericObjectType]

inline def mergeObjects_preventDuplicates(obj1: GenericObjectType, obj2: GenericObjectType, concatArrays: preventDuplicates): GenericObjectType = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeObjects")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any], concatArrays.asInstanceOf[js.Any])).asInstanceOf[GenericObjectType]

/** Recursively merge deeply nested schemas. The difference between `mergeSchemas` and `mergeObjects` is that
  * `mergeSchemas` only concats arrays for values under the 'required' keyword, and when it does, it doesn't include
  * duplicate values.
  *
  * @param obj1 - The first schema object to merge
  * @param obj2 - The second schema object to merge
  * @returns - The merged schema object
  */
inline def mergeSchemas(obj1: GenericObjectType, obj2: GenericObjectType): GenericObjectType = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeSchemas")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[GenericObjectType]

/** Merges the errors in `additionalErrorSchema` into the existing `validationData` by combining the hierarchies in the
  * two `ErrorSchema`s and then appending the error list from the `additionalErrorSchema` obtained by calling
  * `validator.toErrorList()` onto the `errors` in the `validationData`. If no `additionalErrorSchema` is passed, then
  * `validationData` is returned.
  *
  * @param validator - The validator used to convert an ErrorSchema to a list of errors
  * @param validationData - The current `ValidationData` into which to merge the additional errors
  * @param [additionalErrorSchema] - The additional set of errors in an `ErrorSchema`
  * @returns - The `validationData` with the additional errors from `additionalErrorSchema` merged into it, if provided.
  * @deprecated - Use the `validationDataMerge()` function exported from `@rjsf/utils` instead. This function will be
  *        removed in the next major release.
  */
inline def mergeValidationData[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], validationData: ValidationData[T]): ValidationData[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeValidationData")(validator.asInstanceOf[js.Any], validationData.asInstanceOf[js.Any])).asInstanceOf[ValidationData[T]]
inline def mergeValidationData[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  validationData: ValidationData[T],
  additionalErrorSchema: ErrorSchema[T]
): ValidationData[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeValidationData")(validator.asInstanceOf[js.Any], validationData.asInstanceOf[js.Any], additionalErrorSchema.asInstanceOf[js.Any])).asInstanceOf[ValidationData[T]]

/** Return a consistent `id` for the `optionIndex`s of a `Radio` or `Checkboxes` widget
  *
  * @param id - The id of the parent component for the option
  * @param optionIndex - The index of the option for which the id is desired
  * @returns - An id for the option index based on the parent `id`
  */
inline def optionId(id: String, optionIndex: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("optionId")(id.asInstanceOf[js.Any], optionIndex.asInstanceOf[js.Any])).asInstanceOf[String]

/** Gets the list of options from the schema. If the schema has an enum list, then those enum values are returned. The
  * labels for the options will be extracted from the non-standard, RJSF-deprecated `enumNames` if it exists, otherwise
  * the label will be the same as the `value`. If the schema has a `oneOf` or `anyOf`, then the value is the list of
  * `const` values from the schema and the label is either the `schema.title` or the value.
  *
  * @param schema - The schema from which to extract the options list
  * @returns - The list of options from the schema
  */
inline def optionsList[S /* <: StrictRJSFSchema */](schema: S): js.UndefOr[js.Array[EnumOptionsType[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("optionsList")(schema.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[EnumOptionsType[S]]]]

/** Given a list of `properties` and an `order` list, returns a list that contains the `properties` ordered correctly.
  * If `order` is not an array, then the untouched `properties` list is returned. Otherwise `properties` is ordered per
  * the `order` list. If `order` contains a '*' then any `properties` that are not mentioned explicity in `order` will be
  * places in the location of the `*`.
  *
  * @param properties - The list of property keys to be ordered
  * @param order - An array of property keys to be ordered first, with an optional '*' property
  * @returns - A list with the `properties` ordered
  * @throws - Error when the properties cannot be ordered correctly
  */
inline def orderProperties(properties: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("orderProperties")(properties.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
inline def orderProperties(properties: js.Array[String], order: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderProperties")(properties.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

/** Returns a string representation of the `num` that is padded with leading "0"s if necessary
  *
  * @param num - The number to pad
  * @param width - The width of the string at which no lead padding is necessary
  * @returns - The number converted to a string with leading zero padding if the number of digits is less than `width`
  */
inline def pad(num: Double, width: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(num.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]

/** Parses the `dateString` into a `DateObject`, including the time information when `includeTime` is true
  *
  * @param dateString - The date string to parse into a DateObject
  * @param [includeTime=true] - Optional flag, if false, will not include the time data into the object
  * @returns - The date string converted to a `DateObject`
  * @throws - Error when the date cannot be parsed from the string
  */
inline def parseDateString(): DateObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDateString")().asInstanceOf[DateObject]
inline def parseDateString(dateString: String): DateObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDateString")(dateString.asInstanceOf[js.Any]).asInstanceOf[DateObject]
inline def parseDateString(dateString: String, includeTime: Boolean): DateObject = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDateString")(dateString.asInstanceOf[js.Any], includeTime.asInstanceOf[js.Any])).asInstanceOf[DateObject]
inline def parseDateString(dateString: Unit, includeTime: Boolean): DateObject = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDateString")(dateString.asInstanceOf[js.Any], includeTime.asInstanceOf[js.Any])).asInstanceOf[DateObject]

/** Extracts the range spec information `{ step?: number, min?: number, max?: number }` that can be spread onto an HTML
  * input from the range analog in the schema `{ multipleOf?: number, minimum?: number, maximum?: number }`.
  *
  * @param schema - The schema from which to extract the range spec
  * @returns - A range specification from the schema
  */
inline def rangeSpec[S /* <: StrictRJSFSchema */](schema: S): RangeSpecType = ^.asInstanceOf[js.Dynamic].applyDynamic("rangeSpec")(schema.asInstanceOf[js.Any]).asInstanceOf[RangeSpecType]

/** Potentially substitutes all replaceable parameters with the associated value(s) from the `params` if available. When
  * a `params` array is provided, each value in the array is used to replace any of the replaceable parameters in the
  * `inputString` using the `%1`, `%2`, etc. replacement specifiers.
  *
  * @param inputString - The string which will be potentially updated with replacement parameters
  * @param params - The optional list of replaceable parameter values to substitute into the english string
  * @returns - The updated string with any replacement specifiers replaced
  */
inline def replaceStringParameters(inputString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceStringParameters")(inputString.asInstanceOf[js.Any]).asInstanceOf[String]
inline def replaceStringParameters(inputString: String, params: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStringParameters")(inputString.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]

/** Retrieves an expanded schema that has had all of its conditions, additional properties, references and dependencies
  * resolved and merged into the `schema` given a `validator`, `rootSchema` and `rawFormData` that is used to do the
  * potentially recursive resolution.
  *
  * @param validator - An implementation of the `ValidatorType<T, S>` interface that will be forwarded to all the APIs
  * @param schema - The schema for which retrieving a schema is desired
  * @param [rootSchema={}] - The root schema that will be forwarded to all the APIs
  * @param [rawFormData] - The current formData, if any, to assist retrieving a schema
  * @returns - The schema having its conditions, additional properties, references and dependencies resolved
  */
inline def retrieveSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S): S = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[S]
inline def retrieveSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, rootSchema: S): S = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[S]
inline def retrieveSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, rootSchema: S, rawFormData: T): S = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], rawFormData.asInstanceOf[js.Any])).asInstanceOf[S]
inline def retrieveSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, rootSchema: Unit, rawFormData: T): S = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], rawFormData.asInstanceOf[js.Any])).asInstanceOf[S]

/** Sanitize the `data` associated with the `oldSchema` so it is considered appropriate for the `newSchema`. If the new
  * schema does not contain any properties, then `undefined` is returned to clear all the form data. Due to the nature
  * of schemas, this sanitization happens recursively for nested objects of data. Also, any properties in the old schema
  * that are non-existent in the new schema are set to `undefined`. The data sanitization process has the following flow:
  *
  * - If the new schema is an object that contains a `properties` object then:
  *   - Create a `removeOldSchemaData` object, setting each key in the `oldSchema.properties` having `data` to undefined
  *   - Create an empty `nestedData` object for use in the key filtering below:
  *   - Iterate over each key in the `newSchema.properties` as follows:
  *     - Get the `formValue` of the key from the `data`
  *     - Get the `oldKeySchema` and `newKeyedSchema` for the key, defaulting to `{}` when it doesn't exist
  *     - Retrieve the schema for any refs within each `oldKeySchema` and/or `newKeySchema`
  *     - Get the types of the old and new keyed schemas and if the old doesn't exist or the old & new are the same then:
  *       - If `removeOldSchemaData` has an entry for the key, delete it since the new schema has the same property
  *       - If type of the key in the new schema is `object`:
  *         - Store the value from the recursive `sanitizeDataForNewSchema` call in `nestedData[key]`
  *       - Otherwise, check for default or const values:
  *         - Get the old and new `default` values from the schema and check:
  *           - If the new `default` value does not match the form value:
  *             - If the old `default` value DOES match the form value, then:
  *               - Replace `removeOldSchemaData[key]` with the new `default`
  *               - Otherwise, if the new schema is `readOnly` then replace `removeOldSchemaData[key]` with undefined
  *         - Get the old and new `const` values from the schema and check:
  *           - If the new `const` value does not match the form value:
  *           - If the old `const` value DOES match the form value, then:
  *             - Replace `removeOldSchemaData[key]` with the new `const`
  *             - Otherwise, replace `removeOldSchemaData[key]` with undefined
  *   - Once all keys have been processed, return an object built as follows:
  *     - `{ ...removeOldSchemaData, ...nestedData, ...pick(data, keysToKeep) }`
  * - If the new and old schema types are array and the `data` is an array then:
  *   - If the type of the old and new schema `items` are a non-array objects:
  *     - Retrieve the schema for any refs within each `oldKeySchema.items` and/or `newKeySchema.items`
  *     - If the `type`s of both items are the same (or the old does not have a type):
  *       - If the type is "object", then:
  *         - For each element in the `data` recursively sanitize the data, stopping at `maxItems` if specified
  *       - Otherwise, just return the `data` removing any values after `maxItems` if it is set
  *   - If the type of the old and new schema `items` are booleans of the same value, return `data` as is
  * - Otherwise return `undefined`
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param rootSchema - The root JSON schema of the entire form
  * @param [newSchema] - The new schema for which the data is being sanitized
  * @param [oldSchema] - The old schema from which the data originated
  * @param [data={}] - The form data associated with the schema, defaulting to an empty object when undefined
  * @returns - The new form data, with all the fields uniquely associated with the old schema set
  *      to `undefined`. Will return `undefined` if the new schema is not an object containing properties.
  */
inline def sanitizeDataForNewSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], rootSchema: S): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDataForNewSchema")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[T]
inline def sanitizeDataForNewSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], rootSchema: S, newSchema: S): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDataForNewSchema")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], newSchema.asInstanceOf[js.Any])).asInstanceOf[T]
inline def sanitizeDataForNewSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], rootSchema: S, newSchema: S, oldSchema: S): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDataForNewSchema")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], newSchema.asInstanceOf[js.Any], oldSchema.asInstanceOf[js.Any])).asInstanceOf[T]
inline def sanitizeDataForNewSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], rootSchema: S, newSchema: S, oldSchema: S, data: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDataForNewSchema")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], newSchema.asInstanceOf[js.Any], oldSchema.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[T]
inline def sanitizeDataForNewSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], rootSchema: S, newSchema: S, oldSchema: Unit, data: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDataForNewSchema")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], newSchema.asInstanceOf[js.Any], oldSchema.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[T]
inline def sanitizeDataForNewSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], rootSchema: S, newSchema: Unit, oldSchema: S): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDataForNewSchema")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], newSchema.asInstanceOf[js.Any], oldSchema.asInstanceOf[js.Any])).asInstanceOf[T]
inline def sanitizeDataForNewSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], rootSchema: S, newSchema: Unit, oldSchema: S, data: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDataForNewSchema")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], newSchema.asInstanceOf[js.Any], oldSchema.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[T]
inline def sanitizeDataForNewSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], rootSchema: S, newSchema: Unit, oldSchema: Unit, data: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDataForNewSchema")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], newSchema.asInstanceOf[js.Any], oldSchema.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[T]

/** Check to see if a `schema` specifies that a value must be true. This happens when:
  * - `schema.const` is truthy
  * - `schema.enum` == `[true]`
  * - `schema.anyOf` or `schema.oneOf` has a single value which recursively returns true
  * - `schema.allOf` has at least one value which recursively returns true
  *
  * @param schema - The schema to check
  * @returns - True if the schema specifies a value that must be true, false otherwise
  */
inline def schemaRequiresTrueValue[S /* <: StrictRJSFSchema */](schema: S): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("schemaRequiresTrueValue")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** Determines whether the given `component` should be rerendered by comparing its current set of props and state
  * against the next set. If either of those two sets are not the same, then the component should be rerendered.
  *
  * @param component - A React component being checked
  * @param nextProps - The next set of props against which to check
  * @param nextState - The next set of state against which to check
  * @returns - True if the component should be re-rendered, false otherwise
  */
inline def shouldRender(component: Component[js.Object, js.Object, Any], nextProps: Any, nextState: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRender")(component.asInstanceOf[js.Any], nextProps.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def titleId[T](id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleId")(id.asInstanceOf[js.Any]).asInstanceOf[String]
/** Return a consistent `id` for the field title element
  *
  * @param id - Either simple string id or an IdSchema from which to extract it
  * @returns - The consistent id for the field title element from the given `id`
  */
inline def titleId[T](id: IdSchema[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleId")(id.asInstanceOf[js.Any]).asInstanceOf[String]

/** Returns the constant value from the schema when it is either a single value enum or has a const key. Otherwise
  * throws an error.
  *
  * @param schema - The schema from which to obtain the constant value
  * @returns - The constant value for the schema
  * @throws - Error when the schema does not have a constant value
  */
inline def toConstant[S /* <: StrictRJSFSchema */](schema: S): js.UndefOr[JSONSchema7Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("toConstant")(schema.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSONSchema7Type]]

/** Returns a UTC date string for the given `dateObject`. If `time` is false, then the time portion of the string is
  * removed.
  *
  * @param dateObject - The `DateObject` to convert to a date string
  * @param [time=true] - Optional flag used to remove the time portion of the date string if false
  * @returns - The UTC date string
  */
inline def toDateString(dateObject: DateObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateString")(dateObject.asInstanceOf[js.Any]).asInstanceOf[String]
inline def toDateString(dateObject: DateObject, time: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDateString")(dateObject.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[String]

/** Converts an `errorSchema` into a list of `RJSFValidationErrors`
  *
  * @param errorSchema - The `ErrorSchema` instance to convert
  * @param [fieldPath=[]] - The current field path, defaults to [] if not specified
  * @returns - The list of `RJSFValidationErrors` extracted from the `errorSchema`
  */
inline def toErrorList[T](): js.Array[RJSFValidationError] = ^.asInstanceOf[js.Dynamic].applyDynamic("toErrorList")().asInstanceOf[js.Array[RJSFValidationError]]
inline def toErrorList[T](errorSchema: Unit, fieldPath: js.Array[String]): js.Array[RJSFValidationError] = (^.asInstanceOf[js.Dynamic].applyDynamic("toErrorList")(errorSchema.asInstanceOf[js.Any], fieldPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[RJSFValidationError]]
inline def toErrorList[T](errorSchema: ErrorSchema[T]): js.Array[RJSFValidationError] = ^.asInstanceOf[js.Dynamic].applyDynamic("toErrorList")(errorSchema.asInstanceOf[js.Any]).asInstanceOf[js.Array[RJSFValidationError]]
inline def toErrorList[T](errorSchema: ErrorSchema[T], fieldPath: js.Array[String]): js.Array[RJSFValidationError] = (^.asInstanceOf[js.Dynamic].applyDynamic("toErrorList")(errorSchema.asInstanceOf[js.Any], fieldPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[RJSFValidationError]]

/** Transforms a rjsf validation errors list:
  * [
  *   {property: '.level1.level2[2].level3', message: 'err a'},
  *   {property: '.level1.level2[2].level3', message: 'err b'},
  *   {property: '.level1.level2[4].level3', message: 'err b'},
  * ]
  * Into an error tree:
  * {
  *   level1: {
  *     level2: {
  *       2: {level3: {errors: ['err a', 'err b']}},
  *       4: {level3: {errors: ['err b']}},
  *     }
  *   }
  * };
  *
  * @param errors - The list of RJSFValidationError objects
  * @returns - The `ErrorSchema` built from the list of `RJSFValidationErrors`
  */
inline def toErrorSchema[T](errors: js.Array[RJSFValidationError]): ErrorSchema[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toErrorSchema")(errors.asInstanceOf[js.Any]).asInstanceOf[ErrorSchema[T]]

/** Generates an `IdSchema` object for the `schema`, recursively
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param schema - The schema for which the `IdSchema` is desired
  * @param [id] - The base id for the schema
  * @param [rootSchema] - The root schema, used to primarily to look up `$ref`s
  * @param [formData] - The current formData, if any, to assist retrieving a schema
  * @param [idPrefix='root'] - The prefix to use for the id
  * @param [idSeparator='_'] - The separator to use for the path segments in the id
  * @returns - The `IdSchema` object for the `schema`
  */
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, id: String): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, id: String, rootSchema: S): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, id: String, rootSchema: S, formData: T): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: String,
  rootSchema: S,
  formData: T,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: String,
  rootSchema: S,
  formData: T,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: String,
  rootSchema: S,
  formData: T,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: String,
  rootSchema: S,
  formData: Unit,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: String,
  rootSchema: S,
  formData: Unit,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: String,
  rootSchema: S,
  formData: Unit,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, id: String, rootSchema: Unit, formData: T): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: String,
  rootSchema: Unit,
  formData: T,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: String,
  rootSchema: Unit,
  formData: T,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: String,
  rootSchema: Unit,
  formData: T,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: String,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: String,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: String,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, id: Null, rootSchema: S): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, id: Null, rootSchema: S, formData: T): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Null,
  rootSchema: S,
  formData: T,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Null,
  rootSchema: S,
  formData: T,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Null,
  rootSchema: S,
  formData: T,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Null,
  rootSchema: S,
  formData: Unit,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Null,
  rootSchema: S,
  formData: Unit,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Null,
  rootSchema: S,
  formData: Unit,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, id: Null, rootSchema: Unit, formData: T): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Null,
  rootSchema: Unit,
  formData: T,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Null,
  rootSchema: Unit,
  formData: T,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Null,
  rootSchema: Unit,
  formData: T,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Null,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Null,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Null,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, id: Unit, rootSchema: S): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, id: Unit, rootSchema: S, formData: T): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Unit,
  rootSchema: S,
  formData: T,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Unit,
  rootSchema: S,
  formData: T,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Unit,
  rootSchema: S,
  formData: T,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Unit,
  rootSchema: S,
  formData: Unit,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Unit,
  rootSchema: S,
  formData: Unit,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Unit,
  rootSchema: S,
  formData: Unit,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, id: Unit, rootSchema: Unit, formData: T): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Unit,
  rootSchema: Unit,
  formData: T,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Unit,
  rootSchema: Unit,
  formData: T,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Unit,
  rootSchema: Unit,
  formData: T,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Unit,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Unit,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
  validator: ValidatorType[T, S, F],
  schema: S,
  id: Unit,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]

/** Generates an `PathSchema` object for the `schema`, recursively
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param schema - The schema for which the `PathSchema` is desired
  * @param [name=''] - The base name for the schema
  * @param [rootSchema] - The root schema, used to primarily to look up `$ref`s
  * @param [formData] - The current formData, if any, to assist retrieving a schema
  * @returns - The `PathSchema` object for the `schema`
  */
inline def toPathSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, name: String): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, name: String, rootSchema: S): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, name: String, rootSchema: S, formData: T): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, name: String, rootSchema: Unit, formData: T): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, name: Unit, rootSchema: S): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, name: Unit, rootSchema: S, formData: T): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](validator: ValidatorType[T, S, F], schema: S, name: Unit, rootSchema: Unit, formData: T): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]

/** Unwraps the `errorHandler` structure into the associated `ErrorSchema`, stripping the `addError()` functions from it
  *
  * @param errorHandler - The `FormValidation` error handling structure
  * @returns - The `ErrorSchema` resulting from the stripping of the `addError()` function
  */
inline def unwrapErrorHandler[T](errorHandler: FormValidation[T]): ErrorSchema[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapErrorHandler")(errorHandler.asInstanceOf[js.Any]).asInstanceOf[ErrorSchema[T]]

/** Converts a UTC date string into a local Date format
  *
  * @param jsonDate - A UTC date string
  * @returns - An empty string when `jsonDate` is falsey, otherwise a date string in local format
  */
inline def utcToLocal(jsonDate: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utcToLocal")(jsonDate.asInstanceOf[js.Any]).asInstanceOf[String]

/** Merges the errors in `additionalErrorSchema` into the existing `validationData` by combining the hierarchies in the
  * two `ErrorSchema`s and then appending the error list from the `additionalErrorSchema` obtained by calling
  * `toErrorList()` on the `errors` in the `validationData`. If no `additionalErrorSchema` is passed, then
  * `validationData` is returned.
  *
  * @param validationData - The current `ValidationData` into which to merge the additional errors
  * @param [additionalErrorSchema] - The optional additional set of errors in an `ErrorSchema`
  * @returns - The `validationData` with the additional errors from `additionalErrorSchema` merged into it, if provided.
  */
inline def validationDataMerge[T](validationData: ValidationData[T]): ValidationData[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("validationDataMerge")(validationData.asInstanceOf[js.Any]).asInstanceOf[ValidationData[T]]
inline def validationDataMerge[T](validationData: ValidationData[T], additionalErrorSchema: ErrorSchema[T]): ValidationData[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("validationDataMerge")(validationData.asInstanceOf[js.Any], additionalErrorSchema.asInstanceOf[js.Any])).asInstanceOf[ValidationData[T]]

/** Recursively prefixes all `$ref`s in a schema with the value of the `ROOT_SCHEMA_PREFIX` constant.
  * This is used in isValid to make references to the rootSchema
  *
  * @param schemaNode - The object node to which a ROOT_SCHEMA_PREFIX is added when a REF_KEY is part of it
  * @returns - A copy of the `schemaNode` with updated `$ref`s
  */
inline def withIdRefPrefix[S /* <: StrictRJSFSchema */](schemaNode: S): S | js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("withIdRefPrefix")(schemaNode.asInstanceOf[js.Any]).asInstanceOf[S | js.Array[S]]

/** A `CustomValidator` function takes in a `formData`, `errors` and `uiSchema` objects and returns the given `errors`
  * object back, while potentially adding additional messages to the `errors`
  */
type CustomValidator[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] = js.Function3[
/* formData */ js.UndefOr[T], 
/* errors */ FormValidation[T], 
/* uiSchema */ js.UndefOr[UiSchema[T, S, F]], 
FormValidation[T]]

/** Type describing a recursive structure of `FieldErrors`s for an object with a non-empty set of keys */
type ErrorSchema[T] = FieldErrors & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]:? @rjsf/utils.@rjsf/utils.ErrorSchema<T[key]>} */ js.Any)

/** An `ErrorTransformer` function will take in a list of `errors` & a `uiSchema` and potentially return a
  * transformation of those errors in what ever way it deems necessary
  */
type ErrorTransformer[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] = js.Function2[
/* errors */ js.Array[RJSFValidationError], 
/* uiSchema */ js.UndefOr[UiSchema[T, S, F]], 
js.Array[RJSFValidationError]]

/** The definition of a React-based Field component */
type Field[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] = ComponentType[FieldProps[T, S, F]]

/** The type that describes an error in a field */
type FieldError = String

/** Alias GenericObjectType as FormContextType to allow us to remap this at some future date
  */
type FormContextType = GenericObjectType

/** Type describing a recursive structure of `FieldValidation`s for an object with a non-empty set of keys */
type FormValidation[T] = FieldValidation & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]:? @rjsf/utils.@rjsf/utils.FormValidation<T[key]>} */ js.Any)

/** The representation of any generic object type, usually used as an intersection on other types to make them more
  * flexible in the properties they support (i.e. anything else)
  */
type GenericObjectType = StringDictionary[Any]

/** Type describing a recursive structure of `FieldId`s for an object with a non-empty set of keys */
type IdSchema[T] = FieldId & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]:? @rjsf/utils.@rjsf/utils.IdSchema<T[key]>} */ js.Any)

/** Type describing a recursive structure of `FieldPath`s for an object with a non-empty set of keys */
type PathSchema[T] = FieldPath & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]:? @rjsf/utils.@rjsf/utils.PathSchema<T[key]>} */ js.Any)

/** The set of `Fields` stored in the `Registry` */
type RegistryFieldsType[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] = /** A `Field` indexed by `name` */
StringDictionary[Field[T, S, F]]

/** The set of `Widgets` stored in the `Registry` */
type RegistryWidgetsType[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] = /** A `Widget` indexed by `name` */
StringDictionary[Widget[T, S, F]]

/** Map the JSONSchema7 to our own type so that we can easily bump to a more recent version at some future date and only
  * have to update this one type.
  */
type StrictRJSFSchema = JSONSchema7

/** The definition of a React-based Widget component */
type Widget[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] = ComponentType[WidgetProps[T, S, F]]
