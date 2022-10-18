package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.SortedSetSide
import typings.redisClient.distLibCommandsGenericTransformersMod.ZMPopOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsZmpopMod.ZMPopRawReply
import typings.redisClient.distLibCommandsZmpopMod.ZMPopReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofZMPOP extends StObject {
  
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  def transformArguments(keys: js.Array[RedisCommandArgument], side: SortedSetSide): RedisCommandArguments = js.native
  def transformArguments(keys: js.Array[RedisCommandArgument], side: SortedSetSide, options: ZMPopOptions): RedisCommandArguments = js.native
  def transformArguments(keys: RedisCommandArgument, side: SortedSetSide): RedisCommandArguments = js.native
  def transformArguments(keys: RedisCommandArgument, side: SortedSetSide, options: ZMPopOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: ZMPopRawReply): ZMPopReply = js.native
}
