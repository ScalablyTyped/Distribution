package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Speech API interface represents a speech request. It contains the content the speech service should read and information about how to read it (e.g. language, pitch and volume.) */
@js.native
trait SpeechSynthesisUtterance
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_mark")
  def addEventListener(
    `type`: "mark",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_end")
  def addEventListener(
    `type`: "end",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_boundary")
  def addEventListener(
    `type`: "boundary",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_resume")
  def addEventListener(
    `type`: "resume",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_start")
  def addEventListener(
    `type`: "start",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pause")
  def addEventListener(
    `type`: "pause",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_start")
  def addEventListener(
    `type`: "start",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_resume")
  def addEventListener(
    `type`: "resume",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pause")
  def addEventListener(
    `type`: "pause",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_mark")
  def addEventListener(
    `type`: "mark",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_boundary")
  def addEventListener(
    `type`: "boundary",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_end")
  def addEventListener(
    `type`: "end",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_mark")
  def addEventListener(
    `type`: "mark",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_resume")
  def addEventListener(
    `type`: "resume",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_end")
  def addEventListener(
    `type`: "end",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_boundary")
  def addEventListener(
    `type`: "boundary",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pause")
  def addEventListener(
    `type`: "pause",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_start")
  def addEventListener(
    `type`: "start",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  var lang: java.lang.String = js.native
  
  /* standard dom */
  var onboundary: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onend: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onmark: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onresume: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onstart: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]) | Null = js.native
  
  /* standard dom */
  var pitch: Double = js.native
  
  /* standard dom */
  var rate: Double = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_mark")
  def removeEventListener(
    `type`: "mark",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_resume")
  def removeEventListener(
    `type`: "resume",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pause")
  def removeEventListener(
    `type`: "pause",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_boundary")
  def removeEventListener(
    `type`: "boundary",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_end")
  def removeEventListener(
    `type`: "end",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_start")
  def removeEventListener(
    `type`: "start",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_end")
  def removeEventListener(
    `type`: "end",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pause")
  def removeEventListener(
    `type`: "pause",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_mark")
  def removeEventListener(
    `type`: "mark",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_start")
  def removeEventListener(
    `type`: "start",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_boundary")
  def removeEventListener(
    `type`: "boundary",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_resume")
  def removeEventListener(
    `type`: "resume",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_end")
  def removeEventListener(
    `type`: "end",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_mark")
  def removeEventListener(
    `type`: "mark",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_start")
  def removeEventListener(
    `type`: "start",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pause")
  def removeEventListener(
    `type`: "pause",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_boundary")
  def removeEventListener(
    `type`: "boundary",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_resume")
  def removeEventListener(
    `type`: "resume",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  var text: java.lang.String = js.native
  
  /* standard dom */
  var voice: SpeechSynthesisVoice | Null = js.native
  
  /* standard dom */
  var volume: Double = js.native
}
