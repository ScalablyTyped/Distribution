package typings.protobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.Buffer
import typings.protobufjs.mod.Constructor
import typings.protobufjs.mod.FieldDecorator
import typings.protobufjs.mod.IMapField
import typings.protobufjs.mod.Long
import typings.protobufjs.protobufjsStrings.bool
import typings.protobufjs.protobufjsStrings.bytes
import typings.protobufjs.protobufjsStrings.double
import typings.protobufjs.protobufjsStrings.fixed32
import typings.protobufjs.protobufjsStrings.fixed64
import typings.protobufjs.protobufjsStrings.float
import typings.protobufjs.protobufjsStrings.int32
import typings.protobufjs.protobufjsStrings.int64
import typings.protobufjs.protobufjsStrings.sfixed32
import typings.protobufjs.protobufjsStrings.sfixed64
import typings.protobufjs.protobufjsStrings.sint32
import typings.protobufjs.protobufjsStrings.sint64
import typings.protobufjs.protobufjsStrings.string
import typings.protobufjs.protobufjsStrings.uint32
import typings.protobufjs.protobufjsStrings.uint64
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs/light", "MapField")
@js.native
class MapField protected ()
  extends typings.protobufjs.mod.MapField {
  /**
    * Constructs a new map field instance.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param keyType Key type
    * @param type Value type
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: String, id: Double, keyType: String, `type`: String) = this()
  def this(name: String, id: Double, keyType: String, `type`: String, options: StringDictionary[js.Any]) = this()
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
  def this(name: String, id: Double, keyType: String, `type`: String, options: Unit, comment: String) = this()
}
/* static members */
object MapField {
  
  @JSImport("protobufjs/light", "MapField")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Map field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldKeyType Field key type
    * @param fieldValueType Field value type
    * @returns Decorator function
    */
  @scala.inline
  def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | Uint8Array | Buffer | js.Array[Double] | typings.protobufjs.mod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string | bytes | js.Object | Constructor[js.Object]
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldKeyType.asInstanceOf[js.Any], fieldValueType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  
  /**
    * Constructs a map field from a map field descriptor.
    * @param name Field name
    * @param json Map field descriptor
    * @returns Created map field
    * @throws {TypeError} If arguments are invalid
    */
  @scala.inline
  def fromJSON(name: String, json: IMapField): typings.protobufjs.mod.MapField = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.MapField]
}
