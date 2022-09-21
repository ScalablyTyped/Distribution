package typings.redisClient.anon

import typings.redisClient.helloMod.HelloOptions
import typings.redisClient.helloMod.HelloRawReply
import typings.redisClient.helloMod.HelloTransformedReply
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHELLO extends StObject {
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(options: HelloOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: HelloRawReply): HelloTransformedReply = js.native
}
