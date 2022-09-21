package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.jsonSchema.mod.JSONSchema7
import typings.jsonSchema.mod.JSONSchema7Definition
import typings.jsonSchema.mod.JSONSchema7Type
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.rjsfUtils.anon.AddButton
import typings.rjsfUtils.anon.Blob
import typings.rjsfUtils.mod.^
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
import typings.rjsfUtils.rjsfUtilsStrings.`null`
import typings.rjsfUtils.rjsfUtilsStrings.`object`
import typings.rjsfUtils.rjsfUtilsStrings.array
import typings.rjsfUtils.rjsfUtilsStrings.boolean
import typings.rjsfUtils.rjsfUtilsStrings.number
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

inline def SUBMIT_BTN_OPTIONS_KEY: /* "submitButtonOptions" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("SUBMIT_BTN_OPTIONS_KEY").asInstanceOf[/* "submitButtonOptions" */ String]

inline def UI_FIELD_KEY: /* "ui:field" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("UI_FIELD_KEY").asInstanceOf[/* "ui:field" */ String]

inline def UI_OPTIONS_KEY: /* "ui:options" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("UI_OPTIONS_KEY").asInstanceOf[/* "ui:options" */ String]

inline def UI_WIDGET_KEY: /* "ui:widget" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("UI_WIDGET_KEY").asInstanceOf[/* "ui:widget" */ String]

/** Checks the schema to see if it is allowing additional items, by verifying that `schema.additionalItems` is an
  * object. The user is warned in the console if `schema.additionalItems` has the value `true`.
  *
  * @param schema - The schema object to check
  * @returns - True if additional items is allowed, otherwise false
  */
inline def allowAdditionalItems(schema: RJSFSchema): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAdditionalItems")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]

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
inline def canExpand[T, F](schema: RJSFSchema): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canExpand")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def canExpand[T, F](schema: RJSFSchema, uiSchema: Unit, formData: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canExpand")(schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def canExpand[T, F](schema: RJSFSchema, uiSchema: UiSchema[T, F]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canExpand")(schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def canExpand[T, F](schema: RJSFSchema, uiSchema: UiSchema[T, F], formData: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canExpand")(schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** Creates a `SchemaUtilsType` interface that is based around the given `validator` and `rootSchema` parameters. The
  * resulting interface implementation will forward the `validator` and `rootSchema` to all the wrapped APIs.
  *
  * @param validator - an implementation of the `ValidatorType` interface that will be forwarded to all the APIs
  * @param rootSchema - The root schema that will be forwarded to all the APIs
  * @returns - An implementation of a `SchemaUtilsType` interface
  */
inline def createSchemaUtils[T](validator: ValidatorType[Any], rootSchema: RJSFSchema): SchemaUtilsType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSchemaUtils")(validator.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[SchemaUtilsType[T]]

/** Given the `FileReader.readAsDataURL()` based `dataURI` extracts that data into an actual Blob along with the name
  * of that Blob if provided in the URL. If no name is provided, then the name falls back to `unknown`.
  *
  * @param dataURI - The `DataUrl` potentially containing name and raw data to be converted to a Blob
  * @returns - an object containing a Blob and its name, extracted from the URI
  */
inline def dataURItoBlob(dataURI: String): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("dataURItoBlob")(dataURI.asInstanceOf[js.Any]).asInstanceOf[Blob]

/** Implements a deep equals using the `lodash.isEqualWith` function, that provides a customized comparator that
  * assumes all functions are equivalent.
  *
  * @param a - The first element to compare
  * @param b - The second element to compare
  * @returns - True if the `a` and `b` are deeply equal, false otherwise
  */
inline def deepEquals(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** Given the name of a `$ref` from within a schema, using the `rootSchema`, look up and return the sub-schema using the
  * path provided by that reference. If `#` is not the first character of the reference, or the path does not exist in
  * the schema, then throw an Error. Otherwise return the sub-schema. Also deals with nested `$ref`s in the sub-schema.
  *
  * @param $ref - The ref string for which the schema definition is desired
  * @param [rootSchema={}] - The root schema in which to search for the definition
  * @returns - The sub-schema within the `rootSchema` which matches the `$ref` if it exists
  * @throws - Error indicating that no schema for that reference exists
  */
inline def findSchemaDefinition(): RJSFSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("findSchemaDefinition")().asInstanceOf[RJSFSchema]
inline def findSchemaDefinition($ref: String): RJSFSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("findSchemaDefinition")($ref.asInstanceOf[js.Any]).asInstanceOf[RJSFSchema]
inline def findSchemaDefinition($ref: String, rootSchema: RJSFSchema): RJSFSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("findSchemaDefinition")($ref.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[RJSFSchema]
inline def findSchemaDefinition($ref: Unit, rootSchema: RJSFSchema): RJSFSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("findSchemaDefinition")($ref.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[RJSFSchema]

/** Returns the superset of `formData` that includes the given set updated to include any missing fields that have
  * computed to have defaults provided in the `schema`.
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param theSchema - The schema for which the default state is desired
  * @param [formData] - The current formData, if any, onto which to provide any missing defaults
  * @param [rootSchema] - The root schema, used to primarily to look up `$ref`s
  * @param [includeUndefinedValues=false] - Optional flag, if true, cause undefined values to be added as defaults
  * @returns - The resulting `formData` with all the defaults provided
  */
inline def getDefaultFormState[T](validator: ValidatorType[Any], theSchema: RJSFSchema): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T](validator: ValidatorType[Any], theSchema: RJSFSchema, formData: T): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T](
  validator: ValidatorType[Any],
  theSchema: RJSFSchema,
  formData: T,
  rootSchema: Unit,
  includeUndefinedValues: Boolean
): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T](validator: ValidatorType[Any], theSchema: RJSFSchema, formData: T, rootSchema: RJSFSchema): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T](
  validator: ValidatorType[Any],
  theSchema: RJSFSchema,
  formData: T,
  rootSchema: RJSFSchema,
  includeUndefinedValues: Boolean
): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T](
  validator: ValidatorType[Any],
  theSchema: RJSFSchema,
  formData: Unit,
  rootSchema: Unit,
  includeUndefinedValues: Boolean
): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T](validator: ValidatorType[Any], theSchema: RJSFSchema, formData: Unit, rootSchema: RJSFSchema): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]
inline def getDefaultFormState[T](
  validator: ValidatorType[Any],
  theSchema: RJSFSchema,
  formData: Unit,
  rootSchema: RJSFSchema,
  includeUndefinedValues: Boolean
): js.UndefOr[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | js.Array[T]]]

/** Determines whether the combination of `schema` and `uiSchema` properties indicates that the label for the `schema`
  * should be displayed in a UI.
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param schema - The schema for which the display label flag is desired
  * @param [uiSchema={}] - The UI schema from which to derive potentially displayable information
  * @param [rootSchema] - The root schema, used to primarily to look up `$ref`s
  * @returns - True if the label should be displayed or false if it should not
  */
inline def getDisplayLabel[T, F](validator: ValidatorType[Any], schema: RJSFSchema): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLabel")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def getDisplayLabel[T, F](validator: ValidatorType[Any], schema: RJSFSchema, uiSchema: Unit, rootSchema: RJSFSchema): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLabel")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def getDisplayLabel[T, F](validator: ValidatorType[Any], schema: RJSFSchema, uiSchema: UiSchema[T, F]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLabel")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def getDisplayLabel[T, F](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  uiSchema: UiSchema[T, F],
  rootSchema: RJSFSchema
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLabel")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** Using the `schema`, `defaultType` and `options`, extract out the props for the <input> element that make sense.
  *
  * @param schema - The schema for the field provided by the widget
  * @param [defaultType] - The default type, if any, for the field provided by the widget
  * @param [options={}] - The UI Options for the field provided by the widget
  * @param [autoDefaultStepAny=true] - Determines whether to auto-default step=any when the type is number and no step
  * @returns - The extracted `InputPropsType` object
  */
inline def getInputProps[T, F](schema: RJSFSchema): InputPropsType = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any]).asInstanceOf[InputPropsType]
inline def getInputProps[T, F](schema: RJSFSchema, defaultType: String): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]
inline def getInputProps[T, F](schema: RJSFSchema, defaultType: String, options: Unit, autoDefaultStepAny: Boolean): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoDefaultStepAny.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]
inline def getInputProps[T, F](schema: RJSFSchema, defaultType: String, options: UIOptionsType[T, F]): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]
inline def getInputProps[T, F](schema: RJSFSchema, defaultType: String, options: UIOptionsType[T, F], autoDefaultStepAny: Boolean): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoDefaultStepAny.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]
inline def getInputProps[T, F](schema: RJSFSchema, defaultType: Unit, options: Unit, autoDefaultStepAny: Boolean): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoDefaultStepAny.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]
inline def getInputProps[T, F](schema: RJSFSchema, defaultType: Unit, options: UIOptionsType[T, F]): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]
inline def getInputProps[T, F](schema: RJSFSchema, defaultType: Unit, options: UIOptionsType[T, F], autoDefaultStepAny: Boolean): InputPropsType = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputProps")(schema.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoDefaultStepAny.asInstanceOf[js.Any])).asInstanceOf[InputPropsType]

/** Given the `formData` and list of `options`, attempts to find the index of the option that best matches the data.
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param formData - The current formData, if any, used to figure out a match
  * @param options - The list of options to find a matching options from
  * @param rootSchema - The root schema, used to primarily to look up `$ref`s
  * @returns - The index of the matched option or 0 if none is available
  */
inline def getMatchingOption[T](validator: ValidatorType[Any], formData: T, options: js.Array[RJSFSchema], rootSchema: RJSFSchema): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingOption")(validator.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getMatchingOption[T](
  validator: ValidatorType[Any],
  formData: Unit,
  options: js.Array[RJSFSchema],
  rootSchema: RJSFSchema
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingOption")(validator.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Double]

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
inline def getSchemaType(schema: RJSFSchema): js.UndefOr[String | js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemaType")(schema.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | js.Array[String]]]

/** Extracts any `ui:submitButtonOptions` from the `uiSchema` and merges them onto the `DEFAULT_OPTIONS`
  *
  * @param [uiSchema={}] - the UI Schema from which to extract submit button props
  * @returns - The merging of the `DEFAULT_OPTIONS` with any custom ones
  */
inline def getSubmitButtonOptions[T, F](): UISchemaSubmitButtonOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubmitButtonOptions")().asInstanceOf[UISchemaSubmitButtonOptions]
inline def getSubmitButtonOptions[T, F](uiSchema: UiSchema[T, F]): UISchemaSubmitButtonOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubmitButtonOptions")(uiSchema.asInstanceOf[js.Any]).asInstanceOf[UISchemaSubmitButtonOptions]

inline def getTemplate_ArrayFieldDescriptionTemplate[T, F](name: ArrayFieldDescriptionTemplate, registry: Registry[T, F]): ComponentType[ArrayFieldDescriptionProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldDescriptionProps[T, F]]]
inline def getTemplate_ArrayFieldDescriptionTemplate[T, F](name: ArrayFieldDescriptionTemplate, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): ComponentType[ArrayFieldDescriptionProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldDescriptionProps[T, F]]]

inline def getTemplate_ArrayFieldItemTemplate[T, F](name: ArrayFieldItemTemplate, registry: Registry[T, F]): ComponentType[ArrayFieldTemplateItemType[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldTemplateItemType[T, F]]]
inline def getTemplate_ArrayFieldItemTemplate[T, F](name: ArrayFieldItemTemplate, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): ComponentType[ArrayFieldTemplateItemType[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldTemplateItemType[T, F]]]

/** Returns the template with the given `name` from either the `uiSchema` if it is defined or from the `registry`
  * otherwise. NOTE, since `ButtonTemplates` are not overridden in `uiSchema` only those in the `registry` are returned.
  *
  * @param name - The name of the template to fetch, restricted to the keys of `TemplatesType`
  * @param registry - The `Registry` from which to read the template
  * @param [uiOptions={}] - The `UIOptionsType` from which to read an alternate template
  * @returns - The template from either the `uiSchema` or `registry` for the `name`
  */
inline def getTemplate_ArrayFieldTemplate[T, F](name: ArrayFieldTemplate, registry: Registry[T, F]): ComponentType[ArrayFieldTemplateProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldTemplateProps[T, F]]]
inline def getTemplate_ArrayFieldTemplate[T, F](name: ArrayFieldTemplate, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): ComponentType[ArrayFieldTemplateProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldTemplateProps[T, F]]]

inline def getTemplate_ArrayFieldTitleTemplate[T, F](name: ArrayFieldTitleTemplate, registry: Registry[T, F]): ComponentType[ArrayFieldTitleProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldTitleProps[T, F]]]
inline def getTemplate_ArrayFieldTitleTemplate[T, F](name: ArrayFieldTitleTemplate, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): ComponentType[ArrayFieldTitleProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ArrayFieldTitleProps[T, F]]]

inline def getTemplate_BaseInputTemplate[T, F](name: BaseInputTemplate, registry: Registry[T, F]): ComponentType[WidgetProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[WidgetProps[T, F]]]
inline def getTemplate_BaseInputTemplate[T, F](name: BaseInputTemplate, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): ComponentType[WidgetProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[WidgetProps[T, F]]]

inline def getTemplate_ButtonTemplates[T, F](name: ButtonTemplates, registry: Registry[T, F]): AddButton[T, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[AddButton[T, F]]
inline def getTemplate_ButtonTemplates[T, F](name: ButtonTemplates, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): AddButton[T, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[AddButton[T, F]]

inline def getTemplate_DescriptionFieldTemplate[T, F](name: DescriptionFieldTemplate, registry: Registry[T, F]): ComponentType[DescriptionFieldProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[DescriptionFieldProps[T, F]]]
inline def getTemplate_DescriptionFieldTemplate[T, F](name: DescriptionFieldTemplate, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): ComponentType[DescriptionFieldProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[DescriptionFieldProps[T, F]]]

inline def getTemplate_ErrorListTemplate[T, F](name: ErrorListTemplate, registry: Registry[T, F]): ComponentType[ErrorListProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ErrorListProps[T, F]]]
inline def getTemplate_ErrorListTemplate[T, F](name: ErrorListTemplate, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): ComponentType[ErrorListProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ErrorListProps[T, F]]]

inline def getTemplate_FieldErrorTemplate[T, F](name: FieldErrorTemplate, registry: Registry[T, F]): ComponentType[FieldErrorProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[FieldErrorProps[T, F]]]
inline def getTemplate_FieldErrorTemplate[T, F](name: FieldErrorTemplate, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): ComponentType[FieldErrorProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[FieldErrorProps[T, F]]]

inline def getTemplate_FieldHelpTemplate[T, F](name: FieldHelpTemplate, registry: Registry[T, F]): ComponentType[FieldHelpProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[FieldHelpProps[T, F]]]
inline def getTemplate_FieldHelpTemplate[T, F](name: FieldHelpTemplate, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): ComponentType[FieldHelpProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[FieldHelpProps[T, F]]]

inline def getTemplate_FieldTemplate[T, F](name: FieldTemplate, registry: Registry[T, F]): ComponentType[FieldTemplateProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[FieldTemplateProps[T, F]]]
inline def getTemplate_FieldTemplate[T, F](name: FieldTemplate, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): ComponentType[FieldTemplateProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[FieldTemplateProps[T, F]]]

inline def getTemplate_ObjectFieldTemplate[T, F](name: ObjectFieldTemplate, registry: Registry[T, F]): ComponentType[ObjectFieldTemplateProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ObjectFieldTemplateProps[T, F]]]
inline def getTemplate_ObjectFieldTemplate[T, F](name: ObjectFieldTemplate, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): ComponentType[ObjectFieldTemplateProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[ObjectFieldTemplateProps[T, F]]]

inline def getTemplate_TitleFieldTemplate[T, F](name: TitleFieldTemplate, registry: Registry[T, F]): ComponentType[TitleFieldProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[TitleFieldProps[T, F]]]
inline def getTemplate_TitleFieldTemplate[T, F](name: TitleFieldTemplate, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): ComponentType[TitleFieldProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[TitleFieldProps[T, F]]]

inline def getTemplate_UnsupportedFieldTemplate[T, F](name: UnsupportedFieldTemplate, registry: Registry[T, F]): ComponentType[UnsupportedFieldProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[ComponentType[UnsupportedFieldProps[T, F]]]
inline def getTemplate_UnsupportedFieldTemplate[T, F](name: UnsupportedFieldTemplate, registry: Registry[T, F], uiOptions: UIOptionsType[T, F]): ComponentType[UnsupportedFieldProps[T, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], uiOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[UnsupportedFieldProps[T, F]]]

/** Get all passed options from ui:options, and ui:<optionName>, returning them in an object with the `ui:`
  * stripped off.
  *
  * @param [uiSchema={}] - The UI Schema from which to get any `ui:xxx` options
  * @returns - An object containing all of the `ui:xxx` options with the stripped off
  */
inline def getUiOptions[T, F](): UIOptionsType[T, F] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUiOptions")().asInstanceOf[UIOptionsType[T, F]]
inline def getUiOptions[T, F](uiSchema: UiSchema[T, F]): UIOptionsType[T, F] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUiOptions")(uiSchema.asInstanceOf[js.Any]).asInstanceOf[UIOptionsType[T, F]]

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
inline def getWidget[T, F](schema: RJSFSchema): Widget[T, F] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any]).asInstanceOf[Widget[T, F]]
inline def getWidget[T, F](schema: RJSFSchema, widget: String): Widget[T, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any])).asInstanceOf[Widget[T, F]]
inline def getWidget[T, F](schema: RJSFSchema, widget: String, registeredWidgets: RegistryWidgetsType[T, F]): Widget[T, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Widget[T, F]]
inline def getWidget[T, F](schema: RJSFSchema, widget: Unit, registeredWidgets: RegistryWidgetsType[T, F]): Widget[T, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Widget[T, F]]
inline def getWidget[T, F](schema: RJSFSchema, widget: Widget[T, F]): Widget[T, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any])).asInstanceOf[Widget[T, F]]
inline def getWidget[T, F](schema: RJSFSchema, widget: Widget[T, F], registeredWidgets: RegistryWidgetsType[T, F]): Widget[T, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Widget[T, F]]

/** Given a specific `value` attempts to guess the type of a schema element. In the case where we have to implicitly
  *  create a schema, it is useful to know what type to use based on the data we are defining.
  *
  * @param value - The value from which to guess the type
  * @returns - The best guess for the object type
  */
inline def guessType(value: Any): array | string | `null` | boolean | number | `object` = ^.asInstanceOf[js.Dynamic].applyDynamic("guessType")(value.asInstanceOf[js.Any]).asInstanceOf[array | string | `null` | boolean | number | `object`]

inline def hasWidget[T, F](schema: RJSFSchema, widget: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def hasWidget[T, F](schema: RJSFSchema, widget: String, registeredWidgets: RegistryWidgetsType[T, F]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Boolean]
/** Detects whether the `widget` exists for the `schema` with the associated `registryWidgets` and returns true if it
  * does, or false if it doesn't.
  *
  * @param schema - The schema for the field
  * @param widget - Either the name of the widget OR a `Widget` implementation to use
  * @param [registeredWidgets={}] - A registry of widget name to `Widget` implementation
  * @returns - True if the widget exists, false otherwise
  */
inline def hasWidget[T, F](schema: RJSFSchema, widget: Widget[T, F]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def hasWidget[T, F](schema: RJSFSchema, widget: Widget[T, F], registeredWidgets: RegistryWidgetsType[T, F]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** This function checks if the given `schema` matches a single constant value. This happens when either the schema has
  * an `enum` array with a single value or there is a `const` defined.
  *
  * @param schema - The schema for a field
  * @returns - True if the `schema` has a single constant value, false otherwise
  */
inline def isConstant(schema: RJSFSchema): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstant")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** Checks to see if the `uiSchema` contains the `widget` field and that the widget is not `hidden`
  *
  * @param uiSchema - The UI Schema from which to detect if it is customized
  * @returns - True if the `uiSchema` describes a custom widget, false otherwise
  */
inline def isCustomWidget[T, F](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomWidget")().asInstanceOf[Boolean]
inline def isCustomWidget[T, F](uiSchema: UiSchema[T, F]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomWidget")(uiSchema.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** Checks to see if the `schema` and `uiSchema` combination represents an array of files
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param schema - The schema for which check for array of files flag is desired
  * @param [uiSchema={}] - The UI schema from which to check the widget
  * @param [rootSchema] - The root schema, used to primarily to look up `$ref`s
  * @returns - True if schema/uiSchema contains an array of files, otherwise false
  */
inline def isFilesArray[T, F](validator: ValidatorType[Any], schema: RJSFSchema): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFilesArray")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isFilesArray[T, F](validator: ValidatorType[Any], schema: RJSFSchema, uiSchema: Unit, rootSchema: RJSFSchema): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFilesArray")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isFilesArray[T, F](validator: ValidatorType[Any], schema: RJSFSchema, uiSchema: UiSchema[T, F]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFilesArray")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isFilesArray[T, F](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  uiSchema: UiSchema[T, F],
  rootSchema: RJSFSchema
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFilesArray")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** Detects whether the given `schema` contains fixed items. This is the case when `schema.items` is a non-empty array
  * that only contains objects.
  *
  * @param schema - The schema in which to check for fixed items
  * @returns - True if there are fixed items in the schema, false otherwise
  */
inline def isFixedItems(schema: RJSFSchema): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixedItems")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** Checks to see if the `schema` combination represents a multi-select
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be used when necessary
  * @param schema - The schema for which check for a multi-select flag is desired
  * @param [rootSchema] - The root schema, used to primarily to look up `$ref`s
  * @returns - True if schema contains a multi-select, otherwise false
  */
inline def isMultiSelect[T](validator: ValidatorType[Any], schema: RJSFSchema): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMultiSelect")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isMultiSelect[T](validator: ValidatorType[Any], schema: RJSFSchema, rootSchema: RJSFSchema): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMultiSelect")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]

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
inline def isSelect[T](validator: ValidatorType[Any], theSchema: RJSFSchema): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSelect")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isSelect[T](validator: ValidatorType[Any], theSchema: RJSFSchema, rootSchema: RJSFSchema): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSelect")(validator.asInstanceOf[js.Any], theSchema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]

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
  * @param defaults - The defaults to merge
  * @param formData - The form data into which the defaults will be merged
  * @returns - The resulting merged form data with defaults
  */
inline def mergeDefaultsWithFormData[T](defaults: T, formData: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDefaultsWithFormData")(defaults.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[T]

/** Recursively merge deeply nested objects.
  *
  * @param obj1 - The first object to merge
  * @param obj2 - The second object to merge
  * @param [concatArrays=false] - Optional flag that, when true, will cause arrays to be concatenated
  * @returns - A new object that is the merge of the two given objects
  */
inline def mergeObjects(obj1: GenericObjectType, obj2: GenericObjectType): GenericObjectType = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeObjects")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[GenericObjectType]
inline def mergeObjects(obj1: GenericObjectType, obj2: GenericObjectType, concatArrays: Boolean): GenericObjectType = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeObjects")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any], concatArrays.asInstanceOf[js.Any])).asInstanceOf[GenericObjectType]

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
  */
inline def mergeValidationData[T](validator: ValidatorType[T], validationData: ValidationData[T]): ValidationData[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeValidationData")(validator.asInstanceOf[js.Any], validationData.asInstanceOf[js.Any])).asInstanceOf[ValidationData[T]]
inline def mergeValidationData[T](
  validator: ValidatorType[T],
  validationData: ValidationData[T],
  additionalErrorSchema: ErrorSchema[T]
): ValidationData[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeValidationData")(validator.asInstanceOf[js.Any], validationData.asInstanceOf[js.Any], additionalErrorSchema.asInstanceOf[js.Any])).asInstanceOf[ValidationData[T]]

/** Gets the list of options from the schema. If the schema has an enum list, then those enum values are returned. The
  * labels for the options will be extracted from the non-standard, RJSF-deprecated `enumNames` if it exists, otherwise
  * the label will be the same as the `value`. If the schema has a `oneOf` or `anyOf`, then the value is the list of
  * `const` values from the schema and the label is either the `schema.title` or the value.
  *
  * @param schema - The schema from which to extract the options list
  * @returns - The list of options from the schema
  */
inline def optionsList(schema: RJSFSchema): js.UndefOr[js.Array[EnumOptionsType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("optionsList")(schema.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[EnumOptionsType]]]

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

/** Returns the real value for a select widget due to a silly limitation in the DOM which causes option change event
  * values to always be retrieved as strings. Uses the `schema` to help determine the value's true type. If the value is
  * an empty string, then the `emptyValue` from the `options` is returned, falling back to undefined.
  *
  * @param schema - The schema to used to determine the value's true type
  * @param [value] - The value to convert
  * @param [options] - The UIOptionsType from which to potentially extract the emptyValue
  * @returns - The `value` converted to the proper type
  */
inline def processSelectValue[T, F](schema: RJSFSchema): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("processSelectValue")(schema.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def processSelectValue[T, F](schema: RJSFSchema, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("processSelectValue")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def processSelectValue[T, F](schema: RJSFSchema, value: Any, options: UIOptionsType[T, F]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("processSelectValue")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def processSelectValue[T, F](schema: RJSFSchema, value: Unit, options: UIOptionsType[T, F]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("processSelectValue")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]

/** Extracts the range spec information `{ step?: number, min?: number, max?: number }` that can be spread onto an HTML
  * input from the range analog in the schema `{ multipleOf?: number, minimum?: number, maximum?: number }`.
  *
  * @param schema - The schema from which to extract the range spec
  * @returns - A range specification from the schema
  */
inline def rangeSpec(schema: RJSFSchema): RangeSpecType = ^.asInstanceOf[js.Dynamic].applyDynamic("rangeSpec")(schema.asInstanceOf[js.Any]).asInstanceOf[RangeSpecType]

/** Retrieves an expanded schema that has had all of its conditions, additional properties, references and dependencies
  * resolved and merged into the `schema` given a `validator`, `rootSchema` and `rawFormData` that is used to do the
  * potentially recursive resolution.
  *
  * @param validator - An implementation of the `ValidatorType` interface that will be forwarded to all the APIs
  * @param schema - The schema for which retrieving a schema is desired
  * @param [rootSchema={}] - The root schema that will be forwarded to all the APIs
  * @param [rawFormData] - The current formData, if any, to assist retrieving a schema
  * @returns - The schema having its conditions, additional properties, references and dependencies resolved
  */
inline def retrieveSchema[T](validator: ValidatorType[Any], schema: RJSFSchema): RJSFSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[RJSFSchema]
inline def retrieveSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, rootSchema: Unit, rawFormData: T): RJSFSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], rawFormData.asInstanceOf[js.Any])).asInstanceOf[RJSFSchema]
inline def retrieveSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, rootSchema: RJSFSchema): RJSFSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[RJSFSchema]
inline def retrieveSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, rootSchema: RJSFSchema, rawFormData: T): RJSFSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], rawFormData.asInstanceOf[js.Any])).asInstanceOf[RJSFSchema]

/** Check to see if a `schema` specifies that a value must be true. This happens when:
  * - `schema.const` is truthy
  * - `schema.enum` == `[true]`
  * - `schema.anyOf` or `schema.oneOf` has a single value which recursively returns true
  * - `schema.allOf` has at least one value which recursively returns true
  *
  * @param schema - The schema to check
  * @returns - True if the schema specifies a value that must be true, false otherwise
  */
inline def schemaRequiresTrueValue(schema: RJSFSchema): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("schemaRequiresTrueValue")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** Determines whether the given `component` should be rerendered by comparing its current set of props and state
  * against the next set. If either of those two sets are not the same, then the component should be rerendered.
  *
  * @param component - A React component being checked
  * @param nextProps - The next set of props against which to check
  * @param nextState - The next set of state against which to check
  * @returns - True if the component should be re-rendered, false otherwise
  */
inline def shouldRender(component: Component[js.Object, js.Object, Any], nextProps: Any, nextState: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRender")(component.asInstanceOf[js.Any], nextProps.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** Returns the constant value from the schema when it is either a single value enum or has a const key. Otherwise
  * throws an error.
  *
  * @param schema - The schema from which to obtain the constant value
  * @returns - The constant value for the schema
  * @throws - Error when the schema does not have a constant value
  */
inline def toConstant(schema: RJSFSchema): js.UndefOr[JSONSchema7Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("toConstant")(schema.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSONSchema7Type]]

/** Returns a UTC date string for the given `dateObject`. If `time` is false, then the time portion of the string is
  * removed.
  *
  * @param dateObject - The `DateObject` to convert to a date string
  * @param [time=true] - Optional flag used to remove the time portion of the date string if false
  * @returns - The UTC date string
  */
inline def toDateString(dateObject: DateObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateString")(dateObject.asInstanceOf[js.Any]).asInstanceOf[String]
inline def toDateString(dateObject: DateObject, time: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDateString")(dateObject.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[String]

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
inline def toIdSchema[T](validator: ValidatorType[Any], schema: RJSFSchema): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, id: String): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, id: String, rootSchema: Unit, formData: T): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: String,
  rootSchema: Unit,
  formData: T,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: String,
  rootSchema: Unit,
  formData: T,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: String,
  rootSchema: Unit,
  formData: T,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: String,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: String,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: String,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, id: String, rootSchema: RJSFSchema): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, id: String, rootSchema: RJSFSchema, formData: T): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: String,
  rootSchema: RJSFSchema,
  formData: T,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: String,
  rootSchema: RJSFSchema,
  formData: T,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: String,
  rootSchema: RJSFSchema,
  formData: T,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: String,
  rootSchema: RJSFSchema,
  formData: Unit,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: String,
  rootSchema: RJSFSchema,
  formData: Unit,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: String,
  rootSchema: RJSFSchema,
  formData: Unit,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, id: Null, rootSchema: Unit, formData: T): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Null,
  rootSchema: Unit,
  formData: T,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Null,
  rootSchema: Unit,
  formData: T,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Null,
  rootSchema: Unit,
  formData: T,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Null,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Null,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Null,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, id: Null, rootSchema: RJSFSchema): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, id: Null, rootSchema: RJSFSchema, formData: T): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Null,
  rootSchema: RJSFSchema,
  formData: T,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Null,
  rootSchema: RJSFSchema,
  formData: T,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Null,
  rootSchema: RJSFSchema,
  formData: T,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Null,
  rootSchema: RJSFSchema,
  formData: Unit,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Null,
  rootSchema: RJSFSchema,
  formData: Unit,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Null,
  rootSchema: RJSFSchema,
  formData: Unit,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, id: Unit, rootSchema: Unit, formData: T): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Unit,
  rootSchema: Unit,
  formData: T,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Unit,
  rootSchema: Unit,
  formData: T,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Unit,
  rootSchema: Unit,
  formData: T,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Unit,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Unit,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Unit,
  rootSchema: Unit,
  formData: Unit,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, id: Unit, rootSchema: RJSFSchema): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, id: Unit, rootSchema: RJSFSchema, formData: T): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Unit,
  rootSchema: RJSFSchema,
  formData: T,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Unit,
  rootSchema: RJSFSchema,
  formData: T,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Unit,
  rootSchema: RJSFSchema,
  formData: T,
  idPrefix: Unit,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Unit,
  rootSchema: RJSFSchema,
  formData: Unit,
  idPrefix: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Unit,
  rootSchema: RJSFSchema,
  formData: Unit,
  idPrefix: String,
  idSeparator: String
): IdSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], idSeparator.asInstanceOf[js.Any])).asInstanceOf[IdSchema[T]]
inline def toIdSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  id: Unit,
  rootSchema: RJSFSchema,
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
inline def toPathSchema[T](validator: ValidatorType[Any], schema: RJSFSchema): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, name: String): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, name: String, rootSchema: Unit, formData: T): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, name: String, rootSchema: RJSFSchema): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T](
  validator: ValidatorType[Any],
  schema: RJSFSchema,
  name: String,
  rootSchema: RJSFSchema,
  formData: T
): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, name: Unit, rootSchema: Unit, formData: T): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, name: Unit, rootSchema: RJSFSchema): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]
inline def toPathSchema[T](validator: ValidatorType[Any], schema: RJSFSchema, name: Unit, rootSchema: RJSFSchema, formData: T): PathSchema[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(validator.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], rootSchema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[PathSchema[T]]

/** Converts a UTC date string into a local Date format
  *
  * @param jsonDate - A UTC date string
  * @returns - An empty string when `jsonDate` is falsey, otherwise a date string in local format
  */
inline def utcToLocal(jsonDate: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utcToLocal")(jsonDate.asInstanceOf[js.Any]).asInstanceOf[String]

/** A `CustomValidator` function takes in a `formData` and `errors` object and returns the given `errors` object back,
  * while potentially adding additional messages to the `errors`
  */
type CustomValidator[T] = js.Function2[/* formData */ T, /* errors */ FormValidation[T], FormValidation[T]]

/** Type describing a recursive structure of `FieldErrors`s for an object with a non-empty set of keys */
type ErrorSchema[T] = FieldErrors & typings.rjsfUtils.rjsfUtilsStrings.ErrorSchema & TopLevel[T]

/** An `ErrorTransformer` function will take in a list of `errors` and potentially return a transformation of those
  * errors in what ever way it deems necessary
  */
type ErrorTransformer = js.Function1[/* errors */ js.Array[RJSFValidationError], js.Array[RJSFValidationError]]

/** The definition of a React-based Field component */
type Field[T, F] = ComponentType[FieldProps[T, F]]

/** The type that describes an error in a field */
type FieldError = String

/** Type describing a recursive structure of `FieldValidation`s for an object with a non-empty set of keys */
type FormValidation[T] = FieldValidation & typings.rjsfUtils.rjsfUtilsStrings.FormValidation & TopLevel[T]

/** The representation of any generic object type, usually used as an intersection on other types to make them more
  * flexible in the properties they support (i.e. anything else)
  */
type GenericObjectType = StringDictionary[Any]

/** Type describing a recursive structure of `FieldId`s for an object with a non-empty set of keys */
type IdSchema[T] = FieldId & typings.rjsfUtils.rjsfUtilsStrings.IdSchema & TopLevel[T]

/** This type remaps the keys of `Type` to prepend `ui:` onto them. As a result it does not need to be exported */
type MakeUIType[Type] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ Property in keyof Type as 'ui:${string & Property}' ]: Type[Property]}
  */ typings.rjsfUtils.rjsfUtilsStrings.MakeUIType & TopLevel[Type]

/** Type describing a recursive structure of `FieldPath`s for an object with a non-empty set of keys */
type PathSchema[T] = FieldPath & typings.rjsfUtils.rjsfUtilsStrings.PathSchema & TopLevel[T]

/** Map the JSONSchema7 to our own type so that we can easily bump to JSONSchema8 at some future date and only have to
  * update this one type.
  */
type RJSFSchema = JSONSchema7

/** Map the JSONSchema7Definition to our own type so that we can easily bump to JSONSchema8Definition at some future
  * date and only have to update this one type.
  */
type RJSFSchemaDefinition = JSONSchema7Definition

/** The set of `Fields` stored in the `Registry` */
type RegistryFieldsType[T, F] = /** A `Field` indexed by `name` */
StringDictionary[Field[T, F]]

/** The set of `Widgets` stored in the `Registry` */
type RegistryWidgetsType[T, F] = /** A `Widget` indexed by `name` */
StringDictionary[Widget[T, F]]

/** The definition of a React-based Widget component */
type Widget[T, F] = ComponentType[WidgetProps[T, F]]
