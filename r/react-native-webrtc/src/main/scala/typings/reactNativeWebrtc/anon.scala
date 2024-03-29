package typings.reactNativeWebrtc

import typings.reactNativeWebrtc.mod.RTCIceConnectionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IceConnectionState extends StObject {
    
    var iceConnectionState: RTCIceConnectionState
  }
  object IceConnectionState {
    
    inline def apply(iceConnectionState: RTCIceConnectionState): IceConnectionState = {
      val __obj = js.Dynamic.literal(iceConnectionState = iceConnectionState.asInstanceOf[js.Any])
      __obj.asInstanceOf[IceConnectionState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IceConnectionState] (val x: Self) extends AnyVal {
      
      inline def setIceConnectionState(value: RTCIceConnectionState): Self = StObject.set(x, "iceConnectionState", value.asInstanceOf[js.Any])
    }
  }
}
