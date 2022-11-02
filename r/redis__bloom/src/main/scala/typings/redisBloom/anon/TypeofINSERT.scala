package typings.redisBloom.anon

import typings.redisBloom.distCommandsBloomInsertMod.InsertOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofINSERT extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String, items: js.Array[RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(key: String, items: js.Array[RedisCommandArgument], options: InsertOptions): RedisCommandArguments = js.native
  def transformArguments(key: String, items: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(key: String, items: RedisCommandArgument, options: InsertOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[Double]): js.Array[Boolean] = js.native
}
