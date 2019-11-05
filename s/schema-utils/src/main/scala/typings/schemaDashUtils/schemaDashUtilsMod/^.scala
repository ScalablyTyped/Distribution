package typings.schemaDashUtils.schemaDashUtilsMod

import org.scalablytyped.runtime.Instantiable3
import typings.ajv.ajvMod.ErrorObject
import typings.schemaDashUtils.schemaDashUtilsMod.SchemaUtils.ValidationErrorConfiguration
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ValidateError: Instantiable3[
    /* errors */ js.Array[ErrorObject], 
    /* schema */ Schema, 
    js.UndefOr[/* configuration */ Partial[ValidationErrorConfiguration]], 
    typings.schemaDashUtils.schemaDashUtilsMod.SchemaUtils.ValidationError
  ] = js.native
  var ValidationError: Instantiable3[
    /* errors */ js.Array[ErrorObject], 
    /* schema */ Schema, 
    js.UndefOr[/* configuration */ Partial[ValidationErrorConfiguration]], 
    typings.schemaDashUtils.schemaDashUtilsMod.SchemaUtils.ValidationError
  ] = js.native
  def apply(schema: Schema, options: js.Array[js.Object]): Unit = js.native
  def apply(schema: Schema, options: js.Array[js.Object], configuration: Partial[ValidationErrorConfiguration]): Unit = js.native
  def apply(schema: Schema, options: js.Object): Unit = js.native
  def apply(schema: Schema, options: js.Object, configuration: Partial[ValidationErrorConfiguration]): Unit = js.native
}

