package typings.rabbitmqSchema.mod

import typings.rabbitmqSchema.rabbitmqSchemaStrings.direct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectExchange extends Exchange {
  @JSName("bindings")
  var bindings_DirectExchange: js.Array[DirectBinding] = js.native
  @JSName("type")
  var type_DirectExchange: direct = js.native
}

object DirectExchange {
  @scala.inline
  def apply(bindings: js.Array[DirectBinding], exchange: String, `type`: direct): DirectExchange = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectExchange]
  }
  @scala.inline
  implicit class DirectExchangeOps[Self <: DirectExchange] (val x: Self) extends AnyVal {
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
    def setBindingsVarargs(value: DirectBinding*): Self = this.set("bindings", js.Array(value :_*))
    @scala.inline
    def setBindings(value: js.Array[DirectBinding]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: direct): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

