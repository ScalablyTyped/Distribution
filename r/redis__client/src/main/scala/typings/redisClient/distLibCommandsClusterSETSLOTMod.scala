package typings.redisClient

import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClusterSETSLOTMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_SETSLOT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ClusterSlotStates extends StObject
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_SETSLOT", "ClusterSlotStates")
  @js.native
  object ClusterSlotStates extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ClusterSlotStates & String] = js.native
    
    @js.native
    sealed trait IMPORTING
      extends StObject
         with ClusterSlotStates
    /* "IMPORTING" */ val IMPORTING: typings.redisClient.distLibCommandsClusterSETSLOTMod.ClusterSlotStates.IMPORTING & String = js.native
    
    @js.native
    sealed trait MIGRATING
      extends StObject
         with ClusterSlotStates
    /* "MIGRATING" */ val MIGRATING: typings.redisClient.distLibCommandsClusterSETSLOTMod.ClusterSlotStates.MIGRATING & String = js.native
    
    @js.native
    sealed trait NODE
      extends StObject
         with ClusterSlotStates
    /* "NODE" */ val NODE: typings.redisClient.distLibCommandsClusterSETSLOTMod.ClusterSlotStates.NODE & String = js.native
    
    @js.native
    sealed trait STABLE
      extends StObject
         with ClusterSlotStates
    /* "STABLE" */ val STABLE: typings.redisClient.distLibCommandsClusterSETSLOTMod.ClusterSlotStates.STABLE & String = js.native
  }
  
  inline def transformArguments(slot: Double, state: ClusterSlotStates): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(slot.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(slot: Double, state: ClusterSlotStates, nodeId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(slot.asInstanceOf[js.Any], state.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
