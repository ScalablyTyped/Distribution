package typings.redisClient.anon

import typings.redisClient.distLibCommandsClusterNODESMod.RedisClusterMasterNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERNODES extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(reply: String): js.Array[RedisClusterMasterNode]
}
object TypeofCLUSTERNODES {
  
  inline def apply(
    transformArguments: () => js.Array[String],
    transformReply: String => js.Array[RedisClusterMasterNode]
  ): TypeofCLUSTERNODES = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERNODES]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCLUSTERNODES] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: () => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: String => js.Array[RedisClusterMasterNode]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
