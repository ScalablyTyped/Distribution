package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDtmfSenderEventMap extends StObject {
  
  var tonechange: RTCDTMFToneChangeEvent
}
object RTCDtmfSenderEventMap {
  
  inline def apply(tonechange: RTCDTMFToneChangeEvent): RTCDtmfSenderEventMap = {
    val __obj = js.Dynamic.literal(tonechange = tonechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtmfSenderEventMap]
  }
  
  extension [Self <: RTCDtmfSenderEventMap](x: Self) {
    
    inline def setTonechange(value: RTCDTMFToneChangeEvent): Self = StObject.set(x, "tonechange", value.asInstanceOf[js.Any])
  }
}
