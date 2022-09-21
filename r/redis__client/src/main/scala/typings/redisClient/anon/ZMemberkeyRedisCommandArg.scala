package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @redis/client.@redis/client/dist/lib/commands/generic-transformers.ZMember & {  key :@redis/client.@redis/client/dist/lib/commands.RedisCommandArgument} */
trait ZMemberkeyRedisCommandArg extends StObject {
  
  var key: RedisCommandArgument
  
  var score: Double
  
  var value: RedisCommandArgument
}
object ZMemberkeyRedisCommandArg {
  
  inline def apply(key: RedisCommandArgument, score: Double, value: RedisCommandArgument): ZMemberkeyRedisCommandArg = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZMemberkeyRedisCommandArg]
  }
  
  extension [Self <: ZMemberkeyRedisCommandArg](x: Self) {
    
    inline def setKey(value: RedisCommandArgument): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setValue(value: RedisCommandArgument): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
