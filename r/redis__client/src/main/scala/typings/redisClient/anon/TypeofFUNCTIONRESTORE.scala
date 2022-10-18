package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.APPEND
import typings.redisClient.redisClientStrings.FLUSH
import typings.redisClient.redisClientStrings.OK
import typings.redisClient.redisClientStrings.REPLACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFUNCTIONRESTORE extends StObject {
  
  def transformArguments(dump: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(dump: RedisCommandArgument, mode: FLUSH | APPEND | REPLACE): RedisCommandArguments = js.native
  
  def transformReply(): OK = js.native
}
