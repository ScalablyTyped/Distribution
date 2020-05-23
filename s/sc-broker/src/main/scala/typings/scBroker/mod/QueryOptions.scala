package typings.scBroker.mod

import typings.fleximap.mod.KeyChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var baseKey: js.UndefOr[KeyChain] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var noAck: js.UndefOr[Boolean] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(baseKey: KeyChain = null, data: js.Any = null, noAck: js.UndefOr[Boolean] = js.undefined): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (baseKey != null) __obj.updateDynamic("baseKey")(baseKey.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(noAck)) __obj.updateDynamic("noAck")(noAck.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

