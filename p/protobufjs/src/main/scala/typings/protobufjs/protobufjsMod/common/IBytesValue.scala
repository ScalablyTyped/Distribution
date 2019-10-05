package typings.protobufjs.protobufjsMod.common

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.BytesValue message. */
trait IBytesValue extends js.Object {
  var value: js.UndefOr[Uint8Array] = js.undefined
}

object IBytesValue {
  @scala.inline
  def apply(value: Uint8Array = null): IBytesValue = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IBytesValue]
  }
}

