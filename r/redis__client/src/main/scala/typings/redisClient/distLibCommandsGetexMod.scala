package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsGetexMod {
  
  @JSImport("@redis/client/dist/lib/commands/GETEX", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GETEX", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: RedisCommandArgument, mode: GetExModes): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): RedisCommandArgument | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.redisClient.anon.EX
    - typings.redisClient.anon.PX
    - typings.redisClient.anon.EXAT
    - typings.redisClient.anon.PXAT
    - typings.redisClient.anon.PERSIST
  */
  trait GetExModes extends StObject
  object GetExModes {
    
    inline def EX(EX: Double): typings.redisClient.anon.EX = {
      val __obj = js.Dynamic.literal(EX = EX.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.redisClient.anon.EX]
    }
    
    inline def EXAT(EXAT: Double | js.Date): typings.redisClient.anon.EXAT = {
      val __obj = js.Dynamic.literal(EXAT = EXAT.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.redisClient.anon.EXAT]
    }
    
    inline def PERSIST(): typings.redisClient.anon.PERSIST = {
      val __obj = js.Dynamic.literal(PERSIST = true)
      __obj.asInstanceOf[typings.redisClient.anon.PERSIST]
    }
    
    inline def PX(PX: Double): typings.redisClient.anon.PX = {
      val __obj = js.Dynamic.literal(PX = PX.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.redisClient.anon.PX]
    }
    
    inline def PXAT(PXAT: Double | js.Date): typings.redisClient.anon.PXAT = {
      val __obj = js.Dynamic.literal(PXAT = PXAT.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.redisClient.anon.PXAT]
    }
  }
}
