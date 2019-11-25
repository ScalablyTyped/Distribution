package typings.rabbitmqDashSchema.rabbitmqDashSchemaMod

import typings.rabbitmqDashSchema.rabbitmqDashSchemaStrings.fanout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FanoutExchange extends Exchange {
  @JSName("type")
  var type_FanoutExchange: fanout
}

object FanoutExchange {
  @scala.inline
  def apply(bindings: js.Array[Binding], exchange: String, `type`: fanout, options: js.Object = null): FanoutExchange = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[FanoutExchange]
  }
}

