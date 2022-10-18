package typings.redisTimeSeries

import typings.redisTimeSeries.redisTimeSeriesStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsDeleteruleMod {
  
  @JSImport("@redis/time-series/dist/commands/DELETERULE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/DELETERULE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(sourceKey: String, destinationKey: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(sourceKey.asInstanceOf[js.Any], destinationKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
