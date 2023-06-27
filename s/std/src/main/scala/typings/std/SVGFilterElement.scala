package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the properties of <filter> elements, as well as methods to manipulate them.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFilterElement)
  */
@js.native
trait SVGFilterElement
  extends StObject
     with SVGElement
     with SVGURIReference {
  
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
  val filterUnits: SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val height: SVGAnimatedLength = js.native
  
  /* standard dom */
  val primitiveUnits: SVGAnimatedEnumeration = js.native
  
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
  val width: SVGAnimatedLength = js.native
  
  /* standard dom */
  val x: SVGAnimatedLength = js.native
  
  /* standard dom */
  val y: SVGAnimatedLength = js.native
}
