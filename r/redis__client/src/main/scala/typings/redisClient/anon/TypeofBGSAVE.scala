package typings.redisClient.anon

import typings.redisClient.distLibCommandsBgsaveMod.BgSaveOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBGSAVE extends StObject {
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(options: BgSaveOptions): RedisCommandArguments = js.native
  
  def transformReply(): RedisCommandArgument = js.native
}
