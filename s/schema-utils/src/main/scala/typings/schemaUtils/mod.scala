package typings.schemaUtils

import org.scalablytyped.runtime.Instantiable3
import typings.schemaUtils.validationErrorMod.Schema
import typings.schemaUtils.validationErrorMod.SchemaUtilErrorObject
import typings.schemaUtils.validationErrorMod.ValidationErrorConfiguration
import typings.schemaUtils.validationErrorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("schema-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ValidationError: Instantiable3[
    /* errors */ js.Array[SchemaUtilErrorObject], 
    /* schema */ Schema, 
    /* configuration */ js.UndefOr[ValidationErrorConfiguration], 
    default
  ] = js.native
  
  val validate: js.Function3[
    /* schema */ typings.schemaUtils.validateMod.Schema, 
    /* options */ js.Array[js.Object] | js.Object, 
    /* configuration */ js.UndefOr[typings.schemaUtils.validateMod.ValidationErrorConfiguration], 
    Unit
  ] = js.native
}
