package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Speech API interface is the controller interface for the speech service; this can be used to retrieve information about the synthesis voices available on the device, start and pause speech, and other commands besides. */
@js.native
trait SpeechSynthesis
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_voiceschanged")
  def addEventListener(`type`: "voiceschanged", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_voiceschanged")
  def addEventListener(
    `type`: "voiceschanged",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_voiceschanged")
  def addEventListener(
    `type`: "voiceschanged",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def cancel(): Unit = js.native
  
  /* standard dom */
  def getVoices(): js.Array[SpeechSynthesisVoice] = js.native
  
  /* standard dom */
  var onvoiceschanged: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  def pause(): Unit = js.native
  
  /* standard dom */
  val paused: scala.Boolean = js.native
  
  /* standard dom */
  val pending: scala.Boolean = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_voiceschanged")
  def removeEventListener(`type`: "voiceschanged", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_voiceschanged")
  def removeEventListener(
    `type`: "voiceschanged",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_voiceschanged")
  def removeEventListener(
    `type`: "voiceschanged",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def resume(): Unit = js.native
  
  /* standard dom */
  def speak(utterance: SpeechSynthesisUtterance): Unit = js.native
  
  /* standard dom */
  val speaking: scala.Boolean = js.native
}
