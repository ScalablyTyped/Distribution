package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <feMorphology> element. */
@js.native
trait SVGFEMorphologyElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_MORPHOLOGY_OPERATOR_DILATE: scala.Double = js.native
  val SVG_MORPHOLOGY_OPERATOR_ERODE: scala.Double = js.native
  val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: scala.Double = js.native
  val in1: SVGAnimatedString = js.native
  val operator: SVGAnimatedEnumeration = js.native
  val radiusX: SVGAnimatedNumber = js.native
  val radiusY: SVGAnimatedNumber = js.native
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
}

@JSGlobal("SVGFEMorphologyElement")
@js.native
class SVGFEMorphologyElementCls () extends SVGFEMorphologyElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override val height: SVGAnimatedLength = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
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
  override val result: SVGAnimatedString = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /* CompleteClass */
  override val width: SVGAnimatedLength = js.native
  /* CompleteClass */
  override val x: SVGAnimatedLength = js.native
  /* CompleteClass */
  override val y: SVGAnimatedLength = js.native
}

@JSGlobal("SVGFEMorphologyElement")
@js.native
object SVGFEMorphologyElement
  extends org.scalablytyped.runtime.Instantiable0[SVGFEMorphologyElement] {
  val SVG_MORPHOLOGY_OPERATOR_DILATE: scala.Double = js.native
  val SVG_MORPHOLOGY_OPERATOR_ERODE: scala.Double = js.native
  val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: scala.Double = js.native
}

