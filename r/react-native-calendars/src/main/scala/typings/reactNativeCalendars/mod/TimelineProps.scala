package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineProps extends StObject {
  
  /**
    *  End time of the timeline. Default = 24
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    *  Handler whick gets executed when on event tap. Default = undefined
    */
  var eventTapped: js.UndefOr[js.Function1[/* event */ TimelineEvent, Any]] = js.undefined
  
  /**
    *  Array of events. Default = []
    */
  var events: js.UndefOr[js.Array[TimelineEvent]] = js.undefined
  
  /**
    *  Time format. Default = true
    */
  var format24h: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Start time of the timeline. Default = 0
    */
  var start: js.UndefOr[Double] = js.undefined
}
object TimelineProps {
  
  inline def apply(): TimelineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineProps]
  }
  
  extension [Self <: TimelineProps](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEventTapped(value: /* event */ TimelineEvent => Any): Self = StObject.set(x, "eventTapped", js.Any.fromFunction1(value))
    
    inline def setEventTappedUndefined: Self = StObject.set(x, "eventTapped", js.undefined)
    
    inline def setEvents(value: js.Array[TimelineEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: TimelineEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFormat24h(value: Boolean): Self = StObject.set(x, "format24h", value.asInstanceOf[js.Any])
    
    inline def setFormat24hUndefined: Self = StObject.set(x, "format24h", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
