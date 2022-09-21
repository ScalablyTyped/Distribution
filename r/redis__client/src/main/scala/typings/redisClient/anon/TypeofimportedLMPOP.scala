package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.LMPopOptions
import typings.redisClient.genericTransformersMod.ListSide
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedLMPOP extends StObject {
  
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  def transformArguments(keys: js.Array[RedisCommandArgument], side: ListSide): RedisCommandArguments = js.native
  def transformArguments(keys: js.Array[RedisCommandArgument], side: ListSide, options: LMPopOptions): RedisCommandArguments = js.native
  def transformArguments(keys: RedisCommandArgument, side: ListSide): RedisCommandArguments = js.native
  def transformArguments(keys: RedisCommandArgument, side: ListSide, options: LMPopOptions): RedisCommandArguments = js.native
  
  def transformReply(): Null | (js.Tuple2[/* key */ String, /* elements */ js.Array[String]]) = js.native
}
