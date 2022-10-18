package typings.redisClient.anon

import typings.redisClient.distLibCommandsBitcountMod.BitCountRange
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBITCOUNT extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, range: BitCountRange): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
