package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.SortOptions
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSORTRO extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String): RedisCommandArguments = js.native
  def transformArguments(key: String, options: SortOptions): RedisCommandArguments = js.native
  
  def transformReply(): js.Array[String] = js.native
}
