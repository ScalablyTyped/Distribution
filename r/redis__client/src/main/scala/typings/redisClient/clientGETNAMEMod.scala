package typings.redisClient

import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientGETNAMEMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLIENT_GETNAME", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String | Null]
}
