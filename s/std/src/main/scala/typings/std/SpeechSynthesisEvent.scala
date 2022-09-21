package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Speech API interface contains information about the current state of SpeechSynthesisUtterance objects that have been processed in the speech service. */
@js.native
trait SpeechSynthesisEvent
  extends StObject
     with Event {
  
  /* standard dom */
  val charIndex: Double = js.native
  
  /* standard dom */
  val charLength: Double = js.native
  
  /* standard dom */
  val elapsedTime: Double = js.native
  
  /* standard dom */
  val name: java.lang.String = js.native
  
  /* standard dom */
  val utterance: SpeechSynthesisUtterance = js.native
}
