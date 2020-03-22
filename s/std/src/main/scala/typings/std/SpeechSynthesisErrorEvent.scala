package typings.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechSynthesisErrorEvent extends SpeechSynthesisEvent {
  val error: SpeechSynthesisErrorCode = js.native
}

@JSGlobal("SpeechSynthesisErrorEvent")
@js.native
object SpeechSynthesisErrorEvent
  extends Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ SpeechSynthesisErrorEventInit, 
      SpeechSynthesisErrorEvent
    ]

