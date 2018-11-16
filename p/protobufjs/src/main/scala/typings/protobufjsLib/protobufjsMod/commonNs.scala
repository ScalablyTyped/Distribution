package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "common")
@js.native
object commonNs extends js.Object {
  /** Properties of a google.protobuf.Any message. */
  
  trait IAny extends js.Object {
    var bytes: js.UndefOr[stdLib.Uint8Array] = js.undefined
    var typeUrl: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /** Properties of a google.protobuf.BoolValue message. */
  
  trait IBoolValue extends js.Object {
    var value: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  /** Properties of a google.protobuf.BytesValue message. */
  
  trait IBytesValue extends js.Object {
    var value: js.UndefOr[stdLib.Uint8Array] = js.undefined
  }
  
  /** Properties of a google.protobuf.DoubleValue message. */
  
  trait IDoubleValue extends js.Object {
    var value: js.UndefOr[scala.Double] = js.undefined
  }
  
  /** Properties of a google.protobuf.Duration message. */
  
  trait IDuration extends js.Object {
    var nanos: js.UndefOr[scala.Double] = js.undefined
    var seconds: js.UndefOr[scala.Double | protobufjsLib.protobufjsMod.Long] = js.undefined
  }
  
  /** Properties of a google.protobuf.Empty message. */
  
  trait IEmpty extends js.Object
  
  /** Properties of a google.protobuf.FloatValue message. */
  
  trait IFloatValue extends js.Object {
    var value: js.UndefOr[scala.Double] = js.undefined
  }
  
  /** Properties of a google.protobuf.Int32Value message. */
  
  trait IInt32Value extends js.Object {
    var value: js.UndefOr[scala.Double] = js.undefined
  }
  
  /** Properties of a google.protobuf.Int64Value message. */
  
  trait IInt64Value extends js.Object {
    var value: js.UndefOr[scala.Double | protobufjsLib.protobufjsMod.Long] = js.undefined
  }
  
  /** Properties of a google.protobuf.ListValue message. */
  
  trait IListValue extends js.Object {
    var values: js.UndefOr[js.Array[IValue]] = js.undefined
  }
  
  /** Properties of a google.protobuf.StringValue message. */
  
  trait IStringValue extends js.Object {
    var value: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /** Properties of a google.protobuf.Struct message. */
  
  trait IStruct extends js.Object {
    var fields: js.UndefOr[ScalablyTyped.runtime.StringDictionary[IValue]] = js.undefined
  }
  
  /** Properties of a google.protobuf.Timestamp message. */
  
  trait ITimestamp extends js.Object {
    var nanos: js.UndefOr[scala.Double] = js.undefined
    var seconds: js.UndefOr[scala.Double | protobufjsLib.protobufjsMod.Long] = js.undefined
  }
  
  /** Properties of a google.protobuf.UInt32Value message. */
  
  trait IUInt32Value extends js.Object {
    var value: js.UndefOr[scala.Double] = js.undefined
  }
  
  /** Properties of a google.protobuf.UInt64Value message. */
  
  trait IUInt64Value extends js.Object {
    var value: js.UndefOr[scala.Double | protobufjsLib.protobufjsMod.Long] = js.undefined
  }
  
  /** Properties of a google.protobuf.Value message. */
  
  trait IValue extends js.Object {
    var boolValue: js.UndefOr[scala.Boolean] = js.undefined
    var kind: js.UndefOr[java.lang.String] = js.undefined
    var listValue: js.UndefOr[IListValue] = js.undefined
    var nullValue: js.UndefOr[protobufjsLib.protobufjsLibNumbers.`0`] = js.undefined
    var numberValue: js.UndefOr[scala.Double] = js.undefined
    var stringValue: js.UndefOr[java.lang.String] = js.undefined
    var structValue: js.UndefOr[IStruct] = js.undefined
  }
  
  /**
       * Gets the root definition of the specified common proto file.
       *
       * Bundled definitions are:
       * - google/protobuf/any.proto
       * - google/protobuf/duration.proto
       * - google/protobuf/empty.proto
       * - google/protobuf/field_mask.proto
       * - google/protobuf/struct.proto
       * - google/protobuf/timestamp.proto
       * - google/protobuf/wrappers.proto
       *
       * @param file Proto file name
       * @returns Root definition or `null` if not defined
       */
  def get(file: java.lang.String): protobufjsLib.protobufjsMod.INamespace | scala.Null = js.native
}

