package typings.rjsfUtils.mod

import typings.rjsfUtils.rjsfUtilsStrings.excludeObjectChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The `SchemaUtilsType` interface provides a wrapper around the publicly exported APIs in the `@rjsf/utils/schema`
  * directory such that one does not have to explicitly pass the `validator` or `rootSchema` to each method. Since both
  * the `validator` and `rootSchema` generally does not change across a `Form`, this allows for providing a simplified
  * set of APIs to the `@rjsf/core` components and the various themes as well.
  */
@js.native
trait SchemaUtilsType[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** Determines whether either the `validator` and `rootSchema` differ from the ones associated with this instance of
    * the `SchemaUtilsType`. If either `validator` or `rootSchema` are falsy, then return false to prevent the creation
    * of a new `SchemaUtilsType` with incomplete properties.
    *
    * @param validator - An implementation of the `ValidatorType` interface that will be compared against the current one
    * @param rootSchema - The root schema that will be compared against the current one
    * @returns - True if the `SchemaUtilsType` differs from the given `validator` or `rootSchema`
    */
  def doesSchemaUtilsDiffer(validator: ValidatorType[T, S, F], rootSchema: S): Boolean = js.native
  
  /** Determines which of the given `options` provided most closely matches the `formData`.
    * Returns the index of the option that is valid and is the closest match, or 0 if there is no match.
    *
    * The closest match is determined using the number of matching properties, and more heavily favors options with
    * matching readOnly, default, or const values.
    *
    * @param formData - The form data associated with the schema
    * @param options - The list of options that can be selected from
    * @param [selectedOption] - The index of the currently selected option, defaulted to -1 if not specified
    * @param [discriminatorField] - The optional name of the field within the options object whose value is used to
    *          determine which option is selected
    * @returns - The index of the option that is the closest match to the `formData` or the `selectedOption` if no match
    */
  def getClosestMatchingOption(formData: T, options: js.Array[S]): Double = js.native
  def getClosestMatchingOption(formData: T, options: js.Array[S], selectedOption: Double): Double = js.native
  def getClosestMatchingOption(formData: T, options: js.Array[S], selectedOption: Double, discriminatorField: String): Double = js.native
  def getClosestMatchingOption(formData: T, options: js.Array[S], selectedOption: Unit, discriminatorField: String): Double = js.native
  def getClosestMatchingOption(formData: Unit, options: js.Array[S]): Double = js.native
  def getClosestMatchingOption(formData: Unit, options: js.Array[S], selectedOption: Double): Double = js.native
  def getClosestMatchingOption(formData: Unit, options: js.Array[S], selectedOption: Double, discriminatorField: String): Double = js.native
  def getClosestMatchingOption(formData: Unit, options: js.Array[S], selectedOption: Unit, discriminatorField: String): Double = js.native
  
  /** Returns the superset of `formData` that includes the given set updated to include any missing fields that have
    * computed to have defaults provided in the `schema`.
    *
    * @param schema - The schema for which the default state is desired
    * @param [formData] - The current formData, if any, onto which to provide any missing defaults
    * @param [includeUndefinedValues=false] - Optional flag, if true, cause undefined values to be added as defaults.
    *          If "excludeObjectChildren", cause undefined values for this object and pass `includeUndefinedValues` as
    *          false when computing defaults for any nested object properties.
    * @returns - The resulting `formData` with all the defaults provided
    */
  def getDefaultFormState(schema: S): js.UndefOr[T | js.Array[T]] = js.native
  def getDefaultFormState(schema: S, formData: T): js.UndefOr[T | js.Array[T]] = js.native
  def getDefaultFormState(schema: S, formData: T, includeUndefinedValues: Boolean): js.UndefOr[T | js.Array[T]] = js.native
  def getDefaultFormState(schema: S, formData: Unit, includeUndefinedValues: Boolean): js.UndefOr[T | js.Array[T]] = js.native
  @JSName("getDefaultFormState")
  def getDefaultFormState_excludeObjectChildren(schema: S, formData: T, includeUndefinedValues: excludeObjectChildren): js.UndefOr[T | js.Array[T]] = js.native
  @JSName("getDefaultFormState")
  def getDefaultFormState_excludeObjectChildren(schema: S, formData: Unit, includeUndefinedValues: excludeObjectChildren): js.UndefOr[T | js.Array[T]] = js.native
  
  /** Determines whether the combination of `schema` and `uiSchema` properties indicates that the label for the `schema`
    * should be displayed in a UI.
    *
    * @param schema - The schema for which the display label flag is desired
    * @param [uiSchema] - The UI schema from which to derive potentially displayable information
    * @param [globalOptions={}] - The Global UI Schema from which to get any fallback `xxx` options
    * @returns - True if the label should be displayed or false if it should not
    */
  def getDisplayLabel(schema: S): Boolean = js.native
  def getDisplayLabel(schema: S, uiSchema: Unit, globalOptions: GlobalUISchemaOptions): Boolean = js.native
  def getDisplayLabel(schema: S, uiSchema: UiSchema[T, S, F]): Boolean = js.native
  def getDisplayLabel(schema: S, uiSchema: UiSchema[T, S, F], globalOptions: GlobalUISchemaOptions): Boolean = js.native
  
  /** Given the `formData` and list of `options`, attempts to find the index of the first option that matches the data.
    * Always returns the first option if there is nothing that matches.
    *
    * @param formData - The current formData, if any, used to figure out a match
    * @param options - The list of options to find a matching options from
    * @param [discriminatorField] - The optional name of the field within the options object whose value is used to
    *          determine which option is selected
    * @returns - The firstindex of the matched option or 0 if none is available
    */
  def getFirstMatchingOption(formData: T, options: js.Array[S]): Double = js.native
  def getFirstMatchingOption(formData: T, options: js.Array[S], discriminatorField: String): Double = js.native
  def getFirstMatchingOption(formData: Unit, options: js.Array[S]): Double = js.native
  def getFirstMatchingOption(formData: Unit, options: js.Array[S], discriminatorField: String): Double = js.native
  
  /** Given the `formData` and list of `options`, attempts to find the index of the option that best matches the data.
    * Deprecated, use `getFirstMatchingOption()` instead.
    *
    * @param formData - The current formData, if any, onto which to provide any missing defaults
    * @param options - The list of options to find a matching options from
    * @param [discriminatorField] - The optional name of the field within the options object whose value is used to
    *          determine which option is selected
    * @returns - The index of the matched option or 0 if none is available
    * @deprecated
    */
  def getMatchingOption(formData: T, options: js.Array[S]): Double = js.native
  def getMatchingOption(formData: T, options: js.Array[S], discriminatorField: String): Double = js.native
  def getMatchingOption(formData: Unit, options: js.Array[S]): Double = js.native
  def getMatchingOption(formData: Unit, options: js.Array[S], discriminatorField: String): Double = js.native
  
  /** Returns the `ValidatorType` in the `SchemaUtilsType`
    *
    * @returns - The `ValidatorType`
    */
  def getValidator(): ValidatorType[T, S, F] = js.native
  
  /** Checks to see if the `schema` and `uiSchema` combination represents an array of files
    *
    * @param schema - The schema for which check for array of files flag is desired
    * @param [uiSchema] - The UI schema from which to check the widget
    * @returns - True if schema/uiSchema contains an array of files, otherwise false
    */
  def isFilesArray(schema: S): Boolean = js.native
  def isFilesArray(schema: S, uiSchema: UiSchema[T, S, F]): Boolean = js.native
  
  /** Checks to see if the `schema` combination represents a multi-select
    *
    * @param schema - The schema for which check for a multi-select flag is desired
    * @returns - True if schema contains a multi-select, otherwise false
    */
  def isMultiSelect(schema: S): Boolean = js.native
  
  /** Checks to see if the `schema` combination represents a select
    *
    * @param schema - The schema for which check for a select flag is desired
    * @returns - True if schema contains a select, otherwise false
    */
  def isSelect(schema: S): Boolean = js.native
  
  /** Merges the errors in `additionalErrorSchema` into the existing `validationData` by combining the hierarchies in
    * the two `ErrorSchema`s and then appending the error list from the `additionalErrorSchema` obtained by calling
    * `validator.toErrorList()` onto the `errors` in the `validationData`. If no `additionalErrorSchema` is passed, then
    * `validationData` is returned.
    *
    * @param validationData - The current `ValidationData` into which to merge the additional errors
    * @param [additionalErrorSchema] - The additional set of errors
    * @returns - The `validationData` with the additional errors from `additionalErrorSchema` merged into it, if provided
    * @deprecated - Use the `validationDataMerge()` function exported from `@rjsf/utils` instead. This function will be
    *        removed in the next major release.
    */
  def mergeValidationData(validationData: ValidationData[T]): ValidationData[T] = js.native
  def mergeValidationData(validationData: ValidationData[T], additionalErrorSchema: ErrorSchema[T]): ValidationData[T] = js.native
  
  /** Retrieves an expanded schema that has had all of its conditions, additional properties, references and
    * dependencies resolved and merged into the `schema` given a `rawFormData` that is used to do the potentially
    * recursive resolution.
    *
    * @param schema - The schema for which retrieving a schema is desired
    * @param [formData] - The current formData, if any, to assist retrieving a schema
    * @returns - The schema having its conditions, additional properties, references and dependencies resolved
    */
  def retrieveSchema(schema: S): S = js.native
  def retrieveSchema(schema: S, formData: T): S = js.native
  
  /** Sanitize the `data` associated with the `oldSchema` so it is considered appropriate for the `newSchema`. If the
    * new schema does not contain any properties, then `undefined` is returned to clear all the form data. Due to the
    * nature of schemas, this sanitization happens recursively for nested objects of data. Also, any properties in the
    * old schema that are non-existent in the new schema are set to `undefined`.
    *
    * @param [newSchema] - The new schema for which the data is being sanitized
    * @param [oldSchema] - The old schema from which the data originated
    * @param [data={}] - The form data associated with the schema, defaulting to an empty object when undefined
    * @returns - The new form data, with all of the fields uniquely associated with the old schema set
    *      to `undefined`. Will return `undefined` if the new schema is not an object containing properties.
    */
  def sanitizeDataForNewSchema(): T = js.native
  def sanitizeDataForNewSchema(newSchema: S): T = js.native
  def sanitizeDataForNewSchema(newSchema: S, oldSchema: S): T = js.native
  def sanitizeDataForNewSchema(newSchema: S, oldSchema: S, data: Any): T = js.native
  def sanitizeDataForNewSchema(newSchema: S, oldSchema: Unit, data: Any): T = js.native
  def sanitizeDataForNewSchema(newSchema: Unit, oldSchema: S): T = js.native
  def sanitizeDataForNewSchema(newSchema: Unit, oldSchema: S, data: Any): T = js.native
  def sanitizeDataForNewSchema(newSchema: Unit, oldSchema: Unit, data: Any): T = js.native
  
  /** Generates an `IdSchema` object for the `schema`, recursively
    *
    * @param schema - The schema for which the display label flag is desired
    * @param [id] - The base id for the schema
    * @param [formData] - The current formData, if any, onto which to provide any missing defaults
    * @param [idPrefix='root'] - The prefix to use for the id
    * @param [idSeparator='_'] - The separator to use for the path segments in the id
    * @returns - The `IdSchema` object for the `schema`
    */
  def toIdSchema(schema: S): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: String): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: String, formData: T): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: String, formData: T, idPrefix: String): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: String, formData: T, idPrefix: String, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: String, formData: T, idPrefix: Unit, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: String, formData: Unit, idPrefix: String): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: String, formData: Unit, idPrefix: String, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: String, formData: Unit, idPrefix: Unit, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: Unit, formData: T): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: Unit, formData: T, idPrefix: String): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: Unit, formData: T, idPrefix: String, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: Unit, formData: T, idPrefix: Unit, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: Unit, formData: Unit, idPrefix: String): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: Unit, formData: Unit, idPrefix: String, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: S, id: Unit, formData: Unit, idPrefix: Unit, idSeparator: String): IdSchema[T] = js.native
  
  /** Generates an `PathSchema` object for the `schema`, recursively
    *
    * @param schema - The schema for which the display label flag is desired
    * @param [name] - The base name for the schema
    * @param [formData] - The current formData, if any, onto which to provide any missing defaults
    * @returns - The `PathSchema` object for the `schema`
    */
  def toPathSchema(schema: S): PathSchema[T] = js.native
  def toPathSchema(schema: S, name: String): PathSchema[T] = js.native
  def toPathSchema(schema: S, name: String, formData: T): PathSchema[T] = js.native
  def toPathSchema(schema: S, name: Unit, formData: T): PathSchema[T] = js.native
}
