package typings.redisBloom.anon

import typings.redisBloom.distCommandsTDigestMod.CompressionOption
import typings.redisBloom.redisBloomStrings.OK
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedCREATE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, options: CompressionOption): RedisCommandArguments = js.native
  
  def transformReply(): OK = js.native
}
