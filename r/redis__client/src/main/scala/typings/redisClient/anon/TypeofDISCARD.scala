package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDISCARD extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(): RedisCommandArgument
}
object TypeofDISCARD {
  
  inline def apply(transformArguments: () => js.Array[String], transformReply: () => RedisCommandArgument): TypeofDISCARD = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofDISCARD]
  }
  
  extension [Self <: TypeofDISCARD](x: Self) {
    
    inline def setTransformArguments(value: () => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: () => RedisCommandArgument): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
