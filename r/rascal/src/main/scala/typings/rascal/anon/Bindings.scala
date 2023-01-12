package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bindings extends StObject {
  
  var bindings: BindingKey
  
  var connection: Hostname
  
  var connectionStrategy: String
  
  var exchanges: Assert
  
  var publicationChannelPools: RegularPool
  
  var queues: AssertBoolean
}
object Bindings {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Bindings] (val x: Self) extends AnyVal {
    
    inline def setBindings(value: BindingKey): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setConnection(value: Hostname): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionStrategy(value: String): Self = StObject.set(x, "connectionStrategy", value.asInstanceOf[js.Any])
    
    inline def setExchanges(value: Assert): Self = StObject.set(x, "exchanges", value.asInstanceOf[js.Any])
    
    inline def setPublicationChannelPools(value: RegularPool): Self = StObject.set(x, "publicationChannelPools", value.asInstanceOf[js.Any])
    
    inline def setQueues(value: AssertBoolean): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
  }
}
