package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the properties of <svg> elements, as well as methods to manipulate them. This interface contains also various miscellaneous commonly-used utility methods, such as matrix operations and the ability to control the time of redraw on visual rendering devices.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement)
  */
@js.native
trait SVGSVGElement
  extends StObject
     with SVGGraphicsElement
     with SVGFitToViewBox
     with WindowEventHandlers {
  
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
  def animationsPaused(): scala.Boolean = js.native
  
  /* standard dom */
  def checkEnclosure(element: SVGElement, rect: DOMRectReadOnly): scala.Boolean = js.native
  
  /* standard dom */
  def checkIntersection(element: SVGElement, rect: DOMRectReadOnly): scala.Boolean = js.native
  
  /* standard dom */
  def createSVGAngle(): SVGAngle = js.native
  
  /* standard dom */
  def createSVGLength(): SVGLength = js.native
  
  /* standard dom */
  def createSVGMatrix(): DOMMatrix = js.native
  
  /* standard dom */
  def createSVGNumber(): SVGNumber = js.native
  
  /* standard dom */
  def createSVGPoint(): DOMPoint = js.native
  
  /* standard dom */
  def createSVGRect(): DOMRect = js.native
  
  /* standard dom */
  def createSVGTransform(): SVGTransform = js.native
  
  /* standard dom */
  def createSVGTransformFromMatrix(): SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: DOMMatrix2DInit): SVGTransform = js.native
  
  /* standard dom */
  var currentScale: Double = js.native
  
  /* standard dom */
  val currentTranslate: DOMPointReadOnly = js.native
  
  /* standard dom */
  def deselectAll(): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def forceRedraw(): Unit = js.native
  
  /* standard dom */
  def getCurrentTime(): Double = js.native
  
  /* standard dom */
  def getElementById(elementId: java.lang.String): Element = js.native
  
  /* standard dom */
  def getEnclosureList(rect: DOMRectReadOnly): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  def getEnclosureList(rect: DOMRectReadOnly, referenceElement: SVGElement): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  
  /* standard dom */
  def getIntersectionList(rect: DOMRectReadOnly): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  def getIntersectionList(rect: DOMRectReadOnly, referenceElement: SVGElement): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  
  /* standard dom */
  val height: SVGAnimatedLength = js.native
  
  /* standard dom */
  def pauseAnimations(): Unit = js.native
  
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
  def setCurrentTime(seconds: Double): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  
  /* standard dom */
  def unpauseAnimations(): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def unsuspendRedraw(suspendHandleID: Double): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def unsuspendRedrawAll(): Unit = js.native
  
  /* standard dom */
  val width: SVGAnimatedLength = js.native
  
  /* standard dom */
  val x: SVGAnimatedLength = js.native
  
  /* standard dom */
  val y: SVGAnimatedLength = js.native
}
