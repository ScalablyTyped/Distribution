package typings.redisClient.anon

import typings.node.bufferMod.global.Buffer
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.ALL
import typings.redisClient.redisClientStrings.OK
import typings.redisClient.redisClientStrings.WRITE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCLIENTPAUSE extends StObject {
  
  def transformArguments(timeout: Double): RedisCommandArguments = js.native
  def transformArguments(timeout: Double, mode: WRITE | ALL): RedisCommandArguments = js.native
  
  def transformReply(): OK | Buffer = js.native
}
