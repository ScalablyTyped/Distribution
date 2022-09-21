package typings.redisTimeSeries.anon

import typings.redisTimeSeries.commandsMod.Filter
import typings.redisTimeSeries.mgetMod.MGetRawReply
import typings.redisTimeSeries.mgetWITHLABELSMod.MGetWithLabelsOptions
import typings.redisTimeSeries.mgetWITHLABELSMod.MGetWithLabelsReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMGETWITHLABELS extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(filter: Filter): js.Array[String] = js.native
  def transformArguments(filter: Filter, options: MGetWithLabelsOptions): js.Array[String] = js.native
  
  def transformReply(reply: MGetRawReply): js.Array[MGetWithLabelsReply] = js.native
}
