package typings.std

import typings.std.stdStrings._empty
import typings.std.stdStrings.auto
import typings.std.stdStrings.encrypted
import typings.std.stdStrings.metadata
import typings.std.stdStrings.none
import typings.std.stdStrings.waitingforkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Adds to HTMLElement the properties and methods needed to support basic media-related capabilities that are common to audio and video. */
@js.native
trait HTMLMediaElement
  extends StObject
     with HTMLElement {
  
  /* standard dom */
  val HAVE_CURRENT_DATA: Double = js.native
  
  /* standard dom */
  val HAVE_ENOUGH_DATA: Double = js.native
  
  /* standard dom */
  val HAVE_FUTURE_DATA: Double = js.native
  
  /* standard dom */
  val HAVE_METADATA: Double = js.native
  
  /* standard dom */
  val HAVE_NOTHING: Double = js.native
  
  /* standard dom */
  val NETWORK_EMPTY: Double = js.native
  
  /* standard dom */
  val NETWORK_IDLE: Double = js.native
  
  /* standard dom */
  val NETWORK_LOADING: Double = js.native
  
  /* standard dom */
  val NETWORK_NO_SOURCE: Double = js.native
  
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
  
  /* standard dom */
  def addTextTrack(kind: TextTrackKind): TextTrack = js.native
  def addTextTrack(kind: TextTrackKind, label: java.lang.String): TextTrack = js.native
  def addTextTrack(kind: TextTrackKind, label: java.lang.String, language: java.lang.String): TextTrack = js.native
  def addTextTrack(kind: TextTrackKind, label: Unit, language: java.lang.String): TextTrack = js.native
  
  /** Gets or sets a value that indicates whether to start playing the media automatically. */
  /* standard dom */
  var autoplay: scala.Boolean = js.native
  
  /** Gets a collection of buffered time ranges. */
  /* standard dom */
  val buffered: TimeRanges = js.native
  
  /** Returns a string that specifies whether the client can play a given media resource type. */
  /* standard dom */
  def canPlayType(`type`: java.lang.String): CanPlayTypeResult = js.native
  
  /** Gets or sets a flag that indicates whether the client provides a set of controls for the media (in case the developer does not include controls for the player). */
  /* standard dom */
  var controls: scala.Boolean = js.native
  
  /* standard dom */
  var crossOrigin: java.lang.String | Null = js.native
  
  /** Gets the address or URL of the current media resource that is selected by IHTMLMediaElement. */
  /* standard dom */
  val currentSrc: java.lang.String = js.native
  
  /** Gets or sets the current playback position, in seconds. */
  /* standard dom */
  var currentTime: Double = js.native
  
  /* standard dom */
  var defaultMuted: scala.Boolean = js.native
  
  /** Gets or sets the default playback rate when the user is not using fast forward or reverse for a video or audio resource. */
  /* standard dom */
  var defaultPlaybackRate: Double = js.native
  
  /* standard dom */
  var disableRemotePlayback: scala.Boolean = js.native
  
  /** Returns the duration in seconds of the current media resource. A NaN value is returned if duration is not available, or Infinity if the media resource is streaming. */
  /* standard dom */
  val duration: Double = js.native
  
  /** Gets information about whether the playback has ended or not. */
  /* standard dom */
  val ended: scala.Boolean = js.native
  
  /** Returns an object representing the current error state of the audio or video element. */
  /* standard dom */
  val error: MediaError | Null = js.native
  
  /* standard dom */
  def fastSeek(time: Double): Unit = js.native
  
  /** Resets the audio or video object and loads a new media resource. */
  /* standard dom */
  def load(): Unit = js.native
  
  /** Gets or sets a flag to specify whether playback should restart after it completes. */
  /* standard dom */
  var loop: scala.Boolean = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  val mediaKeys: MediaKeys | Null = js.native
  
  /** Gets or sets a flag that indicates whether the audio (either audio or the audio track on video media) is muted. */
  /* standard dom */
  var muted: scala.Boolean = js.native
  
  /** Gets the current network activity for the element. */
  /* standard dom */
  val networkState: Double = js.native
  
  /* standard dom */
  var onencrypted: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onwaitingforkey: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** Pauses the current playback and sets paused to TRUE. This can be used to test whether the media is playing or paused. You can also use the pause or play events to tell whether the media is playing or not. */
  /* standard dom */
  def pause(): Unit = js.native
  
  /** Gets a flag that specifies whether playback is paused. */
  /* standard dom */
  val paused: scala.Boolean = js.native
  
  /** Loads and starts playback of a media resource. */
  /* standard dom */
  def play(): js.Promise[Unit] = js.native
  
  /** Gets or sets the current rate of speed for the media resource to play. This speed is expressed as a multiple of the normal speed of the media resource. */
  /* standard dom */
  var playbackRate: Double = js.native
  
  /** Gets TimeRanges for the current media resource that has been played. */
  /* standard dom */
  val played: TimeRanges = js.native
  
  /** Gets or sets a value indicating what data should be preloaded, if any. */
  /* standard dom */
  var preload: none | metadata | auto | _empty = js.native
  
  /* standard dom */
  var preservesPitch: scala.Boolean = js.native
  
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
  
  /** Returns a TimeRanges object that represents the ranges of the current media resource that can be seeked. */
  /* standard dom */
  val seekable: TimeRanges = js.native
  
  /** Gets a flag that indicates whether the client is currently moving to a new playback position in the media resource. */
  /* standard dom */
  val seeking: scala.Boolean = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  def setMediaKeys(): js.Promise[Unit] = js.native
  def setMediaKeys(mediaKeys: MediaKeys): js.Promise[Unit] = js.native
  
  /** The address or URL of the a media resource that is to be considered. */
  /* standard dom */
  var src: java.lang.String = js.native
  
  /* standard dom */
  var srcObject: MediaProvider | Null = js.native
  
  /* standard dom */
  val textTracks: TextTrackList = js.native
  
  /** Gets or sets the volume level for audio portions of the media element. */
  /* standard dom */
  var volume: Double = js.native
}
