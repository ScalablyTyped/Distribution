package typings.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rascal.anon.ConfirmPool
import typings.rascal.rascalStrings.fixed
import typings.rascal.rascalStrings.random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VhostConfig extends StObject {
  
  var assert: js.UndefOr[Boolean] = js.undefined
  
  var bindings: js.UndefOr[StringDictionary[BindingConfig] | js.Array[String]] = js.undefined
  
  var check: js.UndefOr[Boolean] = js.undefined
  
  var connection: js.UndefOr[ConnectionConfig] = js.undefined
  
  var connectionStrategy: js.UndefOr[random | fixed] = js.undefined
  
  var connections: js.UndefOr[js.Array[ConnectionConfig]] = js.undefined
  
  var exchanges: js.UndefOr[StringDictionary[ExchangeConfig] | js.Array[String]] = js.undefined
  
  var namespace: js.UndefOr[String | Boolean] = js.undefined
  
  var publicationChannelPools: js.UndefOr[ConfirmPool] = js.undefined
  
  var publications: js.UndefOr[StringDictionary[PublicationConfig]] = js.undefined
  
  var queues: js.UndefOr[StringDictionary[QueueConfig] | js.Array[String]] = js.undefined
  
  var subscriptions: js.UndefOr[StringDictionary[SubscriptionConfig]] = js.undefined
}
object VhostConfig {
  
  @scala.inline
  def apply(): VhostConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VhostConfig]
  }
  
  @scala.inline
  implicit class VhostConfigMutableBuilder[Self <: VhostConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssert(value: Boolean): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    @scala.inline
    def setBindings(value: StringDictionary[BindingConfig] | js.Array[String]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setBindingsVarargs(value: String*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    @scala.inline
    def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    @scala.inline
    def setConnection(value: ConnectionConfig): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStrategy(value: random | fixed): Self = StObject.set(x, "connectionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStrategyUndefined: Self = StObject.set(x, "connectionStrategy", js.undefined)
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setConnections(value: js.Array[ConnectionConfig]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: ConnectionConfig*): Self = StObject.set(x, "connections", js.Array(value :_*))
    
    @scala.inline
    def setExchanges(value: StringDictionary[ExchangeConfig] | js.Array[String]): Self = StObject.set(x, "exchanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangesUndefined: Self = StObject.set(x, "exchanges", js.undefined)
    
    @scala.inline
    def setExchangesVarargs(value: String*): Self = StObject.set(x, "exchanges", js.Array(value :_*))
    
    @scala.inline
    def setNamespace(value: String | Boolean): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setPublicationChannelPools(value: ConfirmPool): Self = StObject.set(x, "publicationChannelPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicationChannelPoolsUndefined: Self = StObject.set(x, "publicationChannelPools", js.undefined)
    
    @scala.inline
    def setPublications(value: StringDictionary[PublicationConfig]): Self = StObject.set(x, "publications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicationsUndefined: Self = StObject.set(x, "publications", js.undefined)
    
    @scala.inline
    def setQueues(value: StringDictionary[QueueConfig] | js.Array[String]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuesUndefined: Self = StObject.set(x, "queues", js.undefined)
    
    @scala.inline
    def setQueuesVarargs(value: String*): Self = StObject.set(x, "queues", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptions(value: StringDictionary[SubscriptionConfig]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
  }
}
