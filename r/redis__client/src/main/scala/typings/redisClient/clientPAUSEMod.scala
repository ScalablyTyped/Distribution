package typings.redisClient

import typings.node.bufferMod.global.Buffer
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.ALL
import typings.redisClient.redisClientStrings.OK
import typings.redisClient.redisClientStrings.WRITE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientPAUSEMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLIENT_PAUSE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(timeout: Double): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(timeout.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(timeout: Double, mode: WRITE | ALL): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(timeout.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK | Buffer]
}
