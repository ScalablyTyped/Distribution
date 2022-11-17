package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods for manipulating video objects. It also inherits properties and methods of HTMLMediaElement and HTMLElement. */
@js.native
trait HTMLVideoElement
  extends StObject
     with HTMLMediaElement {
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_leavepictureinpicture")
  def addEventListener(
    `type`: "leavepictureinpicture",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_enterpictureinpicture")
  def addEventListener(
    `type`: "enterpictureinpicture",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_enterpictureinpicture")
  def addEventListener(
    `type`: "enterpictureinpicture",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_leavepictureinpicture")
  def addEventListener(
    `type`: "leavepictureinpicture",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_enterpictureinpicture")
  def addEventListener(
    `type`: "enterpictureinpicture",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_leavepictureinpicture")
  def addEventListener(
    `type`: "leavepictureinpicture",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def cancelVideoFrameCallback(handle: Double): Unit = js.native
  
  /* standard dom */
  var disablePictureInPicture: scala.Boolean = js.native
  
  /* standard dom */
  def getVideoPlaybackQuality(): VideoPlaybackQuality = js.native
  
  /** Gets or sets the height of the video element. */
  /* standard dom */
  var height: Double = js.native
  
  /* standard dom */
  var onenterpictureinpicture: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onleavepictureinpicture: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** Gets or sets the playsinline of the video element. for example, On iPhone, video elements will now be allowed to play inline, and will not automatically enter fullscreen mode when playback begins. */
  /* standard dom */
  var playsInline: scala.Boolean = js.native
  
  /** Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available. */
  /* standard dom */
  var poster: java.lang.String = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_leavepictureinpicture")
  def removeEventListener(
    `type`: "leavepictureinpicture",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_enterpictureinpicture")
  def removeEventListener(
    `type`: "enterpictureinpicture",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_enterpictureinpicture")
  def removeEventListener(
    `type`: "enterpictureinpicture",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_leavepictureinpicture")
  def removeEventListener(
    `type`: "leavepictureinpicture",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_enterpictureinpicture")
  def removeEventListener(
    `type`: "enterpictureinpicture",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_leavepictureinpicture")
  def removeEventListener(
    `type`: "leavepictureinpicture",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def requestPictureInPicture(): js.Promise[PictureInPictureWindow] = js.native
  
  /* standard dom */
  def requestVideoFrameCallback(callback: VideoFrameRequestCallback): Double = js.native
  
  /** Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known. */
  /* standard dom */
  val videoHeight: Double = js.native
  
  /** Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known. */
  /* standard dom */
  val videoWidth: Double = js.native
  
  /** Gets or sets the width of the video element. */
  /* standard dom */
  var width: Double = js.native
}
