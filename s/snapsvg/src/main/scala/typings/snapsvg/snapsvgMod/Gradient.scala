package typings.snapsvg.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gradient extends Element {
  def addStop(color: String, offset: Double): Gradient = js.native
  def setStops(str: String): Gradient = js.native
  def stops(): js.Array[Element] = js.native
}

