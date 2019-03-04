package typings
package rabbitmqDashSchemaLib.rabbitmqDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exchange extends Topology {
  var bindings: js.Array[Binding]
  var exchange: java.lang.String
  var `type`: java.lang.String
}

object Exchange {
  @scala.inline
  def apply(
    bindings: js.Array[Binding],
    exchange: java.lang.String,
    `type`: java.lang.String,
    options: js.Object = null
  ): Exchange = {
    val __obj = js.Dynamic.literal(bindings = bindings, exchange = exchange)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Exchange]
  }
}

