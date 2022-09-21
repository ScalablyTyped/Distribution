package typings.reactCalendarTimeline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TodayMarkerProps
  extends StObject
     with MarkerProps {
  
  var interval: js.UndefOr[Double] = js.undefined
}
object TodayMarkerProps {
  
  inline def apply(date: js.Date | Double): TodayMarkerProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[TodayMarkerProps]
  }
  
  extension [Self <: TodayMarkerProps](x: Self) {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
