package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The `SchemaUtilsType` interface provides a wrapper around the publicly exported APIs in the `@rjsf/utils/schema`
  * directory such that one does not have to explicitly pass the `validator` or `rootSchema` to each method. Since both
  * the `validator` and `rootSchema` generally does not change across a `Form`, this allows for providing a simplified
  * set of APIs to the `@rjsf/core` components and the various themes as well.
  */
@js.native
trait SchemaUtilsType[T] extends StObject {
  
  /** Determines whether either the `validator` and `rootSchema` differ from the ones associated with this instance of
    * the `SchemaUtilsType`. If either `validator` or `rootSchema` are falsy, then return false to prevent the creation
    * of a new `SchemaUtilsType` with incomplete properties.
    *
    * @param validator - An implementation of the `ValidatorType` interface that will be compared against the current one
    * @param rootSchema - The root schema that will be compared against the current one
    * @returns - True if the `SchemaUtilsType` differs from the given `validator` or `rootSchema`
    */
  def doesSchemaUtilsDiffer(validator: ValidatorType[Any], rootSchema: RJSFSchema): Boolean = js.native
  
  /** Returns the superset of `formData` that includes the given set updated to include any missing fields that have
    * computed to have defaults provided in the `schema`.
    *
    * @param schema - The schema for which the default state is desired
    * @param [formData] - The current formData, if any, onto which to provide any missing defaults
    * @param [includeUndefinedValues=false] - Optional flag, if true, cause undefined values to be added as defaults
    * @returns - The resulting `formData` with all the defaults provided
    */
  def getDefaultFormState(schema: RJSFSchema): js.UndefOr[T | js.Array[T]] = js.native
  def getDefaultFormState(schema: RJSFSchema, formData: T): js.UndefOr[T | js.Array[T]] = js.native
  def getDefaultFormState(schema: RJSFSchema, formData: T, includeUndefinedValues: Boolean): js.UndefOr[T | js.Array[T]] = js.native
  def getDefaultFormState(schema: RJSFSchema, formData: Unit, includeUndefinedValues: Boolean): js.UndefOr[T | js.Array[T]] = js.native
  
  /** Determines whether the combination of `schema` and `uiSchema` properties indicates that the label for the `schema`
    * should be displayed in a UI.
    *
    * @param schema - The schema for which the display label flag is desired
    * @param [uiSchema] - The UI schema from which to derive potentially displayable information
    * @returns - True if the label should be displayed or false if it should not
    */
  def getDisplayLabel[F](schema: RJSFSchema): Boolean = js.native
  def getDisplayLabel[F](schema: RJSFSchema, uiSchema: UiSchema[T, F]): Boolean = js.native
  
  /** Given the `formData` and list of `options`, attempts to find the index of the option that best matches the data.
    *
    * @param formData - The current formData, if any, onto which to provide any missing defaults
    * @param options - The list of options to find a matching options from
    * @returns - The index of the matched option or 0 if none is available
    */
  def getMatchingOption(formData: T, options: js.Array[RJSFSchema]): Double = js.native
  
  /** Returns the `ValidatorType` in the `SchemaUtilsType`
    *
    * @returns - The `ValidatorType`
    */
  def getValidator(): ValidatorType[T] = js.native
  
  /** Checks to see if the `schema` and `uiSchema` combination represents an array of files
    *
    * @param schema - The schema for which check for array of files flag is desired
    * @param [uiSchema] - The UI schema from which to check the widget
    * @returns - True if schema/uiSchema contains an array of files, otherwise false
    */
  def isFilesArray[F](schema: RJSFSchema): Boolean = js.native
  def isFilesArray[F](schema: RJSFSchema, uiSchema: UiSchema[T, F]): Boolean = js.native
  
  /** Checks to see if the `schema` combination represents a multi-select
    *
    * @param schema - The schema for which check for a multi-select flag is desired
    * @returns - True if schema contains a multi-select, otherwise false
    */
  def isMultiSelect(schema: RJSFSchema): Boolean = js.native
  
  /** Checks to see if the `schema` combination represents a select
    *
    * @param schema - The schema for which check for a select flag is desired
    * @returns - True if schema contains a select, otherwise false
    */
  def isSelect(schema: RJSFSchema): Boolean = js.native
  
  /** Merges the errors in `additionalErrorSchema` into the existing `validationData` by combining the hierarchies in the
    * two `ErrorSchema`s and then appending the error list from the `additionalErrorSchema` obtained by calling
    * `validator.toErrorList()` onto the `errors` in the `validationData`. If no `additionalErrorSchema` is passed, then
    * `validationData` is returned.
    *
    * @param validator - The validator used to convert an ErrorSchema to a list of errors
    * @param validationData - The current `ValidationData` into which to merge the additional errors
    * @param [additionalErrorSchema] - The additional set of errors
    * @returns - The `validationData` with the additional errors from `additionalErrorSchema` merged into it, if provided.
    */
  def mergeValidationData(validationData: ValidationData[T]): ValidationData[T] = js.native
  def mergeValidationData(validationData: ValidationData[T], additionalErrorSchema: ErrorSchema[T]): ValidationData[T] = js.native
  
  /** Retrieves an expanded schema that has had all of its conditions, additional properties, references and
    * dependencies resolved and merged into the `schema` given a `rawFormData` that is used to do the potentially
    * recursive resolution.
    *
    * @param schema - The schema for which retrieving a schema is desired
    * @param [rawFormData] - The current formData, if any, to assist retrieving a schema
    * @returns - The schema having its conditions, additional properties, references and dependencies resolved
    */
  def retrieveSchema(schema: RJSFSchema): RJSFSchema = js.native
  def retrieveSchema(schema: RJSFSchema, formData: T): RJSFSchema = js.native
  
  /** Generates an `IdSchema` object for the `schema`, recursively
    *
    * @param schema - The schema for which the display label flag is desired
    * @param [id] - The base id for the schema
    * @param [formData] - The current formData, if any, onto which to provide any missing defaults
    * @param [idPrefix='root'] - The prefix to use for the id
    * @param [idSeparator='_'] - The separator to use for the path segments in the id
    * @returns - The `IdSchema` object for the `schema`
    */
  def toIdSchema(schema: RJSFSchema): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: String): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: String, formData: T): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: String, formData: T, idPrefix: String): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: String, formData: T, idPrefix: String, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: String, formData: T, idPrefix: Unit, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: String, formData: Unit, idPrefix: String): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: String, formData: Unit, idPrefix: String, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: String, formData: Unit, idPrefix: Unit, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: Unit, formData: T): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: Unit, formData: T, idPrefix: String): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: Unit, formData: T, idPrefix: String, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: Unit, formData: T, idPrefix: Unit, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: Unit, formData: Unit, idPrefix: String): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: Unit, formData: Unit, idPrefix: String, idSeparator: String): IdSchema[T] = js.native
  def toIdSchema(schema: RJSFSchema, id: Unit, formData: Unit, idPrefix: Unit, idSeparator: String): IdSchema[T] = js.native
  
  /** Generates an `PathSchema` object for the `schema`, recursively
    *
    * @param schema - The schema for which the display label flag is desired
    * @param [name] - The base name for the schema
    * @param [formData] - The current formData, if any, onto which to provide any missing defaults
    * @returns - The `PathSchema` object for the `schema`
    */
  def toPathSchema(schema: RJSFSchema): PathSchema[T] = js.native
  def toPathSchema(schema: RJSFSchema, name: String): PathSchema[T] = js.native
  def toPathSchema(schema: RJSFSchema, name: String, formData: T): PathSchema[T] = js.native
  def toPathSchema(schema: RJSFSchema, name: Unit, formData: T): PathSchema[T] = js.native
}
