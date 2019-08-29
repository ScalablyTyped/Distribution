package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A base interface used by the component transfer function interfaces. */
@js.native
trait SVGComponentTransferFunctionElement extends SVGElement {
  val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Double = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Double = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Double = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Double = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Double = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Double = js.native
  val amplitude: SVGAnimatedNumber = js.native
  val exponent: SVGAnimatedNumber = js.native
  val intercept: SVGAnimatedNumber = js.native
  val offset: SVGAnimatedNumber = js.native
  val slope: SVGAnimatedNumber = js.native
  val tableValues: SVGAnimatedNumberList = js.native
  val `type`: SVGAnimatedEnumeration = js.native
}

@JSGlobal("SVGComponentTransferFunctionElement")
@js.native
class SVGComponentTransferFunctionElementCls () extends SVGComponentTransferFunctionElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("SVGComponentTransferFunctionElement")
@js.native
object SVGComponentTransferFunctionElement extends Instantiable0[SVGComponentTransferFunctionElement] {
  val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Double = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Double = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Double = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Double = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Double = js.native
  val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Double = js.native
}

