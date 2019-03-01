package typings
package scDashBrokerLib.scDashBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var baseKey: js.UndefOr[fleximapLib.fleximapMod.KeyChain] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var noAck: js.UndefOr[scala.Boolean] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    baseKey: fleximapLib.fleximapMod.KeyChain = null,
    data: js.Any = null,
    noAck: js.UndefOr[scala.Boolean] = js.undefined
  ): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (baseKey != null) __obj.updateDynamic("baseKey")(baseKey)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(noAck)) __obj.updateDynamic("noAck")(noAck)
    __obj.asInstanceOf[QueryOptions]
  }
}

