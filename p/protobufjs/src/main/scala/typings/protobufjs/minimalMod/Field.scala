package typings.protobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.Buffer
import typings.protobufjs.protobufjsMod.Constructor
import typings.protobufjs.protobufjsMod.FieldDecorator
import typings.protobufjs.protobufjsMod.IField
import typings.protobufjs.protobufjsMod.Long
import typings.protobufjs.protobufjsStrings.bool
import typings.protobufjs.protobufjsStrings.bytes
import typings.protobufjs.protobufjsStrings.double
import typings.protobufjs.protobufjsStrings.fixed32
import typings.protobufjs.protobufjsStrings.fixed64
import typings.protobufjs.protobufjsStrings.float
import typings.protobufjs.protobufjsStrings.int32
import typings.protobufjs.protobufjsStrings.int64
import typings.protobufjs.protobufjsStrings.optional
import typings.protobufjs.protobufjsStrings.repeated
import typings.protobufjs.protobufjsStrings.required
import typings.protobufjs.protobufjsStrings.sfixed32
import typings.protobufjs.protobufjsStrings.sfixed64
import typings.protobufjs.protobufjsStrings.sint32
import typings.protobufjs.protobufjsStrings.sint64
import typings.protobufjs.protobufjsStrings.string
import typings.protobufjs.protobufjsStrings.uint32
import typings.protobufjs.protobufjsStrings.uint64
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "Field")
@js.native
class Field protected ()
  extends typings.protobufjs.protobufjsMod.Field {
  /**
    * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param type Value type
    * @param [rule="optional"] Field rule
    * @param [extend] Extended type if different from parent
    * @param [options] Declared options
    */
  def this(name: String, id: Double, `type`: String) = this()
  def this(name: String, id: Double, `type`: String, rule: String) = this()
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[js.Any]) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: String) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: StringDictionary[js.Any]) = this()
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[js.Any], extend: String) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: String,
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: StringDictionary[js.Any],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: String,
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: StringDictionary[js.Any],
    options: StringDictionary[js.Any]
  ) = this()
}

/* static members */
@JSImport("protobufjs/minimal", "Field")
@js.native
object Field extends js.Object {
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @param [defaultValue] Default value
    * @returns Decorator function
    */
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: optional
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: String
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: optional,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | Uint8Array]
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: Boolean
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: Double
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: Long
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: Uint8Array
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: repeated
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: String
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: repeated,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | Uint8Array]
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: Boolean
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: Double
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: Long
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: Uint8Array
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: required
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: String
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: required,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | Uint8Array]
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: Boolean
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: Double
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: Long
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: Uint8Array
  ): FieldDecorator = js.native
  def d[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](fieldId: Double, fieldType: String): FieldDecorator = js.native
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @returns Decorator function
    */
  def d[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](fieldId: Double, fieldType: Constructor[T]): FieldDecorator = js.native
  @JSName("d")
  def d_optional[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: optional): FieldDecorator = js.native
  @JSName("d")
  def d_optional[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: optional): FieldDecorator = js.native
  @JSName("d")
  def d_repeated[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: repeated): FieldDecorator = js.native
  @JSName("d")
  def d_repeated[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: repeated): FieldDecorator = js.native
  @JSName("d")
  def d_required[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: required): FieldDecorator = js.native
  @JSName("d")
  def d_required[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: required): FieldDecorator = js.native
  /**
    * Constructs a field from a field descriptor.
    * @param name Field name
    * @param json Field descriptor
    * @returns Created field
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IField): typings.protobufjs.protobufjsMod.Field = js.native
}

