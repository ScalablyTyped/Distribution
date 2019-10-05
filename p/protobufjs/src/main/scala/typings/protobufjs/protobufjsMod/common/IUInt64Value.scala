package typings.protobufjs.protobufjsMod.common

import typings.protobufjs.protobufjsMod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.UInt64Value message. */
trait IUInt64Value extends js.Object {
  var value: js.UndefOr[Double | Long] = js.undefined
}

object IUInt64Value {
  @scala.inline
  def apply(value: Double | Long = null): IUInt64Value = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUInt64Value]
  }
}

