package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.GeoSearchBy
import typings.redisClient.distLibCommandsGenericTransformersMod.GeoSearchFrom
import typings.redisClient.distLibCommandsGenericTransformersMod.GeoSearchOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsGeosearchstoreMod {
  
  @JSImport("@redis/client/dist/lib/commands/GEOSEARCHSTORE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEOSEARCHSTORE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEOSEARCHSTORE", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(
    destination: RedisCommandArgument,
    source: RedisCommandArgument,
    from: GeoSearchFrom,
    by: GeoSearchBy
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destination.asInstanceOf[js.Any], source.asInstanceOf[js.Any], from.asInstanceOf[js.Any], by.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    destination: RedisCommandArgument,
    source: RedisCommandArgument,
    from: GeoSearchFrom,
    by: GeoSearchBy,
    options: GeoSearchStoreOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destination.asInstanceOf[js.Any], source.asInstanceOf[js.Any], from.asInstanceOf[js.Any], by.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait GeoSearchStoreOptions
    extends StObject
       with GeoSearchOptions {
    
    var STOREDIST: js.UndefOr[`true`] = js.undefined
  }
  object GeoSearchStoreOptions {
    
    inline def apply(): GeoSearchStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoSearchStoreOptions]
    }
    
    extension [Self <: GeoSearchStoreOptions](x: Self) {
      
      inline def setSTOREDIST(value: `true`): Self = StObject.set(x, "STOREDIST", value.asInstanceOf[js.Any])
      
      inline def setSTOREDISTUndefined: Self = StObject.set(x, "STOREDIST", js.undefined)
    }
  }
}
