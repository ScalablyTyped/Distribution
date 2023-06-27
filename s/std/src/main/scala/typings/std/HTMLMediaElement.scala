package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdStrings._empty
import typings.std.stdStrings.auto
import typings.std.stdStrings.encrypted
import typings.std.stdStrings.metadata
import typings.std.stdStrings.none
import typings.std.stdStrings.waitingforkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds to HTMLElement the properties and methods needed to support basic media-related capabilities that are common to audio and video.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement)
  */
@js.native
trait HTMLMediaElement
  extends StObject
     with HTMLElement {
  
  /* standard dom */
  val HAVE_CURRENT_DATA: `2` = js.native
  
  /* standard dom */
  val HAVE_ENOUGH_DATA: `4` = js.native
  
  /* standard dom */
  val HAVE_FUTURE_DATA: `3` = js.native
  
  /* standard dom */
  val HAVE_METADATA: `1` = js.native
  
  /* standard dom */
  val HAVE_NOTHING: `0` = js.native
  
  /* standard dom */
  val NETWORK_EMPTY: `0` = js.native
  
  /* standard dom */
  val NETWORK_IDLE: `1` = js.native
  
  /* standard dom */
  val NETWORK_LOADING: `2` = js.native
  
  /* standard dom */
  val NETWORK_NO_SOURCE: `3` = js.native
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waitingforkey(`type`: waitingforkey, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/addTextTrack) */
  /* standard dom */
  def addTextTrack(kind: TextTrackKind): TextTrack = js.native
  def addTextTrack(kind: TextTrackKind, label: java.lang.String): TextTrack = js.native
  def addTextTrack(kind: TextTrackKind, label: java.lang.String, language: java.lang.String): TextTrack = js.native
  def addTextTrack(kind: TextTrackKind, label: Unit, language: java.lang.String): TextTrack = js.native
  
  /**
    * Gets or sets a value that indicates whether to start playing the media automatically.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/autoplay)
    */
  /* standard dom */
  var autoplay: scala.Boolean = js.native
  
  /**
    * Gets a collection of buffered time ranges.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/buffered)
    */
  /* standard dom */
  val buffered: TimeRanges = js.native
  
  /**
    * Returns a string that specifies whether the client can play a given media resource type.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/canPlayType)
    */
  /* standard dom */
  def canPlayType(`type`: java.lang.String): CanPlayTypeResult = js.native
  
  /**
    * Gets or sets a flag that indicates whether the client provides a set of controls for the media (in case the developer does not include controls for the player).
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/controls)
    */
  /* standard dom */
  var controls: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/crossOrigin) */
  /* standard dom */
  var crossOrigin: java.lang.String | Null = js.native
  
  /**
    * Gets the address or URL of the current media resource that is selected by IHTMLMediaElement.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/currentSrc)
    */
  /* standard dom */
  val currentSrc: java.lang.String = js.native
  
  /**
    * Gets or sets the current playback position, in seconds.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/currentTime)
    */
  /* standard dom */
  var currentTime: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/defaultMuted) */
  /* standard dom */
  var defaultMuted: scala.Boolean = js.native
  
  /**
    * Gets or sets the default playback rate when the user is not using fast forward or reverse for a video or audio resource.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/defaultPlaybackRate)
    */
  /* standard dom */
  var defaultPlaybackRate: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/disableRemotePlayback) */
  /* standard dom */
  var disableRemotePlayback: scala.Boolean = js.native
  
  /**
    * Returns the duration in seconds of the current media resource. A NaN value is returned if duration is not available, or Infinity if the media resource is streaming.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/duration)
    */
  /* standard dom */
  val duration: Double = js.native
  
  /**
    * Gets information about whether the playback has ended or not.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/ended)
    */
  /* standard dom */
  val ended: scala.Boolean = js.native
  
  /**
    * Returns an object representing the current error state of the audio or video element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/error)
    */
  /* standard dom */
  val error: MediaError | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/fastSeek) */
  /* standard dom */
  def fastSeek(time: Double): Unit = js.native
  
  /**
    * Resets the audio or video object and loads a new media resource.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/load)
    */
  /* standard dom */
  def load(): Unit = js.native
  
  /**
    * Gets or sets a flag to specify whether playback should restart after it completes.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loop)
    */
  /* standard dom */
  var loop: scala.Boolean = js.native
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/mediaKeys)
    */
  /* standard dom */
  val mediaKeys: MediaKeys | Null = js.native
  
  /**
    * Gets or sets a flag that indicates whether the audio (either audio or the audio track on video media) is muted.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/muted)
    */
  /* standard dom */
  var muted: scala.Boolean = js.native
  
  /**
    * Gets the current network activity for the element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/networkState)
    */
  /* standard dom */
  val networkState: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/encrypted_event) */
  /* standard dom */
  var onencrypted: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/waitingforkey_event) */
  /* standard dom */
  var onwaitingforkey: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /**
    * Pauses the current playback and sets paused to TRUE. This can be used to test whether the media is playing or paused. You can also use the pause or play events to tell whether the media is playing or not.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/pause)
    */
  /* standard dom */
  def pause(): Unit = js.native
  
  /**
    * Gets a flag that specifies whether playback is paused.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/paused)
    */
  /* standard dom */
  val paused: scala.Boolean = js.native
  
  /**
    * Loads and starts playback of a media resource.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/play)
    */
  /* standard dom */
  def play(): js.Promise[Unit] = js.native
  
  /**
    * Gets or sets the current rate of speed for the media resource to play. This speed is expressed as a multiple of the normal speed of the media resource.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/playbackRate)
    */
  /* standard dom */
  var playbackRate: Double = js.native
  
  /**
    * Gets TimeRanges for the current media resource that has been played.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/played)
    */
  /* standard dom */
  val played: TimeRanges = js.native
  
  /**
    * Gets or sets a value indicating what data should be preloaded, if any.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/preload)
    */
  /* standard dom */
  var preload: none | metadata | auto | _empty = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/preservesPitch) */
  /* standard dom */
  var preservesPitch: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/readyState) */
  /* standard dom */
  val readyState: Double = js.native
  
  /* standard dom */
  val remote: RemotePlayback = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waitingforkey(`type`: waitingforkey, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /**
    * Returns a TimeRanges object that represents the ranges of the current media resource that can be seeked.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seekable)
    */
  /* standard dom */
  val seekable: TimeRanges = js.native
  
  /**
    * Gets a flag that indicates whether the client is currently moving to a new playback position in the media resource.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seeking)
    */
  /* standard dom */
  val seeking: scala.Boolean = js.native
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/setMediaKeys)
    */
  /* standard dom */
  def setMediaKeys(): js.Promise[Unit] = js.native
  def setMediaKeys(mediaKeys: MediaKeys): js.Promise[Unit] = js.native
  
  /**
    * The address or URL of the a media resource that is to be considered.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/src)
    */
  /* standard dom */
  var src: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/srcObject) */
  /* standard dom */
  var srcObject: MediaProvider | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/textTracks) */
  /* standard dom */
  val textTracks: TextTrackList = js.native
  
  /**
    * Gets or sets the volume level for audio portions of the media element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/volume)
    */
  /* standard dom */
  var volume: Double = js.native
}
