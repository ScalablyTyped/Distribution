package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamTrackEventInit extends EventInit {
  
  var track: MediaStreamTrack = js.native
}
object MediaStreamTrackEventInit {
  
  @scala.inline
  def apply(track: MediaStreamTrack): MediaStreamTrackEventInit = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackEventInit]
  }
  
  @scala.inline
  implicit class MediaStreamTrackEventInitMutableBuilder[Self <: MediaStreamTrackEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrack(value: MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
