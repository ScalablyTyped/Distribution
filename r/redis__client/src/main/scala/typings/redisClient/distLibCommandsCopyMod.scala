package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsCopyMod {
  
  @JSImport("@redis/client/dist/lib/commands/COPY", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/COPY", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(source: RedisCommandArgument, destination: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(source: RedisCommandArgument, destination: RedisCommandArgument, options: CopyCommandOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait CopyCommandOptions extends StObject {
    
    var destinationDb: js.UndefOr[Double] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
  }
  object CopyCommandOptions {
    
    inline def apply(): CopyCommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyCommandOptions]
    }
    
    extension [Self <: CopyCommandOptions](x: Self) {
      
      inline def setDestinationDb(value: Double): Self = StObject.set(x, "destinationDb", value.asInstanceOf[js.Any])
      
      inline def setDestinationDbUndefined: Self = StObject.set(x, "destinationDb", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    }
  }
}
