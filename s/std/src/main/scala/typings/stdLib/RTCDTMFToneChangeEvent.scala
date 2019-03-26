package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ RTCDTMFToneChangeEventInit, 
      RTCDTMFToneChangeEvent
    ]

