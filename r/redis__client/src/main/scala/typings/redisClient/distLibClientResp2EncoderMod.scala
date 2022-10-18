package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibClientResp2EncoderMod {
  
  @JSImport("@redis/client/dist/lib/client/RESP2/encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: RedisCommandArguments): js.Array[RedisCommandArgument] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[RedisCommandArgument]]
}
