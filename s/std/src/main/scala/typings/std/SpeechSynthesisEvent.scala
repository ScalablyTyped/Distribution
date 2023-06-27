package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Web Speech API interface contains information about the current state of SpeechSynthesisUtterance objects that have been processed in the speech service.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent)
  */
@js.native
trait SpeechSynthesisEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/charIndex) */
  /* standard dom */
  val charIndex: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/charLength) */
  /* standard dom */
  val charLength: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/elapsedTime) */
  /* standard dom */
  val elapsedTime: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/name) */
  /* standard dom */
  val name: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/utterance) */
  /* standard dom */
  val utterance: SpeechSynthesisUtterance = js.native
}
