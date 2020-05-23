package typings.std

import typings.std.stdStrings.SVGUnload
import typings.std.stdStrings.SVGZoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the properties of <svg> elements, as well as methods to manipulate them. This interface contains also various miscellaneous commonly-used utility methods, such as matrix operations and the ability to control the time of redraw on visual rendering devices. */
@js.native
trait SVGSVGElement
  extends SVGGraphicsElement
     with DocumentEvent
     with SVGFitToViewBox
     with SVGZoomAndPan {
  /** @deprecated */
  var contentScriptType: java.lang.String = js.native
  /** @deprecated */
  var contentStyleType: java.lang.String = js.native
  var currentScale: Double = js.native
  val currentTranslate: SVGPoint = js.native
  val height: SVGAnimatedLength = js.native
  var onunload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onzoom: (js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _]) | Null = js.native
  /** @deprecated */
  val pixelUnitToMillimeterX: Double = js.native
  /** @deprecated */
  val pixelUnitToMillimeterY: Double = js.native
  /** @deprecated */
  val screenPixelToMillimeterX: Double = js.native
  /** @deprecated */
  val screenPixelToMillimeterY: Double = js.native
  /** @deprecated */
  val viewport: SVGRect = js.native
  val width: SVGAnimatedLength = js.native
  val x: SVGAnimatedLength = js.native
  val y: SVGAnimatedLength = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * 
    * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * 
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * 
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
    * 
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
    * 
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
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
  def addEventListener_SVGUnload(`type`: SVGUnload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(`type`: SVGZoom, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def animationsPaused(): scala.Boolean = js.native
  def checkEnclosure(element: SVGElement, rect: SVGRect): scala.Boolean = js.native
  def checkIntersection(element: SVGElement, rect: SVGRect): scala.Boolean = js.native
  def createSVGAngle(): SVGAngle = js.native
  def createSVGLength(): SVGLength = js.native
  def createSVGMatrix(): SVGMatrix = js.native
  def createSVGNumber(): SVGNumber = js.native
  def createSVGPoint(): SVGPoint = js.native
  def createSVGRect(): SVGRect = js.native
  def createSVGTransform(): SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = js.native
  def deselectAll(): Unit = js.native
  /** @deprecated */
  def forceRedraw(): Unit = js.native
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: java.lang.String): CSSStyleDeclaration = js.native
  def getCurrentTime(): Double = js.native
  def getElementById(elementId: java.lang.String): Element = js.native
  def getEnclosureList(rect: SVGRect, referenceElement: SVGElement): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  def getIntersectionList(rect: SVGRect, referenceElement: SVGElement): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  def pauseAnimations(): Unit = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
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
  @JSName("removeEventListener")
  def removeEventListener_SVGUnload(`type`: SVGUnload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGZoom(`type`: SVGZoom, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  def setCurrentTime(seconds: Double): Unit = js.native
  /** @deprecated */
  def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  def unpauseAnimations(): Unit = js.native
  /** @deprecated */
  def unsuspendRedraw(suspendHandleID: Double): Unit = js.native
  /** @deprecated */
  def unsuspendRedrawAll(): Unit = js.native
}

