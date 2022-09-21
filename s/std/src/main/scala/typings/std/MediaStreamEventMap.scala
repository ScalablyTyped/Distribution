package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamEventMap extends StObject {
  
  /* standard dom */
  var addtrack: MediaStreamTrackEvent
  
  /* standard dom */
  var removetrack: MediaStreamTrackEvent
}
object MediaStreamEventMap {
  
  inline def apply(addtrack: MediaStreamTrackEvent, removetrack: MediaStreamTrackEvent): MediaStreamEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamEventMap]
  }
  
  extension [Self <: MediaStreamEventMap](x: Self) {
    
    inline def setAddtrack(value: MediaStreamTrackEvent): Self = StObject.set(x, "addtrack", value.asInstanceOf[js.Any])
    
    inline def setRemovetrack(value: MediaStreamTrackEvent): Self = StObject.set(x, "removetrack", value.asInstanceOf[js.Any])
  }
}
