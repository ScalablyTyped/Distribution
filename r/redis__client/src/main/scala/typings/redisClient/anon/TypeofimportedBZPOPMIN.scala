package typings.redisClient.anon

import typings.redisClient.bzpopmaxMod.BZPopMaxReply
import typings.redisClient.bzpopmaxMod.ZMemberRawReply
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedBZPOPMIN extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: js.Array[RedisCommandArgument], timeout: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, timeout: Double): RedisCommandArguments = js.native
  
  def transformReply(reply: ZMemberRawReply): BZPopMaxReply | Null = js.native
}
