package typings.socketIoRedis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<socket.io-redis.socket.io-redis.RedisAdapterOptions> */
  trait PartialRedisAdapterOption extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var pubClient: js.UndefOr[Any] = js.undefined
    
    var requestsTimeout: js.UndefOr[Double] = js.undefined
    
    var subClient: js.UndefOr[Any] = js.undefined
  }
  object PartialRedisAdapterOption {
    
    inline def apply(): PartialRedisAdapterOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRedisAdapterOption]
    }
    
    extension [Self <: PartialRedisAdapterOption](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPubClient(value: Any): Self = StObject.set(x, "pubClient", value.asInstanceOf[js.Any])
      
      inline def setPubClientUndefined: Self = StObject.set(x, "pubClient", js.undefined)
      
      inline def setRequestsTimeout(value: Double): Self = StObject.set(x, "requestsTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestsTimeoutUndefined: Self = StObject.set(x, "requestsTimeout", js.undefined)
      
      inline def setSubClient(value: Any): Self = StObject.set(x, "subClient", value.asInstanceOf[js.Any])
      
      inline def setSubClientUndefined: Self = StObject.set(x, "subClient", js.undefined)
    }
  }
}
