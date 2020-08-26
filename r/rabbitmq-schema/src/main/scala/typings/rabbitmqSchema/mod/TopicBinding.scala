package typings.rabbitmqSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicBinding extends Binding {
  @JSName("routingPattern")
  var routingPattern_TopicBinding: String = js.native
}

object TopicBinding {
  @scala.inline
  def apply(destination: Exchange | Queue, routingPattern: String, source: Exchange): TopicBinding = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], routingPattern = routingPattern.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicBinding]
  }
  @scala.inline
  implicit class TopicBindingOps[Self <: TopicBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoutingPattern(value: String): Self = this.set("routingPattern", value.asInstanceOf[js.Any])
  }
  
}

