package typings.schemaUtils

import org.scalablytyped.runtime.Instantiable3
import typings.schemaUtils.validationErrorMod.Schema
import typings.schemaUtils.validationErrorMod.SchemaUtilErrorObject
import typings.schemaUtils.validationErrorMod.ValidationErrorConfiguration
import typings.schemaUtils.validationErrorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("schema-utils", "ValidationError")
  @js.native
  class ValidationError protected () extends default {
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
  @JSImport("schema-utils", "ValidationError")
  @js.native
  val ValidationError: Instantiable3[
    /* errors */ js.Array[SchemaUtilErrorObject], 
    /* schema */ Schema, 
    /* configuration */ js.UndefOr[ValidationErrorConfiguration], 
    default
  ] = js.native
  
  @JSImport("schema-utils", "validate")
  @js.native
  val validate: js.Function3[
    /* schema */ typings.schemaUtils.validateMod.Schema, 
    /* options */ js.Array[js.Object] | js.Object, 
    /* configuration */ js.UndefOr[typings.schemaUtils.validateMod.ValidationErrorConfiguration], 
    Unit
  ] = js.native
}
