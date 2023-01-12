package typings.redisClient

import typings.redisClient.anon.Count
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientBooleans.`true`
import typings.redisClient.redisClientStrings.LEX
import typings.redisClient.redisClientStrings.SCORE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsZrangestoreMod {
  
  @JSImport("@redis/client/dist/lib/commands/ZRANGESTORE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZRANGESTORE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(dst: RedisCommandArgument, src: RedisCommandArgument, min: Double, max: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    dst: RedisCommandArgument,
    src: RedisCommandArgument,
    min: Double,
    max: Double,
    options: ZRangeStoreOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(dst: RedisCommandArgument, src: RedisCommandArgument, min: Double, max: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    dst: RedisCommandArgument,
    src: RedisCommandArgument,
    min: Double,
    max: RedisCommandArgument,
    options: ZRangeStoreOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(dst: RedisCommandArgument, src: RedisCommandArgument, min: RedisCommandArgument, max: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    dst: RedisCommandArgument,
    src: RedisCommandArgument,
    min: RedisCommandArgument,
    max: Double,
    options: ZRangeStoreOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    dst: RedisCommandArgument,
    src: RedisCommandArgument,
    min: RedisCommandArgument,
    max: RedisCommandArgument
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    dst: RedisCommandArgument,
    src: RedisCommandArgument,
    min: RedisCommandArgument,
    max: RedisCommandArgument,
    options: ZRangeStoreOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait ZRangeStoreOptions extends StObject {
    
    var BY: js.UndefOr[SCORE | LEX] = js.undefined
    
    var LIMIT: js.UndefOr[Count] = js.undefined
    
    var REV: js.UndefOr[`true`] = js.undefined
    
    var WITHSCORES: js.UndefOr[`true`] = js.undefined
  }
  object ZRangeStoreOptions {
    
    inline def apply(): ZRangeStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZRangeStoreOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZRangeStoreOptions] (val x: Self) extends AnyVal {
      
      inline def setBY(value: SCORE | LEX): Self = StObject.set(x, "BY", value.asInstanceOf[js.Any])
      
      inline def setBYUndefined: Self = StObject.set(x, "BY", js.undefined)
      
      inline def setLIMIT(value: Count): Self = StObject.set(x, "LIMIT", value.asInstanceOf[js.Any])
      
      inline def setLIMITUndefined: Self = StObject.set(x, "LIMIT", js.undefined)
      
      inline def setREV(value: `true`): Self = StObject.set(x, "REV", value.asInstanceOf[js.Any])
      
      inline def setREVUndefined: Self = StObject.set(x, "REV", js.undefined)
      
      inline def setWITHSCORES(value: `true`): Self = StObject.set(x, "WITHSCORES", value.asInstanceOf[js.Any])
      
      inline def setWITHSCORESUndefined: Self = StObject.set(x, "WITHSCORES", js.undefined)
    }
  }
}
