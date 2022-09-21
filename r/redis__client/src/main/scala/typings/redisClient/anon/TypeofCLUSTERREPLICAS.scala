package typings.redisClient.anon

import typings.redisClient.clusterNODESMod.RedisClusterMasterNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERREPLICAS extends StObject {
  
  def transformArguments(nodeId: String): js.Array[String]
  
  def transformReply(reply: String): js.Array[RedisClusterMasterNode]
}
object TypeofCLUSTERREPLICAS {
  
  inline def apply(
    transformArguments: String => js.Array[String],
    transformReply: String => js.Array[RedisClusterMasterNode]
  ): TypeofCLUSTERREPLICAS = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERREPLICAS]
  }
  
  extension [Self <: TypeofCLUSTERREPLICAS](x: Self) {
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: String => js.Array[RedisClusterMasterNode]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
