package typings.redisClient.anon

import typings.redisClient.distLibCommandsBzpopmaxMod.BZPopMaxReply
import typings.redisClient.distLibCommandsBzpopmaxMod.ZMemberRawReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedBZPOPMAX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: js.Array[RedisCommandArgument], timeout: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, timeout: Double): RedisCommandArguments = js.native
  
  def transformReply(reply: ZMemberRawReply): BZPopMaxReply | Null = js.native
}
