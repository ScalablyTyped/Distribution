package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRecorder
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(`type`: "error", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_resume")
  def addEventListener(`type`: "resume", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_dataavailable")
  def addEventListener(`type`: "dataavailable", listener: js.ThisFunction1[/* this */ this.type, /* ev */ BlobEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_start")
  def addEventListener(`type`: "start", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pause")
  def addEventListener(`type`: "pause", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_stop")
  def addEventListener(`type`: "stop", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_start")
  def addEventListener(
    `type`: "start",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_resume")
  def addEventListener(
    `type`: "resume",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pause")
  def addEventListener(
    `type`: "pause",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_dataavailable")
  def addEventListener(
    `type`: "dataavailable",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BlobEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_stop")
  def addEventListener(
    `type`: "stop",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_resume")
  def addEventListener(
    `type`: "resume",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_stop")
  def addEventListener(
    `type`: "stop",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_dataavailable")
  def addEventListener(
    `type`: "dataavailable",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BlobEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pause")
  def addEventListener(
    `type`: "pause",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_start")
  def addEventListener(
    `type`: "start",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val audioBitsPerSecond: Double = js.native
  
  /* standard dom */
  val mimeType: java.lang.String = js.native
  
  /* standard dom */
  var ondataavailable: (js.ThisFunction1[/* this */ this.type, /* ev */ BlobEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onresume: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onstop: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  def pause(): Unit = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_resume")
  def removeEventListener(`type`: "resume", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pause")
  def removeEventListener(`type`: "pause", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_stop")
  def removeEventListener(`type`: "stop", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_dataavailable")
  def removeEventListener(`type`: "dataavailable", listener: js.ThisFunction1[/* this */ this.type, /* ev */ BlobEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(`type`: "error", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_start")
  def removeEventListener(`type`: "start", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pause")
  def removeEventListener(
    `type`: "pause",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_stop")
  def removeEventListener(
    `type`: "stop",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_dataavailable")
  def removeEventListener(
    `type`: "dataavailable",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BlobEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_start")
  def removeEventListener(
    `type`: "start",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_resume")
  def removeEventListener(
    `type`: "resume",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_start")
  def removeEventListener(
    `type`: "start",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pause")
  def removeEventListener(
    `type`: "pause",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_resume")
  def removeEventListener(
    `type`: "resume",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_dataavailable")
  def removeEventListener(
    `type`: "dataavailable",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BlobEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_stop")
  def removeEventListener(
    `type`: "stop",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def requestData(): Unit = js.native
  
  /* standard dom */
  def resume(): Unit = js.native
  
  /* standard dom */
  def start(): Unit = js.native
  def start(timeslice: Double): Unit = js.native
  
  /* standard dom */
  val state: RecordingState = js.native
  
  /* standard dom */
  def stop(): Unit = js.native
  
  /* standard dom */
  val stream: MediaStream = js.native
  
  /* standard dom */
  val videoBitsPerSecond: Double = js.native
}
