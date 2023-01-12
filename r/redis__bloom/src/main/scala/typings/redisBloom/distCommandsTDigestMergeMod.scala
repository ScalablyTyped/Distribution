package typings.redisBloom

import typings.redisBloom.distCommandsTDigestMod.CompressionOption
import typings.redisBloom.redisBloomStrings.OK
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsTDigestMergeMod {
  
  @JSImport("@redis/bloom/dist/commands/t-digest/MERGE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/t-digest/MERGE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(destKey: RedisCommandArgument, srcKeys: js.Array[RedisCommandArgument]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destKey.asInstanceOf[js.Any], srcKeys.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(destKey: RedisCommandArgument, srcKeys: js.Array[RedisCommandArgument], options: MergeOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destKey.asInstanceOf[js.Any], srcKeys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(destKey: RedisCommandArgument, srcKeys: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destKey.asInstanceOf[js.Any], srcKeys.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(destKey: RedisCommandArgument, srcKeys: RedisCommandArgument, options: MergeOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destKey.asInstanceOf[js.Any], srcKeys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
  
  trait MergeOptions
    extends StObject
       with CompressionOption {
    
    var OVERRIDE: js.UndefOr[Boolean] = js.undefined
  }
  object MergeOptions {
    
    inline def apply(): MergeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MergeOptions] (val x: Self) extends AnyVal {
      
      inline def setOVERRIDE(value: Boolean): Self = StObject.set(x, "OVERRIDE", value.asInstanceOf[js.Any])
      
      inline def setOVERRIDEUndefined: Self = StObject.set(x, "OVERRIDE", js.undefined)
    }
  }
}
