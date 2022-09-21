package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.MAXLEN
import typings.redisClient.redisClientStrings.MINID
import typings.redisClient.xtrimMod.XTrimOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofXTRIM extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument, strategy: MAXLEN | MINID, threshold: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, strategy: MAXLEN | MINID, threshold: Double, options: XTrimOptions): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
