package typings.protobufjs.mod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Int32Value message. */
trait IInt32Value extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
}

object IInt32Value {
  @scala.inline
  def apply(value: js.UndefOr[Double] = js.undefined): IInt32Value = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInt32Value]
  }
}

