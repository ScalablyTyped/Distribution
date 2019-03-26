package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleSchema extends SimpleSchemaStatic {
  var debug: scala.Boolean = js.native
}

@JSImport("simpl-schema", "SimpleSchema")
@js.native
class SimpleSchemaCls protected () extends SimpleSchema {
  def this(schema: js.Array[_]) = this()
  def this(schema: org.scalablytyped.runtime.StringDictionary[
      SchemaDefinition | stdLib.BooleanConstructor | stdLib.StringConstructor | stdLib.NumberConstructor | stdLib.DateConstructor | stdLib.ArrayConstructor | java.lang.String | stdLib.RegExp | SimpleSchema
    ]) = this()
  def this(schema: js.Array[_], options: SimpleSchemaOptions) = this()
  def this(schema: org.scalablytyped.runtime.StringDictionary[
      SchemaDefinition | stdLib.BooleanConstructor | stdLib.StringConstructor | stdLib.NumberConstructor | stdLib.DateConstructor | stdLib.ArrayConstructor | java.lang.String | stdLib.RegExp | SimpleSchema
    ], options: SimpleSchemaOptions) = this()
}

