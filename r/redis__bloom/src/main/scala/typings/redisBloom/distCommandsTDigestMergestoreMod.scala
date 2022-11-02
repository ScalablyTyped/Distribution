package typings.redisBloom

import typings.redisBloom.redisBloomStrings.OK
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsTDigestMergestoreMod {
  
  @JSImport("@redis/bloom/dist/commands/t-digest/MERGESTORE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/t-digest/MERGESTORE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(destKey: RedisCommandArgument, srcKeys: js.Array[RedisCommandArgument]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destKey.asInstanceOf[js.Any], srcKeys.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(destKey: RedisCommandArgument, srcKeys: js.Array[RedisCommandArgument], options: MergeStoreOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destKey.asInstanceOf[js.Any], srcKeys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(destKey: RedisCommandArgument, srcKeys: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destKey.asInstanceOf[js.Any], srcKeys.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(destKey: RedisCommandArgument, srcKeys: RedisCommandArgument, options: MergeStoreOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destKey.asInstanceOf[js.Any], srcKeys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
  
  trait MergeStoreOptions extends StObject {
    
    var COMPRESSION: js.UndefOr[Double] = js.undefined
  }
  object MergeStoreOptions {
    
    inline def apply(): MergeStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeStoreOptions]
    }
    
    extension [Self <: MergeStoreOptions](x: Self) {
      
      inline def setCOMPRESSION(value: Double): Self = StObject.set(x, "COMPRESSION", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSIONUndefined: Self = StObject.set(x, "COMPRESSION", js.undefined)
    }
  }
}
