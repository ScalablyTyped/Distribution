package typings.std

import typings.std.stdStrings.voiceschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Web Speech API interface is the controller interface for the speech service; this can be used to retrieve information about the synthesis voices available on the device, start and pause speech, and other commands besides.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis)
  */
@js.native
trait SpeechSynthesis
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_voiceschanged(`type`: voiceschanged, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/cancel) */
  /* standard dom */
  def cancel(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/getVoices) */
  /* standard dom */
  def getVoices(): js.Array[SpeechSynthesisVoice] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/voiceschanged_event) */
  /* standard dom */
  var onvoiceschanged: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/pause) */
  /* standard dom */
  def pause(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/paused) */
  /* standard dom */
  val paused: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/pending) */
  /* standard dom */
  val pending: scala.Boolean = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(`type`: voiceschanged, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/resume) */
  /* standard dom */
  def resume(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/speak) */
  /* standard dom */
  def speak(utterance: SpeechSynthesisUtterance): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/speaking) */
  /* standard dom */
  val speaking: scala.Boolean = js.native
}
