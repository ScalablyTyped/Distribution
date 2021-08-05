package typings.schemaUtils

import typings.ajv.mod.ErrorObject
import typings.ajv.mod.ErrorParameters
import typings.jsonSchema.mod.JSONSchema4
import typings.schemaUtils.anon.ErrorObjectchildrenArrayE
import typings.schemaUtils.validateMod.Extend
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationErrorMod {
  
  @JSImport("schema-utils/declarations/ValidationError", JSImport.Default)
  @js.native
  class default protected ()
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
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  type JSONSchema6 = typings.jsonSchema.mod.JSONSchema6
  
  type JSONSchema7 = typings.jsonSchema.mod.JSONSchema7
  
  type PostFormatter = js.Function2[/* formattedError */ String, /* error */ ErrorObjectchildrenArrayE, String]
  
  type SPECIFICITY = Double
  
  type Schema = (JSONSchema4 & Extend) | (typings.jsonSchema.mod.JSONSchema6 & Extend) | (typings.jsonSchema.mod.JSONSchema7 & Extend)
  
  trait SchemaUtilErrorObject
    extends StObject
       with ErrorObject {
    
    var children: js.UndefOr[js.Array[ErrorObject]] = js.undefined
  }
  object SchemaUtilErrorObject {
    
    inline def apply(dataPath: String, keyword: String, params: ErrorParameters, schemaPath: String): SchemaUtilErrorObject = {
      val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaUtilErrorObject]
    }
    
    extension [Self <: SchemaUtilErrorObject](x: Self) {
      
      inline def setChildren(value: js.Array[ErrorObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ErrorObject*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
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
  
  trait ValidationErrorConfiguration extends StObject {
    
    var baseDataPath: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var postFormatter: js.UndefOr[typings.schemaUtils.validateMod.PostFormatter] = js.undefined
  }
  object ValidationErrorConfiguration {
    
    inline def apply(): ValidationErrorConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationErrorConfiguration]
    }
    
    extension [Self <: ValidationErrorConfiguration](x: Self) {
      
      inline def setBaseDataPath(value: String): Self = StObject.set(x, "baseDataPath", value.asInstanceOf[js.Any])
      
      inline def setBaseDataPathUndefined: Self = StObject.set(x, "baseDataPath", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPostFormatter(
        value: (/* formattedError */ String, /* error */ typings.schemaUtils.validateMod.SchemaUtilErrorObject) => String
      ): Self = StObject.set(x, "postFormatter", js.Any.fromFunction2(value))
      
      inline def setPostFormatterUndefined: Self = StObject.set(x, "postFormatter", js.undefined)
    }
  }
}
