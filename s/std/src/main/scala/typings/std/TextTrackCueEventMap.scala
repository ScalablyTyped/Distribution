package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackCueEventMap extends StObject {
  
  var enter: Event = js.native
  
  var exit: Event = js.native
}
object TextTrackCueEventMap {
  
  @scala.inline
  def apply(enter: Event, exit: Event): TextTrackCueEventMap = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackCueEventMap]
  }
  
  @scala.inline
  implicit class TextTrackCueEventMapMutableBuilder[Self <: TextTrackCueEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnter(value: Event): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: Event): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
  }
}
