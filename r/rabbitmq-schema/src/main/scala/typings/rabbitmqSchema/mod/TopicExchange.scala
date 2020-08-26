package typings.rabbitmqSchema.mod

import typings.rabbitmqSchema.rabbitmqSchemaStrings.topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicExchange extends Exchange {
  @JSName("bindings")
  var bindings_TopicExchange: js.Array[TopicBinding] = js.native
  @JSName("type")
  var type_TopicExchange: topic = js.native
}

object TopicExchange {
  @scala.inline
  def apply(bindings: js.Array[TopicBinding], exchange: String, `type`: topic): TopicExchange = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicExchange]
  }
  @scala.inline
  implicit class TopicExchangeOps[Self <: TopicExchange] (val x: Self) extends AnyVal {
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
    def setBindingsVarargs(value: TopicBinding*): Self = this.set("bindings", js.Array(value :_*))
    @scala.inline
    def setBindings(value: js.Array[TopicBinding]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: topic): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

