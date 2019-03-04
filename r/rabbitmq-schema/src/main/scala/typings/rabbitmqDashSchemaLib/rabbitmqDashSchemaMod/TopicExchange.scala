package typings
package rabbitmqDashSchemaLib.rabbitmqDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicExchange extends Exchange {
  @JSName("bindings")
  var bindings_TopicExchange: js.Array[TopicBinding]
  @JSName("type")
  var type_TopicExchange: rabbitmqDashSchemaLib.rabbitmqDashSchemaLibStrings.topic
}

object TopicExchange {
  @scala.inline
  def apply(
    bindings: js.Array[TopicBinding],
    exchange: java.lang.String,
    `type`: rabbitmqDashSchemaLib.rabbitmqDashSchemaLibStrings.topic,
    options: js.Object = null
  ): TopicExchange = {
    val __obj = js.Dynamic.literal(bindings = bindings, exchange = exchange)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[TopicExchange]
  }
}

