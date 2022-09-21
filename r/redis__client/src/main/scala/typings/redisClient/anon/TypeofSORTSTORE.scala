package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.SortOptions
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSORTSTORE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(source: String, destination: String): RedisCommandArguments = js.native
  def transformArguments(source: String, destination: String, options: SortOptions): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
