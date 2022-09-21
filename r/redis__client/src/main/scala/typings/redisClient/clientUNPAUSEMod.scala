package typings.redisClient

import typings.node.bufferMod.global.Buffer
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientUNPAUSEMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLIENT_UNPAUSE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK | Buffer]
}
