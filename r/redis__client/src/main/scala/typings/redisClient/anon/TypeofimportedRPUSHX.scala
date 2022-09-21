package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedRPUSHX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument, element: js.Array[RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, element: RedisCommandArgument): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
