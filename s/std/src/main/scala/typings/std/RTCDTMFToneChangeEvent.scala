package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events sent to indicate that DTMF tones have started or finished playing. This interface is used by the tonechange event. */
@js.native
trait RTCDTMFToneChangeEvent extends Event {
  val tone: java.lang.String = js.native
}

