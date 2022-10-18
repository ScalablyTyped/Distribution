package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedSMOVE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(source: RedisCommandArgument, destination: RedisCommandArgument, member: RedisCommandArgument): RedisCommandArguments
  
  def transformReply(reply: Double): Boolean
}
object TypeofimportedSMOVE {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (RedisCommandArgument, RedisCommandArgument, RedisCommandArgument) => RedisCommandArguments,
    transformReply: Double => Boolean
  ): TypeofimportedSMOVE = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction3(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofimportedSMOVE]
  }
  
  extension [Self <: TypeofimportedSMOVE](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, RedisCommandArgument, RedisCommandArgument) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction3(value))
    
    inline def setTransformReply(value: Double => Boolean): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
