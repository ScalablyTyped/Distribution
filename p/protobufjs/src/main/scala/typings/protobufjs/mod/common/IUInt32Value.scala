package typings.protobufjs.mod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.UInt32Value message. */
trait IUInt32Value extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
}

object IUInt32Value {
  @scala.inline
  def apply(value: Int | Double = null): IUInt32Value = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUInt32Value]
  }
}

