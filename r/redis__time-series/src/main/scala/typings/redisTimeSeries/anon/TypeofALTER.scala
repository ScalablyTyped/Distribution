package typings.redisTimeSeries.anon

import typings.redisTimeSeries.distCommandsAlterMod.AlterOptions
import typings.redisTimeSeries.redisTimeSeriesStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofALTER extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String): js.Array[String] = js.native
  def transformArguments(key: String, options: AlterOptions): js.Array[String] = js.native
  
  def transformReply(): OK = js.native
}
