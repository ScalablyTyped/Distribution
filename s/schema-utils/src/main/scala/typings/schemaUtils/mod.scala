package typings.schemaUtils

import typings.schemaUtils.declarationsValidationErrorMod.Schema
import typings.schemaUtils.declarationsValidationErrorMod.SchemaUtilErrorObject
import typings.schemaUtils.declarationsValidationErrorMod.ValidationErrorConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("schema-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("schema-utils", "ValidationError")
  @js.native
  open class ValidationError protected ()
    extends typings.schemaUtils.declarationsValidateMod.ValidationError {
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
  }
  
  inline def validate(schema: typings.schemaUtils.declarationsValidateMod.Schema, options: js.Array[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validate(
    schema: typings.schemaUtils.declarationsValidateMod.Schema,
    options: js.Array[js.Object],
    configuration: typings.schemaUtils.declarationsValidateMod.ValidationErrorConfiguration
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validate(schema: typings.schemaUtils.declarationsValidateMod.Schema, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validate(
    schema: typings.schemaUtils.declarationsValidateMod.Schema,
    options: js.Object,
    configuration: typings.schemaUtils.declarationsValidateMod.ValidationErrorConfiguration
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
