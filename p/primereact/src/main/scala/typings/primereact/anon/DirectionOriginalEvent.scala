package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionOriginalEvent extends StObject {
  
  var direction: String = js.native
  
  var originalEvent: typings.std.Event = js.native
  
  var source: js.Array[_] = js.native
  
  var target: js.Array[_] = js.native
}
object DirectionOriginalEvent {
  
  @scala.inline
  def apply(direction: String, originalEvent: typings.std.Event, source: js.Array[_], target: js.Array[_]): DirectionOriginalEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionOriginalEvent]
  }
  
  @scala.inline
  implicit class DirectionOriginalEventMutableBuilder[Self <: DirectionOriginalEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Array[_]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVarargs(value: js.Any*): Self = StObject.set(x, "source", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[_]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: js.Any*): Self = StObject.set(x, "target", js.Array(value :_*))
  }
}
