package typings
package protobufjsLib.minimalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "Field")
@js.native
class Field protected ()
  extends protobufjsLib.protobufjsMod.Field {
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
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: java.lang.String) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: org.scalablytyped.runtime.StringDictionary[js.Any], extend: java.lang.String) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: org.scalablytyped.runtime.StringDictionary[js.Any], extend: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: org.scalablytyped.runtime.StringDictionary[js.Any], options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: org.scalablytyped.runtime.StringDictionary[js.Any], extend: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: org.scalablytyped.runtime.StringDictionary[js.Any], extend: org.scalablytyped.runtime.StringDictionary[js.Any], options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
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
    fieldId: scala.Double,
    fieldType: js.Object | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.uint64
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: js.Object | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.uint64,
    fieldRule: protobufjsLib.protobufjsLibStrings.optional
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: js.Object | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.uint64,
    fieldRule: protobufjsLib.protobufjsLibStrings.optional,
    defaultValue: protobufjsLib.protobufjsMod.Buffer | stdLib.Uint8Array
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.optional,
    defaultValue: java.lang.String
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: js.Object | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.uint64,
    fieldRule: protobufjsLib.protobufjsLibStrings.optional,
    defaultValue: js.Array[
      scala.Boolean | protobufjsLib.protobufjsMod.Buffer | scala.Double | protobufjsLib.protobufjsMod.Long | java.lang.String | stdLib.Uint8Array
    ]
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.optional,
    defaultValue: protobufjsLib.protobufjsMod.Long
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.optional,
    defaultValue: scala.Boolean
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.optional,
    defaultValue: scala.Double
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: js.Object | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.uint64,
    fieldRule: protobufjsLib.protobufjsLibStrings.repeated
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: js.Object | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.uint64,
    fieldRule: protobufjsLib.protobufjsLibStrings.repeated,
    defaultValue: protobufjsLib.protobufjsMod.Buffer | stdLib.Uint8Array
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.repeated,
    defaultValue: java.lang.String
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: js.Object | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.uint64,
    fieldRule: protobufjsLib.protobufjsLibStrings.repeated,
    defaultValue: js.Array[
      scala.Boolean | protobufjsLib.protobufjsMod.Buffer | scala.Double | protobufjsLib.protobufjsMod.Long | java.lang.String | stdLib.Uint8Array
    ]
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.repeated,
    defaultValue: protobufjsLib.protobufjsMod.Long
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.repeated,
    defaultValue: scala.Boolean
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.repeated,
    defaultValue: scala.Double
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: js.Object | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.uint64,
    fieldRule: protobufjsLib.protobufjsLibStrings.required
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: js.Object | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.uint64,
    fieldRule: protobufjsLib.protobufjsLibStrings.required,
    defaultValue: protobufjsLib.protobufjsMod.Buffer | stdLib.Uint8Array
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.required,
    defaultValue: java.lang.String
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: js.Object | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.uint64,
    fieldRule: protobufjsLib.protobufjsLibStrings.required,
    defaultValue: js.Array[
      scala.Boolean | protobufjsLib.protobufjsMod.Buffer | scala.Double | protobufjsLib.protobufjsMod.Long | java.lang.String | stdLib.Uint8Array
    ]
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.required,
    defaultValue: protobufjsLib.protobufjsMod.Long
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.required,
    defaultValue: scala.Boolean
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d(
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsLibStrings.double | protobufjsLib.protobufjsLibStrings.float | protobufjsLib.protobufjsLibStrings.int32 | protobufjsLib.protobufjsLibStrings.uint32 | protobufjsLib.protobufjsLibStrings.sint32 | protobufjsLib.protobufjsLibStrings.fixed32 | protobufjsLib.protobufjsLibStrings.sfixed32 | protobufjsLib.protobufjsLibStrings.int64 | protobufjsLib.protobufjsLibStrings.uint64 | protobufjsLib.protobufjsLibStrings.sint64 | protobufjsLib.protobufjsLibStrings.fixed64 | protobufjsLib.protobufjsLibStrings.sfixed64 | protobufjsLib.protobufjsLibStrings.string | protobufjsLib.protobufjsLibStrings.bool | protobufjsLib.protobufjsLibStrings.bytes | js.Object,
    fieldRule: protobufjsLib.protobufjsLibStrings.required,
    defaultValue: scala.Double
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  def d[T /* <: protobufjsLib.protobufjsMod.Message[T] */](fieldId: scala.Double, fieldType: java.lang.String): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @returns Decorator function
    */
  def d[T /* <: protobufjsLib.protobufjsMod.Message[T] */](fieldId: scala.Double, fieldType: protobufjsLib.protobufjsMod.Constructor[T]): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  @JSName("d")
  def d_optional[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    fieldId: scala.Double,
    fieldType: java.lang.String,
    fieldRule: protobufjsLib.protobufjsLibStrings.optional
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  @JSName("d")
  def d_optional[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsMod.Constructor[T],
    fieldRule: protobufjsLib.protobufjsLibStrings.optional
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  @JSName("d")
  def d_repeated[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    fieldId: scala.Double,
    fieldType: java.lang.String,
    fieldRule: protobufjsLib.protobufjsLibStrings.repeated
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  @JSName("d")
  def d_repeated[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsMod.Constructor[T],
    fieldRule: protobufjsLib.protobufjsLibStrings.repeated
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  @JSName("d")
  def d_required[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    fieldId: scala.Double,
    fieldType: java.lang.String,
    fieldRule: protobufjsLib.protobufjsLibStrings.required
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  @JSName("d")
  def d_required[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    fieldId: scala.Double,
    fieldType: protobufjsLib.protobufjsMod.Constructor[T],
    fieldRule: protobufjsLib.protobufjsLibStrings.required
  ): protobufjsLib.protobufjsMod.FieldDecorator = js.native
  /**
    * Constructs a field from a field descriptor.
    * @param name Field name
    * @param json Field descriptor
    * @returns Created field
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: java.lang.String, json: protobufjsLib.protobufjsMod.IField): protobufjsLib.protobufjsMod.Field = js.native
}

