package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGSVGElement interface provides access to the properties of <svg> elements, as well as methods to manipulate them. This interface contains also various miscellaneous commonly-used utility methods, such as matrix operations and the ability to control the time of redraw on visual rendering devices. */
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
  var currentScale: scala.Double = js.native
  val currentTranslate: SVGPoint = js.native
  val height: SVGAnimatedLength = js.native
  var onunload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onzoom: (js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _]) | scala.Null = js.native
  /** @deprecated */
  val pixelUnitToMillimeterX: scala.Double = js.native
  /** @deprecated */
  val pixelUnitToMillimeterY: scala.Double = js.native
  /** @deprecated */
  val screenPixelToMillimeterX: scala.Double = js.native
  /** @deprecated */
  val screenPixelToMillimeterY: scala.Double = js.native
  /** @deprecated */
  val viewport: SVGRect = js.native
  val width: SVGAnimatedLength = js.native
  val x: SVGAnimatedLength = js.native
  val y: SVGAnimatedLength = js.native
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
  def addEventListener_SVGUnload(
    `type`: stdLib.stdLibStrings.SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGUnload(
    `type`: stdLib.stdLibStrings.SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGUnload(
    `type`: stdLib.stdLibStrings.SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(
    `type`: stdLib.stdLibStrings.SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(
    `type`: stdLib.stdLibStrings.SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(
    `type`: stdLib.stdLibStrings.SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
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
  def deselectAll(): scala.Unit = js.native
  /** @deprecated */
  def forceRedraw(): scala.Unit = js.native
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: java.lang.String): CSSStyleDeclaration = js.native
  /** @deprecated */
  def getCurrentTime(): scala.Double = js.native
  def getElementById(elementId: java.lang.String): Element = js.native
  def getEnclosureList(rect: SVGRect, referenceElement: SVGElement): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  def getIntersectionList(rect: SVGRect, referenceElement: SVGElement): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  /** @deprecated */
  def pauseAnimations(): scala.Unit = js.native
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
  def removeEventListener_SVGUnload(
    `type`: stdLib.stdLibStrings.SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGUnload(
    `type`: stdLib.stdLibStrings.SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGUnload(
    `type`: stdLib.stdLibStrings.SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGZoom(
    `type`: stdLib.stdLibStrings.SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGZoom(
    `type`: stdLib.stdLibStrings.SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGZoom(
    `type`: stdLib.stdLibStrings.SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  /** @deprecated */
  def setCurrentTime(seconds: scala.Double): scala.Unit = js.native
  /** @deprecated */
  def suspendRedraw(maxWaitMilliseconds: scala.Double): scala.Double = js.native
  /** @deprecated */
  def unpauseAnimations(): scala.Unit = js.native
  /** @deprecated */
  def unsuspendRedraw(suspendHandleID: scala.Double): scala.Unit = js.native
  /** @deprecated */
  def unsuspendRedrawAll(): scala.Unit = js.native
}

@JSGlobal("SVGSVGElement")
@js.native
class SVGSVGElementCls () extends SVGSVGElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val requiredExtensions: SVGStringList = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /* CompleteClass */
  override val systemLanguage: SVGStringList = js.native
  /* CompleteClass */
  override val viewBox: SVGAnimatedRect = js.native
  /* CompleteClass */
  override val zoomAndPan: scala.Double = js.native
}

@JSGlobal("SVGSVGElement")
@js.native
object SVGSVGElement
  extends org.scalablytyped.runtime.Instantiable0[SVGSVGElement] {
  val SVG_ZOOMANDPAN_DISABLE: scala.Double = js.native
  val SVG_ZOOMANDPAN_MAGNIFY: scala.Double = js.native
  val SVG_ZOOMANDPAN_UNKNOWN: scala.Double = js.native
}

