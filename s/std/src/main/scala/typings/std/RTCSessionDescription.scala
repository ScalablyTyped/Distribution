package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One end of a connection—or potential connection—and how it's configured. Each RTCSessionDescription consists of a description type indicating which part of the offer/answer negotiation process it describes and of the SDP descriptor of the session.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription)
  */
trait RTCSessionDescription extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/sdp) */
  /* standard dom */
  val sdp: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/toJSON) */
  /* standard dom */
  def toJSON(): Any
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/type) */
  /* standard dom */
  val `type`: RTCSdpType
}
object RTCSessionDescription {
  
  inline def apply(sdp: java.lang.String, toJSON: () => Any, `type`: RTCSdpType): RTCSessionDescription = {
    val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSessionDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCSessionDescription] (val x: Self) extends AnyVal {
    
    inline def setSdp(value: java.lang.String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setType(value: RTCSdpType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
