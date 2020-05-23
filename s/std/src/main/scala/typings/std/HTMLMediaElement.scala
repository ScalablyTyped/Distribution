package typings.std

import typings.std.stdStrings.encrypted
import typings.std.stdStrings.waitingforkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Adds to HTMLElement the properties and methods needed to support basic media-related capabilities that are common to audio and video. */
@js.native
trait HTMLMediaElement extends HTMLElement {
  val HAVE_CURRENT_DATA: Double = js.native
  val HAVE_ENOUGH_DATA: Double = js.native
  val HAVE_FUTURE_DATA: Double = js.native
  val HAVE_METADATA: Double = js.native
  val HAVE_NOTHING: Double = js.native
  val NETWORK_EMPTY: Double = js.native
  val NETWORK_IDLE: Double = js.native
  val NETWORK_LOADING: Double = js.native
  val NETWORK_NO_SOURCE: Double = js.native
  /**
    * Gets or sets a value that indicates whether to start playing the media automatically.
    */
  var autoplay: scala.Boolean = js.native
  /**
    * Gets a collection of buffered time ranges.
    */
  val buffered: TimeRanges = js.native
  /**
    * Gets or sets a flag that indicates whether the client provides a set of controls for the media (in case the developer does not include controls for the player).
    */
  var controls: scala.Boolean = js.native
  var crossOrigin: java.lang.String | Null = js.native
  /**
    * Gets the address or URL of the current media resource that is selected by IHTMLMediaElement.
    */
  val currentSrc: java.lang.String = js.native
  /**
    * Gets or sets the current playback position, in seconds.
    */
  var currentTime: Double = js.native
  var defaultMuted: scala.Boolean = js.native
  /**
    * Gets or sets the default playback rate when the user is not using fast forward or reverse for a video or audio resource.
    */
  var defaultPlaybackRate: Double = js.native
  /**
    * Returns the duration in seconds of the current media resource. A NaN value is returned if duration is not available, or Infinity if the media resource is streaming.
    */
  val duration: Double = js.native
  /**
    * Gets information about whether the playback has ended or not.
    */
  val ended: scala.Boolean = js.native
  /**
    * Returns an object representing the current error state of the audio or video element.
    */
  val error: MediaError | Null = js.native
  /**
    * Gets or sets a flag to specify whether playback should restart after it completes.
    */
  var loop: scala.Boolean = js.native
  val mediaKeys: MediaKeys | Null = js.native
  /**
    * Gets or sets a flag that indicates whether the audio (either audio or the audio track on video media) is muted.
    */
  var muted: scala.Boolean = js.native
  /**
    * Gets the current network activity for the element.
    */
  val networkState: Double = js.native
  var onencrypted: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _]) | Null = js.native
  var onwaitingforkey: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  /**
    * Gets a flag that specifies whether playback is paused.
    */
  val paused: scala.Boolean = js.native
  /**
    * Gets or sets the current rate of speed for the media resource to play. This speed is expressed as a multiple of the normal speed of the media resource.
    */
  var playbackRate: Double = js.native
  /**
    * Gets TimeRanges for the current media resource that has been played.
    */
  val played: TimeRanges = js.native
  /**
    * Gets or sets the current playback position, in seconds.
    */
  var preload: java.lang.String = js.native
  val readyState: Double = js.native
  /**
    * Returns a TimeRanges object that represents the ranges of the current media resource that can be seeked.
    */
  val seekable: TimeRanges = js.native
  /**
    * Gets a flag that indicates whether the client is currently moving to a new playback position in the media resource.
    */
  val seeking: scala.Boolean = js.native
  /**
    * The address or URL of the a media resource that is to be considered.
    */
  var src: java.lang.String = js.native
  var srcObject: MediaProvider | Null = js.native
  val textTracks: TextTrackList = js.native
  /**
    * Gets or sets the volume level for audio portions of the media element.
    */
  var volume: Double = js.native
  @JSName("addEventListener")
  def addEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waitingforkey(`type`: waitingforkey, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def addTextTrack(kind: TextTrackKind): TextTrack = js.native
  def addTextTrack(kind: TextTrackKind, label: java.lang.String): TextTrack = js.native
  def addTextTrack(kind: TextTrackKind, label: java.lang.String, language: java.lang.String): TextTrack = js.native
  /**
    * Returns a string that specifies whether the client can play a given media resource type.
    */
  def canPlayType(`type`: java.lang.String): CanPlayTypeResult = js.native
  def fastSeek(time: Double): Unit = js.native
  /**
    * Resets the audio or video object and loads a new media resource.
    */
  def load(): Unit = js.native
  /**
    * Pauses the current playback and sets paused to TRUE. This can be used to test whether the media is playing or paused. You can also use the pause or play events to tell whether the media is playing or not.
    */
  def pause(): Unit = js.native
  /**
    * Loads and starts playback of a media resource.
    */
  def play(): js.Promise[Unit] = js.native
  @JSName("removeEventListener")
  def removeEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waitingforkey(`type`: waitingforkey, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  def setMediaKeys(): js.Promise[Unit] = js.native
  def setMediaKeys(mediaKeys: MediaKeys): js.Promise[Unit] = js.native
}

