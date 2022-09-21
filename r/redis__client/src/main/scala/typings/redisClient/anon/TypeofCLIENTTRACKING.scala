package typings.redisClient.anon

import typings.node.bufferMod.global.Buffer
import typings.redisClient.clientTRACKINGMod.ClientTrackingOptions
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCLIENTTRACKING extends StObject {
  
  def transformArguments[M /* <: Boolean */](mode: M): RedisCommandArguments = js.native
  @JSName("transformArguments")
  def transformArguments_true[M /* <: Boolean */](mode: M, options: js.UndefOr[ClientTrackingOptions]): RedisCommandArguments = js.native
  
  def transformReply(): OK | Buffer = js.native
}
