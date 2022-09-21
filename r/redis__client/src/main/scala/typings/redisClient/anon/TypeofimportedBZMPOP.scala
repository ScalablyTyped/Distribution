package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.SortedSetSide
import typings.redisClient.genericTransformersMod.ZMPopOptions
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.zmpopMod.ZMPopRawReply
import typings.redisClient.zmpopMod.ZMPopReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedBZMPOP extends StObject {
  
  val FIRST_KEY_INDEX: /* 3 */ Double = js.native
  
  def transformArguments(timeout: Double, keys: js.Array[RedisCommandArgument], side: SortedSetSide): RedisCommandArguments = js.native
  def transformArguments(timeout: Double, keys: js.Array[RedisCommandArgument], side: SortedSetSide, options: ZMPopOptions): RedisCommandArguments = js.native
  def transformArguments(timeout: Double, keys: RedisCommandArgument, side: SortedSetSide): RedisCommandArguments = js.native
  def transformArguments(timeout: Double, keys: RedisCommandArgument, side: SortedSetSide, options: ZMPopOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: ZMPopRawReply): ZMPopReply = js.native
}
