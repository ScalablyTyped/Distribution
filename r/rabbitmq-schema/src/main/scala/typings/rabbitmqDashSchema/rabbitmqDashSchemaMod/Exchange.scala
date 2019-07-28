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
    val __obj = js.Dynamic.literal(bindings = bindings, exchange = exchange)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Exchange]
  }
}

