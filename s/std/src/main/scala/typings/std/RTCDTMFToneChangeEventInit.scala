package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDTMFToneChangeEventInit
  extends StObject
     with EventInit {
  
  var tone: java.lang.String
}
object RTCDTMFToneChangeEventInit {
  
  @scala.inline
  def apply(tone: java.lang.String): RTCDTMFToneChangeEventInit = {
    val __obj = js.Dynamic.literal(tone = tone.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDTMFToneChangeEventInit]
  }
  
  @scala.inline
  implicit class RTCDTMFToneChangeEventInitMutableBuilder[Self <: RTCDTMFToneChangeEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTone(value: java.lang.String): Self = StObject.set(x, "tone", value.asInstanceOf[js.Any])
  }
}
