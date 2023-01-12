package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDTMFSenderEventMap extends StObject {
  
  /* standard dom */
  var tonechange: RTCDTMFToneChangeEvent
}
object RTCDTMFSenderEventMap {
  
  inline def apply(tonechange: RTCDTMFToneChangeEvent): RTCDTMFSenderEventMap = {
    val __obj = js.Dynamic.literal(tonechange = tonechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDTMFSenderEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCDTMFSenderEventMap] (val x: Self) extends AnyVal {
    
    inline def setTonechange(value: RTCDTMFToneChangeEvent): Self = StObject.set(x, "tonechange", value.asInstanceOf[js.Any])
  }
}
