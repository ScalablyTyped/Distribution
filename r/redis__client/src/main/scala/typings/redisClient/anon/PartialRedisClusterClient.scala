package typings.redisClient.anon

import typings.genericPool.mod.Options
import typings.redisClient.distLibClientSocketMod.RedisSocketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@redis/client.@redis/client/dist/lib/cluster.RedisClusterClientOptions> */
trait PartialRedisClusterClient extends StObject {
  
  var commandsQueueMaxLength: js.UndefOr[Double] = js.undefined
  
  var disableOfflineQueue: js.UndefOr[Boolean] = js.undefined
  
  var isolationPoolOptions: js.UndefOr[Options] = js.undefined
  
  var legacyMode: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var pingInterval: js.UndefOr[Double] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var socket: js.UndefOr[RedisSocketOptions] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object PartialRedisClusterClient {
  
  inline def apply(): PartialRedisClusterClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRedisClusterClient]
  }
  
  extension [Self <: PartialRedisClusterClient](x: Self) {
    
    inline def setCommandsQueueMaxLength(value: Double): Self = StObject.set(x, "commandsQueueMaxLength", value.asInstanceOf[js.Any])
    
    inline def setCommandsQueueMaxLengthUndefined: Self = StObject.set(x, "commandsQueueMaxLength", js.undefined)
    
    inline def setDisableOfflineQueue(value: Boolean): Self = StObject.set(x, "disableOfflineQueue", value.asInstanceOf[js.Any])
    
    inline def setDisableOfflineQueueUndefined: Self = StObject.set(x, "disableOfflineQueue", js.undefined)
    
    inline def setIsolationPoolOptions(value: Options): Self = StObject.set(x, "isolationPoolOptions", value.asInstanceOf[js.Any])
    
    inline def setIsolationPoolOptionsUndefined: Self = StObject.set(x, "isolationPoolOptions", js.undefined)
    
    inline def setLegacyMode(value: Boolean): Self = StObject.set(x, "legacyMode", value.asInstanceOf[js.Any])
    
    inline def setLegacyModeUndefined: Self = StObject.set(x, "legacyMode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
    
    inline def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setSocket(value: RedisSocketOptions): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
