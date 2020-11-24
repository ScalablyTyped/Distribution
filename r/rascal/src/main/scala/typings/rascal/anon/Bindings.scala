package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bindings extends js.Object {
  
  var bindings: BindingKey = js.native
  
  var connection: Hostname = js.native
  
  var connectionStrategy: String = js.native
  
  var exchanges: Assert = js.native
  
  var publicationChannelPools: RegularPool = js.native
  
  var queues: AssertBoolean = js.native
}
object Bindings {
  
  @scala.inline
  def apply(
    bindings: BindingKey,
    connection: Hostname,
    connectionStrategy: String,
    exchanges: Assert,
    publicationChannelPools: RegularPool,
    queues: AssertBoolean
  ): Bindings = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], connectionStrategy = connectionStrategy.asInstanceOf[js.Any], exchanges = exchanges.asInstanceOf[js.Any], publicationChannelPools = publicationChannelPools.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bindings]
  }
  
  @scala.inline
  implicit class BindingsOps[Self <: Bindings] (val x: Self) extends AnyVal {
    
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
    def setBindings(value: BindingKey): Self = this.set("bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: Hostname): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStrategy(value: String): Self = this.set("connectionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchanges(value: Assert): Self = this.set("exchanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicationChannelPools(value: RegularPool): Self = this.set("publicationChannelPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueues(value: AssertBoolean): Self = this.set("queues", value.asInstanceOf[js.Any])
  }
}
