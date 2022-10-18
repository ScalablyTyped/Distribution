package typings.redisClient.anon

import typings.redisClient.distLibCommandsFunctionSTATSMod.FunctionStatsRawReply
import typings.redisClient.distLibCommandsFunctionSTATSMod.FunctionStatsReply
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFUNCTIONSTATS extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(reply: FunctionStatsRawReply): FunctionStatsReply
}
object TypeofFUNCTIONSTATS {
  
  inline def apply(
    transformArguments: () => RedisCommandArguments,
    transformReply: FunctionStatsRawReply => FunctionStatsReply
  ): TypeofFUNCTIONSTATS = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofFUNCTIONSTATS]
  }
  
  extension [Self <: TypeofFUNCTIONSTATS](x: Self) {
    
    inline def setTransformArguments(value: () => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: FunctionStatsRawReply => FunctionStatsReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
