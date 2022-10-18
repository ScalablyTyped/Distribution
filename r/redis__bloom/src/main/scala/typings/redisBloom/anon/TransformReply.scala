package typings.redisBloom.anon

import typings.redisBloom.distCommandsBloomInsertMod.InsertOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformReply extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String, items: String): RedisCommandArguments = js.native
  def transformArguments(key: String, items: String, options: InsertOptions): js.Array[String] = js.native
  def transformArguments(key: String, items: String, options: typings.redisBloom.distCommandsCuckooMod.InsertOptions): RedisCommandArguments = js.native
  def transformArguments(key: String, items: js.Array[String]): RedisCommandArguments = js.native
  def transformArguments(key: String, items: js.Array[String], options: InsertOptions): js.Array[String] = js.native
  def transformArguments(
    key: String,
    items: js.Array[String],
    options: typings.redisBloom.distCommandsCuckooMod.InsertOptions
  ): RedisCommandArguments = js.native
  @JSName("transformArguments")
  def transformArguments_Array(key: String, items: String): js.Array[String] = js.native
  @JSName("transformArguments")
  def transformArguments_Array(key: String, items: js.Array[String]): js.Array[String] = js.native
  
  def transformReply(reply: js.Array[Double]): js.Array[Boolean] = js.native
}
