package typings.redisClient.anon

import typings.redisClient.commandsClusterSLOTSMod.ClusterSlotsRawReply
import typings.redisClient.commandsClusterSLOTSMod.ClusterSlotsReply
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERSLOTS extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(reply: ClusterSlotsRawReply): ClusterSlotsReply
}
object TypeofCLUSTERSLOTS {
  
  inline def apply(
    transformArguments: () => RedisCommandArguments,
    transformReply: ClusterSlotsRawReply => ClusterSlotsReply
  ): TypeofCLUSTERSLOTS = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERSLOTS]
  }
  
  extension [Self <: TypeofCLUSTERSLOTS](x: Self) {
    
    inline def setTransformArguments(value: () => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: ClusterSlotsRawReply => ClusterSlotsReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
