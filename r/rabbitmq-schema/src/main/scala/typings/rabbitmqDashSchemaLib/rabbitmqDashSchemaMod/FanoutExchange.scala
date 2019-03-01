package typings
package rabbitmqDashSchemaLib.rabbitmqDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FanoutExchange extends Exchange {
  @JSName("type")
  var type_FanoutExchange: rabbitmqDashSchemaLib.rabbitmqDashSchemaLibStrings.fanout
}

object FanoutExchange {
  @scala.inline
  def apply(
    bindings: js.Array[Binding],
    exchange: java.lang.String,
    `type`: rabbitmqDashSchemaLib.rabbitmqDashSchemaLibStrings.fanout,
    options: js.Object = null
  ): FanoutExchange = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bindings")(bindings)
    __obj.updateDynamic("exchange")(exchange)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[FanoutExchange]
  }
}

