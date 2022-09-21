package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.ZMember
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.zrangebyscoreMod.ZRangeByScoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedZRANGEBYSC extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, min: String, max: String): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: String, max: String, options: ZRangeByScoreOptions): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: String, max: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: String, max: Double, options: ZRangeByScoreOptions): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: Double, max: String): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: Double, max: String, options: ZRangeByScoreOptions): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: Double, max: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: Double, max: Double, options: ZRangeByScoreOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[RedisCommandArgument]): js.Array[ZMember] = js.native
}
