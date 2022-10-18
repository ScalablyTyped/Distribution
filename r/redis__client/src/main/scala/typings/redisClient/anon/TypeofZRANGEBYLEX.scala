package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsZrangebylexMod.ZRangeByLexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofZRANGEBYLEX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, min: RedisCommandArgument, max: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    min: RedisCommandArgument,
    max: RedisCommandArgument,
    options: ZRangeByLexOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(): js.Array[RedisCommandArgument] = js.native
}
