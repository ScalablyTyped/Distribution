package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "MapField")
@js.native
class MapField protected () extends FieldBase {
  /**
    * Constructs a new map field instance.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param keyType Key type
    * @param type Value type
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: java.lang.String, id: scala.Double, keyType: java.lang.String, `type`: java.lang.String) = this()
  def this(name: java.lang.String, id: scala.Double, keyType: java.lang.String, `type`: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, keyType: java.lang.String, `type`: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any], comment: java.lang.String) = this()
  /** Key type. */
  var keyType: java.lang.String = js.native
  /** Resolved key type if not a basic type. */
  var resolvedKeyType: ReflectionObject | scala.Null = js.native
}

/* static members */
@JSImport("protobufjs", "MapField")
@js.native
object MapField extends js.Object {
  /**
    * Map field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldKeyType Field key type
    * @param fieldValueType Field value type
    * @returns Decorator function
    */
  def d[T /* <: org.scalablytyped.runtime.StringDictionary[
    scala.Double | protobufjsLib.protobufjsMod.Long | java.lang.String | scala.Boolean | stdLib.Uint8Array | protobufjsLib.protobufjsMod.Buffer | js.Array[scala.Double] | protobufjsLib.protobufjsMod.Message[js.Object]
  ] */](
    fieldId: scala.Double,
    fieldKeyType: protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.string,
    fieldValueType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bytes | js.Object | protobufjsLib.protobufjsMod.Constructor[js.Object]
  ): protobufjsLib.FieldDecorator = js.native
  /**
    * Constructs a map field from a map field descriptor.
    * @param name Field name
    * @param json Map field descriptor
    * @returns Created map field
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: java.lang.String, json: protobufjsLib.protobufjsMod.IMapField): protobufjsLib.protobufjsMod.MapField = js.native
}

