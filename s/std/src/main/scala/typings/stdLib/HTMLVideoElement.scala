package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTMLVideoElement interface provides special properties and methods for manipulating video objects. It also inherits properties and methods of HTMLMediaElement and HTMLElement. */
@js.native
trait HTMLVideoElement
  extends HTMLMediaElement
     with CanvasImageSource
     with TexImageSource {
  /**
    * Gets or sets the height of the video element.
    */
  var height: scala.Double = js.native
  var msHorizontalMirror: scala.Boolean = js.native
  val msIsLayoutOptimalForPlayback: scala.Boolean = js.native
  val msIsStereo3D: scala.Boolean = js.native
  var msStereo3DPackingMode: java.lang.String = js.native
  var msStereo3DRenderMode: java.lang.String = js.native
  var msZoom: scala.Boolean = js.native
  var onMSVideoFormatChanged: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onMSVideoFrameStepCompleted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onMSVideoOptimalLayoutChanged: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available.
    */
  var poster: java.lang.String = js.native
  /**
    * Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known.
    */
  val videoHeight: scala.Double = js.native
  /**
    * Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known.
    */
  val videoWidth: scala.Double = js.native
  val webkitDisplayingFullscreen: scala.Boolean = js.native
  val webkitSupportsFullscreen: scala.Boolean = js.native
  /**
    * Gets or sets the width of the video element.
    */
  var width: scala.Double = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFormatChanged(
    `type`: stdLib.stdLibStrings.MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFormatChanged(
    `type`: stdLib.stdLibStrings.MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFormatChanged(
    `type`: stdLib.stdLibStrings.MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFrameStepCompleted(
    `type`: stdLib.stdLibStrings.MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFrameStepCompleted(
    `type`: stdLib.stdLibStrings.MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFrameStepCompleted(
    `type`: stdLib.stdLibStrings.MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoOptimalLayoutChanged(
    `type`: stdLib.stdLibStrings.MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoOptimalLayoutChanged(
    `type`: stdLib.stdLibStrings.MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoOptimalLayoutChanged(
    `type`: stdLib.stdLibStrings.MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def getVideoPlaybackQuality(): VideoPlaybackQuality = js.native
  def msFrameStep(forward: scala.Boolean): scala.Unit = js.native
  def msInsertVideoEffect(activatableClassId: java.lang.String, effectRequired: scala.Boolean): scala.Unit = js.native
  def msInsertVideoEffect(activatableClassId: java.lang.String, effectRequired: scala.Boolean, config: js.Any): scala.Unit = js.native
  def msSetVideoRectangle(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFormatChanged(
    `type`: stdLib.stdLibStrings.MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFormatChanged(
    `type`: stdLib.stdLibStrings.MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFormatChanged(
    `type`: stdLib.stdLibStrings.MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFrameStepCompleted(
    `type`: stdLib.stdLibStrings.MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFrameStepCompleted(
    `type`: stdLib.stdLibStrings.MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFrameStepCompleted(
    `type`: stdLib.stdLibStrings.MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoOptimalLayoutChanged(
    `type`: stdLib.stdLibStrings.MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoOptimalLayoutChanged(
    `type`: stdLib.stdLibStrings.MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoOptimalLayoutChanged(
    `type`: stdLib.stdLibStrings.MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def webkitEnterFullScreen(): scala.Unit = js.native
  def webkitEnterFullscreen(): scala.Unit = js.native
  def webkitExitFullScreen(): scala.Unit = js.native
  def webkitExitFullscreen(): scala.Unit = js.native
}

@JSGlobal("HTMLVideoElement")
@js.native
class HTMLVideoElementCls () extends HTMLVideoElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLVideoElement")
@js.native
object HTMLVideoElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLVideoElement]

