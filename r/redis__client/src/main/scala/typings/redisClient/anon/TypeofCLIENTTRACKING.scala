package typings.redisClient.anon

import typings.node.bufferMod.global.Buffer
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCLIENTTRACKING extends StObject {
  
  def transformArguments[M /* <: Boolean */](mode: M): RedisCommandArguments = js.native
  @JSName("transformArguments")
  def transformArguments_true[M /* <: Boolean */](
    mode: M,
    options: /* import warning: importer.ImportType#apply Failed type conversion: M extends true ? @redis/client.@redis/client/dist/lib/commands/CLIENT_TRACKING.ClientTrackingOptions : undefined */ js.Any
  ): RedisCommandArguments = js.native
  
  def transformReply(): OK | Buffer = js.native
}
