package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SpeechSynthesisEvent interface of the Web Speech API contains information about the current state of SpeechSynthesisUtterance objects that have been processed in the speech service. */
@js.native
trait SpeechSynthesisEvent extends Event {
  val charIndex: scala.Double = js.native
  val elapsedTime: scala.Double = js.native
  val name: java.lang.String = js.native
  val utterance: SpeechSynthesisUtterance = js.native
}

@JSGlobal("SpeechSynthesisEvent")
@js.native
class SpeechSynthesisEventCls () extends SpeechSynthesisEvent

@JSGlobal("SpeechSynthesisEvent")
@js.native
object SpeechSynthesisEvent
  extends org.scalablytyped.runtime.Instantiable0[SpeechSynthesisEvent]

