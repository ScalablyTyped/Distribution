package typings.std

import typings.std.stdStrings.ended
import typings.std.stdStrings.mute
import typings.std.stdStrings.unmute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single media track within a stream; typically, these are audio or video tracks, but other track types may exist as well.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack)
  */
@js.native
trait MediaStreamTrack
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(`type`: mute, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(`type`: unmute, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/applyConstraints) */
  /* standard dom */
  def applyConstraints(): js.Promise[Unit] = js.native
  def applyConstraints(constraints: MediaTrackConstraints): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/contentHint) */
  /* standard dom */
  var contentHint: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/enabled) */
  /* standard dom */
  var enabled: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/getCapabilities) */
  /* standard dom */
  def getCapabilities(): MediaTrackCapabilities = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/getConstraints) */
  /* standard dom */
  def getConstraints(): MediaTrackConstraints = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/getSettings) */
  /* standard dom */
  def getSettings(): MediaTrackSettings = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/id) */
  /* standard dom */
  val id: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/kind) */
  /* standard dom */
  val kind: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/label) */
  /* standard dom */
  val label: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/muted) */
  /* standard dom */
  val muted: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/ended_event) */
  /* standard dom */
  var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/mute_event) */
  /* standard dom */
  var onmute: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/unmute_event) */
  /* standard dom */
  var onunmute: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/readyState) */
  /* standard dom */
  val readyState: MediaStreamTrackState = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(`type`: mute, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(`type`: unmute, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/stop) */
  /* standard dom */
  def stop(): Unit = js.native
}
