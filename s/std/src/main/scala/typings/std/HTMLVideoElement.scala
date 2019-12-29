package typings.std

import org.scalablytyped.runtime.Instantiable0
import typings.std.stdStrings.MSVideoFormatChanged
import typings.std.stdStrings.MSVideoFrameStepCompleted
import typings.std.stdStrings.MSVideoOptimalLayoutChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods for manipulating video objects. It also inherits properties and methods of HTMLMediaElement and HTMLElement. */
@js.native
trait HTMLVideoElement
  extends HTMLMediaElement
     with CanvasImageSource
     with TexImageSource {
  /**
    * Gets or sets the height of the video element.
    */
  var height: Double = js.native
  var msHorizontalMirror: scala.Boolean = js.native
  val msIsLayoutOptimalForPlayback: scala.Boolean = js.native
  val msIsStereo3D: scala.Boolean = js.native
  var msStereo3DPackingMode: java.lang.String = js.native
  var msStereo3DRenderMode: java.lang.String = js.native
  var msZoom: scala.Boolean = js.native
  var onMSVideoFormatChanged: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onMSVideoFrameStepCompleted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onMSVideoOptimalLayoutChanged: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  /**
    * Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available.
    */
  var poster: java.lang.String = js.native
  /**
    * Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known.
    */
  val videoHeight: Double = js.native
  /**
    * Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known.
    */
  val videoWidth: Double = js.native
  val webkitDisplayingFullscreen: scala.Boolean = js.native
  val webkitSupportsFullscreen: scala.Boolean = js.native
  /**
    * Gets or sets the width of the video element.
    */
  var width: Double = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFormatChanged(`type`: MSVideoFormatChanged, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFormatChanged(
    `type`: MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFormatChanged(
    `type`: MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFrameStepCompleted(
    `type`: MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFrameStepCompleted(
    `type`: MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFrameStepCompleted(
    `type`: MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoOptimalLayoutChanged(
    `type`: MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoOptimalLayoutChanged(
    `type`: MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoOptimalLayoutChanged(
    `type`: MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def getVideoPlaybackQuality(): VideoPlaybackQuality = js.native
  def msFrameStep(forward: scala.Boolean): Unit = js.native
  def msInsertVideoEffect(activatableClassId: java.lang.String, effectRequired: scala.Boolean): Unit = js.native
  def msInsertVideoEffect(activatableClassId: java.lang.String, effectRequired: scala.Boolean, config: js.Any): Unit = js.native
  def msSetVideoRectangle(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFormatChanged(`type`: MSVideoFormatChanged, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFormatChanged(
    `type`: MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFormatChanged(
    `type`: MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFrameStepCompleted(
    `type`: MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFrameStepCompleted(
    `type`: MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFrameStepCompleted(
    `type`: MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoOptimalLayoutChanged(
    `type`: MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoOptimalLayoutChanged(
    `type`: MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoOptimalLayoutChanged(
    `type`: MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  def webkitEnterFullScreen(): Unit = js.native
  def webkitEnterFullscreen(): Unit = js.native
  def webkitExitFullScreen(): Unit = js.native
  def webkitExitFullscreen(): Unit = js.native
}

@JSGlobal("HTMLVideoElement")
@js.native
object HTMLVideoElement extends Instantiable0[HTMLVideoElement]

