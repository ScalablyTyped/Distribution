package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.ASYNC
import typings.redisClient.redisClientStrings.OK
import typings.redisClient.redisClientStrings.SYNC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFUNCTIONFLUSH extends StObject {
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(mode: ASYNC | SYNC): RedisCommandArguments = js.native
  
  def transformReply(): OK = js.native
}
