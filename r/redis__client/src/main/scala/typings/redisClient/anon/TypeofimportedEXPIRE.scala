package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.GT
import typings.redisClient.redisClientStrings.LT
import typings.redisClient.redisClientStrings.XX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedEXPIRE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument, seconds: Double): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    seconds: Double,
    mode: typings.redisClient.redisClientStrings.NX | XX | GT | LT
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: Double): Boolean = js.native
}
