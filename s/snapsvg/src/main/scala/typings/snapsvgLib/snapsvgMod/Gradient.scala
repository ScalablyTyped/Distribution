package typings
package snapsvgLib.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gradient extends Element {
  def addStop(color: java.lang.String, offset: scala.Double): Gradient = js.native
  def setStops(str: java.lang.String): Gradient = js.native
  def stops(): js.Array[Element] = js.native
}

