package typings.redisClient

import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClusterFAILOVERMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_FAILOVER", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait FailoverModes extends StObject
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_FAILOVER", "FailoverModes")
  @js.native
  object FailoverModes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FailoverModes & String] = js.native
    
    @js.native
    sealed trait FORCE
      extends StObject
         with FailoverModes
    /* "FORCE" */ val FORCE: typings.redisClient.distLibCommandsClusterFAILOVERMod.FailoverModes.FORCE & String = js.native
    
    @js.native
    sealed trait TAKEOVER
      extends StObject
         with FailoverModes
    /* "TAKEOVER" */ val TAKEOVER: typings.redisClient.distLibCommandsClusterFAILOVERMod.FailoverModes.TAKEOVER & String = js.native
  }
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  inline def transformArguments(mode: FailoverModes): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(mode.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
