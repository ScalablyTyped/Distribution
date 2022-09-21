package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofACLSETUSER extends StObject {
  
  def transformArguments(username: RedisCommandArgument, rule: js.Array[RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(username: RedisCommandArgument, rule: RedisCommandArgument): RedisCommandArguments = js.native
  
  def transformReply(): RedisCommandArgument = js.native
}
