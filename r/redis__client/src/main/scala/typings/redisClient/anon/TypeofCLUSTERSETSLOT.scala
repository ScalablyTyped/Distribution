package typings.redisClient.anon

import typings.redisClient.distLibCommandsClusterSETSLOTMod.ClusterSlotStates
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCLUSTERSETSLOT extends StObject {
  
  def transformArguments(slot: Double, state: ClusterSlotStates): js.Array[String] = js.native
  def transformArguments(slot: Double, state: ClusterSlotStates, nodeId: String): js.Array[String] = js.native
  
  def transformReply(): OK = js.native
}
