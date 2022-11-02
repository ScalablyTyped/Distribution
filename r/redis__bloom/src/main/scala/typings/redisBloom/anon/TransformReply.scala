package typings.redisBloom.anon

import typings.redisBloom.distCommandsCuckooMod.InsertOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformReply extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String, items: String): RedisCommandArguments = js.native
  def transformArguments(key: String, items: String, options: InsertOptions): RedisCommandArguments = js.native
  def transformArguments(key: String, items: js.Array[RedisCommandArgument | String]): RedisCommandArguments = js.native
  def transformArguments(
    key: String,
    items: js.Array[RedisCommandArgument],
    options: typings.redisBloom.distCommandsBloomInsertMod.InsertOptions
  ): RedisCommandArguments = js.native
  def transformArguments(key: String, items: js.Array[String], options: InsertOptions): RedisCommandArguments = js.native
  def transformArguments(key: String, items: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(
    key: String,
    items: RedisCommandArgument,
    options: typings.redisBloom.distCommandsBloomInsertMod.InsertOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[Double]): js.Array[Boolean] = js.native
}
