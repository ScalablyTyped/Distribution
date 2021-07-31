package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTrackListEventMap extends StObject {
  
  var addtrack: TrackEvent
  
  var change: Event
  
  var removetrack: TrackEvent
}
object TextTrackListEventMap {
  
  @scala.inline
  def apply(addtrack: TrackEvent, change: Event, removetrack: TrackEvent): TextTrackListEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackListEventMap]
  }
  
  @scala.inline
  implicit class TextTrackListEventMapMutableBuilder[Self <: TextTrackListEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddtrack(value: TrackEvent): Self = StObject.set(x, "addtrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange(value: Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovetrack(value: TrackEvent): Self = StObject.set(x, "removetrack", value.asInstanceOf[js.Any])
  }
}
