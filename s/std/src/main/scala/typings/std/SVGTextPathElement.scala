package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <textPath> element. */
@js.native
trait SVGTextPathElement
  extends StObject
     with SVGTextContentElement
     with SVGURIReference {
  
  /* standard dom */
  val TEXTPATH_METHODTYPE_ALIGN: Double = js.native
  
  /* standard dom */
  val TEXTPATH_METHODTYPE_STRETCH: Double = js.native
  
  /* standard dom */
  val TEXTPATH_METHODTYPE_UNKNOWN: Double = js.native
  
  /* standard dom */
  val TEXTPATH_SPACINGTYPE_AUTO: Double = js.native
  
  /* standard dom */
  val TEXTPATH_SPACINGTYPE_EXACT: Double = js.native
  
  /* standard dom */
  val TEXTPATH_SPACINGTYPE_UNKNOWN: Double = js.native
  
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
  val method: SVGAnimatedEnumeration = js.native
  
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
  val spacing: SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val startOffset: SVGAnimatedLength = js.native
}
