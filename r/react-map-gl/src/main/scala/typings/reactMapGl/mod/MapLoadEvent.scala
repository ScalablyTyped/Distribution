package typings.reactMapGl.mod

import typings.mapboxGl.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLoadEvent extends StObject {
  
  var target: Map
  
  var `type`: String
}
object MapLoadEvent {
  
  @scala.inline
  def apply(target: Map, `type`: String): MapLoadEvent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLoadEvent]
  }
  
  @scala.inline
  implicit class MapLoadEventMutableBuilder[Self <: MapLoadEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: Map): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
