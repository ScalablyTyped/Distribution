package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsXtrimMod.XTrimOptions
import typings.redisClient.redisClientStrings.MAXLEN
import typings.redisClient.redisClientStrings.MINID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedXTRIM extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument, strategy: MAXLEN | MINID, threshold: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, strategy: MAXLEN | MINID, threshold: Double, options: XTrimOptions): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
