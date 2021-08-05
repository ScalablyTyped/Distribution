package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCStatsEventInit
  extends StObject
     with EventInit {
  
  var report: RTCStatsReport
}
object RTCStatsEventInit {
  
  inline def apply(report: RTCStatsReport): RTCStatsEventInit = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCStatsEventInit]
  }
  
  extension [Self <: RTCStatsEventInit](x: Self) {
    
    inline def setReport(value: RTCStatsReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
  }
}
