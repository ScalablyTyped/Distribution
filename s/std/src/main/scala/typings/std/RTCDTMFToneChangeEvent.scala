package typings.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events sent to indicate that DTMF tones have started or finished playing. This interface is used by the tonechange event. */
@js.native
trait RTCDTMFToneChangeEvent extends Event {
  val tone: java.lang.String = js.native
}

@JSGlobal("RTCDTMFToneChangeEvent")
@js.native
class RTCDTMFToneChangeEventCls protected () extends RTCDTMFToneChangeEvent {
  def this(`type`: java.lang.String, eventInitDict: RTCDTMFToneChangeEventInit) = this()
}

@JSGlobal("RTCDTMFToneChangeEvent")
@js.native
object RTCDTMFToneChangeEvent
  extends Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ RTCDTMFToneChangeEventInit, 
      RTCDTMFToneChangeEvent
    ]

