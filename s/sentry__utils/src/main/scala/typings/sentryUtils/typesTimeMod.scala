package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTimeMod {
  
  @JSImport("@sentry/utils/types/time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/utils/types/time", "browserPerformanceTimeOrigin")
  @js.native
  val browserPerformanceTimeOrigin: js.UndefOr[Double] = js.native
  
  @JSImport("@sentry/utils/types/time", "_browserPerformanceTimeOriginMode")
  @js.native
  def browserPerformanceTimeOriginMode: String = js.native
  
  inline def browserPerformanceTimeOriginMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_browserPerformanceTimeOriginMode")(x.asInstanceOf[js.Any])
  
  inline def dateTimestampInSeconds(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dateTimestampInSeconds")().asInstanceOf[Double]
  
  inline def timestampInSeconds(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampInSeconds")().asInstanceOf[Double]
  
  inline def timestampWithMs(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampWithMs")().asInstanceOf[Double]
  
  @JSImport("@sentry/utils/types/time", "usingPerformanceAPI")
  @js.native
  val usingPerformanceAPI: Boolean = js.native
}
