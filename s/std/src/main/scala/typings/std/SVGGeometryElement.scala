package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGGeometryElement extends SVGGraphicsElement {
  val pathLength: SVGAnimatedNumber = js.native
  def getPointAtLength(distance: Double): DOMPoint = js.native
  def getTotalLength(): Double = js.native
  def isPointInFill(): scala.Boolean = js.native
  def isPointInFill(point: DOMPointInit): scala.Boolean = js.native
  def isPointInStroke(): scala.Boolean = js.native
  def isPointInStroke(point: DOMPointInit): scala.Boolean = js.native
}

