package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsPingMod {
  
  @JSImport("@redis/client/dist/lib/commands/PING", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  
  inline def transformReply(): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument]
}
