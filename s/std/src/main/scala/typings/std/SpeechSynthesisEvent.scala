package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Speech API interface contains information about the current state of SpeechSynthesisUtterance objects that have been processed in the speech service. */
@js.native
trait SpeechSynthesisEvent
  extends StObject
     with Event {
  
  val charIndex: Double = js.native
  
  val charLength: Double = js.native
  
  val elapsedTime: Double = js.native
  
  val name: java.lang.String = js.native
  
  val utterance: SpeechSynthesisUtterance = js.native
}
