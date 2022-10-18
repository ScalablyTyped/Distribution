package typings.redisClient.anon

import typings.redisClient.distLibCommandsFunctionLOADMod.FunctionLoadOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFUNCTIONLOAD extends StObject {
  
  def transformArguments(code: String): RedisCommandArguments = js.native
  def transformArguments(code: String, options: FunctionLoadOptions): RedisCommandArguments = js.native
  
  def transformReply(): String = js.native
}
