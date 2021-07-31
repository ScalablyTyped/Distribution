package typings.reactCalendarTimeline.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TodayMarkerProps
  extends StObject
     with MarkerProps {
  
  var interval: js.UndefOr[Double] = js.undefined
}
object TodayMarkerProps {
  
  @scala.inline
  def apply(date: Date | Double): TodayMarkerProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[TodayMarkerProps]
  }
  
  @scala.inline
  implicit class TodayMarkerPropsMutableBuilder[Self <: TodayMarkerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
