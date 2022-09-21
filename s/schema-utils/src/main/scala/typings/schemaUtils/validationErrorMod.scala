package typings.schemaUtils

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationErrorMod {
  
  @JSImport("schema-utils/declarations/ValidationError", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ValidationError {
    /**
      * @param {Array<SchemaUtilErrorObject>} errors
      * @param {Schema} schema
      * @param {ValidationErrorConfiguration} configuration
      */
    def this(errors: js.Array[SchemaUtilErrorObject], schema: Schema) = this()
    def this(
      errors: js.Array[SchemaUtilErrorObject],
      schema: Schema,
      configuration: ValidationErrorConfiguration
    ) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  type JSONSchema6 = typings.jsonSchema.mod.JSONSchema6
  
  type JSONSchema7 = typings.jsonSchema.mod.JSONSchema7
  
  type PostFormatter = typings.schemaUtils.validateMod.PostFormatter
  
  type Schema = typings.schemaUtils.validateMod.Schema
  
  type SchemaUtilErrorObject = typings.schemaUtils.validateMod.SchemaUtilErrorObject
  
  @js.native
  trait ValidationError
    extends StObject
       with Error {
    
    /** @type {string} */
    var baseDataPath: String = js.native
    
    /** @type {Array<SchemaUtilErrorObject>} */
    var errors: js.Array[SchemaUtilErrorObject] = js.native
    
    /**
      * @param {Schema} schema
      * @param {boolean} logic
      * @param {Array<Object>} prevSchemas
      * @returns {string}
      */
    def formatSchema(schema: Schema): String = js.native
    def formatSchema(schema: Schema, logic: Boolean): String = js.native
    def formatSchema(schema: Schema, logic: Boolean, prevSchemas: js.Array[js.Object]): String = js.native
    def formatSchema(schema: Schema, logic: Unit, prevSchemas: js.Array[js.Object]): String = js.native
    
    /**
      * @param {SchemaUtilErrorObject} error
      * @returns {string}
      */
    def formatValidationError(error: SchemaUtilErrorObject): String = js.native
    
    /**
      * @param {Array<SchemaUtilErrorObject>} errors
      * @returns {string}
      */
    def formatValidationErrors(errors: js.Array[SchemaUtilErrorObject]): String = js.native
    
    /**
      * @param {string} path
      * @returns {Schema}
      */
    def getSchemaPart(path: String): Schema = js.native
    
    /**
      * @param {Schema=} schemaPart
      * @returns {string}
      */
    def getSchemaPartDescription(): String = js.native
    def getSchemaPartDescription(schemaPart: Schema): String = js.native
    
    /**
      * @param {Schema=} schemaPart
      * @param {(boolean | Array<string>)=} additionalPath
      * @param {boolean=} needDot
      * @param {boolean=} logic
      * @returns {string}
      */
    def getSchemaPartText(): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: js.Array[String]): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: js.Array[String], needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: js.Array[String], needDot: Boolean, logic: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: js.Array[String], needDot: Unit, logic: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: Boolean, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: Boolean, needDot: Boolean, logic: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: Boolean, needDot: Unit, logic: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: Unit, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: Unit, needDot: Boolean, logic: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: Unit, needDot: Unit, logic: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Schema): String = js.native
    def getSchemaPartText(schemaPart: Schema, additionalPath: js.Array[String]): String = js.native
    def getSchemaPartText(schemaPart: Schema, additionalPath: js.Array[String], needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Schema, additionalPath: js.Array[String], needDot: Boolean, logic: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Schema, additionalPath: js.Array[String], needDot: Unit, logic: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Schema, additionalPath: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Schema, additionalPath: Boolean, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Schema, additionalPath: Boolean, needDot: Boolean, logic: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Schema, additionalPath: Boolean, needDot: Unit, logic: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Schema, additionalPath: Unit, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Schema, additionalPath: Unit, needDot: Boolean, logic: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Schema, additionalPath: Unit, needDot: Unit, logic: Boolean): String = js.native
    
    /** @type {string} */
    var headerName: String = js.native
    
    /** @type {PostFormatter | null} */
    var postFormatter: PostFormatter | Null = js.native
    
    /** @type {Schema} */
    var schema: Schema = js.native
  }
  
  type ValidationErrorConfiguration = typings.schemaUtils.validateMod.ValidationErrorConfiguration
}
