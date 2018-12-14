package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGGeometryElement extends SVGGraphicsElement {
  val pathLength: SVGAnimatedNumber = js.native
  def getPointAtLength(distance: scala.Double): DOMPoint = js.native
  def getTotalLength(): scala.Double = js.native
  def isPointInFill(): scala.Boolean = js.native
  def isPointInFill(point: DOMPointInit): scala.Boolean = js.native
  def isPointInStroke(): scala.Boolean = js.native
  def isPointInStroke(point: DOMPointInit): scala.Boolean = js.native
}

@JSGlobal("SVGGeometryElement")
@js.native
object SVGGeometryElement
  extends org.scalablytyped.runtime.Instantiable0[SVGGeometryElement]

