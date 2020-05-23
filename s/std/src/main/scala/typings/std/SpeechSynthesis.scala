package typings.std

import typings.std.stdStrings.voiceschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Web Speech API interface is the controller interface for the speech service; this can be used to retrieve information about the synthesis voices available on the device, start and pause speech, and other commands besides. */
@js.native
trait SpeechSynthesis extends EventTarget {
  var onvoiceschanged: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  val paused: scala.Boolean = js.native
  val pending: scala.Boolean = js.native
  val speaking: scala.Boolean = js.native
  @JSName("addEventListener")
  def addEventListener_voiceschanged(`type`: voiceschanged, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def cancel(): Unit = js.native
  def getVoices(): js.Array[SpeechSynthesisVoice] = js.native
  def pause(): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(`type`: voiceschanged, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  def resume(): Unit = js.native
  def speak(utterance: SpeechSynthesisUtterance): Unit = js.native
}

