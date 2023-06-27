package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement) */
@js.native
trait SVGAnimationElement
  extends StObject
     with SVGElement
     with SVGTests {
  
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
  def beginElement(): Unit = js.native
  
  /* standard dom */
  def beginElementAt(offset: Double): Unit = js.native
  
  /* standard dom */
  def endElement(): Unit = js.native
  
  /* standard dom */
  def endElementAt(offset: Double): Unit = js.native
  
  /* standard dom */
  def getCurrentTime(): Double = js.native
  
  /* standard dom */
  def getSimpleDuration(): Double = js.native
  
  /* standard dom */
  def getStartTime(): Double = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/targetElement) */
  /* standard dom */
  val targetElement: SVGElement | Null = js.native
}
