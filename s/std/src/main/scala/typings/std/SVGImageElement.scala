package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the <image> element.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement)
  */
@js.native
trait SVGImageElement
  extends StObject
     with SVGGraphicsElement
     with SVGURIReference
     with HTMLOrSVGImageElement {
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/height) */
  /* standard dom */
  val height: SVGAnimatedLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/preserveAspectRatio) */
  /* standard dom */
  val preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/width) */
  /* standard dom */
  val width: SVGAnimatedLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/x) */
  /* standard dom */
  val x: SVGAnimatedLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/y) */
  /* standard dom */
  val y: SVGAnimatedLength = js.native
}
