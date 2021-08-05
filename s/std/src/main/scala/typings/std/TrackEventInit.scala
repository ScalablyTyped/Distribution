package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackEventInit
  extends StObject
     with EventInit {
  
  var track: js.UndefOr[TextTrack | Null] = js.undefined
}
object TrackEventInit {
  
  inline def apply(): TrackEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackEventInit]
  }
  
  extension [Self <: TrackEventInit](x: Self) {
    
    inline def setTrack(value: TextTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackNull: Self = StObject.set(x, "track", null)
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
