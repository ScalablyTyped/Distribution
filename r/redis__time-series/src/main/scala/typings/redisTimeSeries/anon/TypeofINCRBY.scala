package typings.redisTimeSeries.anon

import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisTimeSeries.commandsMod.IncrDecrOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofINCRBY extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String, value: Double): RedisCommandArguments = js.native
  def transformArguments(key: String, value: Double, options: IncrDecrOptions): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
