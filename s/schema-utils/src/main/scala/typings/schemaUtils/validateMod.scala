package typings.schemaUtils

import typings.ajv.mod.ErrorParameters
import typings.schemaUtils.validationErrorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("schema-utils/declarations/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("schema-utils/declarations/validate", "ValidationError")
  @js.native
  class ValidationError protected () extends default {
    /**
      * @param {Array<SchemaUtilErrorObject>} errors
      * @param {Schema} schema
      * @param {ValidationErrorConfiguration} configuration
      */
    def this(
      errors: js.Array[typings.schemaUtils.validationErrorMod.SchemaUtilErrorObject],
      schema: typings.schemaUtils.validationErrorMod.Schema
    ) = this()
    def this(
      errors: js.Array[typings.schemaUtils.validationErrorMod.SchemaUtilErrorObject],
      schema: typings.schemaUtils.validationErrorMod.Schema,
      configuration: typings.schemaUtils.validationErrorMod.ValidationErrorConfiguration
    ) = this()
  }
  
  inline def validate(schema: Schema, options: js.Array[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validate(schema: Schema, options: js.Array[js.Object], configuration: ValidationErrorConfiguration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validate(schema: Schema, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validate(schema: Schema, options: js.Object, configuration: ValidationErrorConfiguration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ErrorObject = typings.ajv.mod.ErrorObject
  
  trait Extend extends StObject {
    
    var formatExclusiveMaximum: js.UndefOr[Boolean] = js.undefined
    
    var formatExclusiveMinimum: js.UndefOr[Boolean] = js.undefined
    
    var formatMaximum: js.UndefOr[Double] = js.undefined
    
    var formatMinimum: js.UndefOr[Double] = js.undefined
  }
  object Extend {
    
    inline def apply(): Extend = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extend]
    }
    
    extension [Self <: Extend](x: Self) {
      
      inline def setFormatExclusiveMaximum(value: Boolean): Self = StObject.set(x, "formatExclusiveMaximum", value.asInstanceOf[js.Any])
      
      inline def setFormatExclusiveMaximumUndefined: Self = StObject.set(x, "formatExclusiveMaximum", js.undefined)
      
      inline def setFormatExclusiveMinimum(value: Boolean): Self = StObject.set(x, "formatExclusiveMinimum", value.asInstanceOf[js.Any])
      
      inline def setFormatExclusiveMinimumUndefined: Self = StObject.set(x, "formatExclusiveMinimum", js.undefined)
      
      inline def setFormatMaximum(value: Double): Self = StObject.set(x, "formatMaximum", value.asInstanceOf[js.Any])
      
      inline def setFormatMaximumUndefined: Self = StObject.set(x, "formatMaximum", js.undefined)
      
      inline def setFormatMinimum(value: Double): Self = StObject.set(x, "formatMinimum", value.asInstanceOf[js.Any])
      
      inline def setFormatMinimumUndefined: Self = StObject.set(x, "formatMinimum", js.undefined)
    }
  }
  
  type JSONSchema4 = typings.jsonSchema.mod.JSONSchema4
  
  type JSONSchema6 = typings.jsonSchema.mod.JSONSchema6
  
  type JSONSchema7 = typings.jsonSchema.mod.JSONSchema7
  
  type PostFormatter = js.Function2[/* formattedError */ String, /* error */ SchemaUtilErrorObject, String]
  
  type Schema = (typings.jsonSchema.mod.JSONSchema4 & Extend) | (typings.jsonSchema.mod.JSONSchema6 & Extend) | (typings.jsonSchema.mod.JSONSchema7 & Extend)
  
  trait SchemaUtilErrorObject
    extends StObject
       with typings.ajv.mod.ErrorObject {
    
    var children: js.UndefOr[js.Array[typings.ajv.mod.ErrorObject]] = js.undefined
  }
  object SchemaUtilErrorObject {
    
    inline def apply(dataPath: String, keyword: String, params: ErrorParameters, schemaPath: String): SchemaUtilErrorObject = {
      val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaUtilErrorObject]
    }
    
    extension [Self <: SchemaUtilErrorObject](x: Self) {
      
      inline def setChildren(value: js.Array[typings.ajv.mod.ErrorObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: typings.ajv.mod.ErrorObject*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  trait ValidationErrorConfiguration extends StObject {
    
    var baseDataPath: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var postFormatter: js.UndefOr[PostFormatter] = js.undefined
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
      
      inline def setPostFormatter(value: (/* formattedError */ String, /* error */ SchemaUtilErrorObject) => String): Self = StObject.set(x, "postFormatter", js.Any.fromFunction2(value))
      
      inline def setPostFormatterUndefined: Self = StObject.set(x, "postFormatter", js.undefined)
    }
  }
}
