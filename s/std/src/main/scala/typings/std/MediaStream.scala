package typings.std

import typings.std.stdStrings.addtrack
import typings.std.stdStrings.removetrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A stream of media content. A stream consists of several tracks such as video or audio tracks. Each track is specified as an instance of MediaStreamTrack.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream)
  */
@js.native
trait MediaStream
  extends StObject
     with EventTarget
     with MediaProvider {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/active) */
  /* standard dom */
  val active: scala.Boolean = js.native
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/addTrack) */
  /* standard dom */
  def addTrack(track: MediaStreamTrack): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getAudioTracks) */
  /* standard dom */
  def getAudioTracks(): js.Array[MediaStreamTrack] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getTrackById) */
  /* standard dom */
  def getTrackById(trackId: java.lang.String): MediaStreamTrack | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getTracks) */
  /* standard dom */
  def getTracks(): js.Array[MediaStreamTrack] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getVideoTracks) */
  /* standard dom */
  def getVideoTracks(): js.Array[MediaStreamTrack] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/id) */
  /* standard dom */
  val id: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/addtrack_event) */
  /* standard dom */
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/removetrack_event) */
  /* standard dom */
  var onremovetrack: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/removeTrack) */
  /* standard dom */
  def removeTrack(track: MediaStreamTrack): Unit = js.native
}
