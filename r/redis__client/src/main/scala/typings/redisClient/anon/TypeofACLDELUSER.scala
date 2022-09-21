package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofACLDELUSER extends StObject {
  
  def transformArguments(username: js.Array[RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(username: RedisCommandArgument): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
