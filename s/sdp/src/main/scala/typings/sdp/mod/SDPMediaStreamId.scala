package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPMediaStreamId extends StObject {
  
  var stream: String
  
  var track: String
}
object SDPMediaStreamId {
  
  inline def apply(stream: String, track: String): SDPMediaStreamId = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPMediaStreamId]
  }
  
  extension [Self <: SDPMediaStreamId](x: Self) {
    
    inline def setStream(value: String): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
