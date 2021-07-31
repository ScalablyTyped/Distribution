package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDtmfSenderEventMap extends StObject {
  
  var tonechange: RTCDTMFToneChangeEvent
}
object RTCDtmfSenderEventMap {
  
  @scala.inline
  def apply(tonechange: RTCDTMFToneChangeEvent): RTCDtmfSenderEventMap = {
    val __obj = js.Dynamic.literal(tonechange = tonechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtmfSenderEventMap]
  }
  
  @scala.inline
  implicit class RTCDtmfSenderEventMapMutableBuilder[Self <: RTCDtmfSenderEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTonechange(value: RTCDTMFToneChangeEvent): Self = StObject.set(x, "tonechange", value.asInstanceOf[js.Any])
  }
}
