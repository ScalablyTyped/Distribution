package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The interface that describes the validation functions that are provided by a Validator implementation used by the
  * schema utilities.
  */
@js.native
trait ValidatorType[T] extends StObject {
  
  /** Validates data against a schema, returning true if the data is valid, or
    * false otherwise. If the schema is invalid, then this function will return
    * false.
    *
    * @param schema - The schema against which to validate the form data   * @param schema
    * @param formData- - The form data to validate
    * @param rootSchema - The root schema used to provide $ref resolutions
    */
  def isValid(schema: RJSFSchema, formData: T, rootSchema: RJSFSchema): Boolean = js.native
  
  /** Converts an `errorSchema` into a list of `RJSFValidationErrors`
    *
    * @param errorSchema - The `ErrorSchema` instance to convert
    * @param [fieldPath=[]] - The current field path, defaults to [] if not specified
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
    */
  def validateFormData(formData: T, schema: RJSFSchema): ValidationData[T] = js.native
  def validateFormData(formData: T, schema: RJSFSchema, customValidate: Unit, transformErrors: ErrorTransformer): ValidationData[T] = js.native
  def validateFormData(formData: T, schema: RJSFSchema, customValidate: CustomValidator[T]): ValidationData[T] = js.native
  def validateFormData(
    formData: T,
    schema: RJSFSchema,
    customValidate: CustomValidator[T],
    transformErrors: ErrorTransformer
  ): ValidationData[T] = js.native
}
