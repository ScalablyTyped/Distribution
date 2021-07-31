package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map extends StObject {
  
  var map: js.Any
  
  var originalEvent: typings.std.Event
  
  var overlay: js.Any
}
object Map {
  
  @scala.inline
  def apply(map: js.Any, originalEvent: typings.std.Event, overlay: js.Any): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  @scala.inline
  implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlay(value: js.Any): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
  }
}
