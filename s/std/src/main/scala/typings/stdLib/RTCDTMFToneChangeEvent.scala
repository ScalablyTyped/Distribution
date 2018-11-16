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
object RTCDTMFToneChangeEvent
  extends ScalablyTyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ RTCDTMFToneChangeEventInit, 
      RTCDTMFToneChangeEvent
    ]

