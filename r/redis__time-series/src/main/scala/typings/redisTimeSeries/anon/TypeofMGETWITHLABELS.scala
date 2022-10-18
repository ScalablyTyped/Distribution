package typings.redisTimeSeries.anon

import typings.redisTimeSeries.distCommandsMgetMod.MGetRawReply
import typings.redisTimeSeries.distCommandsMgetWITHLABELSMod.MGetWithLabelsOptions
import typings.redisTimeSeries.distCommandsMgetWITHLABELSMod.MGetWithLabelsReply
import typings.redisTimeSeries.distCommandsMod.Filter
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
