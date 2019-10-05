package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to represent a value that can be an <angle> or <number> value. An SVGAngle reflected through the animVal attribute is always read only. */
trait SVGAngle extends js.Object {
  val SVG_ANGLETYPE_DEG: Double
  val SVG_ANGLETYPE_GRAD: Double
  val SVG_ANGLETYPE_RAD: Double
  val SVG_ANGLETYPE_UNKNOWN: Double
  val SVG_ANGLETYPE_UNSPECIFIED: Double
  val unitType: Double
  var value: Double
  var valueAsString: java.lang.String
  var valueInSpecifiedUnits: Double
  def convertToSpecifiedUnits(unitType: Double): Unit
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit
}

@JSGlobal("SVGAngle")
@js.native
object SVGAngle extends Instantiable0[SVGAngle] {
  val SVG_ANGLETYPE_DEG: Double = js.native
  val SVG_ANGLETYPE_GRAD: Double = js.native
  val SVG_ANGLETYPE_RAD: Double = js.native
  val SVG_ANGLETYPE_UNKNOWN: Double = js.native
  val SVG_ANGLETYPE_UNSPECIFIED: Double = js.native
}

