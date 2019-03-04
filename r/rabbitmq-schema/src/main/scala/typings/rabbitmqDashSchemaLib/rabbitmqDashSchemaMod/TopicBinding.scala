package typings
package rabbitmqDashSchemaLib.rabbitmqDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicBinding extends Binding {
  @JSName("routingPattern")
  var routingPattern_TopicBinding: java.lang.String
}

object TopicBinding {
  @scala.inline
  def apply(
    destination: Exchange | Queue,
    routingPattern: java.lang.String,
    source: Exchange,
    args: js.Object = null
  ): TopicBinding = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], routingPattern = routingPattern, source = source)
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[TopicBinding]
  }
}

