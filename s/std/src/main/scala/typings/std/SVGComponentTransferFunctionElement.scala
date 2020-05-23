package typings.std

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

