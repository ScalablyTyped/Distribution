package typings
package rabbitmqDashSchemaLib.rabbitmqDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends Topology {
  var messageSchema: js.Object
  var queue: java.lang.String
}

object Queue {
  @scala.inline
  def apply(messageSchema: js.Object, queue: java.lang.String, options: js.Object = null): Queue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messageSchema")(messageSchema)
    __obj.updateDynamic("queue")(queue)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Queue]
  }
}

