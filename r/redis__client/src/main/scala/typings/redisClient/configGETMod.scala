package typings.redisClient

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configGETMod {
  
  @JSImport("@redis/client/dist/lib/commands/CONFIG_GET", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(parameter: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(parameter.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: js.Array[RedisCommandArgument]): Record[String, RedisCommandArgument] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Record[String, RedisCommandArgument]]
}
