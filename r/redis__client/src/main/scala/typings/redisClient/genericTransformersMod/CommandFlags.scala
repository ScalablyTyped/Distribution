package typings.redisClient.genericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommandFlags extends StObject
@JSImport("@redis/client/dist/lib/commands/generic-transformers", "CommandFlags")
@js.native
object CommandFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CommandFlags & String] = js.native
  
  @js.native
  sealed trait ADMIN
    extends StObject
       with CommandFlags
  /* "admin" */ val ADMIN: typings.redisClient.genericTransformersMod.CommandFlags.ADMIN & String = js.native
  
  @js.native
  sealed trait ASKING
    extends StObject
       with CommandFlags
  /* "asking" */ val ASKING: typings.redisClient.genericTransformersMod.CommandFlags.ASKING & String = js.native
  
  @js.native
  sealed trait DENYOOM
    extends StObject
       with CommandFlags
  /* "denyoom" */ val DENYOOM: typings.redisClient.genericTransformersMod.CommandFlags.DENYOOM & String = js.native
  
  @js.native
  sealed trait FAST
    extends StObject
       with CommandFlags
  /* "fast" */ val FAST: typings.redisClient.genericTransformersMod.CommandFlags.FAST & String = js.native
  
  @js.native
  sealed trait LOADING
    extends StObject
       with CommandFlags
  /* "loading" */ val LOADING: typings.redisClient.genericTransformersMod.CommandFlags.LOADING & String = js.native
  
  @js.native
  sealed trait MOVABLEKEYS
    extends StObject
       with CommandFlags
  /* "movablekeys" */ val MOVABLEKEYS: typings.redisClient.genericTransformersMod.CommandFlags.MOVABLEKEYS & String = js.native
  
  @js.native
  sealed trait NOSCRIPT
    extends StObject
       with CommandFlags
  /* "noscript" */ val NOSCRIPT: typings.redisClient.genericTransformersMod.CommandFlags.NOSCRIPT & String = js.native
  
  @js.native
  sealed trait PUBSUB
    extends StObject
       with CommandFlags
  /* "pubsub" */ val PUBSUB: typings.redisClient.genericTransformersMod.CommandFlags.PUBSUB & String = js.native
  
  @js.native
  sealed trait RANDOM
    extends StObject
       with CommandFlags
  /* "random" */ val RANDOM: typings.redisClient.genericTransformersMod.CommandFlags.RANDOM & String = js.native
  
  @js.native
  sealed trait READONLY
    extends StObject
       with CommandFlags
  /* "readonly" */ val READONLY: typings.redisClient.genericTransformersMod.CommandFlags.READONLY & String = js.native
  
  @js.native
  sealed trait SKIP_MONITOR
    extends StObject
       with CommandFlags
  /* "skip_monitor" */ val SKIP_MONITOR: typings.redisClient.genericTransformersMod.CommandFlags.SKIP_MONITOR & String = js.native
  
  @js.native
  sealed trait SORT_FOR_SCRIPT
    extends StObject
       with CommandFlags
  /* "sort_for_script" */ val SORT_FOR_SCRIPT: typings.redisClient.genericTransformersMod.CommandFlags.SORT_FOR_SCRIPT & String = js.native
  
  @js.native
  sealed trait STALE
    extends StObject
       with CommandFlags
  /* "stale" */ val STALE: typings.redisClient.genericTransformersMod.CommandFlags.STALE & String = js.native
  
  @js.native
  sealed trait WRITE
    extends StObject
       with CommandFlags
  /* "write" */ val WRITE: typings.redisClient.genericTransformersMod.CommandFlags.WRITE & String = js.native
}
