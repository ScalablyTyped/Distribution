package typings.redisClient.distLibCommandsGenericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RedisFunctionFlags extends StObject
@JSImport("@redis/client/dist/lib/commands/generic-transformers", "RedisFunctionFlags")
@js.native
object RedisFunctionFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RedisFunctionFlags & String] = js.native
  
  @js.native
  sealed trait ALLOW_OOM
    extends StObject
       with RedisFunctionFlags
  /* "allow-oom" */ val ALLOW_OOM: typings.redisClient.distLibCommandsGenericTransformersMod.RedisFunctionFlags.ALLOW_OOM & String = js.native
  
  @js.native
  sealed trait ALLOW_STALE
    extends StObject
       with RedisFunctionFlags
  /* "allow-stale" */ val ALLOW_STALE: typings.redisClient.distLibCommandsGenericTransformersMod.RedisFunctionFlags.ALLOW_STALE & String = js.native
  
  @js.native
  sealed trait NO_CLUSTER
    extends StObject
       with RedisFunctionFlags
  /* "no-cluster" */ val NO_CLUSTER: typings.redisClient.distLibCommandsGenericTransformersMod.RedisFunctionFlags.NO_CLUSTER & String = js.native
  
  @js.native
  sealed trait NO_WRITES
    extends StObject
       with RedisFunctionFlags
  /* "no-writes" */ val NO_WRITES: typings.redisClient.distLibCommandsGenericTransformersMod.RedisFunctionFlags.NO_WRITES & String = js.native
}
