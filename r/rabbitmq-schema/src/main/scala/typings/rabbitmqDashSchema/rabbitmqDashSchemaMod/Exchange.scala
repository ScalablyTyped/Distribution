package typings.rabbitmqDashSchema.rabbitmqDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exchange extends Topology {
  var bindings: js.Array[Binding]
  var exchange: String
  var `type`: String
}

object Exchange {
  @scala.inline
  def apply(bindings: js.Array[Binding], exchange: String, `type`: String, options: js.Object = null): Exchange = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exchange]
  }
}

