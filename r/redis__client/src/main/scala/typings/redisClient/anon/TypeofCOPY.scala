package typings.redisClient.anon

import typings.redisClient.distLibCommandsCopyMod.CopyCommandOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCOPY extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(source: RedisCommandArgument, destination: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(source: RedisCommandArgument, destination: RedisCommandArgument, options: CopyCommandOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: Double): Boolean = js.native
}
