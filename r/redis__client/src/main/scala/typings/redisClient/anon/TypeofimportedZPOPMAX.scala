package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.ZMember
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedZPOPMAX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[Any]): ZMember | Null = js.native
  def transformReply(reply: js.Tuple2[RedisCommandArgument, RedisCommandArgument]): ZMember | Null = js.native
}
