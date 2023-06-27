package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement) */
@js.native
trait SVGGeometryElement
  extends StObject
     with SVGGraphicsElement {
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/getPointAtLength) */
  /* standard dom */
  def getPointAtLength(distance: Double): DOMPoint = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/getTotalLength) */
  /* standard dom */
  def getTotalLength(): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/isPointInFill) */
  /* standard dom */
  def isPointInFill(): scala.Boolean = js.native
  def isPointInFill(point: DOMPointInit): scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/isPointInStroke) */
  /* standard dom */
  def isPointInStroke(): scala.Boolean = js.native
  def isPointInStroke(point: DOMPointInit): scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/pathLength) */
  /* standard dom */
  val pathLength: SVGAnimatedNumber = js.native
  
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
}
