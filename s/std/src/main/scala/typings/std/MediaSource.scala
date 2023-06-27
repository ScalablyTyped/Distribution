package typings.std

import typings.std.stdStrings.sourceclose
import typings.std.stdStrings.sourceended
import typings.std.stdStrings.sourceopen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Media Source Extensions API interface represents a source of media data for an HTMLMediaElement object. A MediaSource object can be attached to a HTMLMediaElement to be played in the user agent.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource)
  */
@js.native
trait MediaSource
  extends StObject
     with EventTarget
     with MediaProvider {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/activeSourceBuffers) */
  /* standard dom */
  val activeSourceBuffers: SourceBufferList = js.native
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_sourceclose(`type`: sourceclose, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceclose(
    `type`: sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceclose(
    `type`: sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceended(`type`: sourceended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceended(
    `type`: sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceended(
    `type`: sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceopen(`type`: sourceopen, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceopen(
    `type`: sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceopen(
    `type`: sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/addSourceBuffer) */
  /* standard dom */
  def addSourceBuffer(`type`: java.lang.String): SourceBuffer = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/clearLiveSeekableRange) */
  /* standard dom */
  def clearLiveSeekableRange(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/duration) */
  /* standard dom */
  var duration: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/endOfStream) */
  /* standard dom */
  def endOfStream(): Unit = js.native
  def endOfStream(error: EndOfStreamError): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceclose_event) */
  /* standard dom */
  var onsourceclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceended_event) */
  /* standard dom */
  var onsourceended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceopen_event) */
  /* standard dom */
  var onsourceopen: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/readyState) */
  /* standard dom */
  val readyState: ReadyState = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_sourceclose(`type`: sourceclose, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceclose(
    `type`: sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceclose(
    `type`: sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceended(`type`: sourceended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceended(
    `type`: sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceended(
    `type`: sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceopen(`type`: sourceopen, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceopen(
    `type`: sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceopen(
    `type`: sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/removeSourceBuffer) */
  /* standard dom */
  def removeSourceBuffer(sourceBuffer: SourceBuffer): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/setLiveSeekableRange) */
  /* standard dom */
  def setLiveSeekableRange(start: Double, end: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceBuffers) */
  /* standard dom */
  val sourceBuffers: SourceBufferList = js.native
}
