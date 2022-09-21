package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.lposMod.LPosOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLPOSCOUNT extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, element: RedisCommandArgument, count: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, element: RedisCommandArgument, count: Double, options: LPosOptions): RedisCommandArguments = js.native
  
  def transformReply(): js.Array[Double] = js.native
}
