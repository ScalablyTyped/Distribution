package typings.redisBloom.anon

import typings.redisBloom.distCommandsBloomInfoMod.InfoRawReply
import typings.redisBloom.distCommandsBloomInfoMod.InfoReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformArguments extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String): js.Array[String] = js.native
  def transformArguments(key: RedisCommandArgument): RedisCommandArguments = js.native
  
  def transformReply(reply: InfoRawReply): InfoReply = js.native
  def transformReply(reply: typings.redisBloom.distCommandsCountMinSketchInfoMod.InfoRawReply): typings.redisBloom.distCommandsCountMinSketchInfoMod.InfoReply = js.native
  def transformReply(reply: typings.redisBloom.distCommandsCuckooInfoMod.InfoRawReply): typings.redisBloom.distCommandsCuckooInfoMod.InfoReply = js.native
  def transformReply(reply: typings.redisBloom.distCommandsTDigestInfoMod.InfoRawReply): typings.redisBloom.distCommandsTDigestInfoMod.InfoReply = js.native
  def transformReply(reply: typings.redisBloom.distCommandsTopKInfoMod.InfoRawReply): typings.redisBloom.distCommandsTopKInfoMod.InfoReply = js.native
}
