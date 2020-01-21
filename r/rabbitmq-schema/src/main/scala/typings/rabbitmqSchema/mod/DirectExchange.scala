package typings.rabbitmqSchema.mod

import typings.rabbitmqSchema.rabbitmqSchemaStrings.direct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectExchange extends Exchange {
  @JSName("bindings")
  var bindings_DirectExchange: js.Array[DirectBinding]
  @JSName("type")
  var type_DirectExchange: direct
}

object DirectExchange {
  @scala.inline
  def apply(bindings: js.Array[DirectBinding], exchange: String, `type`: direct, options: js.Object = null): DirectExchange = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectExchange]
  }
}

