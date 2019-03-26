package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechSynthesis extends EventTarget {
  var onvoiceschanged: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val paused: scala.Boolean = js.native
  val pending: scala.Boolean = js.native
  val speaking: scala.Boolean = js.native
  @JSName("addEventListener")
  def addEventListener_voiceschanged(
    `type`: stdLib.stdLibStrings.voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_voiceschanged(
    `type`: stdLib.stdLibStrings.voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_voiceschanged(
    `type`: stdLib.stdLibStrings.voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def cancel(): scala.Unit = js.native
  def getVoices(): js.Array[SpeechSynthesisVoice] = js.native
  def pause(): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(
    `type`: stdLib.stdLibStrings.voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(
    `type`: stdLib.stdLibStrings.voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(
    `type`: stdLib.stdLibStrings.voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def speak(utterance: SpeechSynthesisUtterance): scala.Unit = js.native
}

@JSGlobal("SpeechSynthesis")
@js.native
class SpeechSynthesisCls () extends SpeechSynthesis

@JSGlobal("SpeechSynthesis")
@js.native
object SpeechSynthesis
  extends org.scalablytyped.runtime.Instantiable0[SpeechSynthesis]

