package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAngle extends js.Object {
  val SVG_ANGLETYPE_DEG: scala.Double
  val SVG_ANGLETYPE_GRAD: scala.Double
  val SVG_ANGLETYPE_RAD: scala.Double
  val SVG_ANGLETYPE_UNKNOWN: scala.Double
  val SVG_ANGLETYPE_UNSPECIFIED: scala.Double
  val unitType: scala.Double
  var value: scala.Double
  var valueAsString: java.lang.String
  var valueInSpecifiedUnits: scala.Double
  def convertToSpecifiedUnits(unitType: scala.Double): scala.Unit
  def newValueSpecifiedUnits(unitType: scala.Double, valueInSpecifiedUnits: scala.Double): scala.Unit
}

@JSGlobal("SVGAngle")
@js.native
object SVGAngle
  extends org.scalablytyped.runtime.Instantiable0[SVGAngle] {
  val SVG_ANGLETYPE_DEG: scala.Double = js.native
  val SVG_ANGLETYPE_GRAD: scala.Double = js.native
  val SVG_ANGLETYPE_RAD: scala.Double = js.native
  val SVG_ANGLETYPE_UNKNOWN: scala.Double = js.native
  val SVG_ANGLETYPE_UNSPECIFIED: scala.Double = js.native
}

