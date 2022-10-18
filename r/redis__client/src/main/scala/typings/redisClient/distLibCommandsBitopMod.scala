package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsBitopMod {
  
  @JSImport("@redis/client/dist/lib/commands/BITOP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/BITOP", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  inline def transformArguments(operation: BitOperations, destKey: RedisCommandArgument, key: js.Array[RedisCommandArgument]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(operation.asInstanceOf[js.Any], destKey.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(operation: BitOperations, destKey: RedisCommandArgument, key: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(operation.asInstanceOf[js.Any], destKey.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.redisClient.redisClientStrings.AND
    - typings.redisClient.redisClientStrings.OR
    - typings.redisClient.redisClientStrings.XOR
    - typings.redisClient.redisClientStrings.NOT
  */
  trait BitOperations extends StObject
  object BitOperations {
    
    inline def AND: typings.redisClient.redisClientStrings.AND = "AND".asInstanceOf[typings.redisClient.redisClientStrings.AND]
    
    inline def NOT: typings.redisClient.redisClientStrings.NOT = "NOT".asInstanceOf[typings.redisClient.redisClientStrings.NOT]
    
    inline def OR: typings.redisClient.redisClientStrings.OR = "OR".asInstanceOf[typings.redisClient.redisClientStrings.OR]
    
    inline def XOR: typings.redisClient.redisClientStrings.XOR = "XOR".asInstanceOf[typings.redisClient.redisClientStrings.XOR]
  }
}
