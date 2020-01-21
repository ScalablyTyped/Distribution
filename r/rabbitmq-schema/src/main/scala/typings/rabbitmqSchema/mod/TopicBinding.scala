package typings.rabbitmqSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicBinding extends Binding {
  @JSName("routingPattern")
  var routingPattern_TopicBinding: String
}

object TopicBinding {
  @scala.inline
  def apply(destination: Exchange | Queue, routingPattern: String, source: Exchange, args: js.Object = null): TopicBinding = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], routingPattern = routingPattern.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicBinding]
  }
}

