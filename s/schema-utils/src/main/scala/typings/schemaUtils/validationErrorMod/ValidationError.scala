package typings.schemaUtils.validationErrorMod

import typings.jsonSchema.mod.JSONSchema4
import typings.schemaUtils.ErrorObjectchildrenArrayE
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends Error {
  /** @type {string} */
  var baseDataPath: String = js.native
  /** @type {Array<SchemaUtilErrorObject>} */
  var errors: js.Array[SchemaUtilErrorObject] = js.native
  /** @type {string} */
  var headerName: String = js.native
  /** @type {PostFormatter | null} */
  var postFormatter: PostFormatter | Null = js.native
  /** @type {Schema} */
  var schema: Schema = js.native
  /**
    * @param {Schema} schema
    * @param {Array<Object>} prevSchemas
    * @returns {string}
    */
  def formatSchema(schema: JSONSchema4): String = js.native
  def formatSchema(schema: JSONSchema4, prevSchemas: js.Array[js.Object]): String = js.native
  def formatSchema(schema: typings.jsonSchema.mod.JSONSchema6): String = js.native
  def formatSchema(schema: typings.jsonSchema.mod.JSONSchema6, prevSchemas: js.Array[js.Object]): String = js.native
  def formatSchema(schema: typings.jsonSchema.mod.JSONSchema7): String = js.native
  def formatSchema(schema: typings.jsonSchema.mod.JSONSchema7, prevSchemas: js.Array[js.Object]): String = js.native
  /**
    * @param {SchemaUtilErrorObject} error
    * @returns {string}
    */
  def formatValidationError(error: ErrorObjectchildrenArrayE): String = js.native
  /**
    * @param {Array<SchemaUtilErrorObject>} errors
    * @returns {string}
    */
  def formatValidationErrors(errors: js.Array[ErrorObjectchildrenArrayE]): String = js.native
  /**
    * @param {string} path
    * @returns {Schema}
    */
  def getSchemaPart(path: String): JSONSchema4 | typings.jsonSchema.mod.JSONSchema6 | typings.jsonSchema.mod.JSONSchema7 = js.native
  /**
    * @param {Schema=} schemaPart
    * @returns {string}
    */
  def getSchemaPartDescription(): String = js.native
  def getSchemaPartDescription(schemaPart: JSONSchema4): String = js.native
  def getSchemaPartDescription(schemaPart: typings.jsonSchema.mod.JSONSchema6): String = js.native
  def getSchemaPartDescription(schemaPart: typings.jsonSchema.mod.JSONSchema7): String = js.native
  /**
    * @param {Schema=} schemaPart
    * @param {(boolean | Array<string>)=} additionalPath
    * @param {boolean=} needDot
    * @returns {string}
    */
  def getSchemaPartText(): String = js.native
  def getSchemaPartText(schemaPart: JSONSchema4 | typings.jsonSchema.mod.JSONSchema6 | typings.jsonSchema.mod.JSONSchema7): String = js.native
  def getSchemaPartText(
    schemaPart: JSONSchema4 | typings.jsonSchema.mod.JSONSchema6 | typings.jsonSchema.mod.JSONSchema7,
    additionalPath: Boolean | js.Array[String]
  ): String = js.native
  def getSchemaPartText(
    schemaPart: JSONSchema4 | typings.jsonSchema.mod.JSONSchema6 | typings.jsonSchema.mod.JSONSchema7,
    additionalPath: Boolean | js.Array[String],
    needDot: Boolean
  ): String = js.native
}

