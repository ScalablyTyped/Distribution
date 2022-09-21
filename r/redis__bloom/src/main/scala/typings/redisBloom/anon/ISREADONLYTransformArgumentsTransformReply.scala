package typings.redisBloom.anon

import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISREADONLYTransformArgumentsTransformReply extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String, items: String): RedisCommandArguments = js.native
  def transformArguments(key: String, items: js.Array[String]): RedisCommandArguments = js.native
  @JSName("transformArguments")
  def transformArguments_Array(key: String, item: String): js.Array[String] = js.native
  
  def transformReply(): Double = js.native
  @JSName("transformReply")
  def transformReply_Array(): js.Array[Double] = js.native
}
