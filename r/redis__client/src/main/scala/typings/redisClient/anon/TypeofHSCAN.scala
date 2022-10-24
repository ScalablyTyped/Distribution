package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.ScanOptions
import typings.redisClient.distLibCommandsHscanMod.HScanRawReply
import typings.redisClient.distLibCommandsHscanMod.HScanReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHSCAN extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, cursor: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, cursor: Double, options: ScanOptions): RedisCommandArguments = js.native
  
  def transformReply(param0: HScanRawReply): HScanReply = js.native
}
