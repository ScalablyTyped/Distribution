package typings.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rascal.anon.ConfirmPool
import typings.rascal.rascalStrings.fixed
import typings.rascal.rascalStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VhostConfig extends js.Object {
  
  var assert: js.UndefOr[Boolean] = js.native
  
  var bindings: js.UndefOr[StringDictionary[BindingConfig] | js.Array[String]] = js.native
  
  var check: js.UndefOr[Boolean] = js.native
  
  var connection: js.UndefOr[ConnectionConfig] = js.native
  
  var connectionStrategy: js.UndefOr[random | fixed] = js.native
  
  var connections: js.UndefOr[js.Array[ConnectionConfig]] = js.native
  
  var exchanges: js.UndefOr[StringDictionary[ExchangeConfig] | js.Array[String]] = js.native
  
  var namespace: js.UndefOr[String | Boolean] = js.native
  
  var publicationChannelPools: js.UndefOr[ConfirmPool] = js.native
  
  var publications: js.UndefOr[StringDictionary[PublicationConfig]] = js.native
  
  var queues: js.UndefOr[StringDictionary[QueueConfig] | js.Array[String]] = js.native
  
  var subscriptions: js.UndefOr[StringDictionary[SubscriptionConfig]] = js.native
}
object VhostConfig {
  
  @scala.inline
  def apply(): VhostConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VhostConfig]
  }
  
  @scala.inline
  implicit class VhostConfigOps[Self <: VhostConfig] (val x: Self) extends AnyVal {
    
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
    def setAssert(value: Boolean): Self = this.set("assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssert: Self = this.set("assert", js.undefined)
    
    @scala.inline
    def setBindingsVarargs(value: String*): Self = this.set("bindings", js.Array(value :_*))
    
    @scala.inline
    def setBindings(value: StringDictionary[BindingConfig] | js.Array[String]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    
    @scala.inline
    def setCheck(value: Boolean): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setConnection(value: ConnectionConfig): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setConnectionStrategy(value: random | fixed): Self = this.set("connectionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionStrategy: Self = this.set("connectionStrategy", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: ConnectionConfig*): Self = this.set("connections", js.Array(value :_*))
    
    @scala.inline
    def setConnections(value: js.Array[ConnectionConfig]): Self = this.set("connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
    
    @scala.inline
    def setExchangesVarargs(value: String*): Self = this.set("exchanges", js.Array(value :_*))
    
    @scala.inline
    def setExchanges(value: StringDictionary[ExchangeConfig] | js.Array[String]): Self = this.set("exchanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchanges: Self = this.set("exchanges", js.undefined)
    
    @scala.inline
    def setNamespace(value: String | Boolean): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setPublicationChannelPools(value: ConfirmPool): Self = this.set("publicationChannelPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicationChannelPools: Self = this.set("publicationChannelPools", js.undefined)
    
    @scala.inline
    def setPublications(value: StringDictionary[PublicationConfig]): Self = this.set("publications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublications: Self = this.set("publications", js.undefined)
    
    @scala.inline
    def setQueuesVarargs(value: String*): Self = this.set("queues", js.Array(value :_*))
    
    @scala.inline
    def setQueues(value: StringDictionary[QueueConfig] | js.Array[String]): Self = this.set("queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueues: Self = this.set("queues", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: StringDictionary[SubscriptionConfig]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptions: Self = this.set("subscriptions", js.undefined)
  }
}
