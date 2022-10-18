package typings.redisClient.anon

import typings.redisClient.distLibCommandsClusterLINKSMod.ClusterLinksRawReply
import typings.redisClient.distLibCommandsClusterLINKSMod.ClusterLinksReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERLINKS extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(reply: ClusterLinksRawReply): ClusterLinksReply
}
object TypeofCLUSTERLINKS {
  
  inline def apply(
    transformArguments: () => js.Array[String],
    transformReply: ClusterLinksRawReply => ClusterLinksReply
  ): TypeofCLUSTERLINKS = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERLINKS]
  }
  
  extension [Self <: TypeofCLUSTERLINKS](x: Self) {
    
    inline def setTransformArguments(value: () => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: ClusterLinksRawReply => ClusterLinksReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
