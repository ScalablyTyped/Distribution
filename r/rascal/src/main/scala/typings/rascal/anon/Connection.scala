package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  var bindings: BindingKey
  
  var connection: Hostname
  
  var connectionStrategy: String
  
  var exchanges: Type
  
  var namespace: Boolean
  
  var publicationChannelPools: RegularPool
  
  var queues: Purge
}
object Connection {
  
  @scala.inline
  def apply(
    bindings: BindingKey,
    connection: Hostname,
    connectionStrategy: String,
    exchanges: Type,
    namespace: Boolean,
    publicationChannelPools: RegularPool,
    queues: Purge
  ): Connection = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], connectionStrategy = connectionStrategy.asInstanceOf[js.Any], exchanges = exchanges.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], publicationChannelPools = publicationChannelPools.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: BindingKey): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: Hostname): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStrategy(value: String): Self = StObject.set(x, "connectionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchanges(value: Type): Self = StObject.set(x, "exchanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Boolean): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicationChannelPools(value: RegularPool): Self = StObject.set(x, "publicationChannelPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueues(value: Purge): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
  }
}
