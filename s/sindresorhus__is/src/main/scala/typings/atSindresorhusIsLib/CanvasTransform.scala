package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasTransform extends js.Object {
  def getTransform(): DOMMatrix = js.native
  def resetTransform(): scala.Unit = js.native
  def rotate(angle: scala.Double): scala.Unit = js.native
  def scale(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setTransform(): scala.Unit = js.native
  def setTransform(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double
  ): scala.Unit = js.native
  def setTransform(transform: DOMMatrix2DInit): scala.Unit = js.native
  def transform(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double
  ): scala.Unit = js.native
  def translate(x: scala.Double, y: scala.Double): scala.Unit = js.native
}

