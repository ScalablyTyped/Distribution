package typings.std

import typings.std.stdStrings.enterpictureinpicture
import typings.std.stdStrings.leavepictureinpicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides special properties and methods for manipulating video objects. It also inherits properties and methods of HTMLMediaElement and HTMLElement.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement)
  */
@js.native
trait HTMLVideoElement
  extends StObject
     with HTMLMediaElement
     with CanvasImageSource
     with TexImageSource {
  
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
  def addEventListener_enterpictureinpicture(
    `type`: enterpictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enterpictureinpicture(
    `type`: enterpictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enterpictureinpicture(
    `type`: enterpictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_leavepictureinpicture(
    `type`: leavepictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_leavepictureinpicture(
    `type`: leavepictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_leavepictureinpicture(
    `type`: leavepictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def cancelVideoFrameCallback(handle: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/disablePictureInPicture) */
  /* standard dom */
  var disablePictureInPicture: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/getVideoPlaybackQuality) */
  /* standard dom */
  def getVideoPlaybackQuality(): VideoPlaybackQuality = js.native
  
  /**
    * Gets or sets the height of the video element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/height)
    */
  /* standard dom */
  var height: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/enterpictureinpicture_event) */
  /* standard dom */
  var onenterpictureinpicture: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/leavepictureinpicture_event) */
  /* standard dom */
  var onleavepictureinpicture: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** Gets or sets the playsinline of the video element. for example, On iPhone, video elements will now be allowed to play inline, and will not automatically enter fullscreen mode when playback begins. */
  /* standard dom */
  var playsInline: scala.Boolean = js.native
  
  /**
    * Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/poster)
    */
  /* standard dom */
  var poster: java.lang.String = js.native
  
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
  def removeEventListener_enterpictureinpicture(
    `type`: enterpictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enterpictureinpicture(
    `type`: enterpictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enterpictureinpicture(
    `type`: enterpictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_leavepictureinpicture(
    `type`: leavepictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_leavepictureinpicture(
    `type`: leavepictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_leavepictureinpicture(
    `type`: leavepictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/requestPictureInPicture) */
  /* standard dom */
  def requestPictureInPicture(): js.Promise[PictureInPictureWindow] = js.native
  
  /* standard dom */
  def requestVideoFrameCallback(callback: VideoFrameRequestCallback): Double = js.native
  
  /**
    * Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/videoHeight)
    */
  /* standard dom */
  val videoHeight: Double = js.native
  
  /**
    * Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/videoWidth)
    */
  /* standard dom */
  val videoWidth: Double = js.native
  
  /**
    * Gets or sets the width of the video element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/width)
    */
  /* standard dom */
  var width: Double = js.native
}
