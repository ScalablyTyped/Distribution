package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsLinsertMod {
  
  @JSImport("@redis/client/dist/lib/commands/LINSERT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/LINSERT", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(
    key: RedisCommandArgument,
    position: LInsertPosition,
    pivot: RedisCommandArgument,
    element: RedisCommandArgument
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], position.asInstanceOf[js.Any], pivot.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.redisClient.redisClientStrings.BEFORE
    - typings.redisClient.redisClientStrings.AFTER
  */
  trait LInsertPosition extends StObject
  object LInsertPosition {
    
    inline def AFTER: typings.redisClient.redisClientStrings.AFTER = "AFTER".asInstanceOf[typings.redisClient.redisClientStrings.AFTER]
    
    inline def BEFORE: typings.redisClient.redisClientStrings.BEFORE = "BEFORE".asInstanceOf[typings.redisClient.redisClientStrings.BEFORE]
  }
}
