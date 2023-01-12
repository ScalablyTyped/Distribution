package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var track: js.UndefOr[TextTrack | Null] = js.undefined
}
object TrackEventInit {
  
  inline def apply(): TrackEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackEventInit] (val x: Self) extends AnyVal {
    
    inline def setTrack(value: TextTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackNull: Self = StObject.set(x, "track", null)
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
