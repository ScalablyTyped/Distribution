package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTrackListEventMap extends StObject {
  
  /* standard dom */
  var addtrack: TrackEvent
  
  /* standard dom */
  var change: Event
  
  /* standard dom */
  var removetrack: TrackEvent
}
object TextTrackListEventMap {
  
  inline def apply(addtrack: TrackEvent, change: Event, removetrack: TrackEvent): TextTrackListEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackListEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextTrackListEventMap] (val x: Self) extends AnyVal {
    
    inline def setAddtrack(value: TrackEvent): Self = StObject.set(x, "addtrack", value.asInstanceOf[js.Any])
    
    inline def setChange(value: Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setRemovetrack(value: TrackEvent): Self = StObject.set(x, "removetrack", value.asInstanceOf[js.Any])
  }
}
