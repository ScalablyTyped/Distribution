package typings.protobufjs.mod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.DoubleValue message. */
trait IDoubleValue extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
}

object IDoubleValue {
  @scala.inline
  def apply(value: js.UndefOr[Double] = js.undefined): IDoubleValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDoubleValue]
  }
}

