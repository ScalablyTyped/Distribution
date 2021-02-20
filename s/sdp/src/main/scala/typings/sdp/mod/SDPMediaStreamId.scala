package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPMediaStreamId extends StObject {
  
  var stream: String = js.native
  
  var track: String = js.native
}
object SDPMediaStreamId {
  
  @scala.inline
  def apply(stream: String, track: String): SDPMediaStreamId = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPMediaStreamId]
  }
  
  @scala.inline
  implicit class SDPMediaStreamIdMutableBuilder[Self <: SDPMediaStreamId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: String): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
