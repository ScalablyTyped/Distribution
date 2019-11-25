package typings.protobufjs.protobufjsMod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.BoolValue message. */
trait IBoolValue extends js.Object {
  var value: js.UndefOr[Boolean] = js.undefined
}

object IBoolValue {
  @scala.inline
  def apply(value: js.UndefOr[Boolean] = js.undefined): IBoolValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBoolValue]
  }
}

