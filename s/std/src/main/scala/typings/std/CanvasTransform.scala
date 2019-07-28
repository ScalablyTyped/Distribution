package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasTransform extends js.Object {
  def getTransform(): DOMMatrix = js.native
  def resetTransform(): Unit = js.native
  def rotate(angle: Double): Unit = js.native
  def scale(x: Double, y: Double): Unit = js.native
  def setTransform(): Unit = js.native
  def setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  def setTransform(transform: DOMMatrix2DInit): Unit = js.native
  def transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  def translate(x: Double, y: Double): Unit = js.native
}

