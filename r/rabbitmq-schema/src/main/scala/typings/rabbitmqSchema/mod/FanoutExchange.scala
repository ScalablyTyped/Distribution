package typings.rabbitmqSchema.mod

import typings.rabbitmqSchema.rabbitmqSchemaStrings.fanout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FanoutExchange extends Exchange {
  
  @JSName("type")
  var type_FanoutExchange: fanout = js.native
}
object FanoutExchange {
  
  @scala.inline
  def apply(bindings: js.Array[Binding], exchange: String, `type`: fanout): FanoutExchange = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FanoutExchange]
  }
  
  @scala.inline
  implicit class FanoutExchangeOps[Self <: FanoutExchange] (val x: Self) extends AnyVal {
    
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
    def setType(value: fanout): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
