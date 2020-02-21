package typings.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeOptions extends js.Object {
  var ackTimeout: js.UndefOr[Double] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var noTimeout: js.UndefOr[Boolean] = js.undefined
}

object InvokeOptions {
  @scala.inline
  def apply(
    ackTimeout: Int | Double = null,
    force: js.UndefOr[Boolean] = js.undefined,
    noTimeout: js.UndefOr[Boolean] = js.undefined
  ): InvokeOptions = {
    val __obj = js.Dynamic.literal()
    if (ackTimeout != null) __obj.updateDynamic("ackTimeout")(ackTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(noTimeout)) __obj.updateDynamic("noTimeout")(noTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeOptions]
  }
}

