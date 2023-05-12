package typings.rjsfUtils.mod

import typings.rjsfUtils.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The interface that describes the validation functions that are provided by a Validator implementation used by the
  * schema utilities.
  */
@js.native
trait ValidatorType[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** Validates data against a schema, returning true if the data is valid, or
    * false otherwise. If the schema is invalid, then this function will return
    * false.
    *
    * @param schema - The schema against which to validate the form data   * @param schema
    * @param formData - The form data to validate
    * @param rootSchema - The root schema used to provide $ref resolutions
    */
  def isValid(schema: S, formData: T, rootSchema: S): Boolean = js.native
  def isValid(schema: S, formData: Unit, rootSchema: S): Boolean = js.native
  
  /** Runs the pure validation of the `schema` and `formData` without any of the RJSF functionality. Provided for use
    * by the playground. Returns the `errors` from the validation
    *
    * @param schema - The schema against which to validate the form data
    * @param formData - The form data to validate
    */
  def rawValidation[Result](schema: S): Errors[Result] = js.native
  def rawValidation[Result](schema: S, formData: T): Errors[Result] = js.native
  
  /** Converts an `errorSchema` into a list of `RJSFValidationErrors`
    *
    * @param errorSchema - The `ErrorSchema` instance to convert
    * @param [fieldPath=[]] - The current field path, defaults to [] if not specified
    * @deprecated - Use the `toErrorList()` function provided by `@rjsf/utils` instead. This function will be removed in
    *        the next major release.
    */
  def toErrorList(): js.Array[RJSFValidationError] = js.native
  def toErrorList(errorSchema: Unit, fieldPath: js.Array[String]): js.Array[RJSFValidationError] = js.native
  def toErrorList(errorSchema: ErrorSchema[T]): js.Array[RJSFValidationError] = js.native
  def toErrorList(errorSchema: ErrorSchema[T], fieldPath: js.Array[String]): js.Array[RJSFValidationError] = js.native
  
  /** This function processes the `formData` with an optional user contributed `customValidate` function, which receives
    * the form data and a `errorHandler` function that will be used to add custom validation errors for each field. Also
    * supports a `transformErrors` function that will take the raw AJV validation errors, prior to custom validation and
    * transform them in what ever way it chooses.
    *
    * @param formData - The form data to validate
    * @param schema - The schema against which to validate the form data
    * @param [customValidate] - An optional function that is used to perform custom validation
    * @param [transformErrors] - An optional function that is used to transform errors after AJV validation
    * @param [uiSchema] - An optional uiSchema that is passed to `transformErrors` and `customValidate`
    */
  def validateFormData(formData: T, schema: S): ValidationData[T] = js.native
  def validateFormData(formData: T, schema: S, customValidate: Unit, transformErrors: Unit, uiSchema: UiSchema[T, S, F]): ValidationData[T] = js.native
  def validateFormData(formData: T, schema: S, customValidate: Unit, transformErrors: ErrorTransformer[T, S, F]): ValidationData[T] = js.native
  def validateFormData(
    formData: T,
    schema: S,
    customValidate: Unit,
    transformErrors: ErrorTransformer[T, S, F],
    uiSchema: UiSchema[T, S, F]
  ): ValidationData[T] = js.native
  def validateFormData(formData: T, schema: S, customValidate: CustomValidator[T, S, F]): ValidationData[T] = js.native
  def validateFormData(
    formData: T,
    schema: S,
    customValidate: CustomValidator[T, S, F],
    transformErrors: Unit,
    uiSchema: UiSchema[T, S, F]
  ): ValidationData[T] = js.native
  def validateFormData(
    formData: T,
    schema: S,
    customValidate: CustomValidator[T, S, F],
    transformErrors: ErrorTransformer[T, S, F]
  ): ValidationData[T] = js.native
  def validateFormData(
    formData: T,
    schema: S,
    customValidate: CustomValidator[T, S, F],
    transformErrors: ErrorTransformer[T, S, F],
    uiSchema: UiSchema[T, S, F]
  ): ValidationData[T] = js.native
  def validateFormData(formData: Unit, schema: S): ValidationData[T] = js.native
  def validateFormData(
    formData: Unit,
    schema: S,
    customValidate: Unit,
    transformErrors: Unit,
    uiSchema: UiSchema[T, S, F]
  ): ValidationData[T] = js.native
  def validateFormData(formData: Unit, schema: S, customValidate: Unit, transformErrors: ErrorTransformer[T, S, F]): ValidationData[T] = js.native
  def validateFormData(
    formData: Unit,
    schema: S,
    customValidate: Unit,
    transformErrors: ErrorTransformer[T, S, F],
    uiSchema: UiSchema[T, S, F]
  ): ValidationData[T] = js.native
  def validateFormData(formData: Unit, schema: S, customValidate: CustomValidator[T, S, F]): ValidationData[T] = js.native
  def validateFormData(
    formData: Unit,
    schema: S,
    customValidate: CustomValidator[T, S, F],
    transformErrors: Unit,
    uiSchema: UiSchema[T, S, F]
  ): ValidationData[T] = js.native
  def validateFormData(
    formData: Unit,
    schema: S,
    customValidate: CustomValidator[T, S, F],
    transformErrors: ErrorTransformer[T, S, F]
  ): ValidationData[T] = js.native
  def validateFormData(
    formData: Unit,
    schema: S,
    customValidate: CustomValidator[T, S, F],
    transformErrors: ErrorTransformer[T, S, F],
    uiSchema: UiSchema[T, S, F]
  ): ValidationData[T] = js.native
}
