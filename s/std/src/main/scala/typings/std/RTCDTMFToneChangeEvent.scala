package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Events sent to indicate that DTMF tones have started or finished playing. This interface is used by the tonechange event.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFToneChangeEvent)
  */
@js.native
trait RTCDTMFToneChangeEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFToneChangeEvent/tone) */
  /* standard dom */
  val tone: java.lang.String = js.native
}
