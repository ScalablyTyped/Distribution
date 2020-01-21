package typings.rabbitmqSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends Topology {
  var messageSchema: js.Object
  var queue: String
}

object Queue {
  @scala.inline
  def apply(messageSchema: js.Object, queue: String, options: js.Object = null): Queue = {
    val __obj = js.Dynamic.literal(messageSchema = messageSchema.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
}

