package typings.redisClient.anon

import typings.redisClient.distLibCommandsHelloMod.HelloOptions
import typings.redisClient.distLibCommandsHelloMod.HelloRawReply
import typings.redisClient.distLibCommandsHelloMod.HelloTransformedReply
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHELLO extends StObject {
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(options: HelloOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: HelloRawReply): HelloTransformedReply = js.native
}
