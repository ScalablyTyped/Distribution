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
  
  @scala.inline
  def apply(report: RTCStatsReport): RTCStatsEventInit = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCStatsEventInit]
  }
  
  @scala.inline
  implicit class RTCStatsEventInitMutableBuilder[Self <: RTCStatsEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReport(value: RTCStatsReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
  }
}
