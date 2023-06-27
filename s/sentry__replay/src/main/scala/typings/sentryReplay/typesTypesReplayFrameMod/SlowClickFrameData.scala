package typings.sentryReplay.typesTypesReplayFrameMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlowClickFrameData
  extends StObject
     with BaseDomFrameData {
  
  var clickCount: Double
  
  var endReason: String
  
  var route: js.UndefOr[String] = js.undefined
  
  var timeAfterClickMs: Double
  
  var url: String
}
object SlowClickFrameData {
  
  inline def apply(clickCount: Double, endReason: String, timeAfterClickMs: Double, url: String): SlowClickFrameData = {
    val __obj = js.Dynamic.literal(clickCount = clickCount.asInstanceOf[js.Any], endReason = endReason.asInstanceOf[js.Any], timeAfterClickMs = timeAfterClickMs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlowClickFrameData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlowClickFrameData] (val x: Self) extends AnyVal {
    
    inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setEndReason(value: String): Self = StObject.set(x, "endReason", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setTimeAfterClickMs(value: Double): Self = StObject.set(x, "timeAfterClickMs", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
