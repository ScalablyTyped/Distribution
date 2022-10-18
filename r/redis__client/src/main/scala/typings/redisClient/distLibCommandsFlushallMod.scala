package typings.redisClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsFlushallMod {
  
  @JSImport("@redis/client/dist/lib/commands/FLUSHALL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait RedisFlushModes extends StObject
  @JSImport("@redis/client/dist/lib/commands/FLUSHALL", "RedisFlushModes")
  @js.native
  object RedisFlushModes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RedisFlushModes & String] = js.native
    
    @js.native
    sealed trait ASYNC
      extends StObject
         with RedisFlushModes
    /* "ASYNC" */ val ASYNC: typings.redisClient.distLibCommandsFlushallMod.RedisFlushModes.ASYNC & String = js.native
    
    @js.native
    sealed trait SYNC
      extends StObject
         with RedisFlushModes
    /* "SYNC" */ val SYNC: typings.redisClient.distLibCommandsFlushallMod.RedisFlushModes.SYNC & String = js.native
  }
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  inline def transformArguments(mode: RedisFlushModes): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(mode.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
}
