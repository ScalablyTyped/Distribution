package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.SortOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedSORTRO extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String): RedisCommandArguments = js.native
  def transformArguments(key: String, options: SortOptions): RedisCommandArguments = js.native
  
  def transformReply(): js.Array[String] = js.native
}
