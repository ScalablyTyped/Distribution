package typings
package rabbitmqDashSchemaLib.rabbitmqDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectExchange extends Exchange {
  @JSName("bindings")
  var bindings_DirectExchange: js.Array[DirectBinding]
  @JSName("type")
  var type_DirectExchange: rabbitmqDashSchemaLib.rabbitmqDashSchemaLibStrings.direct
}

object DirectExchange {
  @scala.inline
  def apply(
    bindings: js.Array[DirectBinding],
    exchange: java.lang.String,
    `type`: rabbitmqDashSchemaLib.rabbitmqDashSchemaLibStrings.direct,
    options: js.Object = null
  ): DirectExchange = {
    val __obj = js.Dynamic.literal(bindings = bindings, exchange = exchange)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[DirectExchange]
  }
}

