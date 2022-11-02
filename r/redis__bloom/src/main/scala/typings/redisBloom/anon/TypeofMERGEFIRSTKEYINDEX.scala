package typings.redisBloom.anon

import typings.redisBloom.distCommandsTDigestMergeMod.MergeOptions
import typings.redisBloom.redisBloomStrings.OK
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMERGEFIRSTKEYINDEX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(destKey: RedisCommandArgument, srcKeys: js.Array[RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(destKey: RedisCommandArgument, srcKeys: js.Array[RedisCommandArgument], options: MergeOptions): RedisCommandArguments = js.native
  def transformArguments(destKey: RedisCommandArgument, srcKeys: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(destKey: RedisCommandArgument, srcKeys: RedisCommandArgument, options: MergeOptions): RedisCommandArguments = js.native
  
  def transformReply(): OK = js.native
}
