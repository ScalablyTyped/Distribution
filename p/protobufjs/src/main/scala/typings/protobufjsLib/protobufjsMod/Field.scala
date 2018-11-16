package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "Field")
@js.native
class Field protected () extends FieldBase {
  /**
       * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
       * @param name Unique name within its namespace
       * @param id Unique id within its namespace
       * @param type Value type
       * @param [rule="optional"] Field rule
       * @param [extend] Extended type if different from parent
       * @param [options] Declared options
       */
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String) = this()
  /**
       * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
       * @param name Unique name within its namespace
       * @param id Unique id within its namespace
       * @param type Value type
       * @param [rule="optional"] Field rule
       * @param [extend] Extended type if different from parent
       * @param [options] Declared options
       */
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
  /**
       * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
       * @param name Unique name within its namespace
       * @param id Unique id within its namespace
       * @param type Value type
       * @param [rule="optional"] Field rule
       * @param [extend] Extended type if different from parent
       * @param [options] Declared options
       */
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String) = this()
  /**
       * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
       * @param name Unique name within its namespace
       * @param id Unique id within its namespace
       * @param type Value type
       * @param [rule="optional"] Field rule
       * @param [extend] Extended type if different from parent
       * @param [options] Declared options
       */
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: ScalablyTyped.runtime.StringDictionary[js.Any], extend: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
  /**
       * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
       * @param name Unique name within its namespace
       * @param id Unique id within its namespace
       * @param type Value type
       * @param [rule="optional"] Field rule
       * @param [extend] Extended type if different from parent
       * @param [options] Declared options
       */
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: ScalablyTyped.runtime.StringDictionary[js.Any], extend: java.lang.String) = this()
  /**
       * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
       * @param name Unique name within its namespace
       * @param id Unique id within its namespace
       * @param type Value type
       * @param [rule="optional"] Field rule
       * @param [extend] Extended type if different from parent
       * @param [options] Declared options
       */
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
  /**
       * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
       * @param name Unique name within its namespace
       * @param id Unique id within its namespace
       * @param type Value type
       * @param [rule="optional"] Field rule
       * @param [extend] Extended type if different from parent
       * @param [options] Declared options
       */
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: java.lang.String) = this()
  /**
       * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
       * @param name Unique name within its namespace
       * @param id Unique id within its namespace
       * @param type Value type
       * @param [rule="optional"] Field rule
       * @param [extend] Extended type if different from parent
       * @param [options] Declared options
       */
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: ScalablyTyped.runtime.StringDictionary[js.Any], extend: ScalablyTyped.runtime.StringDictionary[js.Any], options: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
  /**
       * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
       * @param name Unique name within its namespace
       * @param id Unique id within its namespace
       * @param type Value type
       * @param [rule="optional"] Field rule
       * @param [extend] Extended type if different from parent
       * @param [options] Declared options
       */
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: ScalablyTyped.runtime.StringDictionary[js.Any], extend: java.lang.String, options: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
  /**
       * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
       * @param name Unique name within its namespace
       * @param id Unique id within its namespace
       * @param type Value type
       * @param [rule="optional"] Field rule
       * @param [extend] Extended type if different from parent
       * @param [options] Declared options
       */
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: ScalablyTyped.runtime.StringDictionary[js.Any], options: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
  /**
       * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
       * @param name Unique name within its namespace
       * @param id Unique id within its namespace
       * @param type Value type
       * @param [rule="optional"] Field rule
       * @param [extend] Extended type if different from parent
       * @param [options] Declared options
       */
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: java.lang.String, options: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
  /** Determines whether this field is packed. Only relevant when repeated and working with proto2. */
  val packed: scala.Boolean = js.native
}

@JSImport("protobufjs", "Field")
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
  def d[T /* <: scala.Double | js.Array[scala.Double] | protobufjsLib.protobufjsMod.Long | js.Array[protobufjsLib.protobufjsMod.Long] | java.lang.String | js.Array[java.lang.String] | scala.Boolean | js.Array[scala.Boolean] | stdLib.Uint8Array | js.Array[stdLib.Uint8Array] | protobufjsLib.protobufjsMod.Buffer | js.Array[protobufjsLib.protobufjsMod.Buffer] */](
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object
  ): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @param [defaultValue] Default value
       * @returns Decorator function
       */
  def d[T /* <: scala.Double | js.Array[scala.Double] | protobufjsLib.protobufjsMod.Long | js.Array[protobufjsLib.protobufjsMod.Long] | java.lang.String | js.Array[java.lang.String] | scala.Boolean | js.Array[scala.Boolean] | stdLib.Uint8Array | js.Array[stdLib.Uint8Array] | protobufjsLib.protobufjsMod.Buffer | js.Array[protobufjsLib.protobufjsMod.Buffer] */](
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.optional
  ): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @param [defaultValue] Default value
       * @returns Decorator function
       */
  def d[T /* <: scala.Double | js.Array[scala.Double] | protobufjsLib.protobufjsMod.Long | js.Array[protobufjsLib.protobufjsMod.Long] | java.lang.String | js.Array[java.lang.String] | scala.Boolean | js.Array[scala.Boolean] | stdLib.Uint8Array | js.Array[stdLib.Uint8Array] | protobufjsLib.protobufjsMod.Buffer | js.Array[protobufjsLib.protobufjsMod.Buffer] */](
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.optional,
    defaultValue: T
  ): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @param [defaultValue] Default value
       * @returns Decorator function
       */
  def d[T /* <: scala.Double | js.Array[scala.Double] | protobufjsLib.protobufjsMod.Long | js.Array[protobufjsLib.protobufjsMod.Long] | java.lang.String | js.Array[java.lang.String] | scala.Boolean | js.Array[scala.Boolean] | stdLib.Uint8Array | js.Array[stdLib.Uint8Array] | protobufjsLib.protobufjsMod.Buffer | js.Array[protobufjsLib.protobufjsMod.Buffer] */](
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.repeated
  ): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @param [defaultValue] Default value
       * @returns Decorator function
       */
  def d[T /* <: scala.Double | js.Array[scala.Double] | protobufjsLib.protobufjsMod.Long | js.Array[protobufjsLib.protobufjsMod.Long] | java.lang.String | js.Array[java.lang.String] | scala.Boolean | js.Array[scala.Boolean] | stdLib.Uint8Array | js.Array[stdLib.Uint8Array] | protobufjsLib.protobufjsMod.Buffer | js.Array[protobufjsLib.protobufjsMod.Buffer] */](
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.repeated,
    defaultValue: T
  ): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @param [defaultValue] Default value
       * @returns Decorator function
       */
  def d[T /* <: scala.Double | js.Array[scala.Double] | protobufjsLib.protobufjsMod.Long | js.Array[protobufjsLib.protobufjsMod.Long] | java.lang.String | js.Array[java.lang.String] | scala.Boolean | js.Array[scala.Boolean] | stdLib.Uint8Array | js.Array[stdLib.Uint8Array] | protobufjsLib.protobufjsMod.Buffer | js.Array[protobufjsLib.protobufjsMod.Buffer] */](
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.required
  ): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @param [defaultValue] Default value
       * @returns Decorator function
       */
  def d[T /* <: scala.Double | js.Array[scala.Double] | protobufjsLib.protobufjsMod.Long | js.Array[protobufjsLib.protobufjsMod.Long] | java.lang.String | js.Array[java.lang.String] | scala.Boolean | js.Array[scala.Boolean] | stdLib.Uint8Array | js.Array[stdLib.Uint8Array] | protobufjsLib.protobufjsMod.Buffer | js.Array[protobufjsLib.protobufjsMod.Buffer] */](
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.required,
    defaultValue: T
  ): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @returns Decorator function
       */
  def d[T /* <: protobufjsLib.protobufjsMod.Message[T] */](fieldId: scala.Double, fieldType: java.lang.String): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @returns Decorator function
       */
  def d[T /* <: protobufjsLib.protobufjsMod.Message[T] */](fieldId: scala.Double, fieldType: protobufjsLib.protobufjsMod.Constructor[T]): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @returns Decorator function
       */
  @JSName("d")
  def d_optional[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    fieldId: scala.Double,
    fieldType: java.lang.String,
    fieldRule: protobufjsLib.protobufjsLibStrings.optional
  ): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @returns Decorator function
       */
  @JSName("d")
  def d_optional[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsMod.Constructor[T],
    fieldRule: protobufjsLib.protobufjsLibStrings.optional
  ): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @returns Decorator function
       */
  @JSName("d")
  def d_repeated[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    fieldId: scala.Double,
    fieldType: java.lang.String,
    fieldRule: protobufjsLib.protobufjsLibStrings.repeated
  ): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @returns Decorator function
       */
  @JSName("d")
  def d_repeated[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsMod.Constructor[T],
    fieldRule: protobufjsLib.protobufjsLibStrings.repeated
  ): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @returns Decorator function
       */
  @JSName("d")
  def d_required[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    fieldId: scala.Double,
    fieldType: java.lang.String,
    fieldRule: protobufjsLib.protobufjsLibStrings.required
  ): protobufjsLib.FieldDecorator = js.native
  /**
       * Field decorator (TypeScript).
       * @param fieldId Field id
       * @param fieldType Field type
       * @param [fieldRule="optional"] Field rule
       * @returns Decorator function
       */
  @JSName("d")
  def d_required[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsMod.Constructor[T],
    fieldRule: protobufjsLib.protobufjsLibStrings.required
  ): protobufjsLib.FieldDecorator = js.native
  /**
       * Constructs a field from a field descriptor.
       * @param name Field name
       * @param json Field descriptor
       * @returns Created field
       * @throws {TypeError} If arguments are invalid
       */
  def fromJSON(name: java.lang.String, json: protobufjsLib.protobufjsMod.IField): protobufjsLib.protobufjsMod.Field = js.native
}

