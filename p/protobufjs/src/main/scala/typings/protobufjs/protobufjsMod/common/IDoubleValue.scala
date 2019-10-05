package typings.protobufjs.protobufjsMod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.DoubleValue message. */
trait IDoubleValue extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
}

object IDoubleValue {
  @scala.inline
  def apply(value: Int | Double = null): IDoubleValue = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDoubleValue]
  }
}

