package typings.std

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

object SVGAngle {
  @scala.inline
  def apply(
    SVG_ANGLETYPE_DEG: Double,
    SVG_ANGLETYPE_GRAD: Double,
    SVG_ANGLETYPE_RAD: Double,
    SVG_ANGLETYPE_UNKNOWN: Double,
    SVG_ANGLETYPE_UNSPECIFIED: Double,
    convertToSpecifiedUnits: Double => Unit,
    newValueSpecifiedUnits: (Double, Double) => Unit,
    unitType: Double,
    value: Double,
    valueAsString: java.lang.String,
    valueInSpecifiedUnits: Double
  ): SVGAngle = {
    val __obj = js.Dynamic.literal(SVG_ANGLETYPE_DEG = SVG_ANGLETYPE_DEG.asInstanceOf[js.Any], SVG_ANGLETYPE_GRAD = SVG_ANGLETYPE_GRAD.asInstanceOf[js.Any], SVG_ANGLETYPE_RAD = SVG_ANGLETYPE_RAD.asInstanceOf[js.Any], SVG_ANGLETYPE_UNKNOWN = SVG_ANGLETYPE_UNKNOWN.asInstanceOf[js.Any], SVG_ANGLETYPE_UNSPECIFIED = SVG_ANGLETYPE_UNSPECIFIED.asInstanceOf[js.Any], convertToSpecifiedUnits = js.Any.fromFunction1(convertToSpecifiedUnits), newValueSpecifiedUnits = js.Any.fromFunction2(newValueSpecifiedUnits), unitType = unitType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any], valueInSpecifiedUnits = valueInSpecifiedUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAngle]
  }
}

