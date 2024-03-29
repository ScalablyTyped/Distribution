package typings.redisClient

import typings.redisClient.distLibLuaScriptMod.RedisScriptConfig
import typings.redisClient.distLibLuaScriptMod.SHA1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@redis/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client", "AbortError")
  @js.native
  open class AbortError ()
    extends typings.redisClient.distLibErrorsMod.AbortError
  
  @JSImport("@redis/client", "ClientClosedError")
  @js.native
  open class ClientClosedError ()
    extends typings.redisClient.distLibErrorsMod.ClientClosedError
  
  @JSImport("@redis/client", "ClientOfflineError")
  @js.native
  open class ClientOfflineError ()
    extends typings.redisClient.distLibErrorsMod.ClientOfflineError
  
  @JSImport("@redis/client", "ConnectionTimeoutError")
  @js.native
  open class ConnectionTimeoutError ()
    extends typings.redisClient.distLibErrorsMod.ConnectionTimeoutError
  
  @JSImport("@redis/client", "DisconnectsClientError")
  @js.native
  open class DisconnectsClientError ()
    extends typings.redisClient.distLibErrorsMod.DisconnectsClientError
  
  @JSImport("@redis/client", "ErrorReply")
  @js.native
  open class ErrorReply protected ()
    extends typings.redisClient.distLibErrorsMod.ErrorReply {
    def this(message: String) = this()
  }
  
  @JSImport("@redis/client", "GeoReplyWith")
  @js.native
  object GeoReplyWith extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith & String] = js.native
    
    /* "WITHCOORD" */ val COORDINATES: typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.COORDINATES & String = js.native
    
    /* "WITHDIST" */ val DISTANCE: typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.DISTANCE & String = js.native
    
    /* "WITHHASH" */ val HASH: typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.HASH & String = js.native
  }
  
  @JSImport("@redis/client", "ReconnectStrategyError")
  @js.native
  open class ReconnectStrategyError protected ()
    extends typings.redisClient.distLibErrorsMod.ReconnectStrategyError {
    def this(originalError: js.Error, socketError: Any) = this()
  }
  
  @JSImport("@redis/client", "RedisFlushModes")
  @js.native
  object RedisFlushModes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisClient.distLibCommandsFlushallMod.RedisFlushModes & String] = js.native
    
    /* "ASYNC" */ val ASYNC: typings.redisClient.distLibCommandsFlushallMod.RedisFlushModes.ASYNC & String = js.native
    
    /* "SYNC" */ val SYNC: typings.redisClient.distLibCommandsFlushallMod.RedisFlushModes.SYNC & String = js.native
  }
  
  @JSImport("@redis/client", "RootNodesUnavailableError")
  @js.native
  open class RootNodesUnavailableError ()
    extends typings.redisClient.distLibErrorsMod.RootNodesUnavailableError
  
  @JSImport("@redis/client", "SocketClosedUnexpectedlyError")
  @js.native
  open class SocketClosedUnexpectedlyError ()
    extends typings.redisClient.distLibErrorsMod.SocketClosedUnexpectedlyError
  
  @JSImport("@redis/client", "WatchError")
  @js.native
  open class WatchError ()
    extends typings.redisClient.distLibErrorsMod.WatchError
  
  @JSImport("@redis/client", "commandOptions")
  @js.native
  val commandOptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RedisClient.commandOptions */ Any = js.native
  
  @JSImport("@redis/client", "createClient")
  @js.native
  val createClient: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RedisClient.create */ Any = js.native
  
  @JSImport("@redis/client", "createCluster")
  @js.native
  val createCluster: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RedisCluster.create */ Any = js.native
  
  inline def defineScript[S /* <: RedisScriptConfig */](script: S): S & SHA1 = ^.asInstanceOf[js.Dynamic].applyDynamic("defineScript")(script.asInstanceOf[js.Any]).asInstanceOf[S & SHA1]
}
