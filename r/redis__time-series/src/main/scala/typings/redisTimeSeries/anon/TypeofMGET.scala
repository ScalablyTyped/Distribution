package typings.redisTimeSeries.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisTimeSeries.distCommandsMgetMod.MGetOptions
import typings.redisTimeSeries.distCommandsMgetMod.MGetRawReply
import typings.redisTimeSeries.distCommandsMgetMod.MGetReply
import typings.redisTimeSeries.distCommandsMod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMGET extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(filter: Filter): RedisCommandArguments = js.native
  def transformArguments(filter: Filter, options: MGetOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: MGetRawReply): js.Array[MGetReply] = js.native
}
