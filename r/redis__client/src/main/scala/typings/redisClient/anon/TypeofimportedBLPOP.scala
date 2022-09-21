package typings.redisClient.anon

import typings.redisClient.blpopMod.BLPopRawReply
import typings.redisClient.blpopMod.BLPopReply
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedBLPOP extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(keys: js.Array[RedisCommandArgument], timeout: Double): RedisCommandArguments = js.native
  def transformArguments(keys: RedisCommandArgument, timeout: Double): RedisCommandArguments = js.native
  
  def transformReply(reply: BLPopRawReply): BLPopReply = js.native
}
