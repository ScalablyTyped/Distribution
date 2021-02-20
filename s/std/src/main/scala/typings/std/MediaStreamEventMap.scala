package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamEventMap extends StObject {
  
  var addtrack: MediaStreamTrackEvent = js.native
  
  var removetrack: MediaStreamTrackEvent = js.native
}
object MediaStreamEventMap {
  
  @scala.inline
  def apply(addtrack: MediaStreamTrackEvent, removetrack: MediaStreamTrackEvent): MediaStreamEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamEventMap]
  }
  
  @scala.inline
  implicit class MediaStreamEventMapMutableBuilder[Self <: MediaStreamEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddtrack(value: MediaStreamTrackEvent): Self = StObject.set(x, "addtrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovetrack(value: MediaStreamTrackEvent): Self = StObject.set(x, "removetrack", value.asInstanceOf[js.Any])
  }
}
