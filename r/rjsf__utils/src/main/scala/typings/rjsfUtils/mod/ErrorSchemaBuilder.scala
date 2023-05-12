package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The `ErrorSchemaBuilder<T>` is used to build an `ErrorSchema<T>` since the definition of the `ErrorSchema` type is
  * designed for reading information rather than writing it. Use this class to add, replace or clear errors in an error
  * schema by using either dotted path or an array of path names. Once you are done building the `ErrorSchema`, you can
  * get the result and/or reset all the errors back to an initial set and start again.
  */
@JSImport("@rjsf/utils", "ErrorSchemaBuilder")
@js.native
/** Construct an `ErrorSchemaBuilder` with an optional initial set of errors in an `ErrorSchema`.
  *
  * @param [initialSchema] - The optional set of initial errors, that will be cloned into the class
  */
open class ErrorSchemaBuilder[T] () extends StObject {
  def this(initialSchema: ErrorSchema[T]) = this()
  
  /** Returns the `ErrorSchema` that has been updated by the methods of the `ErrorSchemaBuilder`
    */
  def ErrorSchema: typings.rjsfUtils.mod.ErrorSchema[T] = js.native
  
  /** Adds the `errorOrList` to the list of errors in the `ErrorSchema` at either the root level or the location within
    * the schema described by the `pathOfError`. For more information about how to specify the path see the
    * [eslint lodash plugin docs](https://github.com/wix/eslint-plugin-lodash/blob/master/docs/rules/path-style.md).
    *
    * @param errorOrList - The error or list of errors to add into the `ErrorSchema`
    * @param [pathOfError] - The optional path into the `ErrorSchema` at which to add the error(s)
    * @returns - The `ErrorSchemaBuilder` object for chaining purposes
    */
  def addErrors(errorOrList: String): this.type = js.native
  def addErrors(errorOrList: String, pathOfError: String): this.type = js.native
  def addErrors(errorOrList: String, pathOfError: js.Array[String]): this.type = js.native
  def addErrors(errorOrList: js.Array[String]): this.type = js.native
  def addErrors(errorOrList: js.Array[String], pathOfError: String): this.type = js.native
  def addErrors(errorOrList: js.Array[String], pathOfError: js.Array[String]): this.type = js.native
  
  /** Clears the error(s) in the `ErrorSchema` at either the root level or the location within the schema described by
    * the `pathOfError`. For more information about how to specify the path see the
    * [eslint lodash plugin docs](https://github.com/wix/eslint-plugin-lodash/blob/master/docs/rules/path-style.md).
    *
    * @param [pathOfError] - The optional path into the `ErrorSchema` at which to clear the error(s)
    * @returns - The `ErrorSchemaBuilder` object for chaining purposes
    */
  def clearErrors(): this.type = js.native
  def clearErrors(pathOfError: String): this.type = js.native
  def clearErrors(pathOfError: js.Array[String]): this.type = js.native
  
  /** The error schema being built
    *
    * @private
    */
  /* private */ var errorSchema: Any = js.native
  
  /** Will get an existing `ErrorSchema` at the specified `pathOfError` or create and return one.
    *
    * @param [pathOfError] - The optional path into the `ErrorSchema` at which to add the error(s)
    * @returns - The error block for the given `pathOfError` or the root if not provided
    * @private
    */
  /* private */ var getOrCreateErrorBlock: Any = js.native
  
  /** Resets all errors in the `ErrorSchemaBuilder` back to the `initialSchema` if provided, otherwise an empty set.
    *
    * @param [initialSchema] - The optional set of initial errors, that will be cloned into the class
    * @returns - The `ErrorSchemaBuilder` object for chaining purposes
    */
  def resetAllErrors(): this.type = js.native
  def resetAllErrors(initialSchema: ErrorSchema[T]): this.type = js.native
  
  /** Sets/replaces the `errorOrList` as the error(s) in the `ErrorSchema` at either the root level or the location
    * within the schema described by the `pathOfError`. For more information about how to specify the path see the
    * [eslint lodash plugin docs](https://github.com/wix/eslint-plugin-lodash/blob/master/docs/rules/path-style.md).
    *
    * @param errorOrList - The error or list of errors to set into the `ErrorSchema`
    * @param [pathOfError] - The optional path into the `ErrorSchema` at which to set the error(s)
    * @returns - The `ErrorSchemaBuilder` object for chaining purposes
    */
  def setErrors(errorOrList: String): this.type = js.native
  def setErrors(errorOrList: String, pathOfError: String): this.type = js.native
  def setErrors(errorOrList: String, pathOfError: js.Array[String]): this.type = js.native
  def setErrors(errorOrList: js.Array[String]): this.type = js.native
  def setErrors(errorOrList: js.Array[String], pathOfError: String): this.type = js.native
  def setErrors(errorOrList: js.Array[String], pathOfError: js.Array[String]): this.type = js.native
}
