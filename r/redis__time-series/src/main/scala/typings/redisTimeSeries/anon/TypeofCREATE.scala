package typings.redisTimeSeries.anon

import typings.redisTimeSeries.distCommandsCreateMod.CreateOptions
import typings.redisTimeSeries.redisTimeSeriesStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCREATE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String): js.Array[String] = js.native
  def transformArguments(key: String, options: CreateOptions): js.Array[String] = js.native
  
  def transformReply(): OK = js.native
}
