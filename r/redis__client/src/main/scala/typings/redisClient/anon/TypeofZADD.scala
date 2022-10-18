package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.ZMember
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsZaddMod.ZAddOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofZADD extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument, members: js.Array[ZMember]): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, members: js.Array[ZMember], options: ZAddOptions): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, members: ZMember): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, members: ZMember, options: ZAddOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: RedisCommandArgument): Double = js.native
}
